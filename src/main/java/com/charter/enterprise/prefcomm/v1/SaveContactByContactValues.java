
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactByContactValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactByContactValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactValues" type="{http://www.charter.com/enterprise/prefcomm/v1}contactValues"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveContactByContactValues", propOrder = {
    "contactValues"
})
public class SaveContactByContactValues {

    @XmlElement(required = true)
    protected ContactValues contactValues;

    /**
     * Gets the value of the contactValues property.
     * 
     * @return
     *     possible object is
     *     {@link ContactValues }
     *     
     */
    public ContactValues getContactValues() {
        return contactValues;
    }

    /**
     * Sets the value of the contactValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactValues }
     *     
     */
    public void setContactValues(ContactValues value) {
        this.contactValues = value;
    }

}
