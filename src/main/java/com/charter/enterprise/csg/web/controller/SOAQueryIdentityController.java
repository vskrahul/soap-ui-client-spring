/**
 * 
 */
package com.charter.enterprise.csg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.charter.enterprise.csg.service.QueryIdentityService;
import com.charter.enterprise.customer.queryidentity.QueryIdentityResponseType;

/**
 * RestController to expose SOA-OSB:QueryIdentity operation as a REST full web service operation.
 * 
 * @author Rahul
 *
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "query-identity")
public class SOAQueryIdentityController {

	private Logger logger = LoggerFactory.getLogger(SOAQueryIdentityController.class);
	
	@Autowired
	private QueryIdentityService service;
	
	@RequestMapping(value = "process", method = {RequestMethod.GET})
	public QueryIdentityResponseType queryIdentity(@RequestParam("AccountID") String accountNumber
													, @RequestParam(name = "ClientIP", required = false, defaultValue = "192.168.1.1") String clientIp
													, @RequestParam(name = "AuditUser", required = false, defaultValue = "apcoe") String auditUser) {
		logger.info(String.format("Querying SOA-OSB for QueryIdentity for %s", accountNumber));
		return service.process(accountNumber, clientIp, auditUser);
	}
}