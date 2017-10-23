
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
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/orders}Result" minOccurs="0"/>
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Schedule" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ScheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TechnicianArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RouteCardPrintDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JobPrintDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TimeCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Time" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Scheduled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Audit" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LastUpdateOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LastUpdateTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LastUpdateTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "result",
    "businessUnit",
    "schedule"
})
@XmlRootElement(name = "UpdateScheduleResponse")
public class UpdateScheduleResponse {

    @XmlElement(name = "Result")
    protected Result2 result;
    @XmlElement(name = "BusinessUnit")
    protected String businessUnit;
    @XmlElement(name = "Schedule")
    protected UpdateScheduleResponse.Schedule schedule;

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
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnit(String value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateScheduleResponse.Schedule }
     *     
     */
    public UpdateScheduleResponse.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateScheduleResponse.Schedule }
     *     
     */
    public void setSchedule(UpdateScheduleResponse.Schedule value) {
        this.schedule = value;
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
     *         &lt;element name="ScheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TechnicianArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RouteCardPrintDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JobPrintDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TimeCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Time" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Scheduled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Audit" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LastUpdateOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LastUpdateTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LastUpdateTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "scheduleId",
        "technicianArea",
        "category",
        "date",
        "status",
        "routeCardPrintDate",
        "jobPrintDate",
        "timeCount",
        "time",
        "audit"
    })
    public static class Schedule {

        @XmlElement(name = "ScheduleId")
        protected String scheduleId;
        @XmlElement(name = "TechnicianArea")
        protected String technicianArea;
        @XmlElement(name = "Category")
        protected String category;
        @XmlElement(name = "Date")
        protected String date;
        @XmlElement(name = "Status")
        protected String status;
        @XmlElement(name = "RouteCardPrintDate")
        protected String routeCardPrintDate;
        @XmlElement(name = "JobPrintDate")
        protected String jobPrintDate;
        @XmlElement(name = "TimeCount")
        protected String timeCount;
        @XmlElement(name = "Time")
        protected List<UpdateScheduleResponse.Schedule.Time> time;
        @XmlElement(name = "Audit")
        protected UpdateScheduleResponse.Schedule.Audit audit;

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
         * Gets the value of the technicianArea property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicianArea() {
            return technicianArea;
        }

        /**
         * Sets the value of the technicianArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnicianArea(String value) {
            this.technicianArea = value;
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
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
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
         * Gets the value of the timeCount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeCount() {
            return timeCount;
        }

        /**
         * Sets the value of the timeCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeCount(String value) {
            this.timeCount = value;
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
         * {@link UpdateScheduleResponse.Schedule.Time }
         * 
         * 
         */
        public List<UpdateScheduleResponse.Schedule.Time> getTime() {
            if (time == null) {
                time = new ArrayList<UpdateScheduleResponse.Schedule.Time>();
            }
            return this.time;
        }

        /**
         * Gets the value of the audit property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateScheduleResponse.Schedule.Audit }
         *     
         */
        public UpdateScheduleResponse.Schedule.Audit getAudit() {
            return audit;
        }

        /**
         * Sets the value of the audit property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateScheduleResponse.Schedule.Audit }
         *     
         */
        public void setAudit(UpdateScheduleResponse.Schedule.Audit value) {
            this.audit = value;
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
         *         &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LastUpdateOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LastUpdateTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LastUpdateTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "lastUpdateTime",
            "lastUpdateOperator",
            "lastUpdateTerminal",
            "lastUpdateTransaction"
        })
        public static class Audit {

            @XmlElement(name = "LastUpdateTime")
            protected String lastUpdateTime;
            @XmlElement(name = "LastUpdateOperator")
            protected String lastUpdateOperator;
            @XmlElement(name = "LastUpdateTerminal")
            protected String lastUpdateTerminal;
            @XmlElement(name = "LastUpdateTransaction")
            protected String lastUpdateTransaction;

            /**
             * Gets the value of the lastUpdateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastUpdateTime() {
                return lastUpdateTime;
            }

            /**
             * Sets the value of the lastUpdateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastUpdateTime(String value) {
                this.lastUpdateTime = value;
            }

            /**
             * Gets the value of the lastUpdateOperator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastUpdateOperator() {
                return lastUpdateOperator;
            }

            /**
             * Sets the value of the lastUpdateOperator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastUpdateOperator(String value) {
                this.lastUpdateOperator = value;
            }

            /**
             * Gets the value of the lastUpdateTerminal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastUpdateTerminal() {
                return lastUpdateTerminal;
            }

            /**
             * Sets the value of the lastUpdateTerminal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastUpdateTerminal(String value) {
                this.lastUpdateTerminal = value;
            }

            /**
             * Gets the value of the lastUpdateTransaction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastUpdateTransaction() {
                return lastUpdateTransaction;
            }

            /**
             * Sets the value of the lastUpdateTransaction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastUpdateTransaction(String value) {
                this.lastUpdateTransaction = value;
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
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Scheduled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "codeDescription",
            "available",
            "scheduled"
        })
        public static class Time {

            @XmlElement(name = "Code")
            protected String code;
            @XmlElement(name = "CodeDescription")
            protected String codeDescription;
            @XmlElement(name = "Available")
            protected String available;
            @XmlElement(name = "Scheduled")
            protected String scheduled;

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
             * Gets the value of the codeDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDescription() {
                return codeDescription;
            }

            /**
             * Sets the value of the codeDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDescription(String value) {
                this.codeDescription = value;
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

            /**
             * Gets the value of the scheduled property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheduled() {
                return scheduled;
            }

            /**
             * Sets the value of the scheduled property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheduled(String value) {
                this.scheduled = value;
            }

        }

    }

}
