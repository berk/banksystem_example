package com.fusiontech.bank.server;
import java.io.IOException;
import java.util.Date;
import java.util.Hashtable;

import org.mortbay.http.HttpException;
import org.mortbay.http.HttpRequest;
import org.mortbay.http.HttpResponse;
import org.mortbay.http.handler.AbstractHttpHandler;

import com.fusiontech.bank.server.utils.ByteArrayUtils;
import com.fusiontech.bank.server.utils.XMLUtils;
import com.fusiontech.bank.services.IWebService;


public class WebServiceHandler extends AbstractHttpHandler {

	private static final long serialVersionUID = 8158439587232306302L;
	Hashtable services = new Hashtable();
	
	/**
	 * Default constructor
	 *
	 */
	public WebServiceHandler() {
		super();
	}
	
	/**
	 * Handles web service requests
	 */
	public void handle(String path, String arg1, HttpRequest request, HttpResponse response) throws HttpException, IOException {
		WebServiceLogger.log("Request", path + " " + arg1 + " " + request.getContentType());

		Date beginDate = new Date();

		IWebService service = (IWebService) services.get(path);
		// if the resourceBase was set and request came in with a path, make sure they are the same 
		if (service==null)
			return;
		
		// get the request message
		byte[] content = ByteArrayUtils.readInputStreamBytes(request.getInputStream());

		WebServiceLogger.log("Request Message", new String(content));
		
		// check if the content is a valid SOAP XML message
		WebServiceMessageParser parser = new WebServiceMessageParser(content);
		parser.parse();
		if (!parser.isValidXML())
			return; 
			
		// check if the message is valid SOAP message
		if (!parser.isValidSOAP())
			return; 

		WebServiceLogger.log("Begin Request XML Message", "");
		XMLUtils.printDocument(parser.getDocument());
		WebServiceLogger.log("End Request XML Message", "");

		WebServiceLogger.log("Execute Operation", parser.getOperationName());
		
		// create web service context - that will be used throughout the instance of the request 
		WebServiceContext context = new WebServiceContext();
		context.setOperationName(parser.getOperationName());
		context.setRequestNode(parser.getRequestNode());
		
		try {
			// execute the operation and get back the new document
			service.execute(context);
		} catch (Exception e) {
			throw new IOException(e.getMessage());
		}
		
		response.setContentType("text/xml");

		WebServiceMessageSerializer serializer = new WebServiceMessageSerializer(context.getResponseNode());
		serializer.setOutputStream(response.getOutputStream());
		
		try {
			serializer.serialize();
		} catch (Exception e) {
			throw new IOException(e.getMessage());
		}

		Date endDate = new Date();

		WebServiceLogger.log("Response Message", "content length = " + serializer.getContentLength());

		WebServiceLogger.log("Begin Response XML Message", "");
		XMLUtils.printDocument(serializer.getDocument());
		WebServiceLogger.log("End Response XML Message", "");
		
		WebServiceLogger.log("Web Service Call", "total execution time = " + (endDate.getTime() - beginDate.getTime()) + " mls");
		
		response.setContentLength(serializer.getContentLength());
		response.commit();
	}

	/**
	 * Adds a service to the handler
	 * 
	 * @param prefix
	 * @param serviceClass
	 * @throws Exception
	 */
	public void addWebService(String prefix, String serviceClass) throws Exception {
		Class webService = Class.forName(serviceClass);
		IWebService service = (IWebService) webService.newInstance();
		services.put(prefix, service);
	}
}
