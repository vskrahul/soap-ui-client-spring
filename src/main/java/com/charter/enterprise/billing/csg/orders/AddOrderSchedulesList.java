
package com.charter.enterprise.billing.csg.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrderSchedulesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrderSchedulesList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineOfBusinessType" type="{http://charter.com/enterprise/billing/csg/orders}LineOfBusinessType" minOccurs="0"/>
 *         &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalUnits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallAheadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Schedule" type="{http://charter.com/enterprise/billing/csg/orders}Schedule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrderSchedulesList", propOrder = {
    "lineOfBusinessType",
    "handshakeId",
    "sequence",
    "type",
    "category",
    "totalUnits",
    "jobId",
    "jobNumber",
    "callAheadNumber",
    "schedule"
})
public class AddOrderSchedulesList {

    @XmlElement(name = "LineOfBusinessType")
    protected LineOfBusinessType lineOfBusinessType;
    @XmlElement(name = "HandshakeId")
    protected String handshakeId;
    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "TotalUnits")
    protected int totalUnits;
    @XmlElement(name = "JobId")
    protected String jobId;
    @XmlElement(name = "JobNumber")
    protected String jobNumber;
    @XmlElement(name = "CallAheadNumber")
    protected String callAheadNumber;
    @XmlElement(name = "Schedule")
    protected List<Schedule> schedule;

    /**
     * Gets the value of the lineOfBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusinessType }
     *     
     */
    public LineOfBusinessType getLineOfBusinessType() {
        return lineOfBusinessType;
    }

    /**
     * Sets the value of the lineOfBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusinessType }
     *     
     */
    public void setLineOfBusinessType(LineOfBusinessType value) {
        this.lineOfBusinessType = value;
    }

    /**
     * Gets the value of the handshakeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandshakeId() {
        return handshakeId;
    }

    /**
     * Sets the value of the handshakeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandshakeId(String value) {
        this.handshakeId = value;
    }

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the totalUnits property.
     * 
     */
    public int getTotalUnits() {
        return totalUnits;
    }

    /**
     * Sets the value of the totalUnits property.
     * 
     */
    public void setTotalUnits(int value) {
        this.totalUnits = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the jobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * Sets the value of the jobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
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
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule }
     * 
     * 
     */
    public List<Schedule> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<Schedule>();
        }
        return this.schedule;
    }

}
