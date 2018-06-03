
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContactRoleById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContactRoleById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactRoleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContactRoleById", propOrder = {
    "contactRoleId"
})
public class GetContactRoleById {

    @XmlElement(required = true)
    protected String contactRoleId;

    /**
     * Gets the value of the contactRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRoleId() {
        return contactRoleId;
    }

    /**
     * Sets the value of the contactRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRoleId(String value) {
        this.contactRoleId = value;
    }

}
