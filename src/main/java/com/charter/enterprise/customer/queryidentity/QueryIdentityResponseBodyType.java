
package com.charter.enterprise.customer.queryidentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryIdentityResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryIdentityResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identity" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserIdentity" type="{http://charter.com/enterprise/customer/QueryIdentity}UserIdentityType"/>
 *                   &lt;element name="AccountNumber" type="{http://charter.com/enterprise/customer/QueryIdentity}AccountIdentityType" minOccurs="0"/>
 *                   &lt;element name="ContactVerified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CPNICompliant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LastLoginIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SpendingLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LockExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CPNICompliantDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmailFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmailAdminPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmailStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SecurityQuestions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SecurityQuestion">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Preferences" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Preference" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;sequence>
 *                                         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                         &lt;sequence>
 *                                           &lt;element name="ParentService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                           &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;/sequence>
 *                                       &lt;/sequence>
 *                                       &lt;sequence>
 *                                         &lt;element name="ValueIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "QueryIdentityResponseBodyType", propOrder = {
    "identity"
})
public class QueryIdentityResponseBodyType {

    @XmlElement(name = "Identity", required = true)
    protected List<QueryIdentityResponseBodyType.Identity> identity;

    /**
     * Gets the value of the identity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryIdentityResponseBodyType.Identity }
     * 
     * 
     */
    public List<QueryIdentityResponseBodyType.Identity> getIdentity() {
        if (identity == null) {
            identity = new ArrayList<QueryIdentityResponseBodyType.Identity>();
        }
        return this.identity;
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
     *         &lt;element name="UserIdentity" type="{http://charter.com/enterprise/customer/QueryIdentity}UserIdentityType"/>
     *         &lt;element name="AccountNumber" type="{http://charter.com/enterprise/customer/QueryIdentity}AccountIdentityType" minOccurs="0"/>
     *         &lt;element name="ContactVerified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CPNICompliant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LastLoginIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SpendingLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LockExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CPNICompliantDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmailFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmailAdminPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmailStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SecurityQuestions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SecurityQuestion">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Preferences" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Preference" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;sequence>
     *                               &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                               &lt;sequence>
     *                                 &lt;element name="ParentService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                 &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;/sequence>
     *                             &lt;/sequence>
     *                             &lt;sequence>
     *                               &lt;element name="ValueIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                               &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;/sequence>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "userIdentity",
        "accountNumber",
        "contactVerified",
        "cpniCompliant",
        "status",
        "role",
        "firstName",
        "lastName",
        "contactPhone",
        "timeZoneOffset",
        "expirationDate",
        "lastLoginDate",
        "lastLoginIP",
        "spendingLimit",
        "lockExpirationDate",
        "cpniCompliantDate",
        "contactEmail",
        "emailFamily",
        "emailAdminPolicy",
        "emailStatus",
        "securityQuestions",
        "preferences"
    })
    public static class Identity {

        @XmlElement(name = "UserIdentity", required = true)
        protected UserIdentityType userIdentity;
        @XmlElement(name = "AccountNumber")
        protected AccountIdentityType accountNumber;
        @XmlElement(name = "ContactVerified")
        protected String contactVerified;
        @XmlElement(name = "CPNICompliant")
        protected String cpniCompliant;
        @XmlElement(name = "Status", required = true)
        protected String status;
        @XmlElement(name = "Role")
        protected String role;
        @XmlElement(name = "FirstName")
        protected String firstName;
        @XmlElement(name = "LastName")
        protected String lastName;
        @XmlElement(name = "ContactPhone")
        protected String contactPhone;
        @XmlElement(name = "TimeZoneOffset")
        protected String timeZoneOffset;
        @XmlElement(name = "ExpirationDate")
        protected String expirationDate;
        @XmlElement(name = "LastLoginDate")
        protected String lastLoginDate;
        @XmlElement(name = "LastLoginIP")
        protected String lastLoginIP;
        @XmlElement(name = "SpendingLimit")
        protected String spendingLimit;
        @XmlElement(name = "LockExpirationDate")
        protected String lockExpirationDate;
        @XmlElement(name = "CPNICompliantDate")
        protected String cpniCompliantDate;
        @XmlElement(name = "ContactEmail")
        protected String contactEmail;
        @XmlElement(name = "EmailFamily")
        protected String emailFamily;
        @XmlElement(name = "EmailAdminPolicy")
        protected String emailAdminPolicy;
        @XmlElement(name = "EmailStatus")
        protected String emailStatus;
        @XmlElement(name = "SecurityQuestions")
        protected QueryIdentityResponseBodyType.Identity.SecurityQuestions securityQuestions;
        @XmlElement(name = "Preferences")
        protected QueryIdentityResponseBodyType.Identity.Preferences preferences;

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
         * Gets the value of the contactVerified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactVerified() {
            return contactVerified;
        }

        /**
         * Sets the value of the contactVerified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactVerified(String value) {
            this.contactVerified = value;
        }

        /**
         * Gets the value of the cpniCompliant property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPNICompliant() {
            return cpniCompliant;
        }

        /**
         * Sets the value of the cpniCompliant property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPNICompliant(String value) {
            this.cpniCompliant = value;
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

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
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
         * Gets the value of the timeZoneOffset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeZoneOffset() {
            return timeZoneOffset;
        }

        /**
         * Sets the value of the timeZoneOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeZoneOffset(String value) {
            this.timeZoneOffset = value;
        }

        /**
         * Gets the value of the expirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpirationDate() {
            return expirationDate;
        }

        /**
         * Sets the value of the expirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpirationDate(String value) {
            this.expirationDate = value;
        }

        /**
         * Gets the value of the lastLoginDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastLoginDate() {
            return lastLoginDate;
        }

        /**
         * Sets the value of the lastLoginDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastLoginDate(String value) {
            this.lastLoginDate = value;
        }

        /**
         * Gets the value of the lastLoginIP property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastLoginIP() {
            return lastLoginIP;
        }

        /**
         * Sets the value of the lastLoginIP property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastLoginIP(String value) {
            this.lastLoginIP = value;
        }

        /**
         * Gets the value of the spendingLimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpendingLimit() {
            return spendingLimit;
        }

        /**
         * Sets the value of the spendingLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpendingLimit(String value) {
            this.spendingLimit = value;
        }

        /**
         * Gets the value of the lockExpirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLockExpirationDate() {
            return lockExpirationDate;
        }

        /**
         * Sets the value of the lockExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLockExpirationDate(String value) {
            this.lockExpirationDate = value;
        }

        /**
         * Gets the value of the cpniCompliantDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPNICompliantDate() {
            return cpniCompliantDate;
        }

        /**
         * Sets the value of the cpniCompliantDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPNICompliantDate(String value) {
            this.cpniCompliantDate = value;
        }

        /**
         * Gets the value of the contactEmail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactEmail() {
            return contactEmail;
        }

        /**
         * Sets the value of the contactEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactEmail(String value) {
            this.contactEmail = value;
        }

        /**
         * Gets the value of the emailFamily property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailFamily() {
            return emailFamily;
        }

        /**
         * Sets the value of the emailFamily property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailFamily(String value) {
            this.emailFamily = value;
        }

        /**
         * Gets the value of the emailAdminPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailAdminPolicy() {
            return emailAdminPolicy;
        }

        /**
         * Sets the value of the emailAdminPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailAdminPolicy(String value) {
            this.emailAdminPolicy = value;
        }

        /**
         * Gets the value of the emailStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailStatus() {
            return emailStatus;
        }

        /**
         * Sets the value of the emailStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailStatus(String value) {
            this.emailStatus = value;
        }

        /**
         * Gets the value of the securityQuestions property.
         * 
         * @return
         *     possible object is
         *     {@link QueryIdentityResponseBodyType.Identity.SecurityQuestions }
         *     
         */
        public QueryIdentityResponseBodyType.Identity.SecurityQuestions getSecurityQuestions() {
            return securityQuestions;
        }

        /**
         * Sets the value of the securityQuestions property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryIdentityResponseBodyType.Identity.SecurityQuestions }
         *     
         */
        public void setSecurityQuestions(QueryIdentityResponseBodyType.Identity.SecurityQuestions value) {
            this.securityQuestions = value;
        }

        /**
         * Gets the value of the preferences property.
         * 
         * @return
         *     possible object is
         *     {@link QueryIdentityResponseBodyType.Identity.Preferences }
         *     
         */
        public QueryIdentityResponseBodyType.Identity.Preferences getPreferences() {
            return preferences;
        }

        /**
         * Sets the value of the preferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryIdentityResponseBodyType.Identity.Preferences }
         *     
         */
        public void setPreferences(QueryIdentityResponseBodyType.Identity.Preferences value) {
            this.preferences = value;
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
         *         &lt;element name="Preference" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;sequence>
         *                     &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                     &lt;sequence>
         *                       &lt;element name="ParentService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                       &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;/sequence>
         *                   &lt;/sequence>
         *                   &lt;sequence>
         *                     &lt;element name="ValueIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                     &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;/sequence>
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
        @XmlType(name = "", propOrder = {
            "preference"
        })
        public static class Preferences {

            @XmlElement(name = "Preference")
            protected List<QueryIdentityResponseBodyType.Identity.Preferences.Preference> preference;

            /**
             * Gets the value of the preference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the preference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPreference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueryIdentityResponseBodyType.Identity.Preferences.Preference }
             * 
             * 
             */
            public List<QueryIdentityResponseBodyType.Identity.Preferences.Preference> getPreference() {
                if (preference == null) {
                    preference = new ArrayList<QueryIdentityResponseBodyType.Identity.Preferences.Preference>();
                }
                return this.preference;
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
             *         &lt;sequence>
             *           &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *           &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *           &lt;sequence>
             *             &lt;element name="ParentService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *             &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *           &lt;/sequence>
             *         &lt;/sequence>
             *         &lt;sequence>
             *           &lt;element name="ValueIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *           &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;/sequence>
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
                "serviceType",
                "serviceIdentifier",
                "parentService",
                "service",
                "valueIdentifier",
                "value"
            })
            public static class Preference {

                @XmlElement(name = "ServiceType", required = true)
                protected String serviceType;
                @XmlElement(name = "ServiceIdentifier")
                protected int serviceIdentifier;
                @XmlElement(name = "ParentService")
                protected String parentService;
                @XmlElement(name = "Service", required = true)
                protected String service;
                @XmlElement(name = "ValueIdentifier")
                protected int valueIdentifier;
                @XmlElement(name = "Value", required = true)
                protected String value;

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

                /**
                 * Gets the value of the serviceIdentifier property.
                 * 
                 */
                public int getServiceIdentifier() {
                    return serviceIdentifier;
                }

                /**
                 * Sets the value of the serviceIdentifier property.
                 * 
                 */
                public void setServiceIdentifier(int value) {
                    this.serviceIdentifier = value;
                }

                /**
                 * Gets the value of the parentService property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParentService() {
                    return parentService;
                }

                /**
                 * Sets the value of the parentService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParentService(String value) {
                    this.parentService = value;
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
                 * Gets the value of the valueIdentifier property.
                 * 
                 */
                public int getValueIdentifier() {
                    return valueIdentifier;
                }

                /**
                 * Sets the value of the valueIdentifier property.
                 * 
                 */
                public void setValueIdentifier(int value) {
                    this.valueIdentifier = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

            }

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
         *         &lt;element name="SecurityQuestion">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "securityQuestion"
        })
        public static class SecurityQuestions {

            @XmlElement(name = "SecurityQuestion", required = true)
            protected QueryIdentityResponseBodyType.Identity.SecurityQuestions.SecurityQuestion securityQuestion;

            /**
             * Gets the value of the securityQuestion property.
             * 
             * @return
             *     possible object is
             *     {@link QueryIdentityResponseBodyType.Identity.SecurityQuestions.SecurityQuestion }
             *     
             */
            public QueryIdentityResponseBodyType.Identity.SecurityQuestions.SecurityQuestion getSecurityQuestion() {
                return securityQuestion;
            }

            /**
             * Sets the value of the securityQuestion property.
             * 
             * @param value
             *     allowed object is
             *     {@link QueryIdentityResponseBodyType.Identity.SecurityQuestions.SecurityQuestion }
             *     
             */
            public void setSecurityQuestion(QueryIdentityResponseBodyType.Identity.SecurityQuestions.SecurityQuestion value) {
                this.securityQuestion = value;
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
             *         &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "secretQuestionIdentifier",
                "secretQuestion",
                "answer"
            })
            public static class SecurityQuestion {

                @XmlElement(name = "SecretQuestionIdentifier")
                protected int secretQuestionIdentifier;
                @XmlElement(name = "SecretQuestion", required = true)
                protected String secretQuestion;
                @XmlElement(name = "Answer")
                protected String answer;

                /**
                 * Gets the value of the secretQuestionIdentifier property.
                 * 
                 */
                public int getSecretQuestionIdentifier() {
                    return secretQuestionIdentifier;
                }

                /**
                 * Sets the value of the secretQuestionIdentifier property.
                 * 
                 */
                public void setSecretQuestionIdentifier(int value) {
                    this.secretQuestionIdentifier = value;
                }

                /**
                 * Gets the value of the secretQuestion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSecretQuestion() {
                    return secretQuestion;
                }

                /**
                 * Sets the value of the secretQuestion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSecretQuestion(String value) {
                    this.secretQuestion = value;
                }

                /**
                 * Gets the value of the answer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAnswer() {
                    return answer;
                }

                /**
                 * Sets the value of the answer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAnswer(String value) {
                    this.answer = value;
                }

            }

        }

    }

}
