package com.charter.enterprise.csg.repository;

import com.charter.enterprise.billing.csg.accounts.Account;

public interface AccountRepository {

	/**
	 * Fetch Account Details from EAI web services.
	 * 
	 * @param accountNumber
	 * @return
	 */
	public Account getAccount(String accountNumber, String routingArea);
}
