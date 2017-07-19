/**
 * 
 */
package com.charter.enterprise.csg.repository.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Repository;

import com.charter.enterprise.csg.exception.RemoteException;
import com.charter.enterprise.csg.repository.QueryIdentityRepository;
import com.charter.enterprise.csg.web.interceptor.RequestCounts;
import com.charter.enterprise.customer.queryidentity.QueryIdentityIDMDBReqABCSImpl;
import com.charter.enterprise.customer.queryidentity.QueryIdentityRequestType;
import com.charter.enterprise.customer.queryidentity.QueryIdentityResponseType;

/**
 * @author Rahul
 *
 */
@Repository
public class QueryIdentityRepositoryImpl implements QueryIdentityRepository {

	private Logger logger = LoggerFactory.getLogger(AccountRepositoryWs.class);
	
	@Autowired
	@Qualifier("queryIdentity")
	private JaxWsPortProxyFactoryBean queryIdentity;
	
	@Override
	public QueryIdentityResponseType process(QueryIdentityRequestType request) {
		QueryIdentityIDMDBReqABCSImpl service = (QueryIdentityIDMDBReqABCSImpl)queryIdentity.getObject();
		
		QueryIdentityResponseType response = null;
		
		try {
			response = service.process(request);
		} catch(RemoteAccessException e) {
			logger.error(e.getMessage());
			throw new RemoteException();
		} finally {
			RequestCounts instance = RequestCounts.getInstance();
			instance.setRequestCounter(instance.getRequestCounter() + 1);
		}
		
		return response;
	}
}