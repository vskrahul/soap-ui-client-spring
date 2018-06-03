
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contactPreferenceValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPreferenceValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDataId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contactMethodId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactPreferenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createDttm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="disabledFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferenceAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="serviceEventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPreferenceValue", propOrder = {
    "contactDataId",
    "contactMethodId",
    "contactPreferenceId",
    "createDttm",
    "createdBy",
    "disabledFlag",
    "preferenceAccountId",
    "serviceEventId"
})
public class ContactPreferenceValue {

    protected Long contactDataId;
    @XmlElement(required = true)
    protected String contactMethodId;
    protected Long contactPreferenceId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDttm;
    @XmlElement(required = true)
    protected String createdBy;
    protected String disabledFlag;
    protected long preferenceAccountId;
    @XmlElement(required = true)
    protected String serviceEventId;

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
     * Gets the value of the contactMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethodId() {
        return contactMethodId;
    }

    /**
     * Sets the value of the contactMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethodId(String value) {
        this.contactMethodId = value;
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
     * Gets the value of the preferenceAccountId property.
     * 
     */
    public long getPreferenceAccountId() {
        return preferenceAccountId;
    }

    /**
     * Sets the value of the preferenceAccountId property.
     * 
     */
    public void setPreferenceAccountId(long value) {
        this.preferenceAccountId = value;
    }

    /**
     * Gets the value of the serviceEventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceEventId() {
        return serviceEventId;
    }

    /**
     * Sets the value of the serviceEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEventId(String value) {
        this.serviceEventId = value;
    }

}
