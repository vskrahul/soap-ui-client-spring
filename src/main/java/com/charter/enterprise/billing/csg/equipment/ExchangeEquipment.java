
package com.charter.enterprise.billing.csg.equipment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeEquipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldOutlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewOutlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Component" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OldCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NewCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Video" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SecondaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HostIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DataIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AssociatedEquipment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="RatingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alert" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestedFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeEquipment", propOrder = {
    "handshakeId",
    "oldSerialNumber",
    "oldType",
    "oldOutlet",
    "newSerialNumber",
    "newType",
    "newOutlet",
    "currentLocation",
    "model",
    "ownership",
    "component",
    "ratingCode",
    "alert",
    "requestedFunction"
})
public class ExchangeEquipment {

    @XmlElement(name = "HandshakeId")
    protected String handshakeId;
    @XmlElement(name = "OldSerialNumber")
    protected String oldSerialNumber;
    @XmlElement(name = "OldType")
    protected String oldType;
    @XmlElement(name = "OldOutlet")
    protected String oldOutlet;
    @XmlElement(name = "NewSerialNumber")
    protected String newSerialNumber;
    @XmlElement(name = "NewType")
    protected String newType;
    @XmlElement(name = "NewOutlet")
    protected String newOutlet;
    @XmlElement(name = "CurrentLocation")
    protected String currentLocation;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "Ownership")
    protected String ownership;
    @XmlElement(name = "Component")
    protected List<ExchangeEquipment.Component> component;
    @XmlElement(name = "RatingCode")
    protected String ratingCode;
    @XmlElement(name = "Alert")
    protected List<ExchangeEquipment.Alert> alert;
    @XmlElement(name = "RequestedFunction")
    protected String requestedFunction;

    /**
     * Gets the value of the handshakeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandshakeId() {
        return handshakeId;
    }

    /**
     * Sets the value of the handshakeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandshakeId(String value) {
        this.handshakeId = value;
    }

    /**
     * Gets the value of the oldSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSerialNumber() {
        return oldSerialNumber;
    }

    /**
     * Sets the value of the oldSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSerialNumber(String value) {
        this.oldSerialNumber = value;
    }

    /**
     * Gets the value of the oldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldType() {
        return oldType;
    }

    /**
     * Sets the value of the oldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldType(String value) {
        this.oldType = value;
    }

    /**
     * Gets the value of the oldOutlet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldOutlet() {
        return oldOutlet;
    }

    /**
     * Sets the value of the oldOutlet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldOutlet(String value) {
        this.oldOutlet = value;
    }

    /**
     * Gets the value of the newSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSerialNumber() {
        return newSerialNumber;
    }

    /**
     * Sets the value of the newSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSerialNumber(String value) {
        this.newSerialNumber = value;
    }

    /**
     * Gets the value of the newType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewType() {
        return newType;
    }

    /**
     * Sets the value of the newType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewType(String value) {
        this.newType = value;
    }

    /**
     * Gets the value of the newOutlet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewOutlet() {
        return newOutlet;
    }

    /**
     * Sets the value of the newOutlet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewOutlet(String value) {
        this.newOutlet = value;
    }

    /**
     * Gets the value of the currentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the value of the currentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLocation(String value) {
        this.currentLocation = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnership(String value) {
        this.ownership = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeEquipment.Component }
     * 
     * 
     */
    public List<ExchangeEquipment.Component> getComponent() {
        if (component == null) {
            component = new ArrayList<ExchangeEquipment.Component>();
        }
        return this.component;
    }

    /**
     * Gets the value of the ratingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingCode() {
        return ratingCode;
    }

    /**
     * Sets the value of the ratingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingCode(String value) {
        this.ratingCode = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeEquipment.Alert }
     * 
     * 
     */
    public List<ExchangeEquipment.Alert> getAlert() {
        if (alert == null) {
            alert = new ArrayList<ExchangeEquipment.Alert>();
        }
        return this.alert;
    }

    /**
     * Gets the value of the requestedFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedFunction() {
        return requestedFunction;
    }

    /**
     * Sets the value of the requestedFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedFunction(String value) {
        this.requestedFunction = value;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "name",
        "value"
    })
    public static class Alert {

        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "Value")
        protected String value;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
     *         &lt;element name="OldCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NewCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Video" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SecondaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HostIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DataIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AssociatedEquipment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "oldCode",
        "newCode",
        "primaryAddress",
        "video",
        "item"
    })
    public static class Component {

        @XmlElement(name = "OldCode")
        protected String oldCode;
        @XmlElement(name = "NewCode")
        protected String newCode;
        @XmlElement(name = "PrimaryAddress")
        protected String primaryAddress;
        @XmlElement(name = "Video")
        protected ExchangeEquipment.Component.Video video;
        @XmlElement(name = "Item")
        protected List<ExchangeEquipment.Component.Item> item;

        /**
         * Gets the value of the oldCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldCode() {
            return oldCode;
        }

        /**
         * Sets the value of the oldCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldCode(String value) {
            this.oldCode = value;
        }

        /**
         * Gets the value of the newCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewCode() {
            return newCode;
        }

        /**
         * Sets the value of the newCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewCode(String value) {
            this.newCode = value;
        }

        /**
         * Gets the value of the primaryAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryAddress() {
            return primaryAddress;
        }

        /**
         * Sets the value of the primaryAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryAddress(String value) {
            this.primaryAddress = value;
        }

        /**
         * Gets the value of the video property.
         * 
         * @return
         *     possible object is
         *     {@link ExchangeEquipment.Component.Video }
         *     
         */
        public ExchangeEquipment.Component.Video getVideo() {
            return video;
        }

        /**
         * Sets the value of the video property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExchangeEquipment.Component.Video }
         *     
         */
        public void setVideo(ExchangeEquipment.Component.Video value) {
            this.video = value;
        }

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExchangeEquipment.Component.Item }
         * 
         * 
         */
        public List<ExchangeEquipment.Component.Item> getItem() {
            if (item == null) {
                item = new ArrayList<ExchangeEquipment.Component.Item>();
            }
            return this.item;
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
         *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "serviceIdentifier",
            "port"
        })
        public static class Item {

            @XmlElement(name = "ServiceIdentifier")
            protected String serviceIdentifier;
            @XmlElement(name = "Port")
            protected String port;

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
         *         &lt;element name="SecondaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HostIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DataIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AssociatedEquipment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "secondaryAddress",
            "hostIdentifier",
            "dataIdentifier",
            "associatedEquipment"
        })
        public static class Video {

            @XmlElement(name = "SecondaryAddress")
            protected String secondaryAddress;
            @XmlElement(name = "HostIdentifier")
            protected String hostIdentifier;
            @XmlElement(name = "DataIdentifier")
            protected String dataIdentifier;
            @XmlElement(name = "AssociatedEquipment")
            protected ExchangeEquipment.Component.Video.AssociatedEquipment associatedEquipment;

            /**
             * Gets the value of the secondaryAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecondaryAddress() {
                return secondaryAddress;
            }

            /**
             * Sets the value of the secondaryAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecondaryAddress(String value) {
                this.secondaryAddress = value;
            }

            /**
             * Gets the value of the hostIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHostIdentifier() {
                return hostIdentifier;
            }

            /**
             * Sets the value of the hostIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHostIdentifier(String value) {
                this.hostIdentifier = value;
            }

            /**
             * Gets the value of the dataIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataIdentifier() {
                return dataIdentifier;
            }

            /**
             * Sets the value of the dataIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataIdentifier(String value) {
                this.dataIdentifier = value;
            }

            /**
             * Gets the value of the associatedEquipment property.
             * 
             * @return
             *     possible object is
             *     {@link ExchangeEquipment.Component.Video.AssociatedEquipment }
             *     
             */
            public ExchangeEquipment.Component.Video.AssociatedEquipment getAssociatedEquipment() {
                return associatedEquipment;
            }

            /**
             * Sets the value of the associatedEquipment property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExchangeEquipment.Component.Video.AssociatedEquipment }
             *     
             */
            public void setAssociatedEquipment(ExchangeEquipment.Component.Video.AssociatedEquipment value) {
                this.associatedEquipment = value;
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
             *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "serialNumber",
                "type",
                "componentCode"
            })
            public static class AssociatedEquipment {

                @XmlElement(name = "SerialNumber")
                protected String serialNumber;
                @XmlElement(name = "Type")
                protected String type;
                @XmlElement(name = "ComponentCode")
                protected String componentCode;

                /**
                 * Gets the value of the serialNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSerialNumber() {
                    return serialNumber;
                }

                /**
                 * Sets the value of the serialNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSerialNumber(String value) {
                    this.serialNumber = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the componentCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getComponentCode() {
                    return componentCode;
                }

                /**
                 * Sets the value of the componentCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setComponentCode(String value) {
                    this.componentCode = value;
                }

            }

        }

    }

}
