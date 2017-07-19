
package com.charter.enterprise.billing.csg.services;

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
@WebServiceClient(name = "ServicesService", targetNamespace = "http://charter.com/enterprise/billing/csg/services", wsdlLocation = "file:/D:/project/Git%20Lab/CSG-API/master/src/main/resources/wsdl/eai/ServicesService.wsdl")
public class ServicesService_Service
    extends Service
{

    private final static URL SERVICESSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.charter.enterprise.billing.csg.services.ServicesService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.charter.enterprise.billing.csg.services.ServicesService_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/project/Git%20Lab/CSG-API/master/src/main/resources/wsdl/eai/ServicesService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/project/Git%20Lab/CSG-API/master/src/main/resources/wsdl/eai/ServicesService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SERVICESSERVICE_WSDL_LOCATION = url;
    }

    public ServicesService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicesService_Service() {
        super(SERVICESSERVICE_WSDL_LOCATION, new QName("http://charter.com/enterprise/billing/csg/services", "ServicesService"));
    }

    /**
     * 
     * @return
     *     returns ServicesService
     */
    @WebEndpoint(name = "ServicesService")
    public ServicesService getServicesService() {
        return super.getPort(new QName("http://charter.com/enterprise/billing/csg/services", "ServicesService"), ServicesService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicesService
     */
    @WebEndpoint(name = "ServicesService")
    public ServicesService getServicesService(WebServiceFeature... features) {
        return super.getPort(new QName("http://charter.com/enterprise/billing/csg/services", "ServicesService"), ServicesService.class, features);
    }

}