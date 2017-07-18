
package com.charter.enterprise.billing.csg.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderInfoJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInfoJob">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallAheadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduleTimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduleTimeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technician" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dispatch" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Schedule" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RecommendedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RecommendedTotalUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TotalUnits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="EstimatedDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CustomerRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comment" type="{http://charter.com/enterprise/billing/csg/orders}IndexedComment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfoJob", propOrder = {
    "sequence",
    "number",
    "type",
    "status",
    "clazz",
    "callAheadNumber",
    "scheduleDate",
    "scheduleTimeCode",
    "scheduleTimeDescription",
    "technician",
    "completionDate",
    "completionTime",
    "jobID",
    "typeDescription",
    "dispatch",
    "schedule",
    "comment"
})
public class OrderInfoJob {

    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "Number")
    protected Integer number;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Class")
    protected String clazz;
    @XmlElement(name = "CallAheadNumber")
    protected String callAheadNumber;
    @XmlElement(name = "ScheduleDate")
    protected String scheduleDate;
    @XmlElement(name = "ScheduleTimeCode")
    protected String scheduleTimeCode;
    @XmlElement(name = "ScheduleTimeDescription")
    protected String scheduleTimeDescription;
    @XmlElement(name = "Technician")
    protected String technician;
    @XmlElement(name = "CompletionDate")
    protected String completionDate;
    @XmlElement(name = "CompletionTime")
    protected String completionTime;
    @XmlElement(name = "JobID")
    protected String jobID;
    @XmlElement(name = "TypeDescription")
    protected String typeDescription;
    @XmlElement(name = "Dispatch")
    protected OrderInfoJob.Dispatch dispatch;
    @XmlElement(name = "Schedule")
    protected OrderInfoJob.Schedule schedule;
    @XmlElement(name = "Comment")
    protected List<IndexedComment> comment;

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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
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
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleDate(String value) {
        this.scheduleDate = value;
    }

    /**
     * Gets the value of the scheduleTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleTimeCode() {
        return scheduleTimeCode;
    }

    /**
     * Sets the value of the scheduleTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleTimeCode(String value) {
        this.scheduleTimeCode = value;
    }

    /**
     * Gets the value of the scheduleTimeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleTimeDescription() {
        return scheduleTimeDescription;
    }

    /**
     * Sets the value of the scheduleTimeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleTimeDescription(String value) {
        this.scheduleTimeDescription = value;
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
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionDate(String value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the completionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionTime() {
        return completionTime;
    }

    /**
     * Sets the value of the completionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionTime(String value) {
        this.completionTime = value;
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
     * Gets the value of the typeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Sets the value of the typeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }

    /**
     * Gets the value of the dispatch property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoJob.Dispatch }
     *     
     */
    public OrderInfoJob.Dispatch getDispatch() {
        return dispatch;
    }

    /**
     * Sets the value of the dispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoJob.Dispatch }
     *     
     */
    public void setDispatch(OrderInfoJob.Dispatch value) {
        this.dispatch = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoJob.Schedule }
     *     
     */
    public OrderInfoJob.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoJob.Schedule }
     *     
     */
    public void setSchedule(OrderInfoJob.Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedComment }
     * 
     * 
     */
    public List<IndexedComment> getComment() {
        if (comment == null) {
            comment = new ArrayList<IndexedComment>();
        }
        return this.comment;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "status",
        "comment"
    })
    public static class Dispatch {

        @XmlElement(name = "Status")
        protected String status;
        @XmlElement(name = "Comment")
        protected String comment;

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
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RecommendedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RecommendedTotalUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TotalUnits" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="EstimatedDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CustomerRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recommendedDate",
        "category",
        "recommendedTotalUnits",
        "totalUnits",
        "estimatedDuration",
        "group",
        "customerRequest"
    })
    public static class Schedule {

        @XmlElement(name = "RecommendedDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar recommendedDate;
        @XmlElement(name = "Category")
        protected String category;
        @XmlElement(name = "RecommendedTotalUnits")
        protected String recommendedTotalUnits;
        @XmlElement(name = "TotalUnits")
        protected int totalUnits;
        @XmlElement(name = "EstimatedDuration")
        protected String estimatedDuration;
        @XmlElement(name = "Group")
        protected String group;
        @XmlElement(name = "CustomerRequest")
        protected String customerRequest;

        /**
         * Gets the value of the recommendedDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRecommendedDate() {
            return recommendedDate;
        }

        /**
         * Sets the value of the recommendedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRecommendedDate(XMLGregorianCalendar value) {
            this.recommendedDate = value;
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
         * Gets the value of the recommendedTotalUnits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecommendedTotalUnits() {
            return recommendedTotalUnits;
        }

        /**
         * Sets the value of the recommendedTotalUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecommendedTotalUnits(String value) {
            this.recommendedTotalUnits = value;
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
         * Gets the value of the estimatedDuration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstimatedDuration() {
            return estimatedDuration;
        }

        /**
         * Sets the value of the estimatedDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedDuration(String value) {
            this.estimatedDuration = value;
        }

        /**
         * Gets the value of the group property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroup() {
            return group;
        }

        /**
         * Sets the value of the group property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroup(String value) {
            this.group = value;
        }

        /**
         * Gets the value of the customerRequest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerRequest() {
            return customerRequest;
        }

        /**
         * Sets the value of the customerRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerRequest(String value) {
            this.customerRequest = value;
        }

    }

}
