package com.fusiontech.bank.server;
import org.mortbay.http.HttpContext;
import org.mortbay.http.HttpServer;
import org.mortbay.http.SocketListener;
import org.mortbay.http.handler.ResourceHandler;
import org.mortbay.jetty.servlet.ServletHandler;

import com.fusiontech.bank.server.tasks.ClearTransactionsTask;
import com.fusiontech.bank.server.utils.ConfigUtils;

public class BankServer {
	HttpServer server;
	HttpContext context;
	SocketListener listener;
	
	public BankServer() throws Exception {
		initializeServer();
		initializeHandlers();
		initializeTasks();
	}
	
	public void initializeServer() throws Exception {
		
		// create a socket port
		listener = new SocketListener();
		listener.setPort(ConfigUtils.getPropertyAsInt("server.port", 8080));

		// create a server
		server = new HttpServer();
		server.addListener(listener);

		// create a server context
		context = new HttpContext();
		context.setContextPath("/");
		context.setResourceBase(ConfigUtils.getProperty("server.root", "./docroot/"));
		server.addContext(context);
		
	}

	public void initializeHandlers() throws Exception {
		// create a web service handler
		WebServiceHandler webServices = new WebServiceHandler();
		webServices.addWebService(ConfigUtils.getProperty("bankservice.path", "/bankservice"), "com.fusiontech.bank.services.BankWebService");
		context.addHandler(webServices);

		// create a servlets handler
	    ServletHandler servlets = new ServletHandler();
	    servlets.addServlet("stmt","/stmt","com.fusiontech.bank.servlets.GetAccountStatementServlet");
	    context.addHandler(servlets);

	    // create a resources handler
	    ResourceHandler resources = new ResourceHandler();
	    context.addHandler(resources);
	}

	private void initializeTasks() {
		new Thread(new ClearTransactionsTask()).start();
	}
	
	public void start() throws Exception {
		server.start();
	}

	public static void main(String[] args) {
		try {
			
			new BankServer().start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
