
package com.charter.enterprise.billing.csg.orders;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="SearchFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                     &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                     &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;/choice>
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
@XmlRootElement(name = "GetAssignedTelephoneNumberListRequest")
public class GetAssignedTelephoneNumberListRequest {

    @XmlElement(name = "CsgHeaderInfo")
    protected CsgHeaderInfo csgHeaderInfo;
    @XmlElement(name = "CustomerId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger customerId;
    @XmlElement(name = "SearchFilter")
    protected GetAssignedTelephoneNumberListRequest.SearchFilter searchFilter;

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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerId(BigInteger value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the searchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GetAssignedTelephoneNumberListRequest.SearchFilter }
     *     
     */
    public GetAssignedTelephoneNumberListRequest.SearchFilter getSearchFilter() {
        return searchFilter;
    }

    /**
     * Sets the value of the searchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAssignedTelephoneNumberListRequest.SearchFilter }
     *     
     */
    public void setSearchFilter(GetAssignedTelephoneNumberListRequest.SearchFilter value) {
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
     *         &lt;choice>
     *           &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *           &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *           &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        "locationId",
        "orderId",
        "accountId"
    })
    public static class SearchFilter {

        @XmlElement(name = "LocationId")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger locationId;
        @XmlElement(name = "OrderId")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger orderId;
        @XmlElement(name = "AccountId")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger accountId;

        /**
         * Gets the value of the locationId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLocationId() {
            return locationId;
        }

        /**
         * Sets the value of the locationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLocationId(BigInteger value) {
            this.locationId = value;
        }

        /**
         * Gets the value of the orderId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrderId() {
            return orderId;
        }

        /**
         * Sets the value of the orderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrderId(BigInteger value) {
            this.orderId = value;
        }

        /**
         * Gets the value of the accountId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAccountId() {
            return accountId;
        }

        /**
         * Sets the value of the accountId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAccountId(BigInteger value) {
            this.accountId = value;
        }

    }

}
