
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uiEventFamily complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uiEventFamily">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audit" type="{http://www.charter.com/enterprise/prefcomm/v1}audit" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mandantoryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recommendedContactMethod" type="{http://www.charter.com/enterprise/prefcomm/v1}contactMethod" minOccurs="0"/>
 *         &lt;element name="sequenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "uiEventFamily", propOrder = {
    "audit",
    "id",
    "mandantoryStatus",
    "recommendedContactMethod",
    "sequenceCode",
    "serviceEvent",
    "uiApplication"
})
public class UiEventFamily {

    protected Audit audit;
    protected Long id;
    protected String mandantoryStatus;
    protected ContactMethod recommendedContactMethod;
    protected String sequenceCode;
    protected ServiceEvent serviceEvent;
    @XmlElement(name = "uIApplication")
    protected UiApplication uiApplication;

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
     * Gets the value of the mandantoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandantoryStatus() {
        return mandantoryStatus;
    }

    /**
     * Sets the value of the mandantoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandantoryStatus(String value) {
        this.mandantoryStatus = value;
    }

    /**
     * Gets the value of the recommendedContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethod }
     *     
     */
    public ContactMethod getRecommendedContactMethod() {
        return recommendedContactMethod;
    }

    /**
     * Sets the value of the recommendedContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethod }
     *     
     */
    public void setRecommendedContactMethod(ContactMethod value) {
        this.recommendedContactMethod = value;
    }

    /**
     * Gets the value of the sequenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceCode() {
        return sequenceCode;
    }

    /**
     * Sets the value of the sequenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceCode(String value) {
        this.sequenceCode = value;
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
