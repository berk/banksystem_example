package com.fusiontech.bank.services;

import com.fusiontech.bank.server.WebServiceContext;

public interface IWebService {
	public void execute(WebServiceContext context) throws Exception;
}
