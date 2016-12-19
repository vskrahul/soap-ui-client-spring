
package com.charter.enterprise.billing.csg.accounts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineOfBusiness complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineOfBusiness">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://charter.com/enterprise/billing/csg/accounts}LineOfBusinessType"/>
 *         &lt;element name="Status" type="{http://charter.com/enterprise/billing/csg/accounts}LineOfBusinessStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineOfBusiness", propOrder = {
    "type",
    "status"
})
public class LineOfBusiness {

    @XmlElement(name = "Type", required = true)
    protected LineOfBusinessType type;
    @XmlElement(name = "Status", required = true)
    protected LineOfBusinessStatus status;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusinessStatus }
     *     
     */
    public LineOfBusinessStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusinessStatus }
     *     
     */
    public void setStatus(LineOfBusinessStatus value) {
        this.status = value;
    }

}
