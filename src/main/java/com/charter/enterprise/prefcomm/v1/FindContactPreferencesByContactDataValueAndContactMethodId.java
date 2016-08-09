
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findContactPreferencesByContactDataValueAndContactMethodId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findContactPreferencesByContactDataValueAndContactMethodId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDataValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "findContactPreferencesByContactDataValueAndContactMethodId", propOrder = {
    "contactDataValue",
    "contactMethodId"
})
public class FindContactPreferencesByContactDataValueAndContactMethodId {

    @XmlElement(required = true)
    protected String contactDataValue;
    @XmlElement(required = true)
    protected String contactMethodId;

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
