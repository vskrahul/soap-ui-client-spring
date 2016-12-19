
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Drop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Drop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HookUpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutageAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Drop", propOrder = {
    "site",
    "hookUpType",
    "poleNumber",
    "hub",
    "outageAgent"
})
public class Drop {

    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "HookUpType")
    protected String hookUpType;
    @XmlElement(name = "PoleNumber")
    protected String poleNumber;
    @XmlElement(name = "Hub")
    protected String hub;
    @XmlElement(name = "OutageAgent")
    protected String outageAgent;

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the hookUpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHookUpType() {
        return hookUpType;
    }

    /**
     * Sets the value of the hookUpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHookUpType(String value) {
        this.hookUpType = value;
    }

    /**
     * Gets the value of the poleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoleNumber() {
        return poleNumber;
    }

    /**
     * Sets the value of the poleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoleNumber(String value) {
        this.poleNumber = value;
    }

    /**
     * Gets the value of the hub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHub() {
        return hub;
    }

    /**
     * Sets the value of the hub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHub(String value) {
        this.hub = value;
    }

    /**
     * Gets the value of the outageAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageAgent() {
        return outageAgent;
    }

    /**
     * Sets the value of the outageAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageAgent(String value) {
        this.outageAgent = value;
    }

}
