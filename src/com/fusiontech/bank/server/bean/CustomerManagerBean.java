package com.fusiontech.bank.server.bean;

import java.util.List;

import com.fusiontech.bank.server.dao.CustomerManagerDao;
import com.fusiontech.bank.server.dao.DAOContext;

public class CustomerManagerBean extends BaseBean {

	public List getCustomers() throws Exception {
		try {
			DAOContext context = createDAOContext();
			
			List customers = CustomerManagerDao.getCustomers(context);
			
			return customers;
		} catch (Exception e) {
			throw new Exception("Failed to retrieve customers : " + e.getMessage(), e);
		}
	}
	
}
