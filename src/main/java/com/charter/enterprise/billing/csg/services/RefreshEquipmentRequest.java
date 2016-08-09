
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CsgHeaderInfo" type="{http://charter.com/enterprise/billing/csg/services}CsgHeaderInfo" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentList" type="{http://charter.com/enterprise/billing/csg/services}ArrayOfRefreshEquipmentRequestEquipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "csgHeaderInfo",
    "customerId",
    "locationId",
    "requestedAction",
    "equipmentList"
})
@XmlRootElement(name = "RefreshEquipmentRequest")
public class RefreshEquipmentRequest {

    @XmlElement(name = "CsgHeaderInfo")
    protected CsgHeaderInfo csgHeaderInfo;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "RequestedAction")
    protected String requestedAction;
    @XmlElement(name = "EquipmentList")
    protected ArrayOfRefreshEquipmentRequestEquipment equipmentList;

    /**
     * Gets the value of the csgHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CsgHeaderInfo }
     *     
     */
    public CsgHeaderInfo getCsgHeaderInfo() {
        return csgHeaderInfo;
    }

    /**
     * Sets the value of the csgHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsgHeaderInfo }
     *     
     */
    public void setCsgHeaderInfo(CsgHeaderInfo value) {
        this.csgHeaderInfo = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the requestedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedAction() {
        return requestedAction;
    }

    /**
     * Sets the value of the requestedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedAction(String value) {
        this.requestedAction = value;
    }

    /**
     * Gets the value of the equipmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRefreshEquipmentRequestEquipment }
     *     
     */
    public ArrayOfRefreshEquipmentRequestEquipment getEquipmentList() {
        return equipmentList;
    }

    /**
     * Sets the value of the equipmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRefreshEquipmentRequestEquipment }
     *     
     */
    public void setEquipmentList(ArrayOfRefreshEquipmentRequestEquipment value) {
        this.equipmentList = value;
    }

}
