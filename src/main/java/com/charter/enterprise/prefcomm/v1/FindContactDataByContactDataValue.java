
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findContactDataByContactDataValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findContactDataByContactDataValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactDataValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findContactDataByContactDataValue", propOrder = {
    "contactDataValue"
})
public class FindContactDataByContactDataValue {

    @XmlElement(name = "ContactDataValue", required = true)
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
