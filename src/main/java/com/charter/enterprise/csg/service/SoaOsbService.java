package com.charter.enterprise.csg.service;

import com.charter.enterprise.customer.queryidentity.QueryIdentityResponseType;
import com.charter.enterprise.updateidentity.UpdateIdentityResponseType;

/**
 * 
 * 
 * @author Rahul
 *
 */
public interface SoaOsbService {

	/**
	 * Query SOA-OSB:QueryIdentity operation for the given account number.
	 * 
	 * @param accountNumber String
	 * @param clientIp String
	 * @param auditUser String
	 * @return {@link QueryIdentityResponseType}
	 */
	public QueryIdentityResponseType queryIdentity(String accountNumber, String clientIp, String auditUser);
	
	/**
	 * Call SOA-OSB:UpdateIdentity operation for the give user identity.
	 * 
	 * @param identity String
	 * @param identityType String
	 * @param nameIdentifier String
	 * @param cpniCompliant String
	 * @param clientIp String
	 * @param auditUser String
	 * @return {@link UpdateIdentityResponseType}
	 */
	public UpdateIdentityResponseType updateQueryIdentity(String identity
														, String identityType
														, String nameIdentifier
														, String cpniCompliant
														, String clientIp, String auditUser);

}