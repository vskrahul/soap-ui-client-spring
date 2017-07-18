
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrderJobResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrderJobResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HandshakeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallAheadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimarySchedule" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderScheduleSchedule" minOccurs="0"/>
 *         &lt;element name="SecondarySchedule" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderScheduleSchedule" minOccurs="0"/>
 *         &lt;element name="TertiarySchedule" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderScheduleSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrderJobResult", propOrder = {
    "sequence",
    "jobID",
    "type",
    "handshakeID",
    "cashOnDelivery",
    "callAheadNumber",
    "primarySchedule",
    "secondarySchedule",
    "tertiarySchedule"
})
public class AddOrderJobResult {

    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "JobID")
    protected String jobID;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "HandshakeID")
    protected String handshakeID;
    @XmlElement(name = "CashOnDelivery")
    protected String cashOnDelivery;
    @XmlElement(name = "CallAheadNumber")
    protected String callAheadNumber;
    @XmlElement(name = "PrimarySchedule")
    protected AddOrderScheduleSchedule primarySchedule;
    @XmlElement(name = "SecondarySchedule")
    protected AddOrderScheduleSchedule secondarySchedule;
    @XmlElement(name = "TertiarySchedule")
    protected AddOrderScheduleSchedule tertiarySchedule;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the handshakeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandshakeID() {
        return handshakeID;
    }

    /**
     * Sets the value of the handshakeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandshakeID(String value) {
        this.handshakeID = value;
    }

    /**
     * Gets the value of the cashOnDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashOnDelivery() {
        return cashOnDelivery;
    }

    /**
     * Sets the value of the cashOnDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashOnDelivery(String value) {
        this.cashOnDelivery = value;
    }

    /**
     * Gets the value of the callAheadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallAheadNumber() {
        return callAheadNumber;
    }

    /**
     * Sets the value of the callAheadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallAheadNumber(String value) {
        this.callAheadNumber = value;
    }

    /**
     * Gets the value of the primarySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrderScheduleSchedule }
     *     
     */
    public AddOrderScheduleSchedule getPrimarySchedule() {
        return primarySchedule;
    }

    /**
     * Sets the value of the primarySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrderScheduleSchedule }
     *     
     */
    public void setPrimarySchedule(AddOrderScheduleSchedule value) {
        this.primarySchedule = value;
    }

    /**
     * Gets the value of the secondarySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrderScheduleSchedule }
     *     
     */
    public AddOrderScheduleSchedule getSecondarySchedule() {
        return secondarySchedule;
    }

    /**
     * Sets the value of the secondarySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrderScheduleSchedule }
     *     
     */
    public void setSecondarySchedule(AddOrderScheduleSchedule value) {
        this.secondarySchedule = value;
    }

    /**
     * Gets the value of the tertiarySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrderScheduleSchedule }
     *     
     */
    public AddOrderScheduleSchedule getTertiarySchedule() {
        return tertiarySchedule;
    }

    /**
     * Sets the value of the tertiarySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrderScheduleSchedule }
     *     
     */
    public void setTertiarySchedule(AddOrderScheduleSchedule value) {
        this.tertiarySchedule = value;
    }

}
