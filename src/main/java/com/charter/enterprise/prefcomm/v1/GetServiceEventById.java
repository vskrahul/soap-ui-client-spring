
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceEventById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceEventById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceEventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceEventById", propOrder = {
    "serviceEventId"
})
public class GetServiceEventById {

    @XmlElement(required = true)
    protected String serviceEventId;

    /**
     * Gets the value of the serviceEventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceEventId() {
        return serviceEventId;
    }

    /**
     * Sets the value of the serviceEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEventId(String value) {
        this.serviceEventId = value;
    }

}
