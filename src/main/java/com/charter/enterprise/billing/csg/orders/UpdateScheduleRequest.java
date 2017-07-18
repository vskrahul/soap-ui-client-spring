
package com.charter.enterprise.billing.csg.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CsgHeaderInfo" type="{http://charter.com/enterprise/billing/csg/orders}CsgHeaderInfo" minOccurs="0"/>
 *         &lt;element name="ScheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RouteCardPrintDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobPrintDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "csgHeaderInfo",
    "scheduleId",
    "status",
    "time",
    "routeCardPrintDate",
    "jobPrintDate"
})
@XmlRootElement(name = "UpdateScheduleRequest")
public class UpdateScheduleRequest {

    @XmlElement(name = "CsgHeaderInfo")
    protected CsgHeaderInfo csgHeaderInfo;
    @XmlElement(name = "ScheduleId")
    protected String scheduleId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Time")
    protected List<UpdateScheduleRequest.Time> time;
    @XmlElement(name = "RouteCardPrintDate")
    protected String routeCardPrintDate;
    @XmlElement(name = "JobPrintDate")
    protected String jobPrintDate;

    /**
     * Gets the value of the csgHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CsgHeaderInfo }
     *     
     */
    public CsgHeaderInfo getCsgHeaderInfo() {
        return csgHeaderInfo;
    }

    /**
     * Sets the value of the csgHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsgHeaderInfo }
     *     
     */
    public void setCsgHeaderInfo(CsgHeaderInfo value) {
        this.csgHeaderInfo = value;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
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
     * Gets the value of the time property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the time property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateScheduleRequest.Time }
     * 
     * 
     */
    public List<UpdateScheduleRequest.Time> getTime() {
        if (time == null) {
            time = new ArrayList<UpdateScheduleRequest.Time>();
        }
        return this.time;
    }

    /**
     * Gets the value of the routeCardPrintDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteCardPrintDate() {
        return routeCardPrintDate;
    }

    /**
     * Sets the value of the routeCardPrintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteCardPrintDate(String value) {
        this.routeCardPrintDate = value;
    }

    /**
     * Gets the value of the jobPrintDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobPrintDate() {
        return jobPrintDate;
    }

    /**
     * Sets the value of the jobPrintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobPrintDate(String value) {
        this.jobPrintDate = value;
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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "code",
        "available"
    })
    public static class Time {

        @XmlElement(name = "Code")
        protected String code;
        @XmlElement(name = "Available")
        protected String available;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the available property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailable() {
            return available;
        }

        /**
         * Sets the value of the available property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailable(String value) {
            this.available = value;
        }

    }

}
