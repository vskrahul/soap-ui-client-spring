
package com.charter.enterprise.billing.csg.equipment;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LockoutPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MaximumAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Video" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SecondaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HostIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DataIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HitPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ParentalPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *       &lt;/sequence>
 *       &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentUpdate", propOrder = {
    "primaryAddress",
    "path",
    "addressingMode",
    "usage",
    "video"
})
public class ComponentUpdate {

    @XmlElement(name = "PrimaryAddress")
    protected String primaryAddress;
    @XmlElement(name = "Path")
    protected String path;
    @XmlElement(name = "AddressingMode")
    protected String addressingMode;
    @XmlElement(name = "Usage")
    protected ComponentUpdate.Usage usage;
    @XmlElement(name = "Video")
    protected ComponentUpdate.Video video;
    @XmlAttribute(name = "Index")
    protected BigInteger index;

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
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the addressingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressingMode() {
        return addressingMode;
    }

    /**
     * Sets the value of the addressingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressingMode(String value) {
        this.addressingMode = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentUpdate.Usage }
     *     
     */
    public ComponentUpdate.Usage getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentUpdate.Usage }
     *     
     */
    public void setUsage(ComponentUpdate.Usage value) {
        this.usage = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentUpdate.Video }
     *     
     */
    public ComponentUpdate.Video getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentUpdate.Video }
     *     
     */
    public void setVideo(ComponentUpdate.Video value) {
        this.video = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
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
     *         &lt;element name="LockoutPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MaximumAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "lockoutPIN",
        "maximumAmount",
        "maximumQuantity"
    })
    public static class Usage {

        @XmlElement(name = "LockoutPIN")
        protected String lockoutPIN;
        @XmlElement(name = "MaximumAmount")
        protected String maximumAmount;
        @XmlElement(name = "MaximumQuantity")
        protected String maximumQuantity;

        /**
         * Gets the value of the lockoutPIN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLockoutPIN() {
            return lockoutPIN;
        }

        /**
         * Sets the value of the lockoutPIN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLockoutPIN(String value) {
            this.lockoutPIN = value;
        }

        /**
         * Gets the value of the maximumAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaximumAmount() {
            return maximumAmount;
        }

        /**
         * Sets the value of the maximumAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaximumAmount(String value) {
            this.maximumAmount = value;
        }

        /**
         * Gets the value of the maximumQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaximumQuantity() {
            return maximumQuantity;
        }

        /**
         * Sets the value of the maximumQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaximumQuantity(String value) {
            this.maximumQuantity = value;
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
     *         &lt;element name="HitPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ParentalPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "hitPriority",
        "parentalPIN",
        "associatedEquipment"
    })
    public static class Video {

        @XmlElement(name = "SecondaryAddress")
        protected String secondaryAddress;
        @XmlElement(name = "HostIdentifier")
        protected String hostIdentifier;
        @XmlElement(name = "DataIdentifier")
        protected String dataIdentifier;
        @XmlElement(name = "HitPriority")
        protected String hitPriority;
        @XmlElement(name = "ParentalPIN")
        protected String parentalPIN;
        @XmlElement(name = "AssociatedEquipment")
        protected ComponentUpdate.Video.AssociatedEquipment associatedEquipment;

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
         * Gets the value of the hitPriority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHitPriority() {
            return hitPriority;
        }

        /**
         * Sets the value of the hitPriority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHitPriority(String value) {
            this.hitPriority = value;
        }

        /**
         * Gets the value of the parentalPIN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentalPIN() {
            return parentalPIN;
        }

        /**
         * Sets the value of the parentalPIN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentalPIN(String value) {
            this.parentalPIN = value;
        }

        /**
         * Gets the value of the associatedEquipment property.
         * 
         * @return
         *     possible object is
         *     {@link ComponentUpdate.Video.AssociatedEquipment }
         *     
         */
        public ComponentUpdate.Video.AssociatedEquipment getAssociatedEquipment() {
            return associatedEquipment;
        }

        /**
         * Sets the value of the associatedEquipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ComponentUpdate.Video.AssociatedEquipment }
         *     
         */
        public void setAssociatedEquipment(ComponentUpdate.Video.AssociatedEquipment value) {
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
