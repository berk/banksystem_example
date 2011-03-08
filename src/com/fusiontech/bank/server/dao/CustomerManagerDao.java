package com.fusiontech.bank.server.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.fusiontech.bank.model.Customer;
import com.fusiontech.bank.server.BankObjectFactory;

public class CustomerManagerDao extends BaseDao {

	public static List getCustomers(DAOContext context) throws Exception {

		List customers = new ArrayList();
		Customer customer = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT customerid, firstname, lastname FROM customer ");
			
			stmt = prepareStatement(context, sql.toString());
			rs = stmt.executeQuery();

			while (rs.next()) {
				customer = BankObjectFactory.getModelsFactory().createCustomer();
				customer.setCustomerId(rs.getInt("customerid"));
				customer.setFirstName(rs.getString("firstname"));
				customer.setLastName(rs.getString("lastname"));
				customers.add(customer);
			}
			
			return customers;
		} catch (Exception e) {
			throw new Exception("Failed to retrieve customers : " + e.getMessage(), e);
		} finally {		
			closeResultSet(rs);
			closePreparedStatement(stmt);
		}
	}

	public static Customer getCustomerByCardNumber(DAOContext context, String cardNumber) throws Exception {

		Customer customer = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("select C.customerId, C.firstName, C.lastName ");
			sql.append("from Customer C, BankCard BC ");
			sql.append("where C.customerId = BC.customerId ");
			sql.append("and BC.cardNumber = ? ");

			String[] paramTypes = new String[1];
			paramTypes[0] = "java.lang.String";
			
			Object[] paramVals = new Object[1];
			paramVals[0] = cardNumber;
				
			stmt = prepareStatement(context, sql.toString(), paramTypes, paramVals);
			rs = stmt.executeQuery();

			if (rs.next()) {
				customer = BankObjectFactory.getModelsFactory().createCustomer();
				customer.setCustomerId(rs.getInt("customerId"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
			}
			
			return customer;
		} catch (Exception e) {
			throw new Exception("Failed to retrieve customer : " + e.getMessage(), e);
		} finally {		
			closeResultSet(rs);
			closePreparedStatement(stmt);
		}
		
	}

}
