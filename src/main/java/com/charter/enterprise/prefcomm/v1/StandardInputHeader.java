
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardInputHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standardInputHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientHostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientCallingService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="auditUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overrideCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standardInputHeader", propOrder = {
    "clientIp",
    "clientHostName",
    "clientCallingService",
    "auditUser",
    "transactionId",
    "overrideCache"
})
public class StandardInputHeader {

    @XmlElement(required = true)
    protected String clientIp;
    @XmlElement(required = true)
    protected String clientHostName;
    @XmlElement(required = true)
    protected String clientCallingService;
    @XmlElement(required = true)
    protected String auditUser;
    @XmlElement(required = true)
    protected String transactionId;
    protected Boolean overrideCache;

    /**
     * Gets the value of the clientIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * Sets the value of the clientIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIp(String value) {
        this.clientIp = value;
    }

    /**
     * Gets the value of the clientHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientHostName() {
        return clientHostName;
    }

    /**
     * Sets the value of the clientHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientHostName(String value) {
        this.clientHostName = value;
    }

    /**
     * Gets the value of the clientCallingService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCallingService() {
        return clientCallingService;
    }

    /**
     * Sets the value of the clientCallingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCallingService(String value) {
        this.clientCallingService = value;
    }

    /**
     * Gets the value of the auditUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditUser() {
        return auditUser;
    }

    /**
     * Sets the value of the auditUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditUser(String value) {
        this.auditUser = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the overrideCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideCache() {
        return overrideCache;
    }

    /**
     * Sets the value of the overrideCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideCache(Boolean value) {
        this.overrideCache = value;
    }

}
