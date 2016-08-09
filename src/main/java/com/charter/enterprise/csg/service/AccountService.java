package com.charter.enterprise.csg.service;

import com.charter.enterprise.billing.csg.accounts.Account;

public interface AccountService {

	/**
	 * Fetch Account Details of Customer from EAI web services.
	 * 
	 * @param accountNumber
	 * @return
	 */
	public Account getAccount(String accountNumber, String routingArea);
	
}