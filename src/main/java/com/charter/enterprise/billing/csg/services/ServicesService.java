
package com.charter.enterprise.billing.csg.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ServicesService", targetNamespace = "http://charter.com/enterprise/billing/csg/services")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicesService {


    /**
     * 
     * @param getCurrentServicesRequest
     * @return
     *     returns com.charter.enterprise.billing.csg.services.GetCurrentServicesResponse
     */
    @WebMethod(operationName = "GetCurrentServices", action = "http://charter.com/enterprise/billing/csg/services:getCurrentServicesIn")
    @WebResult(name = "GetCurrentServicesResponse", targetNamespace = "http://charter.com/enterprise/billing/csg/services", partName = "GetCurrentServicesResult")
    public GetCurrentServicesResponse getCurrentServices(
        @WebParam(name = "GetCurrentServicesRequest", targetNamespace = "http://charter.com/enterprise/billing/csg/services", partName = "getCurrentServicesRequest")
        GetCurrentServicesRequest getCurrentServicesRequest);

    /**
     * 
     * @param getServiceabilityRequest
     * @return
     *     returns com.charter.enterprise.billing.csg.services.GetServiceabilityResponse
     */
    @WebMethod(operationName = "GetServiceability", action = "http://charter.com/enterprise/billing/csg/services:getServiceabilityIn")
    @WebResult(name = "GetServiceabilityResponse", targetNamespace = "http://charter.com/enterprise/billing/csg/services", partName = "GetServiceabilityResult")
    public GetServiceabilityResponse getServiceability(
        @WebParam(name = "GetServiceabilityRequest", targetNamespace = "http://charter.com/enterprise/billing/csg/services", partName = "getServiceabilityRequest")
        GetServiceabilityRequest getServiceabilityRequest);

    /**
     * 
     * @param refreshEquipmentRequest
     * @return
     *     returns com.charter.enterprise.billing.csg.services.RefreshEquipmentResponse
     */
    @WebMethod(operationName = "RefreshEquipment", action = "http://charter.com/enterprise/billing/csg/services:refreshEquipmentIn")
    @WebResult(name = "RefreshEquipmentResponse", targetNamespace = "http://charter.com/enterprise/billing/csg/services", partName = "RefreshEquipmentResult")
    public RefreshEquipmentResponse refreshEquipment(
        @WebParam(name = "RefreshEquipmentRequest", targetNamespace = "http://charter.com/enterprise/billing/csg/services", partName = "refreshEquipmentRequest")
        RefreshEquipmentRequest refreshEquipmentRequest);

}
