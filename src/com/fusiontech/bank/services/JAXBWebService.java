package com.fusiontech.bank.services;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.HashMap;

import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.fusiontech.bank.server.BankObjectFactory;
import com.fusiontech.bank.server.WebServiceContext;
import com.fusiontech.bank.server.utils.XMLUtils;
import com.fusiontech.bank.transports.BaseTransportRequest;
import com.fusiontech.bank.transports.BaseTransportResponse;

/*
 * Generic JAXB service
 */
public abstract class JAXBWebService implements IWebService {
	HashMap callTable = null;

	/**
	 * Deafualt Constructor. Loads the service methods.
	 */
	public JAXBWebService() {
		callTable = new HashMap();
		Method[] methods = this.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			callTable.put(methods[i].getName(), methods[i]);
		}
	}

	/**
	 * Converts the request xml node into a JAXB object
	 * 
	 * @param context
	 * @throws Exception
	 */
	private BaseTransportRequest preprocess(WebServiceContext context) throws Exception {

		// convert request message into a jaxb object
		Document document = XMLUtils.createNewDocument();
		Node newNode = document.importNode(context.getRequestNode(), true);
		document.appendChild(newNode);

		// serialize new partial document into bytes
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		XMLUtils.streamDocument(document, out);
		ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
		
		Unmarshaller unmarshaller = BankObjectFactory.getTransportsContext().createUnmarshaller();
		unmarshaller.setValidating(false);
		
		BaseTransportRequest request = (BaseTransportRequest) unmarshaller.unmarshal(in);
		return request;
		
	}

	/**
	 * Executes the service and returns the response object
	 * 
	 * @param context
	 * @throws Exception
	 */
	private BaseTransportResponse process(WebServiceContext context, BaseTransportRequest request) throws Exception {
		Method m = (Method) callTable.get(context.getOperationName());
		BaseTransportResponse response = (BaseTransportResponse) m.invoke(this, new Object[] { request });
		return response;
	}
	
	/**
	 * Converts the response object into XML
	 * 
	 * @param context
	 * @throws Exception
	 */
	private void postprocess(WebServiceContext context, BaseTransportResponse response) throws Exception {
		// process response message
		Document doc = XMLUtils.createNewDocument();
		Element root = doc.createElement("root");
		doc.appendChild(root);
		
		Marshaller marshaller = BankObjectFactory.getTransportsContext().createMarshaller();
		marshaller.marshal(response, root);
		
		context.setResponseNode(root.getFirstChild());
	}

	/**
	 * Main execute method of the service
	 * @param context
	 * @throws Exception
	 */
	public void execute(WebServiceContext context) throws Exception {
		BaseTransportRequest request = preprocess(context);
		BaseTransportResponse response = process(context, request);
		postprocess(context, response);
	}
}
