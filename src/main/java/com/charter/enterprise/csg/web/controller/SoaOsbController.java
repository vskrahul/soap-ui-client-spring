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

import com.charter.enterprise.csg.service.SoaOsbService;
import com.charter.enterprise.customer.queryidentity.QueryIdentityResponseType;
import com.charter.enterprise.updateidentity.UpdateIdentityResponseType;

/**
 * RestController to expose SOA-OSB:QueryIdentity operation as a REST full web service operation.
 * 
 * @author Rahul
 *
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "soa")
public class SoaOsbController {

	private Logger logger = LoggerFactory.getLogger(SoaOsbController.class);
	
	@Autowired
	private SoaOsbService service;
	
	@RequestMapping(value = "query-identity", method = {RequestMethod.GET})
	public QueryIdentityResponseType queryIdentity(@RequestParam("AccountID") String accountNumber
													, @RequestParam(name = "ClientIP", required = false, defaultValue = "192.168.1.1") String clientIp
													, @RequestParam(name = "AuditUser", required = false, defaultValue = "apcoe") String auditUser) {
		
		logger.info(String.format("Querying SOA-OSB for QueryIdentity for %s", accountNumber));
		return service.queryIdentity(accountNumber, clientIp, auditUser);
	}
	
	@RequestMapping(value = "update-identity", method = {RequestMethod.GET})
	public UpdateIdentityResponseType updateIdentity(@RequestParam("Identity") String identity
													, @RequestParam("IdentityType") String identityType
													, @RequestParam("NameIdentifier") String nameIdentifier
													, @RequestParam("CPNICompliant") String cpniCompliant
													, @RequestParam(name = "ClientIP", required = false, defaultValue = "192.168.1.1") String clientIp
													, @RequestParam(name = "AuditUser", required = false, defaultValue = "CHTRNET:apcoe") String auditUser) {
		logger.info(String.format("Querying SOA-OSB for QueryIdentity for [%s, %s, %s]", identity, identityType, nameIdentifier));
		return service.updateQueryIdentity(identity, identityType, nameIdentifier, cpniCompliant, clientIp, auditUser);
	}
}