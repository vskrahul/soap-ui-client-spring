
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findContactPreferencesByContactDataValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findContactPreferencesByContactDataValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDataValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findContactPreferencesByContactDataValue", propOrder = {
    "contactDataValue"
})
public class FindContactPreferencesByContactDataValue {

    @XmlElement(required = true)
    protected String contactDataValue;

    /**
     * Gets the value of the contactDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDataValue() {
        return contactDataValue;
    }

    /**
     * Sets the value of the contactDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDataValue(String value) {
        this.contactDataValue = value;
    }

}
