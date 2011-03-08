package com.fusiontech.bank.server.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {

	protected static PreparedStatement prepareStatement(DAOContext context, String query) throws Exception {
		return prepareStatement(context, query, null, null);
	}
	
	protected static PreparedStatement prepareStatement(DAOContext context, String query, String[] types, Object[] values) throws Exception {
		PreparedStatement stmt = context.getConnection().prepareStatement(query);

		if (types!=null && values!=null) {
	        for (int i = 0; i < types.length; i++) {
	        	if (types[i].equals("java.lang.String"))
	        		stmt.setString(i+1, (String) values[i]);
	        	else if (types[i].equals("java.lang.Integer"))
	        		stmt.setInt(i+1, ((Integer) values[i]).intValue());
	        	else if (types[i].equals("java.lang.Long"))
	        		stmt.setLong(i+1, ((Long) values[i]).longValue());
	        	else if (types[i].equals("java.lang.Double"))
	        		stmt.setDouble(i+1, ((Double) values[i]).doubleValue());
	        	else if (types[i].equals("java.util.Date")) {
	        		java.util.Date dt = (java.util.Date) values[i];
	        		stmt.setDate(i+1, new Date(dt.getTime()) );
	        	}
			}
		}
		
        return stmt;
	}

	protected static void closeResultSet(ResultSet rst) throws SQLException {
		if (rst!=null) 
			rst.close();
	}

	protected static void closePreparedStatement(PreparedStatement pstmt) throws SQLException {
		if (pstmt!=null) 
			pstmt.close();
	}
	
}
