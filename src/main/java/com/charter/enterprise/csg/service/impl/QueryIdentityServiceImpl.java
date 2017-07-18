/**
 * 
 */
package com.charter.enterprise.csg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charter.enterprise.csg.repository.QueryIdentityRepository;
import com.charter.enterprise.customer.queryidentity.AccountIdentityType;
import com.charter.enterprise.customer.queryidentity.QueryIdentityRequestBodyType;
import com.charter.enterprise.customer.queryidentity.QueryIdentityRequestBodyType.Preferences;
import com.charter.enterprise.customer.queryidentity.QueryIdentityRequestType;
import com.charter.enterprise.customer.queryidentity.QueryIdentityResponseType;
import com.charter.enterprise.customer.queryidentity.RequestHeaderType;

/**
 * @author Rahul
 *
 */
@Service
public class QueryIdentityServiceImpl implements com.charter.enterprise.csg.service.QueryIdentityService {

	@Autowired
	private QueryIdentityRepository respository;
	
	/* (non-Javadoc)
	 * @see com.charter.enterprise.csg.service.QueryIdentityService#process(java.lang.String)
	 */
	@Override
	public QueryIdentityResponseType process(String accountNumber, String clientIp, String auditUser) {
		QueryIdentityRequestType request = new QueryIdentityRequestType();
		
		RequestHeaderType requestHeader = new RequestHeaderType();
		requestHeader.setClientIP(clientIp);
		requestHeader.setAuditUser(String.format("CHTRNET:%s", auditUser));
		
		QueryIdentityRequestBodyType requestBody = new QueryIdentityRequestBodyType();
		
		AccountIdentityType account = new AccountIdentityType();
		account.setAccountNumber(accountNumber);
		
		Preferences prefences = new Preferences();
		prefences.setIncludePreferences(false);
		
		requestBody.setAccountNumber(account);
		requestBody.setIncludeSecurityAnswers(false);
		requestBody.setIncludeSecurityQuestions(false);
		requestBody.setPreferences(prefences);
		
		request.setRequestHeader(requestHeader);
		request.setRequestBody(requestBody);
		
		return respository.process(request);
	}

}