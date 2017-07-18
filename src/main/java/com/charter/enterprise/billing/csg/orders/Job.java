
package com.charter.enterprise.billing.csg.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technician" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicianType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RescheduleReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallAheadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alerts" type="{http://charter.com/enterprise/billing/csg/orders}Alert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestedFunction" type="{http://charter.com/enterprise/billing/csg/orders}RequestedFunction"/>
 *         &lt;element name="PrimarySchedule" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderScheduleSchedule" minOccurs="0"/>
 *         &lt;element name="SecondarySchedule" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderScheduleSchedule" minOccurs="0"/>
 *         &lt;element name="TertiarySchedule" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderScheduleSchedule" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job", propOrder = {
    "sequence",
    "typeCode",
    "status",
    "technician",
    "technicianType",
    "rescheduleReason",
    "requestedAction",
    "callAheadNumber",
    "alerts",
    "requestedFunction",
    "primarySchedule",
    "secondarySchedule",
    "tertiarySchedule",
    "comments"
})
public class Job {

    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "TypeCode")
    protected String typeCode;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Technician")
    protected String technician;
    @XmlElement(name = "TechnicianType")
    protected String technicianType;
    @XmlElement(name = "RescheduleReason")
    protected String rescheduleReason;
    @XmlElement(name = "RequestedAction")
    protected String requestedAction;
    @XmlElement(name = "CallAheadNumber")
    protected String callAheadNumber;
    @XmlElement(name = "Alerts")
    protected List<Alert> alerts;
    @XmlElement(name = "RequestedFunction", required = true)
    protected RequestedFunction requestedFunction;
    @XmlElement(name = "PrimarySchedule")
    protected AddOrderScheduleSchedule primarySchedule;
    @XmlElement(name = "SecondarySchedule")
    protected AddOrderScheduleSchedule secondarySchedule;
    @XmlElement(name = "TertiarySchedule")
    protected AddOrderScheduleSchedule tertiarySchedule;
    @XmlElement(name = "Comments")
    protected List<String> comments;

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
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the technician property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnician() {
        return technician;
    }

    /**
     * Sets the value of the technician property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnician(String value) {
        this.technician = value;
    }

    /**
     * Gets the value of the technicianType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicianType() {
        return technicianType;
    }

    /**
     * Sets the value of the technicianType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicianType(String value) {
        this.technicianType = value;
    }

    /**
     * Gets the value of the rescheduleReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRescheduleReason() {
        return rescheduleReason;
    }

    /**
     * Sets the value of the rescheduleReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRescheduleReason(String value) {
        this.rescheduleReason = value;
    }

    /**
     * Gets the value of the requestedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedAction() {
        return requestedAction;
    }

    /**
     * Sets the value of the requestedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedAction(String value) {
        this.requestedAction = value;
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
     * Gets the value of the alerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alert }
     * 
     * 
     */
    public List<Alert> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<Alert>();
        }
        return this.alerts;
    }

    /**
     * Gets the value of the requestedFunction property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedFunction }
     *     
     */
    public RequestedFunction getRequestedFunction() {
        return requestedFunction;
    }

    /**
     * Sets the value of the requestedFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedFunction }
     *     
     */
    public void setRequestedFunction(RequestedFunction value) {
        this.requestedFunction = value;
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

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComments() {
        if (comments == null) {
            comments = new ArrayList<String>();
        }
        return this.comments;
    }

}
