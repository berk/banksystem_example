package com.fusiontech.bank.server.bean;

import java.sql.Connection;

import com.fusiontech.bank.server.BankErrorConstants;
import com.fusiontech.bank.server.BankException;
import com.fusiontech.bank.server.dao.DAOContext;
import com.fusiontech.bank.server.dao.DataSourceManager;

public class BaseBean {
	
	protected DAOContext createDAOContext() throws BankException {
		try {
			DAOContext context = new DAOContext();
			Connection con = DataSourceManager.getDataSource().getConnection();
			con.setAutoCommit(false);
			context.setConnection(con);
			return context;
		} catch (Exception e) {
			throw new BankException(BankErrorConstants.DATABASE_CONNECTION_FAILED, e);
		}
	}
	
	protected void rollback(DAOContext context) throws BankException {
		try {
			context.getConnection().rollback();
		} catch (Exception e) {
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_ROLLBACK_FAILED, e);
		}
	}
	
	protected void commit(DAOContext context) throws BankException {
		try {
			context.getConnection().commit();
			context.getConnection().close();
		} catch (Exception e) {
			throw new BankException(BankErrorConstants.DATABASE_TRANSACTION_COMMIT_FAILED, e);
		}
	}

}
