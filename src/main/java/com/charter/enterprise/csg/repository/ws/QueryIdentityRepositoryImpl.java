/**
 * 
 */
package com.charter.enterprise.csg.repository.ws;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Repository;

import com.charter.enterprise.csg.exception.SoaOsbException;
import com.charter.enterprise.csg.repository.QueryIdentityRepository;
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
	
	public QueryIdentityRepositoryImpl() {
		String trustStore = System.getenv("JAVA_HOME") + File.separator
									+ "jre" + File.separator
									+ "lib" + File.separator
									+ "security" + File.separator
									+ "cacerts";
		System.setProperty("javax.net.ssl.trustStore", trustStore);
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		System.setProperty("javax.net.debug", "ssl");
	}
	
	@Override
	public QueryIdentityResponseType process(QueryIdentityRequestType request) {
		QueryIdentityIDMDBReqABCSImpl service = (QueryIdentityIDMDBReqABCSImpl)queryIdentity.getObject();
		
		QueryIdentityResponseType response = null;
		try {
			response = service.process(request);
		} catch(RemoteAccessException e) {
			logger.error(e.getMessage());
			throw new SoaOsbException(e.getMessage());
		}
		
		return response;
	}
}