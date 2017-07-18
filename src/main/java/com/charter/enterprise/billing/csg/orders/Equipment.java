
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Equipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Equipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Model">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NotSpecified"/>
 *               &lt;enumeration value="Modem"/>
 *               &lt;enumeration value="Router"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NotSpecified"/>
 *               &lt;enumeration value="ModemPurchase"/>
 *               &lt;enumeration value="RouterPurchase"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Ownership">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NotSpecified"/>
 *               &lt;enumeration value="Purchase"/>
 *               &lt;enumeration value="Rental"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedFunction" type="{http://charter.com/enterprise/billing/csg/orders}RequestedFunction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equipment", propOrder = {
    "model",
    "type",
    "ownership",
    "macAddress",
    "outlet",
    "requestedFunction"
})
public class Equipment {

    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Ownership", required = true)
    protected String ownership;
    @XmlElement(name = "MacAddress")
    protected String macAddress;
    @XmlElement(name = "Outlet")
    protected String outlet;
    @XmlElement(name = "RequestedFunction", required = true)
    protected RequestedFunction requestedFunction;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnership(String value) {
        this.ownership = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the outlet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlet() {
        return outlet;
    }

    /**
     * Sets the value of the outlet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlet(String value) {
        this.outlet = value;
    }

    /**
     * Gets the value of the requestedFunction property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedFunction }
     *     
     */
    public RequestedFunction getRequestedFunction() {
        return requestedFunction;
    }

    /**
     * Sets the value of the requestedFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedFunction }
     *     
     */
    public void setRequestedFunction(RequestedFunction value) {
        this.requestedFunction = value;
    }

}
