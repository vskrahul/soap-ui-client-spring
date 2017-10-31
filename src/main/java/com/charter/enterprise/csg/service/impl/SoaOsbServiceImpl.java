/**
 * 
 */
package com.charter.enterprise.csg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charter.enterprise.csg.repository.SoaOsbRepository;
import com.charter.enterprise.csg.service.SoaOsbService;
import com.charter.enterprise.customer.queryidentity.AccountIdentityType;
import com.charter.enterprise.customer.queryidentity.QueryIdentityRequestBodyType;
import com.charter.enterprise.customer.queryidentity.QueryIdentityRequestBodyType.Preferences;
import com.charter.enterprise.customer.queryidentity.QueryIdentityRequestType;
import com.charter.enterprise.customer.queryidentity.QueryIdentityResponseType;
import com.charter.enterprise.customer.queryidentity.RequestHeaderType;
import com.charter.enterprise.updateidentity.UpdateIdentityRequestBodyType;
import com.charter.enterprise.updateidentity.UpdateIdentityRequestBodyType.IdentityModification;
import com.charter.enterprise.updateidentity.UpdateIdentityRequestType;
import com.charter.enterprise.updateidentity.UpdateIdentityResponseType;
import com.charter.enterprise.updateidentity.UserIdentityType;

/**
 * @author Rahul
 *
 */
@Service
public class SoaOsbServiceImpl implements SoaOsbService {

	@Autowired
	SoaOsbRepository respository;
	
	@Override
	public QueryIdentityResponseType queryIdentity(String accountNumber, String clientIp, String auditUser) {
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
		
		return respository.queryIdentity(request);
	}

	@Override
	public UpdateIdentityResponseType updateQueryIdentity(String identity, String identityType, String nameIdentifier,
			String cpniCompliant, String clientIp, String auditUser) {
		UpdateIdentityRequestType request = new UpdateIdentityRequestType();
		
		com.charter.enterprise.updateidentity.RequestHeaderType requestHeader = new com.charter.enterprise.updateidentity.RequestHeaderType();
		requestHeader.setClientIP(clientIp);
		requestHeader.setAuditUser(auditUser);
		
		UpdateIdentityRequestBodyType requestBody = new UpdateIdentityRequestBodyType();
		
		UserIdentityType userIdentity = new UserIdentityType();
		userIdentity.setIdentity(identity);
		userIdentity.setIdentityType(identityType);
		userIdentity.setNameIdentifier(nameIdentifier);
		
		IdentityModification identityModification = new IdentityModification();
		identityModification.setCPNICompliant(cpniCompliant);
		
		requestBody.setUserIdentity(userIdentity);
		requestBody.setIdentityModification(identityModification);
		
		request.setRequestHeader(requestHeader);
		request.setRequestBody(requestBody);
		
		return respository.updateQueryIdentity(request);
	}

}