
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEventCommunicationByApplicationIdServiceEventIdAndContactMethodId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEventCommunicationByApplicationIdServiceEventIdAndContactMethodId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceEventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "getEventCommunicationByApplicationIdServiceEventIdAndContactMethodId", propOrder = {
    "applicationId",
    "serviceEventId",
    "contactMethodId"
})
public class GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId {

    @XmlElement(required = true)
    protected String applicationId;
    @XmlElement(required = true)
    protected String serviceEventId;
    @XmlElement(required = true)
    protected String contactMethodId;

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

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
