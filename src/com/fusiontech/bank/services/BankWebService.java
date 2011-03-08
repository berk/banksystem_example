package com.fusiontech.bank.services;

import java.util.List;

import com.fusiontech.bank.model.Card;
import com.fusiontech.bank.model.TransactionType;
import com.fusiontech.bank.server.BankException;
import com.fusiontech.bank.server.BankObjectFactory;
import com.fusiontech.bank.server.bean.AccountManagerBean;
import com.fusiontech.bank.server.bean.BankCardManagerBean;
import com.fusiontech.bank.transports.BaseTransportRequest;
import com.fusiontech.bank.transports.BaseTransportResponse;
import com.fusiontech.bank.transports.DepositResponse;
import com.fusiontech.bank.transports.DepositTransportRequest;
import com.fusiontech.bank.transports.GetAccountBalanceResponse;
import com.fusiontech.bank.transports.GetAccountBalanceTransportRequest;
import com.fusiontech.bank.transports.GetAccountListResponse;
import com.fusiontech.bank.transports.GetAccountListTransportRequest;
import com.fusiontech.bank.transports.TransferBalanceResponse;
import com.fusiontech.bank.transports.TransferBalanceTransportRequest;
import com.fusiontech.bank.transports.VerifyDepositResponse;
import com.fusiontech.bank.transports.VerifyDepositTransportRequest;
import com.fusiontech.bank.transports.WithdrawResponse;
import com.fusiontech.bank.transports.WithdrawTransportRequest;

public class BankWebService extends JAXBWebService {
	
	/**
	 * Creates a deposit transaction
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public BaseTransportResponse deposit(BaseTransportRequest request) throws Exception {
		DepositTransportRequest req = (DepositTransportRequest) request;
		DepositResponse resp = BankObjectFactory.getTransportsFactory().createDepositResponse();

		try {
			Card card = new BankCardManagerBean().getValidBankCard(req.getCardNumber(), req.getCardPin());
			
			AccountManagerBean bean = new AccountManagerBean();
			TransactionType trans = bean.deposit(card.getCustomerId(), req.getAccountId(), req.getAmount());
			resp.getTransaction().add(trans);
			resp.setErrorId(0);

		} catch (BankException e) {
			resp.setErrorId(e.getErrorId());
			resp.setErrorMsg(e.getMessage());
		}
		
		return resp;
	}

	/**
	 * Verifies if user can deposit money into account
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public BaseTransportResponse verifyDeposit(BaseTransportRequest request) throws Exception {
		VerifyDepositTransportRequest req = (VerifyDepositTransportRequest) request;
		VerifyDepositResponse resp = BankObjectFactory.getTransportsFactory().createVerifyDepositResponse();

		// TODO: add verification code
		
		resp.setErrorId(0);
		return resp;
	}

	/**
	 * Returns an account balance for the account
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public BaseTransportResponse getAccountBalance(BaseTransportRequest request) throws Exception  {
		GetAccountBalanceTransportRequest req = (GetAccountBalanceTransportRequest) request;
		GetAccountBalanceResponse resp = BankObjectFactory.getTransportsFactory().createGetAccountBalanceResponse();

		try {
			Card card = new BankCardManagerBean().getValidBankCard(req.getCardNumber(), req.getCardPin());
			
			AccountManagerBean bean = new AccountManagerBean();
			TransactionType trans = bean.getAccountBalance(card.getCustomerId(), req.getAccountId());
			resp.getTransaction().add(trans);
			resp.setErrorId(0);

		} catch (BankException e) {
			resp.setErrorId(e.getErrorId());
			resp.setErrorMsg(e.getMessage());
		}

		return resp;
	}

	/** 
	 * Returns an account list for the customer
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public BaseTransportResponse getAccountList(BaseTransportRequest request) throws Exception  {
		GetAccountListTransportRequest req = (GetAccountListTransportRequest) request;
		GetAccountListResponse resp = BankObjectFactory.getTransportsFactory().createGetAccountListResponse();
		
		try {
			Card card = new BankCardManagerBean().getBankCard(req.getCardNumber());
			List accounts = new AccountManagerBean().getAccountsByCustomerId(card.getCustomerId());
			resp.getAccount().addAll(accounts);
			resp.setErrorId(0);
		} catch (BankException e) {
			resp.setErrorId(e.getErrorId());
			resp.setErrorMsg(e.getMessage());
		}
		return resp;
	}
	
	/**
	 * Transfers money between two accounts
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public BaseTransportResponse transferBalance(BaseTransportRequest request) throws Exception  {
		TransferBalanceTransportRequest req = (TransferBalanceTransportRequest) request;
		TransferBalanceResponse resp = BankObjectFactory.getTransportsFactory().createTransferBalanceResponse();

		try {
			Card card = new BankCardManagerBean().getValidBankCard(req.getCardNumber(), req.getCardPin());
			
			AccountManagerBean bean = new AccountManagerBean();
			List transactions = bean.transferBalance(card.getCustomerId(), req.getAccountFrom(), req.getAccountTo(), req.getAmount());
			resp.getTransaction().addAll(transactions);
			resp.setErrorId(0);

		} catch (BankException e) {
			resp.setErrorId(e.getErrorId());
			resp.setErrorMsg(e.getMessage());
		}

		return resp;
	}
	
	/**
	 * Withdraws from an account
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public BaseTransportResponse withdraw(BaseTransportRequest request) throws Exception  {
		WithdrawTransportRequest req = (WithdrawTransportRequest) request;
		WithdrawResponse resp = BankObjectFactory.getTransportsFactory().createWithdrawResponse();

		try {
			Card card = new BankCardManagerBean().getValidBankCard(req.getCardNumber(), req.getCardPin());
			
			AccountManagerBean bean = new AccountManagerBean();
			TransactionType trans = bean.withdraw(card.getCustomerId(), req.getAccountId(), req.getAmount());
			resp.getTransaction().add(trans);
			resp.setErrorId(0);

		} catch (BankException e) {
			resp.setErrorId(e.getErrorId());
			resp.setErrorMsg(e.getMessage());
		}
		
		return resp;
	}
	
}
