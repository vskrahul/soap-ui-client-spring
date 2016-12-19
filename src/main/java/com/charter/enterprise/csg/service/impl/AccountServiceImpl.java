package com.charter.enterprise.csg.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.charter.enterprise.billing.csg.accounts.Account;
import com.charter.enterprise.csg.repository.AccountRepository;
import com.charter.enterprise.csg.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	private Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	@Cacheable(cacheNames = {"getAccount"})
	public Account getAccount(String accountNumber, String routingArea) {
		logger.info("getAccount();");
		return accountRepository.getAccount(accountNumber, routingArea);
	}

}
