
package com.charter.enterprise.billing.csg.orders;

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
 *         &lt;element name="CsgHeaderInfo" type="{http://charter.com/enterprise/billing/csg/orders}CsgHeaderInfo" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderClass" type="{http://charter.com/enterprise/billing/csg/orders}GetOrdersOrderClass"/>
 *         &lt;element name="OrderStatus" type="{http://charter.com/enterprise/billing/csg/orders}GetOrdersOrderStatus"/>
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
    "orderClass",
    "orderStatus"
})
@XmlRootElement(name = "GetOrdersRequest")
public class GetOrdersRequest {

    @XmlElement(name = "CsgHeaderInfo")
    protected CsgHeaderInfo csgHeaderInfo;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "OrderClass", required = true)
    protected GetOrdersOrderClass orderClass;
    @XmlElement(name = "OrderStatus", required = true)
    protected GetOrdersOrderStatus orderStatus;

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
     * Gets the value of the orderClass property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrdersOrderClass }
     *     
     */
    public GetOrdersOrderClass getOrderClass() {
        return orderClass;
    }

    /**
     * Sets the value of the orderClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrdersOrderClass }
     *     
     */
    public void setOrderClass(GetOrdersOrderClass value) {
        this.orderClass = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrdersOrderStatus }
     *     
     */
    public GetOrdersOrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrdersOrderStatus }
     *     
     */
    public void setOrderStatus(GetOrdersOrderStatus value) {
        this.orderStatus = value;
    }

}
