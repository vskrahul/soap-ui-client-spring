
package com.charter.enterprise.billing.csg.accounts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicePriceUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePriceUpdateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemoText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reasons" type="{http://charter.com/enterprise/billing/csg/accounts}ServicePriceReasons" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://charter.com/enterprise/billing/csg/accounts}ServicePriceComments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Services" type="{http://charter.com/enterprise/billing/csg/accounts}ServicePriceServices" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePriceUpdateRequest", propOrder = {
    "customerNumber",
    "locationId",
    "accountId",
    "salesRep",
    "campaign",
    "memoText",
    "reasons",
    "comments",
    "services"
})
public class ServicePriceUpdateRequest {

    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "SalesRep")
    protected String salesRep;
    @XmlElement(name = "Campaign")
    protected String campaign;
    @XmlElement(name = "MemoText")
    protected String memoText;
    @XmlElement(name = "Reasons")
    protected List<ServicePriceReasons> reasons;
    @XmlElement(name = "Comments")
    protected List<ServicePriceComments> comments;
    @XmlElement(name = "Services")
    protected List<ServicePriceServices> services;

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
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
     * Gets the value of the salesRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRep() {
        return salesRep;
    }

    /**
     * Sets the value of the salesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRep(String value) {
        this.salesRep = value;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaign(String value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the memoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoText() {
        return memoText;
    }

    /**
     * Sets the value of the memoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoText(String value) {
        this.memoText = value;
    }

    /**
     * Gets the value of the reasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePriceReasons }
     * 
     * 
     */
    public List<ServicePriceReasons> getReasons() {
        if (reasons == null) {
            reasons = new ArrayList<ServicePriceReasons>();
        }
        return this.reasons;
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
     * {@link ServicePriceComments }
     * 
     * 
     */
    public List<ServicePriceComments> getComments() {
        if (comments == null) {
            comments = new ArrayList<ServicePriceComments>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePriceServices }
     * 
     * 
     */
    public List<ServicePriceServices> getServices() {
        if (services == null) {
            services = new ArrayList<ServicePriceServices>();
        }
        return this.services;
    }

}
