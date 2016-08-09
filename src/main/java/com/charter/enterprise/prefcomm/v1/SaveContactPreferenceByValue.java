
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactPreferenceByValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactPreferenceByValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPreferenceValue" type="{http://www.charter.com/enterprise/prefcomm/v1}contactPreferenceValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveContactPreferenceByValue", propOrder = {
    "contactPreferenceValue"
})
public class SaveContactPreferenceByValue {

    @XmlElement(required = true)
    protected ContactPreferenceValue contactPreferenceValue;

    /**
     * Gets the value of the contactPreferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPreferenceValue }
     *     
     */
    public ContactPreferenceValue getContactPreferenceValue() {
        return contactPreferenceValue;
    }

    /**
     * Sets the value of the contactPreferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPreferenceValue }
     *     
     */
    public void setContactPreferenceValue(ContactPreferenceValue value) {
        this.contactPreferenceValue = value;
    }

}
