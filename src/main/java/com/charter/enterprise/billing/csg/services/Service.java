
package com.charter.enterprise.billing.csg.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerDiscountBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerDiscountEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusinessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HierarchyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Charge" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisconnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{http://charter.com/enterprise/billing/csg/services}Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Offer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="PenaltyOfferIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="PenaltyServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Product" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PricePlan" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                             &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                             &lt;element name="OriginalBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ClassChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
 *         &lt;element name="Schedule" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MinimumDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="LECIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LECMinimumDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
@XmlType(name = "Service", propOrder = {
    "serviceIdentifier",
    "billingIdentifier",
    "parentServiceIdentifier",
    "code",
    "codeDescription",
    "billCode",
    "billCodeDescription",
    "discountCode",
    "discountCodeDescription",
    "discountBeginDate",
    "discountEndDate",
    "customerDiscountBeginDate",
    "customerDiscountEndDate",
    "lineOfBusinessType",
    "telephoneNumber",
    "hierarchyType",
    "outlet",
    "status",
    "rate",
    "negotiatedCharge",
    "negotiatedChargeOverride",
    "quantity",
    "charge",
    "chargeType",
    "chargeMethod",
    "connectDate",
    "disconnectDate",
    "port",
    "parameters",
    "offer",
    "schedule"
})
public class Service {

    @XmlElement(name = "ServiceIdentifier")
    protected String serviceIdentifier;
    @XmlElement(name = "BillingIdentifier")
    protected String billingIdentifier;
    @XmlElement(name = "ParentServiceIdentifier")
    protected String parentServiceIdentifier;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "CodeDescription")
    protected String codeDescription;
    @XmlElement(name = "BillCode")
    protected String billCode;
    @XmlElement(name = "BillCodeDescription")
    protected String billCodeDescription;
    @XmlElement(name = "DiscountCode")
    protected String discountCode;
    @XmlElement(name = "DiscountCodeDescription")
    protected String discountCodeDescription;
    @XmlElement(name = "DiscountBeginDate")
    protected String discountBeginDate;
    @XmlElement(name = "DiscountEndDate")
    protected String discountEndDate;
    @XmlElement(name = "CustomerDiscountBeginDate")
    protected String customerDiscountBeginDate;
    @XmlElement(name = "CustomerDiscountEndDate")
    protected String customerDiscountEndDate;
    @XmlElement(name = "LineOfBusinessType")
    protected String lineOfBusinessType;
    @XmlElement(name = "TelephoneNumber")
    protected String telephoneNumber;
    @XmlElement(name = "HierarchyType")
    protected String hierarchyType;
    @XmlElement(name = "Outlet")
    protected String outlet;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Rate")
    protected float rate;
    @XmlElement(name = "NegotiatedCharge")
    protected float negotiatedCharge;
    @XmlElement(name = "NegotiatedChargeOverride")
    protected String negotiatedChargeOverride;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "Charge")
    protected float charge;
    @XmlElement(name = "ChargeType")
    protected String chargeType;
    @XmlElement(name = "ChargeMethod")
    protected String chargeMethod;
    @XmlElement(name = "ConnectDate")
    protected String connectDate;
    @XmlElement(name = "DisconnectDate")
    protected String disconnectDate;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Parameters")
    protected List<Parameter> parameters;
    @XmlElement(name = "Offer")
    protected Service.Offer offer;
    @XmlElement(name = "Schedule")
    protected Service.Schedule schedule;

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentifier(String value) {
        this.serviceIdentifier = value;
    }

    /**
     * Gets the value of the billingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingIdentifier() {
        return billingIdentifier;
    }

    /**
     * Sets the value of the billingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingIdentifier(String value) {
        this.billingIdentifier = value;
    }

    /**
     * Gets the value of the parentServiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentServiceIdentifier() {
        return parentServiceIdentifier;
    }

    /**
     * Sets the value of the parentServiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentServiceIdentifier(String value) {
        this.parentServiceIdentifier = value;
    }

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
     * Gets the value of the billCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * Sets the value of the billCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCode(String value) {
        this.billCode = value;
    }

    /**
     * Gets the value of the billCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCodeDescription() {
        return billCodeDescription;
    }

    /**
     * Sets the value of the billCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCodeDescription(String value) {
        this.billCodeDescription = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * Gets the value of the discountCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCodeDescription() {
        return discountCodeDescription;
    }

    /**
     * Sets the value of the discountCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCodeDescription(String value) {
        this.discountCodeDescription = value;
    }

    /**
     * Gets the value of the discountBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountBeginDate() {
        return discountBeginDate;
    }

    /**
     * Sets the value of the discountBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountBeginDate(String value) {
        this.discountBeginDate = value;
    }

    /**
     * Gets the value of the discountEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountEndDate() {
        return discountEndDate;
    }

    /**
     * Sets the value of the discountEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountEndDate(String value) {
        this.discountEndDate = value;
    }

    /**
     * Gets the value of the customerDiscountBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscountBeginDate() {
        return customerDiscountBeginDate;
    }

    /**
     * Sets the value of the customerDiscountBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscountBeginDate(String value) {
        this.customerDiscountBeginDate = value;
    }

    /**
     * Gets the value of the customerDiscountEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscountEndDate() {
        return customerDiscountEndDate;
    }

    /**
     * Sets the value of the customerDiscountEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscountEndDate(String value) {
        this.customerDiscountEndDate = value;
    }

    /**
     * Gets the value of the lineOfBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOfBusinessType() {
        return lineOfBusinessType;
    }

    /**
     * Sets the value of the lineOfBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOfBusinessType(String value) {
        this.lineOfBusinessType = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the hierarchyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyType() {
        return hierarchyType;
    }

    /**
     * Sets the value of the hierarchyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyType(String value) {
        this.hierarchyType = value;
    }

    /**
     * Gets the value of the outlet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlet() {
        return outlet;
    }

    /**
     * Sets the value of the outlet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlet(String value) {
        this.outlet = value;
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
     * Gets the value of the rate property.
     * 
     */
    public float getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     */
    public void setRate(float value) {
        this.rate = value;
    }

    /**
     * Gets the value of the negotiatedCharge property.
     * 
     */
    public float getNegotiatedCharge() {
        return negotiatedCharge;
    }

    /**
     * Sets the value of the negotiatedCharge property.
     * 
     */
    public void setNegotiatedCharge(float value) {
        this.negotiatedCharge = value;
    }

    /**
     * Gets the value of the negotiatedChargeOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedChargeOverride() {
        return negotiatedChargeOverride;
    }

    /**
     * Sets the value of the negotiatedChargeOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedChargeOverride(String value) {
        this.negotiatedChargeOverride = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     */
    public float getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     */
    public void setCharge(float value) {
        this.charge = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the chargeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeMethod() {
        return chargeMethod;
    }

    /**
     * Sets the value of the chargeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeMethod(String value) {
        this.chargeMethod = value;
    }

    /**
     * Gets the value of the connectDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectDate() {
        return connectDate;
    }

    /**
     * Sets the value of the connectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectDate(String value) {
        this.connectDate = value;
    }

    /**
     * Gets the value of the disconnectDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectDate() {
        return disconnectDate;
    }

    /**
     * Sets the value of the disconnectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectDate(String value) {
        this.disconnectDate = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<Parameter>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link Service.Offer }
     *     
     */
    public Service.Offer getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service.Offer }
     *     
     */
    public void setOffer(Service.Offer value) {
        this.offer = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Service.Schedule }
     *     
     */
    public Service.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service.Schedule }
     *     
     */
    public void setSchedule(Service.Schedule value) {
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
     *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="PenaltyOfferIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="PenaltyServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Product" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PricePlan" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                   &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                   &lt;element name="OriginalBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ClassChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        "identifier",
        "parentServiceIdentifier",
        "rootServiceIdentifier",
        "componentIdentifier",
        "originalIdentifier",
        "penaltyOfferIdentifier",
        "penaltyServiceIdentifier",
        "product",
        "pricePlan"
    })
    public static class Offer {

        @XmlElement(name = "Identifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger identifier;
        @XmlElement(name = "ParentServiceIdentifier")
        protected String parentServiceIdentifier;
        @XmlElement(name = "RootServiceIdentifier")
        protected String rootServiceIdentifier;
        @XmlElement(name = "ComponentIdentifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger componentIdentifier;
        @XmlElement(name = "OriginalIdentifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger originalIdentifier;
        @XmlElement(name = "PenaltyOfferIdentifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger penaltyOfferIdentifier;
        @XmlElement(name = "PenaltyServiceIdentifier")
        protected String penaltyServiceIdentifier;
        @XmlElement(name = "Product")
        protected Service.Offer.Product product;
        @XmlElement(name = "PricePlan")
        protected Service.Offer.PricePlan pricePlan;

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIdentifier(BigInteger value) {
            this.identifier = value;
        }

        /**
         * Gets the value of the parentServiceIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentServiceIdentifier() {
            return parentServiceIdentifier;
        }

        /**
         * Sets the value of the parentServiceIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentServiceIdentifier(String value) {
            this.parentServiceIdentifier = value;
        }

        /**
         * Gets the value of the rootServiceIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRootServiceIdentifier() {
            return rootServiceIdentifier;
        }

        /**
         * Sets the value of the rootServiceIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRootServiceIdentifier(String value) {
            this.rootServiceIdentifier = value;
        }

        /**
         * Gets the value of the componentIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getComponentIdentifier() {
            return componentIdentifier;
        }

        /**
         * Sets the value of the componentIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setComponentIdentifier(BigInteger value) {
            this.componentIdentifier = value;
        }

        /**
         * Gets the value of the originalIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOriginalIdentifier() {
            return originalIdentifier;
        }

        /**
         * Sets the value of the originalIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOriginalIdentifier(BigInteger value) {
            this.originalIdentifier = value;
        }

        /**
         * Gets the value of the penaltyOfferIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPenaltyOfferIdentifier() {
            return penaltyOfferIdentifier;
        }

        /**
         * Sets the value of the penaltyOfferIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPenaltyOfferIdentifier(BigInteger value) {
            this.penaltyOfferIdentifier = value;
        }

        /**
         * Gets the value of the penaltyServiceIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPenaltyServiceIdentifier() {
            return penaltyServiceIdentifier;
        }

        /**
         * Sets the value of the penaltyServiceIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPenaltyServiceIdentifier(String value) {
            this.penaltyServiceIdentifier = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link Service.Offer.Product }
         *     
         */
        public Service.Offer.Product getProduct() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link Service.Offer.Product }
         *     
         */
        public void setProduct(Service.Offer.Product value) {
            this.product = value;
        }

        /**
         * Gets the value of the pricePlan property.
         * 
         * @return
         *     possible object is
         *     {@link Service.Offer.PricePlan }
         *     
         */
        public Service.Offer.PricePlan getPricePlan() {
            return pricePlan;
        }

        /**
         * Sets the value of the pricePlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Service.Offer.PricePlan }
         *     
         */
        public void setPricePlan(Service.Offer.PricePlan value) {
            this.pricePlan = value;
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
         *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *         &lt;element name="OriginalBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ClassChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
            "identifier",
            "beginDate",
            "originalIdentifier",
            "originalBeginDate",
            "classChoiceIdentifier"
        })
        public static class PricePlan {

            @XmlElement(name = "Identifier")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger identifier;
            @XmlElement(name = "BeginDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar beginDate;
            @XmlElement(name = "OriginalIdentifier")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger originalIdentifier;
            @XmlElement(name = "OriginalBeginDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar originalBeginDate;
            @XmlElement(name = "ClassChoiceIdentifier")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger classChoiceIdentifier;

            /**
             * Gets the value of the identifier property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIdentifier() {
                return identifier;
            }

            /**
             * Sets the value of the identifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIdentifier(BigInteger value) {
                this.identifier = value;
            }

            /**
             * Gets the value of the beginDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getBeginDate() {
                return beginDate;
            }

            /**
             * Sets the value of the beginDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setBeginDate(XMLGregorianCalendar value) {
                this.beginDate = value;
            }

            /**
             * Gets the value of the originalIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getOriginalIdentifier() {
                return originalIdentifier;
            }

            /**
             * Sets the value of the originalIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setOriginalIdentifier(BigInteger value) {
                this.originalIdentifier = value;
            }

            /**
             * Gets the value of the originalBeginDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getOriginalBeginDate() {
                return originalBeginDate;
            }

            /**
             * Sets the value of the originalBeginDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setOriginalBeginDate(XMLGregorianCalendar value) {
                this.originalBeginDate = value;
            }

            /**
             * Gets the value of the classChoiceIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getClassChoiceIdentifier() {
                return classChoiceIdentifier;
            }

            /**
             * Sets the value of the classChoiceIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setClassChoiceIdentifier(BigInteger value) {
                this.classChoiceIdentifier = value;
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
         *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
            "identifier"
        })
        public static class Product {

            @XmlElement(name = "Identifier")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger identifier;

            /**
             * Gets the value of the identifier property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIdentifier() {
                return identifier;
            }

            /**
             * Sets the value of the identifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIdentifier(BigInteger value) {
                this.identifier = value;
            }

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
     *         &lt;element name="MinimumDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="LECIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LECMinimumDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        "minimumDays",
        "lecIdentifier",
        "lecMinimumDays"
    })
    public static class Schedule {

        @XmlElement(name = "MinimumDays")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minimumDays;
        @XmlElement(name = "LECIdentifier")
        protected String lecIdentifier;
        @XmlElement(name = "LECMinimumDays")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger lecMinimumDays;

        /**
         * Gets the value of the minimumDays property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumDays() {
            return minimumDays;
        }

        /**
         * Sets the value of the minimumDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumDays(BigInteger value) {
            this.minimumDays = value;
        }

        /**
         * Gets the value of the lecIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLECIdentifier() {
            return lecIdentifier;
        }

        /**
         * Sets the value of the lecIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLECIdentifier(String value) {
            this.lecIdentifier = value;
        }

        /**
         * Gets the value of the lecMinimumDays property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLECMinimumDays() {
            return lecMinimumDays;
        }

        /**
         * Sets the value of the lecMinimumDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLECMinimumDays(BigInteger value) {
            this.lecMinimumDays = value;
        }

    }

}
