/**
 * 
 */
package com.charter.enterprise.csg.repository;

import com.charter.enterprise.customer.queryidentity.QueryIdentityRequestType;
import com.charter.enterprise.customer.queryidentity.QueryIdentityResponseType;

/**
 * Represent the Repository to Query SOA-OSB:QueryIdentitiy
 * 
 * @author Rahul
 *
 */
public interface QueryIdentityRepository {

	/**
	 * To query SOA-OSB SOAP web services operation for {@link http://charter.com/enterprise/customer/QueryIdentity}
	 * 
	 * @param request {@link QueryIdentityRequestType}
	 * @return {@link QueryIdentityResponseType}
	 */
	public QueryIdentityResponseType process(QueryIdentityRequestType request);
}