
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audit" type="{http://www.charter.com/enterprise/prefcomm/v1}audit"/>
 *         &lt;element name="contact" type="{http://www.charter.com/enterprise/prefcomm/v1}contact"/>
 *         &lt;element name="contactType" type="{http://www.charter.com/enterprise/prefcomm/v1}contactType"/>
 *         &lt;element name="contactValid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invalidReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protectedContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SMSCapable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactData", propOrder = {
    "audit",
    "contact",
    "contactType",
    "contactValid",
    "contactValue",
    "id",
    "invalidReason",
    "optIn",
    "protectedContact",
    "smsCapable"
})
public class ContactData {

    @XmlElement(required = true)
    protected Audit audit;
    @XmlElement(required = true)
    protected Contact contact;
    @XmlElement(required = true)
    protected ContactType contactType;
    @XmlElement(required = true)
    protected String contactValid;
    @XmlElement(required = true)
    protected String contactValue;
    protected Long id;
    protected String invalidReason;
    @XmlElement(required = true)
    protected String optIn;
    protected String protectedContact;
    @XmlElement(name = "SMSCapable", required = true)
    protected String smsCapable;

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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContactType(ContactType value) {
        this.contactType = value;
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
     * Gets the value of the optIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptIn() {
        return optIn;
    }

    /**
     * Sets the value of the optIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptIn(String value) {
        this.optIn = value;
    }

    /**
     * Gets the value of the protectedContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedContact() {
        return protectedContact;
    }

    /**
     * Sets the value of the protectedContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedContact(String value) {
        this.protectedContact = value;
    }

    /**
     * Gets the value of the smsCapable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSCapable() {
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
    public void setSMSCapable(String value) {
        this.smsCapable = value;
    }

}
