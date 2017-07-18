
package com.charter.enterprise.billing.csg.orders;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAssignedTelephoneNumberListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAssignedTelephoneNumberListResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TelephoneNumberList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="TelephoneNumber" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PortedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="TelephoneNumberBlockList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="TelephoneNumberBlock" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="StartTelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EndTelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PortedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TelephoneNumberCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAssignedTelephoneNumberListResult", propOrder = {
    "response",
    "telephoneNumberList",
    "telephoneNumberBlockList"
})
public class GetAssignedTelephoneNumberListResult {

    @XmlElement(name = "Response")
    protected GetAssignedTelephoneNumberListResult.Response response;
    @XmlElement(name = "TelephoneNumberList")
    protected GetAssignedTelephoneNumberListResult.TelephoneNumberList telephoneNumberList;
    @XmlElement(name = "TelephoneNumberBlockList")
    protected GetAssignedTelephoneNumberListResult.TelephoneNumberBlockList telephoneNumberBlockList;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link GetAssignedTelephoneNumberListResult.Response }
     *     
     */
    public GetAssignedTelephoneNumberListResult.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAssignedTelephoneNumberListResult.Response }
     *     
     */
    public void setResponse(GetAssignedTelephoneNumberListResult.Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the telephoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link GetAssignedTelephoneNumberListResult.TelephoneNumberList }
     *     
     */
    public GetAssignedTelephoneNumberListResult.TelephoneNumberList getTelephoneNumberList() {
        return telephoneNumberList;
    }

    /**
     * Sets the value of the telephoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAssignedTelephoneNumberListResult.TelephoneNumberList }
     *     
     */
    public void setTelephoneNumberList(GetAssignedTelephoneNumberListResult.TelephoneNumberList value) {
        this.telephoneNumberList = value;
    }

    /**
     * Gets the value of the telephoneNumberBlockList property.
     * 
     * @return
     *     possible object is
     *     {@link GetAssignedTelephoneNumberListResult.TelephoneNumberBlockList }
     *     
     */
    public GetAssignedTelephoneNumberListResult.TelephoneNumberBlockList getTelephoneNumberBlockList() {
        return telephoneNumberBlockList;
    }

    /**
     * Sets the value of the telephoneNumberBlockList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAssignedTelephoneNumberListResult.TelephoneNumberBlockList }
     *     
     */
    public void setTelephoneNumberBlockList(GetAssignedTelephoneNumberListResult.TelephoneNumberBlockList value) {
        this.telephoneNumberBlockList = value;
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
     *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "returnCode",
        "message"
    })
    public static class Response {

        @XmlElement(name = "ReturnCode")
        protected BigInteger returnCode;
        @XmlElement(name = "Message")
        protected List<Object> message;

        /**
         * Gets the value of the returnCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReturnCode() {
            return returnCode;
        }

        /**
         * Sets the value of the returnCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReturnCode(BigInteger value) {
            this.returnCode = value;
        }

        /**
         * Gets the value of the message property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getMessage() {
            if (message == null) {
                message = new ArrayList<Object>();
            }
            return this.message;
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
     *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="TelephoneNumberBlock" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="StartTelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EndTelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PortedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TelephoneNumberCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        "count",
        "telephoneNumberBlock"
    })
    public static class TelephoneNumberBlockList {

        @XmlElement(name = "Count")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger count;
        @XmlElement(name = "TelephoneNumberBlock")
        protected List<GetAssignedTelephoneNumberListResult.TelephoneNumberBlockList.TelephoneNumberBlock> telephoneNumberBlock;

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

        /**
         * Gets the value of the telephoneNumberBlock property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the telephoneNumberBlock property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTelephoneNumberBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetAssignedTelephoneNumberListResult.TelephoneNumberBlockList.TelephoneNumberBlock }
         * 
         * 
         */
        public List<GetAssignedTelephoneNumberListResult.TelephoneNumberBlockList.TelephoneNumberBlock> getTelephoneNumberBlock() {
            if (telephoneNumberBlock == null) {
                telephoneNumberBlock = new ArrayList<GetAssignedTelephoneNumberListResult.TelephoneNumberBlockList.TelephoneNumberBlock>();
            }
            return this.telephoneNumberBlock;
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
         *         &lt;element name="StartTelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EndTelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PortedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TelephoneNumberCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
            "startTelephoneNumberId",
            "endTelephoneNumberId",
            "accountId",
            "status",
            "_native",
            "portedType",
            "telephoneNumberCount"
        })
        public static class TelephoneNumberBlock {

            @XmlElement(name = "StartTelephoneNumberId")
            protected String startTelephoneNumberId;
            @XmlElement(name = "EndTelephoneNumberId")
            protected String endTelephoneNumberId;
            @XmlElement(name = "AccountId")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger accountId;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "Native")
            protected String _native;
            @XmlElement(name = "PortedType")
            protected String portedType;
            @XmlElement(name = "TelephoneNumberCount")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger telephoneNumberCount;

            /**
             * Gets the value of the startTelephoneNumberId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartTelephoneNumberId() {
                return startTelephoneNumberId;
            }

            /**
             * Sets the value of the startTelephoneNumberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartTelephoneNumberId(String value) {
                this.startTelephoneNumberId = value;
            }

            /**
             * Gets the value of the endTelephoneNumberId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndTelephoneNumberId() {
                return endTelephoneNumberId;
            }

            /**
             * Sets the value of the endTelephoneNumberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndTelephoneNumberId(String value) {
                this.endTelephoneNumberId = value;
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
             * Gets the value of the native property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNative() {
                return _native;
            }

            /**
             * Sets the value of the native property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNative(String value) {
                this._native = value;
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
             * Gets the value of the telephoneNumberCount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTelephoneNumberCount() {
                return telephoneNumberCount;
            }

            /**
             * Sets the value of the telephoneNumberCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTelephoneNumberCount(BigInteger value) {
                this.telephoneNumberCount = value;
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
     *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="TelephoneNumber" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PortedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "count",
        "telephoneNumber"
    })
    public static class TelephoneNumberList {

        @XmlElement(name = "Count")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger count;
        @XmlElement(name = "TelephoneNumber")
        protected List<GetAssignedTelephoneNumberListResult.TelephoneNumberList.TelephoneNumber> telephoneNumber;

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

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
         * {@link GetAssignedTelephoneNumberListResult.TelephoneNumberList.TelephoneNumber }
         * 
         * 
         */
        public List<GetAssignedTelephoneNumberListResult.TelephoneNumberList.TelephoneNumber> getTelephoneNumber() {
            if (telephoneNumber == null) {
                telephoneNumber = new ArrayList<GetAssignedTelephoneNumberListResult.TelephoneNumberList.TelephoneNumber>();
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
         *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PortedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "accountId",
            "status",
            "primary",
            "_native",
            "portedType",
            "inventoryType"
        })
        public static class TelephoneNumber {

            @XmlElement(name = "TelephoneNumberId")
            protected String telephoneNumberId;
            @XmlElement(name = "AccountId")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger accountId;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "Primary")
            protected String primary;
            @XmlElement(name = "Native")
            protected String _native;
            @XmlElement(name = "PortedType")
            protected String portedType;
            @XmlElement(name = "InventoryType")
            protected String inventoryType;

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
             * Gets the value of the primary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimary() {
                return primary;
            }

            /**
             * Sets the value of the primary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimary(String value) {
                this.primary = value;
            }

            /**
             * Gets the value of the native property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNative() {
                return _native;
            }

            /**
             * Sets the value of the native property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNative(String value) {
                this._native = value;
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
             * Gets the value of the inventoryType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInventoryType() {
                return inventoryType;
            }

            /**
             * Sets the value of the inventoryType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInventoryType(String value) {
                this.inventoryType = value;
            }

        }

    }

}
