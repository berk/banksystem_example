package com.fusiontech.bank.server;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.fusiontech.bank.server.utils.XMLUtils;

public class WebServiceMessageSerializer {

	OutputStream outputStream;
	Node responseNode;
	int contentLength = -1;
	Document document;
	
	public int getContentLength() {
		return contentLength;
	}

	public WebServiceMessageSerializer(Node responseNode) {
		 this.responseNode = responseNode;
	}

	public OutputStream getOutputStream() {
		return outputStream;
	}

	public void setOutputStream(OutputStream outputStream) {
		this.outputStream = outputStream;
	}
	
	public void serialize() throws Exception {
		
		// create a new document
		document = XMLUtils.createNewDocument();
		
		// create an envelop
		Element root = document.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
		root.setPrefix("soapenv");
		document.appendChild(root);
		
		// append root attributes
		Attr attr = document.createAttribute("xmlns:soapenv");
		attr.setValue("http://schemas.xmlsoap.org/soap/envelope/");
		root.setAttributeNode(attr);
		attr = document.createAttribute("xmlns:xsd");
		attr.setValue("http://www.w3.org/2001/XMLSchema");
		root.setAttributeNode(attr);
		attr = document.createAttribute("xmlns:xsi");
		attr.setValue("http://www.w3.org/2001/XMLSchema-instance");
		root.setAttributeNode(attr);
		attr = document.createAttribute("xmlns:transport");
		attr.setValue("http://www.fusiontech.com/bankservice/transports/xsd/1.0");
		root.setAttributeNode(attr);
		attr = document.createAttribute("xmlns:model");
		attr.setValue("http://www.fusiontech.com/bankservice/model/xsd/1.0");
		root.setAttributeNode(attr);

		 	 
		// create a body element
		Element body = document.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "Body");
		body.setPrefix("soapenv");
		root.appendChild(body);
		
		// import the jaxb node
		Node importedNode = document.importNode(responseNode, true);
		// append importend node to the body
		body.appendChild(importedNode);

		// stream the document into a byte array
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		XMLUtils.streamDocument(document, out);
		setContentLength(out.size());
		
		// write the byte array into the output stream
		out.writeTo(outputStream);

	}

	public void setContentLength(int contentLength) {
		this.contentLength = contentLength;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Node getResponseNode() {
		return responseNode;
	}

	public void setResponseNode(Node responseNode) {
		this.responseNode = responseNode;
	}
	
}
