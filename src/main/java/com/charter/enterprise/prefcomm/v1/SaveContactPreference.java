
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactPreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactPreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPreference" type="{http://www.charter.com/enterprise/prefcomm/v1}contactPreference"/>
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
@XmlType(name = "saveContactPreference", propOrder = {
    "contactPreference",
    "validateContactData"
})
public class SaveContactPreference {

    @XmlElement(required = true)
    protected ContactPreference contactPreference;
    protected String validateContactData;

    /**
     * Gets the value of the contactPreference property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPreference }
     *     
     */
    public ContactPreference getContactPreference() {
        return contactPreference;
    }

    /**
     * Sets the value of the contactPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPreference }
     *     
     */
    public void setContactPreference(ContactPreference value) {
        this.contactPreference = value;
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
