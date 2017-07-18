
package com.charter.enterprise.billing.csg.equipment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Equipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Equipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentLocationEntryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Make" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplacementModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplacementModelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnershipDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComponentCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Component" type="{http://charter.com/enterprise/billing/csg/equipment}Component" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepairDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCSISVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPremiseEquipment" type="{http://charter.com/enterprise/billing/csg/equipment}OffPremiseEquipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equipment", propOrder = {
    "accountID",
    "serialNumber",
    "type",
    "description",
    "typeDescription",
    "subType",
    "outlet",
    "sequence",
    "status",
    "statusDescription",
    "currentLocation",
    "currentLocationEntryDate",
    "manufacturer",
    "make",
    "model",
    "modelDescription",
    "replacementModel",
    "replacementModelDescription",
    "ownership",
    "ownershipDescription",
    "inventoryStatus",
    "signalType",
    "componentCount",
    "component",
    "cost",
    "ratingCode",
    "receiptDate",
    "repairDate",
    "shipDate",
    "vendorDescription",
    "vendorModel",
    "docsisVersion",
    "offPremiseEquipment"
})
public class Equipment {

    @XmlElement(name = "AccountID")
    protected String accountID;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "TypeDescription")
    protected String typeDescription;
    @XmlElement(name = "SubType")
    protected String subType;
    @XmlElement(name = "Outlet")
    protected String outlet;
    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "CurrentLocation")
    protected String currentLocation;
    @XmlElement(name = "CurrentLocationEntryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currentLocationEntryDate;
    @XmlElement(name = "Manufacturer")
    protected String manufacturer;
    @XmlElement(name = "Make")
    protected String make;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "ModelDescription")
    protected String modelDescription;
    @XmlElement(name = "ReplacementModel")
    protected String replacementModel;
    @XmlElement(name = "ReplacementModelDescription")
    protected String replacementModelDescription;
    @XmlElement(name = "Ownership")
    protected String ownership;
    @XmlElement(name = "OwnershipDescription")
    protected String ownershipDescription;
    @XmlElement(name = "InventoryStatus")
    protected String inventoryStatus;
    @XmlElement(name = "SignalType")
    protected String signalType;
    @XmlElement(name = "ComponentCount")
    protected String componentCount;
    @XmlElement(name = "Component")
    protected List<Component> component;
    @XmlElement(name = "Cost")
    protected String cost;
    @XmlElement(name = "RatingCode")
    protected String ratingCode;
    @XmlElement(name = "ReceiptDate")
    protected String receiptDate;
    @XmlElement(name = "RepairDate")
    protected String repairDate;
    @XmlElement(name = "ShipDate")
    protected String shipDate;
    @XmlElement(name = "VendorDescription")
    protected String vendorDescription;
    @XmlElement(name = "VendorModel")
    protected String vendorModel;
    @XmlElement(name = "DOCSISVersion")
    protected String docsisVersion;
    @XmlElement(name = "OffPremiseEquipment")
    protected OffPremiseEquipment offPremiseEquipment;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
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
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the outlet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlet() {
        return outlet;
    }

    /**
     * Sets the value of the outlet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlet(String value) {
        this.outlet = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
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
     * Gets the value of the currentLocationEntryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentLocationEntryDate() {
        return currentLocationEntryDate;
    }

    /**
     * Sets the value of the currentLocationEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentLocationEntryDate(XMLGregorianCalendar value) {
        this.currentLocationEntryDate = value;
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
     * Gets the value of the replacementModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementModel() {
        return replacementModel;
    }

    /**
     * Sets the value of the replacementModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementModel(String value) {
        this.replacementModel = value;
    }

    /**
     * Gets the value of the replacementModelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementModelDescription() {
        return replacementModelDescription;
    }

    /**
     * Sets the value of the replacementModelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementModelDescription(String value) {
        this.replacementModelDescription = value;
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
     * Gets the value of the inventoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryStatus() {
        return inventoryStatus;
    }

    /**
     * Sets the value of the inventoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryStatus(String value) {
        this.inventoryStatus = value;
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
     * {@link Component }
     * 
     * 
     */
    public List<Component> getComponent() {
        if (component == null) {
            component = new ArrayList<Component>();
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

}
