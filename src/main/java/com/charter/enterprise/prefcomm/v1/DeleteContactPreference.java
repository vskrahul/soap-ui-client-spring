
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteContactPreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteContactPreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPreference" type="{http://www.charter.com/enterprise/prefcomm/v1}contactPreference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteContactPreference", propOrder = {
    "contactPreference"
})
public class DeleteContactPreference {

    @XmlElement(required = true)
    protected ContactPreference contactPreference;

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

}
