
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactData" type="{http://www.charter.com/enterprise/prefcomm/v1}contactData"/>
 *         &lt;element name="validateContactData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveContactData", propOrder = {
    "contactData",
    "validateContactData"
})
public class SaveContactData {

    @XmlElement(required = true)
    protected ContactData contactData;
    protected String validateContactData;

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
     * Gets the value of the validateContactData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateContactData() {
        return validateContactData;
    }

    /**
     * Sets the value of the validateContactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateContactData(String value) {
        this.validateContactData = value;
    }

}
