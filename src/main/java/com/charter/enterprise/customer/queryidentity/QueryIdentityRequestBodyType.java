
package com.charter.enterprise.customer.queryidentity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryIdentityRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryIdentityRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserIdentity" type="{http://charter.com/enterprise/customer/QueryIdentity}UserIdentityType" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://charter.com/enterprise/customer/QueryIdentity}AccountIdentityType" minOccurs="0"/>
 *         &lt;element name="IncludeSecurityQuestions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeSecurityAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Preferences">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IncludePreferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryIdentityRequestBodyType", propOrder = {
    "userIdentity",
    "accountNumber",
    "includeSecurityQuestions",
    "includeSecurityAnswers",
    "preferences",
    "firstName",
    "lastName",
    "contactPhone"
})
public class QueryIdentityRequestBodyType {

    @XmlElement(name = "UserIdentity")
    protected UserIdentityType userIdentity;
    @XmlElement(name = "AccountNumber")
    protected AccountIdentityType accountNumber;
    @XmlElement(name = "IncludeSecurityQuestions")
    protected boolean includeSecurityQuestions;
    @XmlElement(name = "IncludeSecurityAnswers")
    protected Boolean includeSecurityAnswers;
    @XmlElement(name = "Preferences", required = true)
    protected QueryIdentityRequestBodyType.Preferences preferences;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "ContactPhone")
    protected String contactPhone;

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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentityType }
     *     
     */
    public AccountIdentityType getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentityType }
     *     
     */
    public void setAccountNumber(AccountIdentityType value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the includeSecurityQuestions property.
     * 
     */
    public boolean isIncludeSecurityQuestions() {
        return includeSecurityQuestions;
    }

    /**
     * Sets the value of the includeSecurityQuestions property.
     * 
     */
    public void setIncludeSecurityQuestions(boolean value) {
        this.includeSecurityQuestions = value;
    }

    /**
     * Gets the value of the includeSecurityAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSecurityAnswers() {
        return includeSecurityAnswers;
    }

    /**
     * Sets the value of the includeSecurityAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSecurityAnswers(Boolean value) {
        this.includeSecurityAnswers = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link QueryIdentityRequestBodyType.Preferences }
     *     
     */
    public QueryIdentityRequestBodyType.Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryIdentityRequestBodyType.Preferences }
     *     
     */
    public void setPreferences(QueryIdentityRequestBodyType.Preferences value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
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
     *         &lt;element name="IncludePreferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "includePreferences",
        "serviceIdentifier",
        "service",
        "serviceType"
    })
    public static class Preferences {

        @XmlElement(name = "IncludePreferences")
        protected boolean includePreferences;
        @XmlElement(name = "ServiceIdentifier")
        protected Integer serviceIdentifier;
        @XmlElement(name = "Service")
        protected String service;
        @XmlElement(name = "ServiceType")
        protected String serviceType;

        /**
         * Gets the value of the includePreferences property.
         * 
         */
        public boolean isIncludePreferences() {
            return includePreferences;
        }

        /**
         * Sets the value of the includePreferences property.
         * 
         */
        public void setIncludePreferences(boolean value) {
            this.includePreferences = value;
        }

        /**
         * Gets the value of the serviceIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getServiceIdentifier() {
            return serviceIdentifier;
        }

        /**
         * Sets the value of the serviceIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setServiceIdentifier(Integer value) {
            this.serviceIdentifier = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setService(String value) {
            this.service = value;
        }

        /**
         * Gets the value of the serviceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceType(String value) {
            this.serviceType = value;
        }

    }

}
