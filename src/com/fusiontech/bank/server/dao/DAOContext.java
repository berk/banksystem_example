package com.fusiontech.bank.server.dao;

import java.sql.Connection;

public class DAOContext {
	Connection connection;

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
