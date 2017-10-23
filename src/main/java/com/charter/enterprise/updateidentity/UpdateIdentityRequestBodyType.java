
package com.charter.enterprise.updateidentity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateIdentityRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateIdentityRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserIdentity" type="{http://charter.com/enterprise/updateidentity}UserIdentityType"/>
 *         &lt;element name="IdentityModification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IdentityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IdentityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccountIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PurchaseAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SpendingLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmailFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmailAdminPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmailStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CPNICompliant" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(Y|y)"/>
 *                         &lt;pattern value="(N|n)"/>
 *                         &lt;pattern value="(A|a)"/>
 *                         &lt;pattern value="(P|p)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SecurityQuestions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SecurityQuestion">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                               &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SecurityQuestionModification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                               &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;/choice>
 *                             &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Preferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreferenceModification" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                               &lt;sequence>
 *                                 &lt;element name="ParentService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                 &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;/sequence>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ValueIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                               &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/choice>
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
@XmlType(name = "UpdateIdentityRequestBodyType", propOrder = {
    "userIdentity",
    "identityModification",
    "securityQuestions",
    "preferences"
})
public class UpdateIdentityRequestBodyType {

    @XmlElement(name = "UserIdentity", required = true)
    protected UserIdentityType userIdentity;
    @XmlElement(name = "IdentityModification")
    protected UpdateIdentityRequestBodyType.IdentityModification identityModification;
    @XmlElement(name = "SecurityQuestions")
    protected UpdateIdentityRequestBodyType.SecurityQuestions securityQuestions;
    @XmlElement(name = "Preferences")
    protected UpdateIdentityRequestBodyType.Preferences preferences;

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
     * Gets the value of the identityModification property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIdentityRequestBodyType.IdentityModification }
     *     
     */
    public UpdateIdentityRequestBodyType.IdentityModification getIdentityModification() {
        return identityModification;
    }

    /**
     * Sets the value of the identityModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIdentityRequestBodyType.IdentityModification }
     *     
     */
    public void setIdentityModification(UpdateIdentityRequestBodyType.IdentityModification value) {
        this.identityModification = value;
    }

    /**
     * Gets the value of the securityQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIdentityRequestBodyType.SecurityQuestions }
     *     
     */
    public UpdateIdentityRequestBodyType.SecurityQuestions getSecurityQuestions() {
        return securityQuestions;
    }

    /**
     * Sets the value of the securityQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIdentityRequestBodyType.SecurityQuestions }
     *     
     */
    public void setSecurityQuestions(UpdateIdentityRequestBodyType.SecurityQuestions value) {
        this.securityQuestions = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIdentityRequestBodyType.Preferences }
     *     
     */
    public UpdateIdentityRequestBodyType.Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIdentityRequestBodyType.Preferences }
     *     
     */
    public void setPreferences(UpdateIdentityRequestBodyType.Preferences value) {
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
     *         &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IdentityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IdentityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AccountIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PurchaseAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SpendingLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmailFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmailAdminPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmailStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CPNICompliant" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="(Y|y)"/>
     *               &lt;pattern value="(N|n)"/>
     *               &lt;pattern value="(A|a)"/>
     *               &lt;pattern value="(P|p)"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
    @XmlType(name = "", propOrder = {
        "identity",
        "identityType",
        "identityStatus",
        "password",
        "accountIdentifier",
        "accountNumber",
        "timeZoneOffset",
        "role",
        "purchaseAuthority",
        "spendingLimit",
        "contactEmail",
        "securityCode",
        "emailFamily",
        "emailAdminPolicy",
        "emailStatus",
        "cpniCompliant",
        "firstName",
        "lastName",
        "contactPhone"
    })
    public static class IdentityModification {

        @XmlElement(name = "Identity")
        protected String identity;
        @XmlElement(name = "IdentityType")
        protected String identityType;
        @XmlElement(name = "IdentityStatus")
        protected String identityStatus;
        @XmlElement(name = "Password")
        protected String password;
        @XmlElement(name = "AccountIdentifier")
        protected Integer accountIdentifier;
        @XmlElement(name = "AccountNumber")
        protected String accountNumber;
        @XmlElement(name = "TimeZoneOffset")
        protected String timeZoneOffset;
        @XmlElement(name = "Role")
        protected String role;
        @XmlElement(name = "PurchaseAuthority")
        protected String purchaseAuthority;
        @XmlElement(name = "SpendingLimit")
        protected String spendingLimit;
        @XmlElement(name = "ContactEmail")
        protected String contactEmail;
        @XmlElement(name = "SecurityCode")
        protected String securityCode;
        @XmlElement(name = "EmailFamily")
        protected String emailFamily;
        @XmlElement(name = "EmailAdminPolicy")
        protected String emailAdminPolicy;
        @XmlElement(name = "EmailStatus")
        protected String emailStatus;
        @XmlElement(name = "CPNICompliant")
        protected String cpniCompliant;
        @XmlElement(name = "FirstName")
        protected String firstName;
        @XmlElement(name = "LastName")
        protected String lastName;
        @XmlElement(name = "ContactPhone")
        protected String contactPhone;

        /**
         * Gets the value of the identity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentity() {
            return identity;
        }

        /**
         * Sets the value of the identity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentity(String value) {
            this.identity = value;
        }

        /**
         * Gets the value of the identityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentityType() {
            return identityType;
        }

        /**
         * Sets the value of the identityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentityType(String value) {
            this.identityType = value;
        }

        /**
         * Gets the value of the identityStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentityStatus() {
            return identityStatus;
        }

        /**
         * Sets the value of the identityStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentityStatus(String value) {
            this.identityStatus = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the accountIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAccountIdentifier() {
            return accountIdentifier;
        }

        /**
         * Sets the value of the accountIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAccountIdentifier(Integer value) {
            this.accountIdentifier = value;
        }

        /**
         * Gets the value of the accountNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
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
         * Gets the value of the purchaseAuthority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseAuthority() {
            return purchaseAuthority;
        }

        /**
         * Sets the value of the purchaseAuthority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseAuthority(String value) {
            this.purchaseAuthority = value;
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
         * Gets the value of the securityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecurityCode() {
            return securityCode;
        }

        /**
         * Sets the value of the securityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecurityCode(String value) {
            this.securityCode = value;
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
     *         &lt;element name="PreferenceModification" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                     &lt;sequence>
     *                       &lt;element name="ParentService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                       &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     &lt;/sequence>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ValueIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                     &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;/choice>
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
        "preferenceModification"
    })
    public static class Preferences {

        @XmlElement(name = "PreferenceModification", required = true)
        protected List<UpdateIdentityRequestBodyType.Preferences.PreferenceModification> preferenceModification;

        /**
         * Gets the value of the preferenceModification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preferenceModification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreferenceModification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateIdentityRequestBodyType.Preferences.PreferenceModification }
         * 
         * 
         */
        public List<UpdateIdentityRequestBodyType.Preferences.PreferenceModification> getPreferenceModification() {
            if (preferenceModification == null) {
                preferenceModification = new ArrayList<UpdateIdentityRequestBodyType.Preferences.PreferenceModification>();
            }
            return this.preferenceModification;
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
         *         &lt;choice>
         *           &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *           &lt;sequence>
         *             &lt;element name="ParentService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *             &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *           &lt;/sequence>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ValueIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *           &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;/choice>
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
            "serviceIdentifier",
            "parentService",
            "service",
            "valueIdentifier",
            "value"
        })
        public static class PreferenceModification {

            @XmlElement(name = "ServiceIdentifier")
            protected Integer serviceIdentifier;
            @XmlElement(name = "ParentService")
            protected String parentService;
            @XmlElement(name = "Service")
            protected String service;
            @XmlElement(name = "ValueIdentifier")
            protected Integer valueIdentifier;
            @XmlElement(name = "Value")
            protected String value;

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
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getValueIdentifier() {
                return valueIdentifier;
            }

            /**
             * Sets the value of the valueIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setValueIdentifier(Integer value) {
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
     *       &lt;choice>
     *         &lt;element name="SecurityQuestion">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                     &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SecurityQuestionModification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                     &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;/choice>
     *                   &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "securityQuestion",
        "securityQuestionModification"
    })
    public static class SecurityQuestions {

        @XmlElement(name = "SecurityQuestion")
        protected UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestion securityQuestion;
        @XmlElement(name = "SecurityQuestionModification")
        protected UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestionModification securityQuestionModification;

        /**
         * Gets the value of the securityQuestion property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestion }
         *     
         */
        public UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestion getSecurityQuestion() {
            return securityQuestion;
        }

        /**
         * Sets the value of the securityQuestion property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestion }
         *     
         */
        public void setSecurityQuestion(UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestion value) {
            this.securityQuestion = value;
        }

        /**
         * Gets the value of the securityQuestionModification property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestionModification }
         *     
         */
        public UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestionModification getSecurityQuestionModification() {
            return securityQuestionModification;
        }

        /**
         * Sets the value of the securityQuestionModification property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestionModification }
         *     
         */
        public void setSecurityQuestionModification(UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestionModification value) {
            this.securityQuestionModification = value;
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
         *         &lt;choice>
         *           &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *           &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;/choice>
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
            "secretQuestion"
        })
        public static class SecurityQuestion {

            @XmlElement(name = "SecretQuestionIdentifier")
            protected Integer secretQuestionIdentifier;
            @XmlElement(name = "SecretQuestion")
            protected String secretQuestion;

            /**
             * Gets the value of the secretQuestionIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSecretQuestionIdentifier() {
                return secretQuestionIdentifier;
            }

            /**
             * Sets the value of the secretQuestionIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSecretQuestionIdentifier(Integer value) {
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
         *         &lt;choice>
         *           &lt;element name="SecretQuestionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *           &lt;element name="SecretQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;/choice>
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
        public static class SecurityQuestionModification {

            @XmlElement(name = "SecretQuestionIdentifier")
            protected Integer secretQuestionIdentifier;
            @XmlElement(name = "SecretQuestion")
            protected String secretQuestion;
            @XmlElement(name = "Answer")
            protected String answer;

            /**
             * Gets the value of the secretQuestionIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSecretQuestionIdentifier() {
                return secretQuestionIdentifier;
            }

            /**
             * Sets the value of the secretQuestionIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSecretQuestionIdentifier(Integer value) {
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
