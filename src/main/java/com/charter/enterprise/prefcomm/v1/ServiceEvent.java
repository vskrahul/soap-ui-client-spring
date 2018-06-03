
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audit" type="{http://www.charter.com/enterprise/prefcomm/v1}audit"/>
 *         &lt;element name="defaultContactMethod" type="{http://www.charter.com/enterprise/prefcomm/v1}contactMethod"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceEventDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceEventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceEvent", propOrder = {
    "audit",
    "defaultContactMethod",
    "id",
    "serviceEventDescription",
    "serviceEventName"
})
public class ServiceEvent {

    @XmlElement(required = true)
    protected Audit audit;
    @XmlElement(required = true)
    protected ContactMethod defaultContactMethod;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String serviceEventDescription;
    @XmlElement(required = true)
    protected String serviceEventName;

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
     * Gets the value of the defaultContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethod }
     *     
     */
    public ContactMethod getDefaultContactMethod() {
        return defaultContactMethod;
    }

    /**
     * Sets the value of the defaultContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethod }
     *     
     */
    public void setDefaultContactMethod(ContactMethod value) {
        this.defaultContactMethod = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the serviceEventDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceEventDescription() {
        return serviceEventDescription;
    }

    /**
     * Sets the value of the serviceEventDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEventDescription(String value) {
        this.serviceEventDescription = value;
    }

    /**
     * Gets the value of the serviceEventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceEventName() {
        return serviceEventName;
    }

    /**
     * Sets the value of the serviceEventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEventName(String value) {
        this.serviceEventName = value;
    }

}
