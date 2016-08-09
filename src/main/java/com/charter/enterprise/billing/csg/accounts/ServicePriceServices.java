
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicePriceServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePriceServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePriceServices", propOrder = {
    "code",
    "serviceIdentifier",
    "quantity",
    "rate",
    "negotiatedCharge",
    "negotiatedChargeOverride",
    "effectiveDate"
})
public class ServicePriceServices {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "ServiceIdentifier")
    protected String serviceIdentifier;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "NegotiatedCharge", required = true)
    protected BigDecimal negotiatedCharge;
    @XmlElement(name = "NegotiatedChargeOverride")
    protected String negotiatedChargeOverride;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;

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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the negotiatedCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNegotiatedCharge() {
        return negotiatedCharge;
    }

    /**
     * Sets the value of the negotiatedCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNegotiatedCharge(BigDecimal value) {
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

}
