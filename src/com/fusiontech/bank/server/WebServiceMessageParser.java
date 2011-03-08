package com.fusiontech.bank.server;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.fusiontech.bank.server.utils.XMLUtils;

public class WebServiceMessageParser {

	public static final String NS_URI_SOAP_ENVELOPE = "http://schemas.xmlsoap.org/soap/envelope/";
	public static final String ELEM_SOAP_ENVELOPE = "soap:Envelope";
	public static final String ELEM_SOAP_HEADER = "soap:Header";
	public static final String ELEM_SOAP_BODY = "soap:Body";
	public static final String XPATH_NODE_SOAP_BODY = "//*[local-name()='" + ELEM_SOAP_ENVELOPE + "' and namespace-uri()='" + NS_URI_SOAP_ENVELOPE + "']/*[local-name()='" + ELEM_SOAP_BODY + "' and namespace-uri()='" + NS_URI_SOAP_ENVELOPE + "']";
	
	byte[] xmlBytes;
	Document document;
	boolean validXML = false;
	
	public WebServiceMessageParser(byte[] xmlBytes) {
		this.xmlBytes = xmlBytes;
	}
	
	public void parse() {
		try {
			document = XMLUtils.loadDocumentFromByteArray(xmlBytes);
			validXML = true;
		} catch (Throwable e) {
			validXML = false;
		}
	}

	public Document getDocument() {
		return document;
	}

	public boolean isValidXML() {
		return validXML;
	}
	
	public boolean isValidSOAP() {
		if ( document == null || ( document.getNodeType() != Node.DOCUMENT_NODE ) ) {
			return false;
		}
		
		Element soapEnvelope = document.getDocumentElement();

		try {
			if ( soapEnvelope == null || ( soapEnvelope.getNodeType() != Node.ELEMENT_NODE ) ) {
				return false;
			}

			if (soapEnvelope.getNamespaceURI() != null ) {
				if (!soapEnvelope.getNamespaceURI().equals( NS_URI_SOAP_ENVELOPE )) 
					return false;
			}

			if ( !soapEnvelope.getNodeName().equals( ELEM_SOAP_ENVELOPE ) )
				return false;
			
			NodeList nodeList = soapEnvelope.getElementsByTagName( ELEM_SOAP_HEADER );
			if ( nodeList == null || nodeList.getLength() > 1 ) {
				return false;
			}
			
			nodeList = soapEnvelope.getElementsByTagName( ELEM_SOAP_BODY );
			if (  nodeList == null || nodeList.getLength() != 1 ) {
				return false;
			}
			
			return true;
		} catch ( Exception ex ) {
			return false;
		}		
	}

	public Node getBodyNode() {
		try {

			Element soapEnvelope = document.getDocumentElement();
			NodeList soapBody = soapEnvelope.getElementsByTagName( ELEM_SOAP_BODY );

			return soapBody.item(0);
		} catch ( Exception ex ) {
			return null;
		}
	}
	
	public Node getRequestNode() {
		try {

			Element soapEnvelope = document.getDocumentElement();
			NodeList soapBody = soapEnvelope.getElementsByTagName( ELEM_SOAP_BODY );

			NodeList children = soapBody.item(0).getChildNodes();
			boolean foundIt = false;
			Node child = null;
			for ( int i = 0; i < children.getLength() && !foundIt; i++ ) {
				child = children.item( i );
				if ( child.getNodeType() == Node.ELEMENT_NODE ) {
					foundIt = true;
				}
			}

			return child;
		} catch ( Exception ex ) {
			return null;
		}
	}
	
	public String getOperationName() {
		try {
			Node action = getRequestNode();
			
			if ( action!=null) {
				
				String opName = ((Element) action).getLocalName();
				if ( opName == null ) {
					opName = ((Element) action).getNodeName();
				}
								
				return opName;
			} else {
				return null;
			}
		} catch ( Exception ex ) {
			return null;
		}
	}
	
}
