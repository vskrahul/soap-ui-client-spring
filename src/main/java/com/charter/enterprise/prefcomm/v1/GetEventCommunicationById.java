
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEventCommunicationById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEventCommunicationById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventCommunicationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventCommunicationById", propOrder = {
    "eventCommunicationId"
})
public class GetEventCommunicationById {

    protected long eventCommunicationId;

    /**
     * Gets the value of the eventCommunicationId property.
     * 
     */
    public long getEventCommunicationId() {
        return eventCommunicationId;
    }

    /**
     * Sets the value of the eventCommunicationId property.
     * 
     */
    public void setEventCommunicationId(long value) {
        this.eventCommunicationId = value;
    }

}
