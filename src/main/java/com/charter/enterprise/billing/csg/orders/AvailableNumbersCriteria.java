
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableNumbersCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableNumbersCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="TelephoneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="AreaCodeExchange" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="Exchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AvailableNumbersCriteria", propOrder = {
    "telephoneID",
    "areaCodeExchange",
    "reservationID"
})
public class AvailableNumbersCriteria {

    @XmlElement(name = "TelephoneID")
    protected String telephoneID;
    @XmlElement(name = "AreaCodeExchange")
    protected AvailableNumbersCriteria.AreaCodeExchange areaCodeExchange;
    @XmlElement(name = "ReservationID")
    protected String reservationID;

    /**
     * Gets the value of the telephoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneID() {
        return telephoneID;
    }

    /**
     * Sets the value of the telephoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneID(String value) {
        this.telephoneID = value;
    }

    /**
     * Gets the value of the areaCodeExchange property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableNumbersCriteria.AreaCodeExchange }
     *     
     */
    public AvailableNumbersCriteria.AreaCodeExchange getAreaCodeExchange() {
        return areaCodeExchange;
    }

    /**
     * Sets the value of the areaCodeExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableNumbersCriteria.AreaCodeExchange }
     *     
     */
    public void setAreaCodeExchange(AvailableNumbersCriteria.AreaCodeExchange value) {
        this.areaCodeExchange = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationID(String value) {
        this.reservationID = value;
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
     *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Exchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "areaCode",
        "exchange"
    })
    public static class AreaCodeExchange {

        @XmlElement(name = "AreaCode")
        protected String areaCode;
        @XmlElement(name = "Exchange")
        protected String exchange;

        /**
         * Gets the value of the areaCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCode() {
            return areaCode;
        }

        /**
         * Sets the value of the areaCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCode(String value) {
            this.areaCode = value;
        }

        /**
         * Gets the value of the exchange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExchange() {
            return exchange;
        }

        /**
         * Sets the value of the exchange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExchange(String value) {
            this.exchange = value;
        }

    }

}
