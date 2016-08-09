
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactDataHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactDataHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="audit" type="{http://www.charter.com/enterprise/prefcomm/v1}audit" minOccurs="0"/>
 *         &lt;element name="billingSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactDataId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contactTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invalidReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optinPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderPerformed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefereceAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="protectedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsCapable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDataHistory", propOrder = {
    "accountNumber",
    "audit",
    "billingSystemCode",
    "contactDataId",
    "contactId",
    "contactTypeCode",
    "contactValid",
    "contactValue",
    "id",
    "idmFlag",
    "invalidReason",
    "languageCode",
    "nameId",
    "optinPreference",
    "orderPerformed",
    "prefereceAccountId",
    "protectedFlag",
    "roleCode",
    "smsCapable"
})
public class ContactDataHistory {

    protected String accountNumber;
    protected Audit audit;
    protected String billingSystemCode;
    protected Long contactDataId;
    protected Long contactId;
    protected String contactTypeCode;
    protected String contactValid;
    protected String contactValue;
    protected Long id;
    protected String idmFlag;
    protected String invalidReason;
    protected String languageCode;
    protected String nameId;
    protected String optinPreference;
    protected String orderPerformed;
    protected Long prefereceAccountId;
    protected String protectedFlag;
    protected String roleCode;
    protected String smsCapable;

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
     * Gets the value of the audit property.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAudit(Audit value) {
        this.audit = value;
    }

    /**
     * Gets the value of the billingSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingSystemCode() {
        return billingSystemCode;
    }

    /**
     * Sets the value of the billingSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingSystemCode(String value) {
        this.billingSystemCode = value;
    }

    /**
     * Gets the value of the contactDataId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactDataId() {
        return contactDataId;
    }

    /**
     * Sets the value of the contactDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactDataId(Long value) {
        this.contactDataId = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactId(Long value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeCode() {
        return contactTypeCode;
    }

    /**
     * Sets the value of the contactTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTypeCode(String value) {
        this.contactTypeCode = value;
    }

    /**
     * Gets the value of the contactValid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactValid() {
        return contactValid;
    }

    /**
     * Sets the value of the contactValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactValid(String value) {
        this.contactValid = value;
    }

    /**
     * Gets the value of the contactValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactValue() {
        return contactValue;
    }

    /**
     * Sets the value of the contactValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactValue(String value) {
        this.contactValue = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the idmFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdmFlag() {
        return idmFlag;
    }

    /**
     * Sets the value of the idmFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdmFlag(String value) {
        this.idmFlag = value;
    }

    /**
     * Gets the value of the invalidReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidReason() {
        return invalidReason;
    }

    /**
     * Sets the value of the invalidReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidReason(String value) {
        this.invalidReason = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the nameId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameId() {
        return nameId;
    }

    /**
     * Sets the value of the nameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameId(String value) {
        this.nameId = value;
    }

    /**
     * Gets the value of the optinPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptinPreference() {
        return optinPreference;
    }

    /**
     * Sets the value of the optinPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptinPreference(String value) {
        this.optinPreference = value;
    }

    /**
     * Gets the value of the orderPerformed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPerformed() {
        return orderPerformed;
    }

    /**
     * Sets the value of the orderPerformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPerformed(String value) {
        this.orderPerformed = value;
    }

    /**
     * Gets the value of the prefereceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrefereceAccountId() {
        return prefereceAccountId;
    }

    /**
     * Sets the value of the prefereceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrefereceAccountId(Long value) {
        this.prefereceAccountId = value;
    }

    /**
     * Gets the value of the protectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFlag() {
        return protectedFlag;
    }

    /**
     * Sets the value of the protectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFlag(String value) {
        this.protectedFlag = value;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCode(String value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the smsCapable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsCapable() {
        return smsCapable;
    }

    /**
     * Sets the value of the smsCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsCapable(String value) {
        this.smsCapable = value;
    }

}
