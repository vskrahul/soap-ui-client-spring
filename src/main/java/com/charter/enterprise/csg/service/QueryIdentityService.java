/**
 * 
 */
package com.charter.enterprise.csg.service;

import com.charter.enterprise.csg.repository.QueryIdentityRepository;
import com.charter.enterprise.customer.queryidentity.QueryIdentityResponseType;

/**
 * Service to before {@link QueryIdentityRepository}
 * 
 * @author Rahul
 *
 */
public interface QueryIdentityService {

	/**
	 * Query SOA-OSB:QueryIdentity operation for the given account number.
	 * 
	 * @param accountNumber String
	 * @param clientIp String
	 * @param auditUser String
	 * @return {@link QueryIdentityResponseType}
	 */
	public QueryIdentityResponseType process(String accountNumber, String clientIp, String auditUser);
}