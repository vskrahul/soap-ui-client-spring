
package com.charter.enterprise.billing.csg.services;

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
 *         &lt;element name="CsgHeaderInfo" type="{http://charter.com/enterprise/billing/csg/services}CsgHeaderInfo" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CurrentItems" type="{http://charter.com/enterprise/billing/csg/services}CurrentItems"/>
 *                   &lt;element name="HistoryItems" type="{http://charter.com/enterprise/billing/csg/services}HistoryItems"/>
 *                   &lt;element name="PendingItems" type="{http://charter.com/enterprise/billing/csg/services}PendingItems"/>
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
    "customerId",
    "searchFilter"
})
@XmlRootElement(name = "GetCurrentServicesRequest")
public class GetCurrentServicesRequest {

    @XmlElement(name = "CsgHeaderInfo")
    protected CsgHeaderInfo csgHeaderInfo;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "SearchFilter")
    protected GetCurrentServicesRequest.SearchFilter searchFilter;

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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the searchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GetCurrentServicesRequest.SearchFilter }
     *     
     */
    public GetCurrentServicesRequest.SearchFilter getSearchFilter() {
        return searchFilter;
    }

    /**
     * Sets the value of the searchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCurrentServicesRequest.SearchFilter }
     *     
     */
    public void setSearchFilter(GetCurrentServicesRequest.SearchFilter value) {
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
     *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CurrentItems" type="{http://charter.com/enterprise/billing/csg/services}CurrentItems"/>
     *         &lt;element name="HistoryItems" type="{http://charter.com/enterprise/billing/csg/services}HistoryItems"/>
     *         &lt;element name="PendingItems" type="{http://charter.com/enterprise/billing/csg/services}PendingItems"/>
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
        "accountId",
        "locationId",
        "currentItems",
        "historyItems",
        "pendingItems"
    })
    public static class SearchFilter {

        @XmlElement(name = "AccountId")
        protected String accountId;
        @XmlElement(name = "LocationId")
        protected String locationId;
        @XmlElement(name = "CurrentItems", required = true)
        protected CurrentItems currentItems;
        @XmlElement(name = "HistoryItems", required = true)
        protected HistoryItems historyItems;
        @XmlElement(name = "PendingItems", required = true)
        protected PendingItems pendingItems;

        /**
         * Gets the value of the accountId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountId() {
            return accountId;
        }

        /**
         * Sets the value of the accountId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountId(String value) {
            this.accountId = value;
        }

        /**
         * Gets the value of the locationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationId() {
            return locationId;
        }

        /**
         * Sets the value of the locationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationId(String value) {
            this.locationId = value;
        }

        /**
         * Gets the value of the currentItems property.
         * 
         * @return
         *     possible object is
         *     {@link CurrentItems }
         *     
         */
        public CurrentItems getCurrentItems() {
            return currentItems;
        }

        /**
         * Sets the value of the currentItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrentItems }
         *     
         */
        public void setCurrentItems(CurrentItems value) {
            this.currentItems = value;
        }

        /**
         * Gets the value of the historyItems property.
         * 
         * @return
         *     possible object is
         *     {@link HistoryItems }
         *     
         */
        public HistoryItems getHistoryItems() {
            return historyItems;
        }

        /**
         * Sets the value of the historyItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link HistoryItems }
         *     
         */
        public void setHistoryItems(HistoryItems value) {
            this.historyItems = value;
        }

        /**
         * Gets the value of the pendingItems property.
         * 
         * @return
         *     possible object is
         *     {@link PendingItems }
         *     
         */
        public PendingItems getPendingItems() {
            return pendingItems;
        }

        /**
         * Sets the value of the pendingItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link PendingItems }
         *     
         */
        public void setPendingItems(PendingItems value) {
            this.pendingItems = value;
        }

    }

}
