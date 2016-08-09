
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for optOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="optOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactMethodId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optOut", propOrder = {
    "contactValue",
    "contactMethodId"
})
public class OptOut {

    @XmlElement(required = true)
    protected String contactValue;
    @XmlElement(required = true)
    protected String contactMethodId;

    /**
     * Gets the value of the contactValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactValue() {
        return contactValue;
    }

    /**
     * Sets the value of the contactValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactValue(String value) {
        this.contactValue = value;
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

}
