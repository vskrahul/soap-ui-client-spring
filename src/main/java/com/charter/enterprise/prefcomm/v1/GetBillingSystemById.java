
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBillingSystemById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBillingSystemById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBillingSystemById", propOrder = {
    "billingSystemId"
})
public class GetBillingSystemById {

    @XmlElement(required = true)
    protected String billingSystemId;

    /**
     * Gets the value of the billingSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingSystemId() {
        return billingSystemId;
    }

    /**
     * Sets the value of the billingSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingSystemId(String value) {
        this.billingSystemId = value;
    }

}
