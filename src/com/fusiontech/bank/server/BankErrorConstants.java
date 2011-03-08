package com.fusiontech.bank.server;

public class BankErrorConstants {
	public static final int DATABASE_TRANSACTION_FAILED = 100;
	public static final int DATABASE_CONNECTION_FAILED = 101;
	public static final int DATABASE_TRANSACTION_COMMIT_FAILED = 102;
	public static final int DATABASE_TRANSACTION_ROLLBACK_FAILED = 103;
	
	public static final int TRANSPORT_FAILED = 200;
	public static final int INCOMPLETE_PARAMETERS_PASSED = 300;

	public static final int INVALID_CARD_NUMBER = 500;
	public static final int INVALID_PIN_NUMBER = 501;
	public static final int CARD_EXPIRED = 502;

	public static final int INVALID_AMOUNT = 505;
	public static final int INVALID_ACCOUNT = 505;

}
