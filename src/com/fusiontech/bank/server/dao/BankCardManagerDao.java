package com.fusiontech.bank.server.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

import com.fusiontech.bank.model.Card;
import com.fusiontech.bank.server.BankObjectFactory;

public class BankCardManagerDao extends BaseDao {

	public static Card getCardByCardNumber(DAOContext context, String cardNumber) throws Exception {
		
		Card card = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT cardNumber, pin, customerId, expirationDate ");
			sql.append("FROM BankCard ");
			sql.append("WHERE cardNumber = ? "); 
			
			stmt = prepareStatement(context, sql.toString(), 
					new String[] {"java.lang.String"}, 
					new Object[] {cardNumber} 
			);
			
			rs = stmt.executeQuery();

			if (rs.next()) {
				card = BankObjectFactory.getModelsFactory().createCard();
				card.setCardNumber(rs.getString("cardNumber"));
				card.setCustomerId(rs.getInt("customerId"));
				Calendar cal = Calendar.getInstance();
				cal.setTime(rs.getDate("expirationDate"));
				card.setExpirationDate(cal);
				card.setCardPin(rs.getInt("pin"));
			}
			
			return card;
		} catch (Exception e) {
			throw new Exception("Failed to retrieve Account: " + e.getMessage(), e);
		} finally {		
			closeResultSet(rs);
			closePreparedStatement(stmt);
		}
		
	}
	
}
