
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audit" type="{http://www.charter.com/enterprise/prefcomm/v1}audit"/>
 *         &lt;element name="contactData" type="{http://www.charter.com/enterprise/prefcomm/v1}contactData" minOccurs="0"/>
 *         &lt;element name="contactMethod" type="{http://www.charter.com/enterprise/prefcomm/v1}contactMethod"/>
 *         &lt;element name="defaultRecommendation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabledFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preferenceAccount" type="{http://www.charter.com/enterprise/prefcomm/v1}preferenceAccount"/>
 *         &lt;element name="serviceEvent" type="{http://www.charter.com/enterprise/prefcomm/v1}serviceEvent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPreference", propOrder = {
    "audit",
    "contactData",
    "contactMethod",
    "defaultRecommendation",
    "disabledFlag",
    "id",
    "preferenceAccount",
    "serviceEvent"
})
public class ContactPreference {

    @XmlElement(required = true)
    protected Audit audit;
    protected ContactData contactData;
    @XmlElement(required = true)
    protected ContactMethod contactMethod;
    protected String defaultRecommendation;
    @XmlElement(required = true)
    protected String disabledFlag;
    protected Long id;
    @XmlElement(required = true)
    protected PreferenceAccount preferenceAccount;
    @XmlElement(required = true)
    protected ServiceEvent serviceEvent;

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
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactData }
     *     
     */
    public ContactData getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactData }
     *     
     */
    public void setContactData(ContactData value) {
        this.contactData = value;
    }

    /**
     * Gets the value of the contactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethod }
     *     
     */
    public ContactMethod getContactMethod() {
        return contactMethod;
    }

    /**
     * Sets the value of the contactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethod }
     *     
     */
    public void setContactMethod(ContactMethod value) {
        this.contactMethod = value;
    }

    /**
     * Gets the value of the defaultRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRecommendation() {
        return defaultRecommendation;
    }

    /**
     * Sets the value of the defaultRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRecommendation(String value) {
        this.defaultRecommendation = value;
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
     * Gets the value of the preferenceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceAccount }
     *     
     */
    public PreferenceAccount getPreferenceAccount() {
        return preferenceAccount;
    }

    /**
     * Sets the value of the preferenceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceAccount }
     *     
     */
    public void setPreferenceAccount(PreferenceAccount value) {
        this.preferenceAccount = value;
    }

    /**
     * Gets the value of the serviceEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEvent }
     *     
     */
    public ServiceEvent getServiceEvent() {
        return serviceEvent;
    }

    /**
     * Sets the value of the serviceEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEvent }
     *     
     */
    public void setServiceEvent(ServiceEvent value) {
        this.serviceEvent = value;
    }

}
