
package com.charter.enterprise.updateidentity;

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
@WebServiceClient(name = "UpdateIdentity_Service", targetNamespace = "http://charter.com/enterprise/updateidentity", wsdlLocation = "file:/D:/project/Git%20Lab/CSG-API/src/main/resources/wsdl/soa/PS_UpdateIdentity_v1r0.wsdl")
public class UpdateIdentityService
    extends Service
{

    private final static URL UPDATEIDENTITYSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.charter.enterprise.updateidentity.UpdateIdentityService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.charter.enterprise.updateidentity.UpdateIdentityService.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/project/Git%20Lab/CSG-API/src/main/resources/wsdl/soa/PS_UpdateIdentity_v1r0.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/project/Git%20Lab/CSG-API/src/main/resources/wsdl/soa/PS_UpdateIdentity_v1r0.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        UPDATEIDENTITYSERVICE_WSDL_LOCATION = url;
    }

    public UpdateIdentityService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UpdateIdentityService() {
        super(UPDATEIDENTITYSERVICE_WSDL_LOCATION, new QName("http://charter.com/enterprise/updateidentity", "UpdateIdentity_Service"));
    }

    /**
     * 
     * @return
     *     returns UpdateIdentityPortType
     */
    @WebEndpoint(name = "UpdateIdentity_Port")
    public UpdateIdentityPortType getUpdateIdentityPort() {
        return super.getPort(new QName("http://charter.com/enterprise/updateidentity", "UpdateIdentity_Port"), UpdateIdentityPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UpdateIdentityPortType
     */
    @WebEndpoint(name = "UpdateIdentity_Port")
    public UpdateIdentityPortType getUpdateIdentityPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://charter.com/enterprise/updateidentity", "UpdateIdentity_Port"), UpdateIdentityPortType.class, features);
    }

}
