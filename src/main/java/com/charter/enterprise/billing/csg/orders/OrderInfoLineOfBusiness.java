
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderInfoLineOfBusiness complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInfoLineOfBusiness">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://charter.com/enterprise/billing/csg/orders}LineOfBusinessType" minOccurs="0"/>
 *         &lt;element name="Action" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NotSpecified"/>
 *               &lt;enumeration value="Connect"/>
 *               &lt;enumeration value="Downgrade"/>
 *               &lt;enumeration value="Restart"/>
 *               &lt;enumeration value="Sidegrade"/>
 *               &lt;enumeration value="Upgrade"/>
 *               &lt;enumeration value="Disconnect"/>
 *               &lt;enumeration value="Cancelled"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "OrderInfoLineOfBusiness", propOrder = {
    "type",
    "action"
})
public class OrderInfoLineOfBusiness {

    @XmlElement(name = "Type")
    protected LineOfBusinessType type;
    @XmlElement(name = "Action")
    protected String action;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusinessType }
     *     
     */
    public LineOfBusinessType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusinessType }
     *     
     */
    public void setType(LineOfBusinessType value) {
        this.type = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
