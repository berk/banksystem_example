package com.fusiontech.bank.server.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.fusiontech.bank.model.Account;
import com.fusiontech.bank.model.AccountType;
import com.fusiontech.bank.model.TransactionType;
import com.fusiontech.bank.server.BankObjectFactory;

public class AccountManagerDao extends BaseDao {

	public static Account getAccount(DAOContext context, int accountId) throws Exception {
		
		Account account = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT accountid, type, dateCreated FROM account ");
			sql.append("WHERE accountid = ? ");
			
			stmt = prepareStatement(context, sql.toString(), new String[] {"java.lang.Integer"}, new Object[] {new Integer(accountId)} );
			rs = stmt.executeQuery();

			if (rs.next()) {
				account = BankObjectFactory.getModelsFactory().createAccount();
				account.setAccountId(rs.getInt("accountid"));
				account.setType(rs.getString("type"));
				account.setAvailableBalance(22.33);
				account.setCurrentBalance(124.23);
			}
			
			return account;
		} catch (Exception e) {
			throw new Exception("Failed to retrieve Account: " + e.getMessage(), e);
		} finally {		
			closeResultSet(rs);
			closePreparedStatement(stmt);
		}
		
	}

	public static Account getAccountByCustomerIdAccountId(DAOContext context, int customerId, int accountId) throws Exception {
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Account account = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT CA.accountId FROM CustomerAccount CA ");
			sql.append("WHERE CA.customerId = ? ");
			sql.append("AND CA.accountId = ? ");
			
			stmt = prepareStatement(context, sql.toString(), 
					new String[] {"java.lang.Integer", "java.lang.Integer"}, 
					new Object[] {new Integer(customerId), new Integer(accountId)} 
			);
			
			rs = stmt.executeQuery();

			if (rs.next()) {
				account = BankObjectFactory.getModelsFactory().createAccount();
				account.setAccountId(rs.getInt("accountId"));
				return account;
			}
			
			return null;
		} catch (Exception e) {
			throw new Exception("Failed to verify Customer Account: " + e.getMessage(), e);
		} finally {		
			closeResultSet(rs);
			closePreparedStatement(stmt);
		}
		
	}
	
	public static List getCustomerAccounts(DAOContext context, int customerId) throws Exception {
		
		List accounts = new ArrayList();
		AccountType account = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT account.accountid, account.type, account.dateCreated FROM account, customeraccount ");
			sql.append("WHERE account.accountid = customeraccount.accountid ");
			sql.append("AND customeraccount.customerid = ? ");
			
			stmt = prepareStatement(context, sql.toString(), new String[] {"java.lang.Integer"}, new Object[] {new Integer(customerId)} );
			rs = stmt.executeQuery();

			while (rs.next()) {
				account = BankObjectFactory.getModelsFactory().createAccountType();
				account.setAccountId(rs.getInt("accountid"));
				account.setType(rs.getString("type"));
				account.setAvailableBalance(0);
				account.setCurrentBalance(0);
				accounts.add(account);
			}
			
			return accounts;
		} catch (Exception e) {
			throw new Exception("Failed to retrieve Account: " + e.getMessage(), e);
		} finally {		
			closeResultSet(rs);
			closePreparedStatement(stmt);
		}
		
	}
	
	public static int addTransaction (DAOContext context, TransactionType trans) throws Exception {
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO TransactionLog(accountId, customerId, dateCreated, type, amount, clearFlag) ");
			sql.append("VALUES(?, ?, ?, ?, ?, ?) ");
			
			stmt = prepareStatement(context, sql.toString(), 
					new String[] {
							"java.lang.Integer"
							, "java.lang.Integer"
							, "java.util.Date"
							, "java.lang.String"
							, "java.lang.Double"
							, "java.lang.Integer"
					}, 
					new Object[] {
							new Integer(trans.getAccountId())
							, new Integer(trans.getCustomerId())
							, trans.getDateCreated().getTime()
							, trans.getType()
							, new Double(trans.getAmount())
							, new Integer(trans.getClearFlag())
					} 
			);
			
			stmt.executeUpdate();
			stmt.close();

			sql = new StringBuffer();
			sql.append("SELECT MAX(transactionId) lastId FROM TransactionLog ");
			stmt = prepareStatement(context, sql.toString());
			rs = stmt.executeQuery();
			
			int lastId = -1;
			if (rs.next())
				lastId = rs.getInt("lastId");
				
			return lastId;
		} catch (Exception e) {
			throw new Exception("Failed to add a transaction: " + e.getMessage(), e);
		} finally {		
			closeResultSet(rs);
			closePreparedStatement(stmt);
		}
	}

	public static double getAvailableBalance (DAOContext context, int accountId) throws Exception {
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT SUM(amount) balance FROM TransactionLog ");
			sql.append("WHERE accountid = ? ");
			sql.append("AND clearFlag=1 ");
			
			stmt = prepareStatement(context, sql.toString(), 
					new String[] {"java.lang.Integer"}, 
					new Object[] {new Integer(accountId)} );
			
			rs = stmt.executeQuery();
			double balance = 0.0;
			if (rs.next()) {
				balance = rs.getDouble("balance");
			}
			
			return balance;
		} catch (Exception e) {
			throw new Exception("Failed to retrieve available account balance: " + e.getMessage(), e);
		} finally {		
			closeResultSet(rs);
			closePreparedStatement(stmt);
		}
	}

	public static double getCurrentBalance (DAOContext context, int accountId) throws Exception {
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT SUM(amount) balance FROM TransactionLog ");
			sql.append("WHERE accountid = ? ");
			
			stmt = prepareStatement(context, sql.toString(), 
					new String[] {"java.lang.Integer"}, 
					new Object[] {new Integer(accountId)} );
			
			rs = stmt.executeQuery();
			double balance = 0.0;
			if (rs.next()) {
				balance = rs.getDouble("balance");
			}
			
			return balance;
		} catch (Exception e) {
			throw new Exception("Failed to retrieve current account balance: " + e.getMessage(), e);
		} finally {		
			closeResultSet(rs);
			closePreparedStatement(stmt);
		}
	}

	public static int clearTransactions(DAOContext context) throws Exception {
		
		PreparedStatement stmt = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE TransactionLog SET clearFlag=1 WHERE clearFlag=0 ");
			
			stmt = prepareStatement(context, sql.toString(), null, null );
			int count = stmt.executeUpdate();
			
			return count;
		} catch (Exception e) {
			throw new Exception("Failed to clear Transactions in TransactionLog: " + e.getMessage(), e);
		} finally {		
			closePreparedStatement(stmt);
		}
		
	}
	
}
