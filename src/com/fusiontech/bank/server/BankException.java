package com.fusiontech.bank.server;

public class BankException extends Exception {

	private static final long serialVersionUID = 8072331891171388545L;

	int errorId;

	public BankException (int errorId, String message) {
		super(message);
		this.setErrorId(errorId);
	}

	public BankException (int errorId, Exception ex) {
		super(ex.getMessage(), ex);
		this.setErrorId(errorId);
	}

	public int getErrorId() {
		return errorId;
	}

	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}
}
