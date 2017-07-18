
package com.charter.enterprise.billing.csg.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAddOrderRequestTransferTelephoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddOrderRequestTransferTelephoneNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelephoneNumber" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PortedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PortOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Transfer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ArrayOfAddOrderRequestTransferTelephoneNumber", propOrder = {
    "telephoneNumber"
})
public class ArrayOfAddOrderRequestTransferTelephoneNumber {

    @XmlElement(name = "TelephoneNumber")
    protected List<ArrayOfAddOrderRequestTransferTelephoneNumber.TelephoneNumber> telephoneNumber;

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAddOrderRequestTransferTelephoneNumber.TelephoneNumber }
     * 
     * 
     */
    public List<ArrayOfAddOrderRequestTransferTelephoneNumber.TelephoneNumber> getTelephoneNumber() {
        if (telephoneNumber == null) {
            telephoneNumber = new ArrayList<ArrayOfAddOrderRequestTransferTelephoneNumber.TelephoneNumber>();
        }
        return this.telephoneNumber;
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
     *         &lt;element name="TelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PortedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PortOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Transfer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "telephoneNumberId",
        "portedType",
        "portOut",
        "transfer",
        "action"
    })
    public static class TelephoneNumber {

        @XmlElement(name = "TelephoneNumberId")
        protected String telephoneNumberId;
        @XmlElement(name = "PortedType")
        protected String portedType;
        @XmlElement(name = "PortOut")
        protected String portOut;
        @XmlElement(name = "Transfer")
        protected ArrayOfAddOrderRequestTransferTelephoneNumber.TelephoneNumber.Transfer transfer;
        @XmlElement(name = "Action")
        protected String action;

        /**
         * Gets the value of the telephoneNumberId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelephoneNumberId() {
            return telephoneNumberId;
        }

        /**
         * Sets the value of the telephoneNumberId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelephoneNumberId(String value) {
            this.telephoneNumberId = value;
        }

        /**
         * Gets the value of the portedType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortedType() {
            return portedType;
        }

        /**
         * Sets the value of the portedType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortedType(String value) {
            this.portedType = value;
        }

        /**
         * Gets the value of the portOut property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortOut() {
            return portOut;
        }

        /**
         * Sets the value of the portOut property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortOut(String value) {
            this.portOut = value;
        }

        /**
         * Gets the value of the transfer property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfAddOrderRequestTransferTelephoneNumber.TelephoneNumber.Transfer }
         *     
         */
        public ArrayOfAddOrderRequestTransferTelephoneNumber.TelephoneNumber.Transfer getTransfer() {
            return transfer;
        }

        /**
         * Sets the value of the transfer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfAddOrderRequestTransferTelephoneNumber.TelephoneNumber.Transfer }
         *     
         */
        public void setTransfer(ArrayOfAddOrderRequestTransferTelephoneNumber.TelephoneNumber.Transfer value) {
            this.transfer = value;
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
         *         &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "indicator"
        })
        public static class Transfer {

            @XmlElement(name = "Indicator")
            protected String indicator;

            /**
             * Gets the value of the indicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndicator() {
                return indicator;
            }

            /**
             * Sets the value of the indicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndicator(String value) {
                this.indicator = value;
            }

        }

    }

}
