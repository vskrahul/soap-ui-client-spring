
package com.charter.enterprise.billing.csg.equipment;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInventory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Make" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnershipDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComponentCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Component" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AddressingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Tested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Usage" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LockoutPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MaximumAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ReturnPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UploadStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CollectionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NonRespondingCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Video" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SecondaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HostIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DataIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HitPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ParentalPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AssociatedEquipment" type="{http://charter.com/enterprise/billing/csg/equipment}AssociatedEquipment" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Event" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepairDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UploadCapable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModelEdit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCSISVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumServiceClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPremiseEquipment" type="{http://charter.com/enterprise/billing/csg/equipment}OffPremiseEquipment" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://charter.com/enterprise/billing/csg/equipment}text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://charter.com/enterprise/billing/csg/equipment}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Creation" type="{http://charter.com/enterprise/billing/csg/equipment}Audit" minOccurs="0"/>
 *         &lt;element name="LastUpdate" type="{http://charter.com/enterprise/billing/csg/equipment}Audit" minOccurs="0"/>
 *         &lt;element name="FailureCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInventory", propOrder = {
    "equipmentId",
    "serialNumber",
    "type",
    "typeDescription",
    "status",
    "statusDescription",
    "currentLocation",
    "manufacturer",
    "make",
    "model",
    "modelDescription",
    "category",
    "ownership",
    "ownershipDescription",
    "signalType",
    "componentCount",
    "component",
    "cost",
    "receiptDate",
    "repairDate",
    "shipDate",
    "originalStatus",
    "originalLocation",
    "uploadCapable",
    "modelEdit",
    "vendorDescription",
    "vendorModel",
    "docsisVersion",
    "maximumServiceClass",
    "offPremiseEquipment",
    "comment",
    "customField",
    "creation",
    "lastUpdate",
    "failureCount",
    "serviceCount",
    "eventCount"
})
public class EquipmentInventory {

    @XmlElement(name = "EquipmentId")
    protected String equipmentId;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "TypeDescription")
    protected String typeDescription;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "CurrentLocation")
    protected String currentLocation;
    @XmlElement(name = "Manufacturer")
    protected String manufacturer;
    @XmlElement(name = "Make")
    protected String make;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "ModelDescription")
    protected String modelDescription;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Ownership")
    protected String ownership;
    @XmlElement(name = "OwnershipDescription")
    protected String ownershipDescription;
    @XmlElement(name = "SignalType")
    protected String signalType;
    @XmlElement(name = "ComponentCount")
    protected String componentCount;
    @XmlElement(name = "Component")
    protected List<EquipmentInventory.Component> component;
    @XmlElement(name = "Cost")
    protected String cost;
    @XmlElement(name = "ReceiptDate")
    protected String receiptDate;
    @XmlElement(name = "RepairDate")
    protected String repairDate;
    @XmlElement(name = "ShipDate")
    protected String shipDate;
    @XmlElement(name = "OriginalStatus")
    protected String originalStatus;
    @XmlElement(name = "OriginalLocation")
    protected String originalLocation;
    @XmlElement(name = "UploadCapable")
    protected String uploadCapable;
    @XmlElement(name = "ModelEdit")
    protected String modelEdit;
    @XmlElement(name = "VendorDescription")
    protected String vendorDescription;
    @XmlElement(name = "VendorModel")
    protected String vendorModel;
    @XmlElement(name = "DOCSISVersion")
    protected String docsisVersion;
    @XmlElement(name = "MaximumServiceClass")
    protected String maximumServiceClass;
    @XmlElement(name = "OffPremiseEquipment")
    protected OffPremiseEquipment offPremiseEquipment;
    @XmlElement(name = "Comment")
    protected List<Text> comment;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customField;
    @XmlElement(name = "Creation")
    protected Audit creation;
    @XmlElement(name = "LastUpdate")
    protected Audit lastUpdate;
    @XmlElement(name = "FailureCount")
    protected String failureCount;
    @XmlElement(name = "ServiceCount")
    protected String serviceCount;
    @XmlElement(name = "EventCount")
    protected String eventCount;

    /**
     * Gets the value of the equipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Sets the value of the equipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentId(String value) {
        this.equipmentId = value;
    }

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
     * Gets the value of the typeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Sets the value of the typeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
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
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
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
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
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
     * Gets the value of the modelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelDescription() {
        return modelDescription;
    }

    /**
     * Sets the value of the modelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelDescription(String value) {
        this.modelDescription = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the ownershipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipDescription() {
        return ownershipDescription;
    }

    /**
     * Sets the value of the ownershipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipDescription(String value) {
        this.ownershipDescription = value;
    }

    /**
     * Gets the value of the signalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalType() {
        return signalType;
    }

    /**
     * Sets the value of the signalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalType(String value) {
        this.signalType = value;
    }

    /**
     * Gets the value of the componentCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentCount() {
        return componentCount;
    }

    /**
     * Sets the value of the componentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentCount(String value) {
        this.componentCount = value;
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
     * {@link EquipmentInventory.Component }
     * 
     * 
     */
    public List<EquipmentInventory.Component> getComponent() {
        if (component == null) {
            component = new ArrayList<EquipmentInventory.Component>();
        }
        return this.component;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptDate(String value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the repairDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepairDate() {
        return repairDate;
    }

    /**
     * Sets the value of the repairDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepairDate(String value) {
        this.repairDate = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipDate(String value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the originalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalStatus() {
        return originalStatus;
    }

    /**
     * Sets the value of the originalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalStatus(String value) {
        this.originalStatus = value;
    }

    /**
     * Gets the value of the originalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalLocation() {
        return originalLocation;
    }

    /**
     * Sets the value of the originalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalLocation(String value) {
        this.originalLocation = value;
    }

    /**
     * Gets the value of the uploadCapable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadCapable() {
        return uploadCapable;
    }

    /**
     * Sets the value of the uploadCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadCapable(String value) {
        this.uploadCapable = value;
    }

    /**
     * Gets the value of the modelEdit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelEdit() {
        return modelEdit;
    }

    /**
     * Sets the value of the modelEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelEdit(String value) {
        this.modelEdit = value;
    }

    /**
     * Gets the value of the vendorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorDescription() {
        return vendorDescription;
    }

    /**
     * Sets the value of the vendorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorDescription(String value) {
        this.vendorDescription = value;
    }

    /**
     * Gets the value of the vendorModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorModel() {
        return vendorModel;
    }

    /**
     * Sets the value of the vendorModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorModel(String value) {
        this.vendorModel = value;
    }

    /**
     * Gets the value of the docsisVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCSISVersion() {
        return docsisVersion;
    }

    /**
     * Sets the value of the docsisVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCSISVersion(String value) {
        this.docsisVersion = value;
    }

    /**
     * Gets the value of the maximumServiceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumServiceClass() {
        return maximumServiceClass;
    }

    /**
     * Sets the value of the maximumServiceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumServiceClass(String value) {
        this.maximumServiceClass = value;
    }

    /**
     * Gets the value of the offPremiseEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link OffPremiseEquipment }
     *     
     */
    public OffPremiseEquipment getOffPremiseEquipment() {
        return offPremiseEquipment;
    }

    /**
     * Sets the value of the offPremiseEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffPremiseEquipment }
     *     
     */
    public void setOffPremiseEquipment(OffPremiseEquipment value) {
        this.offPremiseEquipment = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * 
     * 
     */
    public List<Text> getComment() {
        if (comment == null) {
            comment = new ArrayList<Text>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the customField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomField>();
        }
        return this.customField;
    }

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setCreation(Audit value) {
        this.creation = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setLastUpdate(Audit value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the failureCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureCount() {
        return failureCount;
    }

    /**
     * Sets the value of the failureCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureCount(String value) {
        this.failureCount = value;
    }

    /**
     * Gets the value of the serviceCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCount() {
        return serviceCount;
    }

    /**
     * Sets the value of the serviceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCount(String value) {
        this.serviceCount = value;
    }

    /**
     * Gets the value of the eventCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCount() {
        return eventCount;
    }

    /**
     * Sets the value of the eventCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCount(String value) {
        this.eventCount = value;
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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AddressingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Tested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Usage" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LockoutPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MaximumAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ReturnPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UploadStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CollectionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NonRespondingCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="AssociatedEquipment" type="{http://charter.com/enterprise/billing/csg/equipment}AssociatedEquipment" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Event" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "code",
        "status",
        "primaryAddress",
        "path",
        "addressingMode",
        "tested",
        "usage",
        "video",
        "service",
        "event"
    })
    public static class Component {

        @XmlElement(name = "Code")
        protected String code;
        @XmlElement(name = "Status")
        protected String status;
        @XmlElement(name = "PrimaryAddress")
        protected String primaryAddress;
        @XmlElement(name = "Path")
        protected String path;
        @XmlElement(name = "AddressingMode")
        protected String addressingMode;
        @XmlElement(name = "Tested")
        protected String tested;
        @XmlElement(name = "Usage")
        protected EquipmentInventory.Component.Usage usage;
        @XmlElement(name = "Video")
        protected EquipmentInventory.Component.Video video;
        @XmlElement(name = "Service")
        protected List<EquipmentInventory.Component.Service> service;
        @XmlElement(name = "Event")
        protected List<EquipmentInventory.Component.Event> event;
        @XmlAttribute(name = "Index")
        protected BigInteger index;

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
         * Gets the value of the tested property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTested() {
            return tested;
        }

        /**
         * Sets the value of the tested property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTested(String value) {
            this.tested = value;
        }

        /**
         * Gets the value of the usage property.
         * 
         * @return
         *     possible object is
         *     {@link EquipmentInventory.Component.Usage }
         *     
         */
        public EquipmentInventory.Component.Usage getUsage() {
            return usage;
        }

        /**
         * Sets the value of the usage property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquipmentInventory.Component.Usage }
         *     
         */
        public void setUsage(EquipmentInventory.Component.Usage value) {
            this.usage = value;
        }

        /**
         * Gets the value of the video property.
         * 
         * @return
         *     possible object is
         *     {@link EquipmentInventory.Component.Video }
         *     
         */
        public EquipmentInventory.Component.Video getVideo() {
            return video;
        }

        /**
         * Sets the value of the video property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquipmentInventory.Component.Video }
         *     
         */
        public void setVideo(EquipmentInventory.Component.Video value) {
            this.video = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EquipmentInventory.Component.Service }
         * 
         * 
         */
        public List<EquipmentInventory.Component.Service> getService() {
            if (service == null) {
                service = new ArrayList<EquipmentInventory.Component.Service>();
            }
            return this.service;
        }

        /**
         * Gets the value of the event property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the event property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EquipmentInventory.Component.Event }
         * 
         * 
         */
        public List<EquipmentInventory.Component.Event> getEvent() {
            if (event == null) {
                event = new ArrayList<EquipmentInventory.Component.Event>();
            }
            return this.event;
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
         *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "itemId",
            "description",
            "startDate",
            "startTime"
        })
        public static class Event {

            @XmlElement(name = "ItemId")
            protected String itemId;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "StartDate")
            protected String startDate;
            @XmlElement(name = "StartTime")
            protected String startTime;

            /**
             * Gets the value of the itemId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemId() {
                return itemId;
            }

            /**
             * Sets the value of the itemId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemId(String value) {
                this.itemId = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the startDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartDate() {
                return startDate;
            }

            /**
             * Sets the value of the startDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartDate(String value) {
                this.startDate = value;
            }

            /**
             * Gets the value of the startTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartTime() {
                return startTime;
            }

            /**
             * Sets the value of the startTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartTime(String value) {
                this.startTime = value;
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
         *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "code",
            "codeDescription"
        })
        public static class Service {

            @XmlElement(name = "ServiceIdentifier")
            protected String serviceIdentifier;
            @XmlElement(name = "Code")
            protected String code;
            @XmlElement(name = "CodeDescription")
            protected String codeDescription;

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
             * Gets the value of the codeDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDescription() {
                return codeDescription;
            }

            /**
             * Sets the value of the codeDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDescription(String value) {
                this.codeDescription = value;
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
         *         &lt;element name="LockoutPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MaximumAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ReturnPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UploadStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CollectionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NonRespondingCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "enabled",
            "maximumQuantity",
            "returnPath",
            "uploadStatus",
            "collectionDate",
            "nonRespondingCount"
        })
        public static class Usage {

            @XmlElement(name = "LockoutPIN")
            protected String lockoutPIN;
            @XmlElement(name = "MaximumAmount")
            protected String maximumAmount;
            @XmlElement(name = "Enabled")
            protected String enabled;
            @XmlElement(name = "MaximumQuantity")
            protected String maximumQuantity;
            @XmlElement(name = "ReturnPath")
            protected String returnPath;
            @XmlElement(name = "UploadStatus")
            protected String uploadStatus;
            @XmlElement(name = "CollectionDate")
            protected String collectionDate;
            @XmlElement(name = "NonRespondingCount")
            protected String nonRespondingCount;

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
             * Gets the value of the enabled property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnabled() {
                return enabled;
            }

            /**
             * Sets the value of the enabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnabled(String value) {
                this.enabled = value;
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

            /**
             * Gets the value of the returnPath property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReturnPath() {
                return returnPath;
            }

            /**
             * Sets the value of the returnPath property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReturnPath(String value) {
                this.returnPath = value;
            }

            /**
             * Gets the value of the uploadStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUploadStatus() {
                return uploadStatus;
            }

            /**
             * Sets the value of the uploadStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUploadStatus(String value) {
                this.uploadStatus = value;
            }

            /**
             * Gets the value of the collectionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCollectionDate() {
                return collectionDate;
            }

            /**
             * Sets the value of the collectionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCollectionDate(String value) {
                this.collectionDate = value;
            }

            /**
             * Gets the value of the nonRespondingCount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonRespondingCount() {
                return nonRespondingCount;
            }

            /**
             * Sets the value of the nonRespondingCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNonRespondingCount(String value) {
                this.nonRespondingCount = value;
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
         *         &lt;element name="AssociatedEquipment" type="{http://charter.com/enterprise/billing/csg/equipment}AssociatedEquipment" minOccurs="0"/>
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
            protected AssociatedEquipment associatedEquipment;

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
             *     {@link AssociatedEquipment }
             *     
             */
            public AssociatedEquipment getAssociatedEquipment() {
                return associatedEquipment;
            }

            /**
             * Sets the value of the associatedEquipment property.
             * 
             * @param value
             *     allowed object is
             *     {@link AssociatedEquipment }
             *     
             */
            public void setAssociatedEquipment(AssociatedEquipment value) {
                this.associatedEquipment = value;
            }

        }

    }

}
