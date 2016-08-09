
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contactDataValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactDataValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDataId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contactTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactValid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createDttm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invalidReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optInPreference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protectedFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smsCapable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDataValue", propOrder = {
    "contactDataId",
    "contactId",
    "contactTypeId",
    "contactValid",
    "contactValue",
    "createDttm",
    "createdBy",
    "invalidReason",
    "optInPreference",
    "protectedFlag",
    "smsCapable"
})
public class ContactDataValue {

    protected Long contactDataId;
    protected long contactId;
    @XmlElement(required = true)
    protected String contactTypeId;
    @XmlElement(required = true)
    protected String contactValid;
    @XmlElement(required = true)
    protected String contactValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDttm;
    @XmlElement(required = true)
    protected String createdBy;
    protected String invalidReason;
    @XmlElement(required = true)
    protected String optInPreference;
    @XmlElement(required = true)
    protected String protectedFlag;
    @XmlElement(required = true)
    protected String smsCapable;

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
     */
    public long getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     */
    public void setContactId(long value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeId() {
        return contactTypeId;
    }

    /**
     * Sets the value of the contactTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTypeId(String value) {
        this.contactTypeId = value;
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
     * Gets the value of the createDttm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDttm() {
        return createDttm;
    }

    /**
     * Sets the value of the createDttm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDttm(XMLGregorianCalendar value) {
        this.createDttm = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
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
     * Gets the value of the optInPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptInPreference() {
        return optInPreference;
    }

    /**
     * Sets the value of the optInPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptInPreference(String value) {
        this.optInPreference = value;
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
