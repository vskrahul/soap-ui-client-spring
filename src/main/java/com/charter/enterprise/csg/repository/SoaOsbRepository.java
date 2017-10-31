/**
 * 
 */
package com.charter.enterprise.csg.repository;

import com.charter.enterprise.customer.queryidentity.QueryIdentityRequestType;
import com.charter.enterprise.customer.queryidentity.QueryIdentityResponseType;
import com.charter.enterprise.updateidentity.UpdateIdentityRequestType;
import com.charter.enterprise.updateidentity.UpdateIdentityResponseType;

/**
 * @author Rahul
 *
 */
public interface SoaOsbRepository {

	/**
	 * To query SOA-OSB SOAP web services operation for {@link http://charter.com/enterprise/customer/QueryIdentity}
	 * @param request {@link QueryIdentityRequestType}
	 * @return {@link QueryIdentityResponseType}
	 */
	public QueryIdentityResponseType queryIdentity(QueryIdentityRequestType request);
	
	/**
	 * To query SOA-OSB:updateQueryIdentity web services operation for {@link https://esbauth.corp.chartercom.com:11102/UpdateIdentity/proxy/PS_UpdateIdentity_v1r0}
	 * 
	 * @param request {@link UpdateIdentityRequestType}
	 * @return {@link UpdateIdentityResponseType}
	 */
	public UpdateIdentityResponseType updateQueryIdentity(UpdateIdentityRequestType request);


}
