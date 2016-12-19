
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LineOfBusiness complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineOfBusiness">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://charter.com/enterprise/billing/csg/services}LineOfBusinessType"/>
 *         &lt;element name="Status" type="{http://charter.com/enterprise/billing/csg/services}LineOfBusinessStatus"/>
 *         &lt;element name="Serviceable" type="{http://charter.com/enterprise/billing/csg/services}LineOfBusinessServiceable"/>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceStatusDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TapStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstalledOutlets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Headend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeadendDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineOfBusiness", propOrder = {
    "type",
    "status",
    "serviceable",
    "node",
    "serviceStatus",
    "serviceStatusDate",
    "tapStatus",
    "installedOutlets",
    "headend",
    "headendDescription"
})
public class LineOfBusiness {

    @XmlElement(name = "Type", required = true)
    protected LineOfBusinessType type;
    @XmlElement(name = "Status", required = true)
    protected LineOfBusinessStatus status;
    @XmlElement(name = "Serviceable", required = true)
    protected LineOfBusinessServiceable serviceable;
    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "ServiceStatus")
    protected String serviceStatus;
    @XmlElement(name = "ServiceStatusDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceStatusDate;
    @XmlElement(name = "TapStatus")
    protected String tapStatus;
    @XmlElement(name = "InstalledOutlets")
    protected String installedOutlets;
    @XmlElement(name = "Headend")
    protected String headend;
    @XmlElement(name = "HeadendDescription")
    protected String headendDescription;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusinessType }
     *     
     */
    public LineOfBusinessType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusinessType }
     *     
     */
    public void setType(LineOfBusinessType value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusinessStatus }
     *     
     */
    public LineOfBusinessStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusinessStatus }
     *     
     */
    public void setStatus(LineOfBusinessStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the serviceable property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusinessServiceable }
     *     
     */
    public LineOfBusinessServiceable getServiceable() {
        return serviceable;
    }

    /**
     * Sets the value of the serviceable property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusinessServiceable }
     *     
     */
    public void setServiceable(LineOfBusinessServiceable value) {
        this.serviceable = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the serviceStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceStatusDate() {
        return serviceStatusDate;
    }

    /**
     * Sets the value of the serviceStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceStatusDate(XMLGregorianCalendar value) {
        this.serviceStatusDate = value;
    }

    /**
     * Gets the value of the tapStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTapStatus() {
        return tapStatus;
    }

    /**
     * Sets the value of the tapStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTapStatus(String value) {
        this.tapStatus = value;
    }

    /**
     * Gets the value of the installedOutlets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledOutlets() {
        return installedOutlets;
    }

    /**
     * Sets the value of the installedOutlets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledOutlets(String value) {
        this.installedOutlets = value;
    }

    /**
     * Gets the value of the headend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadend() {
        return headend;
    }

    /**
     * Sets the value of the headend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadend(String value) {
        this.headend = value;
    }

    /**
     * Gets the value of the headendDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadendDescription() {
        return headendDescription;
    }

    /**
     * Sets the value of the headendDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadendDescription(String value) {
        this.headendDescription = value;
    }

}
