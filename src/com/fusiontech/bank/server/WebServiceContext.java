package com.fusiontech.bank.server;

import org.w3c.dom.Node;

public class WebServiceContext {
	private String operationName = null;
	private Node requestNode = null;
	private Node responseNode = null;
	
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public Node getRequestNode() {
		return requestNode;
	}
	public void setRequestNode(Node requestNode) {
		this.requestNode = requestNode;
	}
	public Node getResponseNode() {
		return responseNode;
	}
	public void setResponseNode(Node responseNode) {
		this.responseNode = responseNode;
	}
}
