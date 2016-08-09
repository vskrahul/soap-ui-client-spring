
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPreferenceHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPreferenceHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="audit" type="{http://www.charter.com/enterprise/prefcomm/v1}audit" minOccurs="0"/>
 *         &lt;element name="billingSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactDataId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contactMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPreferenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contactTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabledFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderPerformed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefereceAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="roleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceEventCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPreferenceHistory", propOrder = {
    "accountNumber",
    "audit",
    "billingSystemCode",
    "contactDataId",
    "contactMethodCode",
    "contactPreferenceId",
    "contactTypeCode",
    "disabledFlag",
    "id",
    "orderPerformed",
    "prefereceAccountId",
    "roleCode",
    "serviceEventCode"
})
public class ContactPreferenceHistory {

    protected String accountNumber;
    protected Audit audit;
    protected String billingSystemCode;
    protected Long contactDataId;
    protected String contactMethodCode;
    protected Long contactPreferenceId;
    protected String contactTypeCode;
    protected String disabledFlag;
    protected Long id;
    protected String orderPerformed;
    protected Long prefereceAccountId;
    protected String roleCode;
    protected String serviceEventCode;

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
     * Gets the value of the contactMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethodCode() {
        return contactMethodCode;
    }

    /**
     * Sets the value of the contactMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethodCode(String value) {
        this.contactMethodCode = value;
    }

    /**
     * Gets the value of the contactPreferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPreferenceId() {
        return contactPreferenceId;
    }

    /**
     * Sets the value of the contactPreferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPreferenceId(Long value) {
        this.contactPreferenceId = value;
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
     * Gets the value of the disabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabledFlag() {
        return disabledFlag;
    }

    /**
     * Sets the value of the disabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabledFlag(String value) {
        this.disabledFlag = value;
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
     * Gets the value of the serviceEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceEventCode() {
        return serviceEventCode;
    }

    /**
     * Sets the value of the serviceEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEventCode(String value) {
        this.serviceEventCode = value;
    }

}
