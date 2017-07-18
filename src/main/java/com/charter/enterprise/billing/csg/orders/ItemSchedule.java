
package com.charter.enterprise.billing.csg.orders;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSchedule">
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
@XmlType(name = "ItemSchedule", propOrder = {
    "minimumDays",
    "lecIdentifier",
    "lecMinimumDays"
})
public class ItemSchedule {

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
