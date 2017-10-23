
package com.charter.enterprise.updateidentity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentityResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserIdentity" type="{http://charter.com/enterprise/updateidentity}UserIdentityType"/>
 *         &lt;element name="AccountIdentity" type="{http://charter.com/enterprise/updateidentity}AccountIdentityType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityResponseBodyType", propOrder = {
    "userIdentity",
    "accountIdentity",
    "status"
})
public class IdentityResponseBodyType {

    @XmlElement(name = "UserIdentity", required = true)
    protected UserIdentityType userIdentity;
    @XmlElement(name = "AccountIdentity")
    protected AccountIdentityType accountIdentity;
    @XmlElement(name = "Status", required = true)
    protected String status;

    /**
     * Gets the value of the userIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentityType }
     *     
     */
    public UserIdentityType getUserIdentity() {
        return userIdentity;
    }

    /**
     * Sets the value of the userIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentityType }
     *     
     */
    public void setUserIdentity(UserIdentityType value) {
        this.userIdentity = value;
    }

    /**
     * Gets the value of the accountIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentityType }
     *     
     */
    public AccountIdentityType getAccountIdentity() {
        return accountIdentity;
    }

    /**
     * Sets the value of the accountIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentityType }
     *     
     */
    public void setAccountIdentity(AccountIdentityType value) {
        this.accountIdentity = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
