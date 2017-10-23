
package com.charter.enterprise.billing.csg.orders;

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
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Schedule" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TechnicianArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SearchFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ScheduleBeginCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ScheduleEndCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ScheduleBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ScheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "csgHeaderInfo",
    "businessUnit",
    "schedule",
    "searchFilter"
})
@XmlRootElement(name = "GetScheduleListRequest")
public class GetScheduleListRequest {

    @XmlElement(name = "CsgHeaderInfo")
    protected CsgHeaderInfo csgHeaderInfo;
    @XmlElement(name = "BusinessUnit")
    protected String businessUnit;
    @XmlElement(name = "Schedule")
    protected GetScheduleListRequest.Schedule schedule;
    @XmlElement(name = "SearchFilter")
    protected GetScheduleListRequest.SearchFilter searchFilter;

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
     *     {@link GetScheduleListRequest.Schedule }
     *     
     */
    public GetScheduleListRequest.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetScheduleListRequest.Schedule }
     *     
     */
    public void setSchedule(GetScheduleListRequest.Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the searchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GetScheduleListRequest.SearchFilter }
     *     
     */
    public GetScheduleListRequest.SearchFilter getSearchFilter() {
        return searchFilter;
    }

    /**
     * Sets the value of the searchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetScheduleListRequest.SearchFilter }
     *     
     */
    public void setSearchFilter(GetScheduleListRequest.SearchFilter value) {
        this.searchFilter = value;
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
     *         &lt;element name="TechnicianArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;/choice>
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
        "technicianArea",
        "category",
        "date"
    })
    public static class Schedule {

        @XmlElement(name = "TechnicianArea")
        protected String technicianArea;
        @XmlElement(name = "Category")
        protected String category;
        @XmlElement(name = "Date")
        protected String date;

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
     *         &lt;element name="ScheduleBeginCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ScheduleEndCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ScheduleBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ScheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "scheduleBeginCategory",
        "scheduleEndCategory",
        "scheduleBeginDate",
        "scheduleEndDate"
    })
    public static class SearchFilter {

        @XmlElement(name = "ScheduleBeginCategory")
        protected String scheduleBeginCategory;
        @XmlElement(name = "ScheduleEndCategory")
        protected String scheduleEndCategory;
        @XmlElement(name = "ScheduleBeginDate")
        protected String scheduleBeginDate;
        @XmlElement(name = "ScheduleEndDate")
        protected String scheduleEndDate;

        /**
         * Gets the value of the scheduleBeginCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScheduleBeginCategory() {
            return scheduleBeginCategory;
        }

        /**
         * Sets the value of the scheduleBeginCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScheduleBeginCategory(String value) {
            this.scheduleBeginCategory = value;
        }

        /**
         * Gets the value of the scheduleEndCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScheduleEndCategory() {
            return scheduleEndCategory;
        }

        /**
         * Sets the value of the scheduleEndCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScheduleEndCategory(String value) {
            this.scheduleEndCategory = value;
        }

        /**
         * Gets the value of the scheduleBeginDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScheduleBeginDate() {
            return scheduleBeginDate;
        }

        /**
         * Sets the value of the scheduleBeginDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScheduleBeginDate(String value) {
            this.scheduleBeginDate = value;
        }

        /**
         * Gets the value of the scheduleEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScheduleEndDate() {
            return scheduleEndDate;
        }

        /**
         * Sets the value of the scheduleEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScheduleEndDate(String value) {
            this.scheduleEndDate = value;
        }

    }

}
