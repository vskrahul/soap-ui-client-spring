
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventCommunication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventCommunication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicableContactMethod" type="{http://www.charter.com/enterprise/prefcomm/v1}contactMethod" minOccurs="0"/>
 *         &lt;element name="audit" type="{http://www.charter.com/enterprise/prefcomm/v1}audit" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceEvent" type="{http://www.charter.com/enterprise/prefcomm/v1}serviceEvent" minOccurs="0"/>
 *         &lt;element name="uIApplication" type="{http://www.charter.com/enterprise/prefcomm/v1}uiApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventCommunication", propOrder = {
    "applicableContactMethod",
    "audit",
    "id",
    "serviceEvent",
    "uiApplication"
})
public class EventCommunication {

    protected ContactMethod applicableContactMethod;
    protected Audit audit;
    protected Long id;
    protected ServiceEvent serviceEvent;
    @XmlElement(name = "uIApplication")
    protected UiApplication uiApplication;

    /**
     * Gets the value of the applicableContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethod }
     *     
     */
    public ContactMethod getApplicableContactMethod() {
        return applicableContactMethod;
    }

    /**
     * Sets the value of the applicableContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethod }
     *     
     */
    public void setApplicableContactMethod(ContactMethod value) {
        this.applicableContactMethod = value;
    }

    /**
     * Gets the value of the audit property.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAudit(Audit value) {
        this.audit = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the serviceEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEvent }
     *     
     */
    public ServiceEvent getServiceEvent() {
        return serviceEvent;
    }

    /**
     * Sets the value of the serviceEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEvent }
     *     
     */
    public void setServiceEvent(ServiceEvent value) {
        this.serviceEvent = value;
    }

    /**
     * Gets the value of the uiApplication property.
     * 
     * @return
     *     possible object is
     *     {@link UiApplication }
     *     
     */
    public UiApplication getUIApplication() {
        return uiApplication;
    }

    /**
     * Sets the value of the uiApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link UiApplication }
     *     
     */
    public void setUIApplication(UiApplication value) {
        this.uiApplication = value;
    }

}
