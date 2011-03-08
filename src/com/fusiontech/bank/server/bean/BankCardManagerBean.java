package com.fusiontech.bank.server.bean;

import java.util.Date;

import com.fusiontech.bank.model.Card;
import com.fusiontech.bank.server.BankErrorConstants;
import com.fusiontech.bank.server.BankException;
import com.fusiontech.bank.server.dao.BankCardManagerDao;
import com.fusiontech.bank.server.dao.DAOContext;

public class BankCardManagerBean extends BaseBean {

	/**
	 * Returns a customer object from a session object
	 * 
	 * @param request
	 * @throws BankException
	 */
	public Card getBankCard(String cardNumber) throws BankException {
		if (cardNumber==null)
			throw new BankException(BankErrorConstants.INCOMPLETE_PARAMETERS_PASSED, "Card number was not specified");

		DAOContext context = createDAOContext();
		Card card = null;
			
		try {

			card = BankCardManagerDao.getCardByCardNumber(context, cardNumber);
			
			commit(context);
		} catch (Exception e) {
			rollback(context);
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_FAILED, e);
		}

		if (card==null)
			throw new BankException(BankErrorConstants.INVALID_CARD_NUMBER, "Invalid card number provided");

		return card;
	}

	public Card getValidBankCard(String cardNumber, int pin) throws BankException {
		Card card = getBankCard(cardNumber);
		
		if (pin!=card.getCardPin())
			throw new BankException(BankErrorConstants.INVALID_PIN_NUMBER, "Invalid pin number provided");

		if (new Date().after(card.getExpirationDate().getTime()))
			throw new BankException(BankErrorConstants.CARD_EXPIRED, "Card has expired");
		
		return card;
	}
	
}
