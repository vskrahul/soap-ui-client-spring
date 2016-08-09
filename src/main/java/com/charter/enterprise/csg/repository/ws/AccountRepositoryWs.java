package com.charter.enterprise.csg.repository.ws;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Repository;

import com.charter.enterprise.billing.csg.accounts.Account;
import com.charter.enterprise.billing.csg.accounts.AccountCriteria;
import com.charter.enterprise.billing.csg.accounts.AccountService;
import com.charter.enterprise.billing.csg.accounts.CsgHeaderInfo;
import com.charter.enterprise.billing.csg.accounts.GetAccountsRequest;
import com.charter.enterprise.billing.csg.accounts.GetAccountsResponse;
import com.charter.enterprise.csg.exception.InvalidAccountException;
import com.charter.enterprise.csg.exception.RemoteException;
import com.charter.enterprise.csg.repository.AccountRepository;
import com.charter.enterprise.csg.web.interceptor.RequestCounts;

@Repository
public class AccountRepositoryWs implements AccountRepository {

	private Logger logger = LoggerFactory.getLogger(AccountRepositoryWs.class);
	
	@Autowired
	@Qualifier("accountProxy")
	private JaxWsPortProxyFactoryBean accountProxy;
	
	@Override
	public Account getAccount(String accountNumber, String routingArea) {
		logger.info("getAccount();");
		GetAccountsRequest request = new GetAccountsRequest();
		
		CsgHeaderInfo csgHeaderInfo = new CsgHeaderInfo();
		csgHeaderInfo.setRoutingArea(routingArea);
		
		AccountCriteria accountCirteria = new AccountCriteria();
		accountCirteria.setAccountNumber(accountNumber);
		
		request.setCsgHeaderInfo(csgHeaderInfo);
		request.setCriteria(accountCirteria);
		
		AccountService accountService = (AccountService)accountProxy.getObject();
		GetAccountsResponse response = null;
		try {
			response = accountService.getAccounts(request);
		} catch(RemoteAccessException e) {
			logger.error(e.getMessage());
			throw new RemoteException();
		} finally {
			RequestCounts instance = RequestCounts.getInstance();
			instance.setRequestCounter(instance.getRequestCounter() + 1);
		}
		
		List<Account> accountsList = response.getAccounts();
		if(accountsList.size() == 0) {
			logger.error("Account do not exists in EAI back end repository.");
			throw new InvalidAccountException();
		}
		return accountsList.get(0);
	}

}
