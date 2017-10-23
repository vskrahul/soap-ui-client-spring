
package com.charter.enterprise.billing.csg.accounts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AccountServicePort", targetNamespace = "http://charter.com/enterprise/billing/csg/accounts", wsdlLocation = "file:/D:/project/Git%20Lab/CSG-API/src/main/resources/wsdl/eai/AccountService.wsdl")
public class AccountServicePort
    extends Service
{

    private final static URL ACCOUNTSERVICEPORT_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.charter.enterprise.billing.csg.accounts.AccountServicePort.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.charter.enterprise.billing.csg.accounts.AccountServicePort.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/project/Git%20Lab/CSG-API/src/main/resources/wsdl/eai/AccountService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/project/Git%20Lab/CSG-API/src/main/resources/wsdl/eai/AccountService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ACCOUNTSERVICEPORT_WSDL_LOCATION = url;
    }

    public AccountServicePort(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountServicePort() {
        super(ACCOUNTSERVICEPORT_WSDL_LOCATION, new QName("http://charter.com/enterprise/billing/csg/accounts", "AccountServicePort"));
    }

    /**
     * 
     * @return
     *     returns AccountService
     */
    @WebEndpoint(name = "AccountService")
    public AccountService getAccountService() {
        return super.getPort(new QName("http://charter.com/enterprise/billing/csg/accounts", "AccountService"), AccountService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountService
     */
    @WebEndpoint(name = "AccountService")
    public AccountService getAccountService(WebServiceFeature... features) {
        return super.getPort(new QName("http://charter.com/enterprise/billing/csg/accounts", "AccountService"), AccountService.class, features);
    }

}
