
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/services}Name" minOccurs="0"/>
 *         &lt;element name="Phone" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Primary" type="{http://charter.com/enterprise/billing/csg/services}PhoneNumber" minOccurs="0"/>
 *                   &lt;element name="Secondary" type="{http://charter.com/enterprise/billing/csg/services}PhoneNumber" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountId",
    "name",
    "phone"
})
public class Account {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "Phone")
    protected Account.Phone phone;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Account.Phone }
     *     
     */
    public Account.Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account.Phone }
     *     
     */
    public void setPhone(Account.Phone value) {
        this.phone = value;
    }


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
     *         &lt;element name="Primary" type="{http://charter.com/enterprise/billing/csg/services}PhoneNumber" minOccurs="0"/>
     *         &lt;element name="Secondary" type="{http://charter.com/enterprise/billing/csg/services}PhoneNumber" minOccurs="0"/>
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
        "primary",
        "secondary"
    })
    public static class Phone {

        @XmlElement(name = "Primary")
        protected PhoneNumber primary;
        @XmlElement(name = "Secondary")
        protected PhoneNumber secondary;

        /**
         * Gets the value of the primary property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneNumber }
         *     
         */
        public PhoneNumber getPrimary() {
            return primary;
        }

        /**
         * Sets the value of the primary property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneNumber }
         *     
         */
        public void setPrimary(PhoneNumber value) {
            this.primary = value;
        }

        /**
         * Gets the value of the secondary property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneNumber }
         *     
         */
        public PhoneNumber getSecondary() {
            return secondary;
        }

        /**
         * Sets the value of the secondary property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneNumber }
         *     
         */
        public void setSecondary(PhoneNumber value) {
            this.secondary = value;
        }

    }

}
