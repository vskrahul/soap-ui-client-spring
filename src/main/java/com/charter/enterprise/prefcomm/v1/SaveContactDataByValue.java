
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactDataByValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactDataByValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDataValue" type="{http://www.charter.com/enterprise/prefcomm/v1}contactDataValue"/>
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
@XmlType(name = "saveContactDataByValue", propOrder = {
    "contactDataValue",
    "validateContactData"
})
public class SaveContactDataByValue {

    @XmlElement(required = true)
    protected ContactDataValue contactDataValue;
    protected String validateContactData;

    /**
     * Gets the value of the contactDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDataValue }
     *     
     */
    public ContactDataValue getContactDataValue() {
        return contactDataValue;
    }

    /**
     * Sets the value of the contactDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDataValue }
     *     
     */
    public void setContactDataValue(ContactDataValue value) {
        this.contactDataValue = value;
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
