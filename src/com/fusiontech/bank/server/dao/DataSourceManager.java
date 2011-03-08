package com.fusiontech.bank.server.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import com.fusiontech.bank.server.utils.ConfigUtils;

public class DataSourceManager {
	
	static BasicDataSource bankDataSource = null;

	public static DataSource getDataSource() throws Exception {
		if (bankDataSource == null) {
			bankDataSource = new BasicDataSource();
			bankDataSource.setDriverClassName(ConfigUtils.getProperty("db.driver", "net.sourceforge.jtds.jdbc.Driver"));
			bankDataSource.setUrl(ConfigUtils.getProperty("db.url", "jdbc:jtds:sqlserver://localhost:1433/bank_system"));
			bankDataSource.setUsername(ConfigUtils.getProperty("db.username", "bank"));
			bankDataSource.setPassword(ConfigUtils.getProperty("db.password", "password"));
		}

		return bankDataSource;
	}
	
	public static void shutdownDataSource() throws SQLException {
	        bankDataSource.close();
    }	
}
