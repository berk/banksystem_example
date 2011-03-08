package com.fusiontech.bank.server.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.fusiontech.bank.model.Account;
import com.fusiontech.bank.model.TransactionType;
import com.fusiontech.bank.server.BankErrorConstants;
import com.fusiontech.bank.server.BankException;
import com.fusiontech.bank.server.BankObjectFactory;
import com.fusiontech.bank.server.dao.AccountManagerDao;
import com.fusiontech.bank.server.dao.DAOContext;

public class AccountManagerBean extends BaseBean {

	public Account getAccount(int accountId) throws BankException {
		DAOContext context = createDAOContext();
		try {
			Account account = AccountManagerDao.getAccount(context, accountId);
			commit(context);
			return account;
		} catch (Exception e) {
			rollback(context);
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_FAILED, e);
		}
	}

	public List getAccountsByCustomerId(int customerId) throws BankException {
		DAOContext context = createDAOContext();
		try {
			List accounts = AccountManagerDao.getCustomerAccounts(context, customerId);
			commit(context);
			return accounts;
		} catch (Exception e) {
			rollback(context);
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_FAILED, e);
		}
	}
	
	public List transferBalance(int customerId, int accountFrom, int accountTo, double amount) throws BankException {
		DAOContext context = createDAOContext();
		try {
			List trans = new ArrayList();

			validateAccount(context, customerId, accountFrom);
			
			TransactionType withdraw = withdraw(context, customerId, accountFrom, amount);
			trans.add(withdraw);

			validateAccount(context, customerId, accountTo);
			
			TransactionType deposit = deposit(context, customerId, accountTo, amount, 1);
			trans.add(deposit);

			commit(context);
			return trans;
		} catch (Exception e) {
			rollback(context);
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_FAILED, e);
		}
	}

	public TransactionType deposit(int customerId, int accountId, double amount) throws BankException {
		DAOContext context = createDAOContext();
		try {
			TransactionType deposit =  deposit(context, customerId, accountId, amount, 0);

			commit(context);
			return deposit;
			
		} catch (BankException e) {
			rollback(context);
			throw e;
		}
	}
	
	private void validateAccount(DAOContext context, int customerId, int accountId) throws Exception {
		Account account = AccountManagerDao.getAccountByCustomerIdAccountId(context, customerId, accountId);
		if (account==null)
			throw new BankException(BankErrorConstants.INVALID_AMOUNT, "Incorrect account selected.");
	}
	
	public TransactionType deposit(DAOContext context, int customerId, int accountId, double amount, int clearFlag) throws BankException {
		
		if (amount<1)
			throw new BankException(BankErrorConstants.INVALID_AMOUNT, "Incorrect amount. Amount cannot be less than 1");
		
		try {
			validateAccount(context, customerId, accountId);
			
			TransactionType trans = BankObjectFactory.getModelsFactory().createTransactionType();
			trans.setDateCreated(Calendar.getInstance());
			trans.setAccountId(accountId);
			trans.setAmount(amount);
			trans.setCustomerId(customerId);
			trans.setType("deposit");
			trans.setClearFlag(clearFlag);
			
			int transId = AccountManagerDao.addTransaction(context, trans);
			trans.setTransactionId(transId);
			
			double availableBalance = AccountManagerDao.getAvailableBalance(context, accountId);
			trans.setAvailableBalance(availableBalance);

			double currentBalance = AccountManagerDao.getCurrentBalance(context, accountId);
			trans.setCurrentBalance(currentBalance);
			
			return trans;
			
		} catch (Exception e) {
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_FAILED, e);
		}
	}
	
	public TransactionType withdraw(int customerId, int accountId, double amount) throws BankException {
		DAOContext context = createDAOContext();

		try {
			TransactionType withdraw =  withdraw(context, customerId, accountId, amount);

			commit(context);
			return withdraw;
			
		} catch (BankException e) {
			rollback(context);
			throw e;
		}
	}
	
	public TransactionType withdraw(DAOContext context, int customerId, int accountId, double amount) throws BankException {
		
		if (amount<1)
			throw new BankException(BankErrorConstants.INVALID_AMOUNT, "Incorrect amount. Amount cannot be less than 1");
		
		try {
			validateAccount(context, customerId, accountId);
			
			double availableBalance = AccountManagerDao.getAvailableBalance(context, accountId);
			if (availableBalance-amount<0)
				throw new BankException(BankErrorConstants.INVALID_AMOUNT, "Insufficient funds.");
			
			TransactionType trans = BankObjectFactory.getModelsFactory().createTransactionType();
			trans.setDateCreated(Calendar.getInstance());
			trans.setAccountId(accountId);
			trans.setAmount((-1) * amount);
			trans.setCustomerId(customerId);
			trans.setType("withdraw");
			trans.setClearFlag(1);
			
			int transId = AccountManagerDao.addTransaction(context, trans);
			trans.setTransactionId(transId);
			
			availableBalance = AccountManagerDao.getAvailableBalance(context, accountId);
			trans.setAvailableBalance(availableBalance);

			double currentBalance = AccountManagerDao.getCurrentBalance(context, accountId);
			trans.setCurrentBalance(currentBalance);
			
			return trans;
			
		} catch (Exception e) {
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_FAILED, e);
		}
	}
	
	public TransactionType getAccountBalance(int customerId, int accountId) throws BankException {
		DAOContext context = createDAOContext();
		
		try {
			validateAccount(context, customerId, accountId);
			
			TransactionType trans = BankObjectFactory.getModelsFactory().createTransactionType();
			trans.setDateCreated(Calendar.getInstance());
			trans.setAccountId(accountId);
			trans.setAmount(0);
			trans.setCustomerId(customerId);
			trans.setType("inquiry");
			trans.setClearFlag(1);
			
			int transId = AccountManagerDao.addTransaction(context, trans);
			trans.setTransactionId(transId);
			
			double availableBalance = AccountManagerDao.getAvailableBalance(context, accountId);
			trans.setAvailableBalance(availableBalance);

			double currentBalance = AccountManagerDao.getCurrentBalance(context, accountId);
			trans.setCurrentBalance(currentBalance);
			
			commit(context);
			return trans;
		} catch (BankException e) {
			rollback(context);
			throw e;
		} catch (Exception e) {
			rollback(context);
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_FAILED, e);
		}
	}
	
	public int clearTransactions() throws BankException {
		DAOContext context = createDAOContext();
		
		try {
			int updateCount = AccountManagerDao.clearTransactions(context);
			
			commit(context);
			return updateCount;
		} catch (BankException e) {
			rollback(context);
			throw e;
		} catch (Exception e) {
			rollback(context);
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_FAILED, e);
		}
	}
	
}
