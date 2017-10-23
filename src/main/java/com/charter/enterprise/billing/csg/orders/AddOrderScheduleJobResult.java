
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrderScheduleJobResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrderScheduleJobResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/orders}Result" minOccurs="0"/>
 *         &lt;element name="JobID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AddOrderScheduleJobResult", propOrder = {
    "result",
    "jobID",
    "sequence",
    "primarySchedule",
    "secondarySchedule",
    "tertiarySchedule"
})
public class AddOrderScheduleJobResult {

    @XmlElement(name = "Result")
    protected Result2 result;
    @XmlElement(name = "JobID")
    protected String jobID;
    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "PrimarySchedule")
    protected AddOrderScheduleSchedule primarySchedule;
    @XmlElement(name = "SecondarySchedule")
    protected AddOrderScheduleSchedule secondarySchedule;
    @XmlElement(name = "TertiarySchedule")
    protected AddOrderScheduleSchedule tertiarySchedule;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result2 }
     *     
     */
    public Result2 getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result2 }
     *     
     */
    public void setResult(Result2 value) {
        this.result = value;
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
