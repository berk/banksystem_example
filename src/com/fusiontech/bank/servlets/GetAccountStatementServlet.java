package com.fusiontech.bank.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fusiontech.bank.model.Customer;
import com.fusiontech.bank.server.bean.CustomerManagerBean;

public class GetAccountStatementServlet extends HttpServlet {

	private static final long serialVersionUID = 565321087062010117L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().write("Account information will be returned here<br>");
	
		response.setContentType("text/html");
		
		try {
			List customers = new CustomerManagerBean().getCustomers();
			response.getWriter().write("<h1>Bank Statement</h1>");
			response.getWriter().write("<ol>");
			for (int i = 0; i < customers.size(); i++) {
				Customer customer = (Customer) customers.get(i);
				response.getWriter().write("<li>" + customer.getFirstName());
			}
			response.getWriter().write("</ol>");
		} catch (Exception e) {
			response.getWriter().write(e.getMessage());
		}		
	}
	
}
