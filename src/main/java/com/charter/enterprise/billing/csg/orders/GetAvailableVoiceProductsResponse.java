
package com.charter.enterprise.billing.csg.orders;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/orders.gavpl}Result" minOccurs="0"/>
 *         &lt;element name="Business" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AvailableCatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ServiceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ChildCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Child" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="RepeatCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ParameterCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Parameter" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Repeatable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Restricted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Constraint" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SelectionOption" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="RandomDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="LECMinimumDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
    "result",
    "business",
    "location",
    "productList"
})
@XmlRootElement(name = "GetAvailableVoiceProductsResponse", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
public class GetAvailableVoiceProductsResponse {

    @XmlElement(name = "Result", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
    protected Result result;
    @XmlElement(name = "Business", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
    protected GetAvailableVoiceProductsResponse.Business business;
    @XmlElement(name = "Location", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
    protected GetAvailableVoiceProductsResponse.Location location;
    @XmlElement(name = "ProductList", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
    protected GetAvailableVoiceProductsResponse.ProductList productList;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link GetAvailableVoiceProductsResponse.Business }
     *     
     */
    public GetAvailableVoiceProductsResponse.Business getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAvailableVoiceProductsResponse.Business }
     *     
     */
    public void setBusiness(GetAvailableVoiceProductsResponse.Business value) {
        this.business = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link GetAvailableVoiceProductsResponse.Location }
     *     
     */
    public GetAvailableVoiceProductsResponse.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAvailableVoiceProductsResponse.Location }
     *     
     */
    public void setLocation(GetAvailableVoiceProductsResponse.Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link GetAvailableVoiceProductsResponse.ProductList }
     *     
     */
    public GetAvailableVoiceProductsResponse.ProductList getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAvailableVoiceProductsResponse.ProductList }
     *     
     */
    public void setProductList(GetAvailableVoiceProductsResponse.ProductList value) {
        this.productList = value;
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
     *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "businessUnit"
    })
    public static class Business {

        @XmlElement(name = "BusinessUnit", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
        protected String businessUnit;

        /**
         * Gets the value of the businessUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessUnit() {
            return businessUnit;
        }

        /**
         * Sets the value of the businessUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessUnit(String value) {
            this.businessUnit = value;
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
     *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "locationId"
    })
    public static class Location {

        @XmlElement(name = "LocationId", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
        protected String locationId;

        /**
         * Gets the value of the locationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationId() {
            return locationId;
        }

        /**
         * Sets the value of the locationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationId(String value) {
            this.locationId = value;
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
     *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AvailableCatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ServiceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ChildCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Child" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RepeatCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ParameterCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Parameter" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Repeatable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Restricted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Constraint" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SelectionOption" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="RandomDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="LECMinimumDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        "product"
    })
    public static class ProductList {

        @XmlElement(name = "Count", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
        protected String count;
        @XmlElement(name = "Product", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
        protected List<GetAvailableVoiceProductsResponse.ProductList.Product> product;

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCount(String value) {
            this.count = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetAvailableVoiceProductsResponse.ProductList.Product }
         * 
         * 
         */
        public List<GetAvailableVoiceProductsResponse.ProductList.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<GetAvailableVoiceProductsResponse.ProductList.Product>();
            }
            return this.product;
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
         *         &lt;element name="AvailableCatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ServiceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ChildCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Child" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RepeatCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ParameterCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Parameter" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Repeatable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Restricted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Constraint" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="SelectionOption" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="RandomDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="LECMinimumDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "code",
            "availableCatalogIdentifier",
            "catalogIdentifier",
            "longDescription",
            "inventoryType",
            "serviceType",
            "serviceCategory",
            "childCount",
            "child",
            "parameterCount",
            "parameter"
        })
        public static class Product {

            @XmlElement(name = "Code", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected String code;
            @XmlElement(name = "AvailableCatalogIdentifier", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected String availableCatalogIdentifier;
            @XmlElement(name = "CatalogIdentifier", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected String catalogIdentifier;
            @XmlElement(name = "LongDescription", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected String longDescription;
            @XmlElement(name = "InventoryType", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected String inventoryType;
            @XmlElement(name = "ServiceType", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected String serviceType;
            @XmlElement(name = "ServiceCategory", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected String serviceCategory;
            @XmlElement(name = "ChildCount", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected String childCount;
            @XmlElement(name = "Child", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected List<GetAvailableVoiceProductsResponse.ProductList.Product.Child> child;
            @XmlElement(name = "ParameterCount", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected String parameterCount;
            @XmlElement(name = "Parameter", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
            protected List<GetAvailableVoiceProductsResponse.ProductList.Product.Parameter> parameter;

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
             * Gets the value of the availableCatalogIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAvailableCatalogIdentifier() {
                return availableCatalogIdentifier;
            }

            /**
             * Sets the value of the availableCatalogIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAvailableCatalogIdentifier(String value) {
                this.availableCatalogIdentifier = value;
            }

            /**
             * Gets the value of the catalogIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCatalogIdentifier() {
                return catalogIdentifier;
            }

            /**
             * Sets the value of the catalogIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCatalogIdentifier(String value) {
                this.catalogIdentifier = value;
            }

            /**
             * Gets the value of the longDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLongDescription() {
                return longDescription;
            }

            /**
             * Sets the value of the longDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLongDescription(String value) {
                this.longDescription = value;
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

            /**
             * Gets the value of the serviceType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceType() {
                return serviceType;
            }

            /**
             * Sets the value of the serviceType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceType(String value) {
                this.serviceType = value;
            }

            /**
             * Gets the value of the serviceCategory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceCategory() {
                return serviceCategory;
            }

            /**
             * Sets the value of the serviceCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceCategory(String value) {
                this.serviceCategory = value;
            }

            /**
             * Gets the value of the childCount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChildCount() {
                return childCount;
            }

            /**
             * Sets the value of the childCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChildCount(String value) {
                this.childCount = value;
            }

            /**
             * Gets the value of the child property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the child property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChild().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetAvailableVoiceProductsResponse.ProductList.Product.Child }
             * 
             * 
             */
            public List<GetAvailableVoiceProductsResponse.ProductList.Product.Child> getChild() {
                if (child == null) {
                    child = new ArrayList<GetAvailableVoiceProductsResponse.ProductList.Product.Child>();
                }
                return this.child;
            }

            /**
             * Gets the value of the parameterCount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParameterCount() {
                return parameterCount;
            }

            /**
             * Sets the value of the parameterCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParameterCount(String value) {
                this.parameterCount = value;
            }

            /**
             * Gets the value of the parameter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parameter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParameter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetAvailableVoiceProductsResponse.ProductList.Product.Parameter }
             * 
             * 
             */
            public List<GetAvailableVoiceProductsResponse.ProductList.Product.Parameter> getParameter() {
                if (parameter == null) {
                    parameter = new ArrayList<GetAvailableVoiceProductsResponse.ProductList.Product.Parameter>();
                }
                return this.parameter;
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
             *         &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="RepeatCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "catalogIdentifier",
                "required",
                "repeatCount"
            })
            public static class Child {

                @XmlElement(name = "CatalogIdentifier", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected String catalogIdentifier;
                @XmlElement(name = "Required", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected String required;
                @XmlElement(name = "RepeatCount", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected String repeatCount;

                /**
                 * Gets the value of the catalogIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCatalogIdentifier() {
                    return catalogIdentifier;
                }

                /**
                 * Sets the value of the catalogIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCatalogIdentifier(String value) {
                    this.catalogIdentifier = value;
                }

                /**
                 * Gets the value of the required property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequired() {
                    return required;
                }

                /**
                 * Sets the value of the required property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequired(String value) {
                    this.required = value;
                }

                /**
                 * Gets the value of the repeatCount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRepeatCount() {
                    return repeatCount;
                }

                /**
                 * Sets the value of the repeatCount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRepeatCount(String value) {
                    this.repeatCount = value;
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
             *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Repeatable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Restricted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Constraint" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SelectionOption" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="RandomDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="LECMinimumDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
                "identifier",
                "name",
                "description",
                "required",
                "repeatable",
                "restricted",
                "constraint",
                "selectionOption"
            })
            public static class Parameter {

                @XmlElement(name = "Identifier", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected String identifier;
                @XmlElement(name = "Name", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected String name;
                @XmlElement(name = "Description", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected String description;
                @XmlElement(name = "Required", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected String required;
                @XmlElement(name = "Repeatable", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected String repeatable;
                @XmlElement(name = "Restricted", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected String restricted;
                @XmlElement(name = "Constraint", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected List<GetAvailableVoiceProductsResponse.ProductList.Product.Parameter.Constraint> constraint;
                @XmlElement(name = "SelectionOption", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                protected List<GetAvailableVoiceProductsResponse.ProductList.Product.Parameter.SelectionOption> selectionOption;

                /**
                 * Gets the value of the identifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdentifier() {
                    return identifier;
                }

                /**
                 * Sets the value of the identifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdentifier(String value) {
                    this.identifier = value;
                }

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
                 * Gets the value of the required property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequired() {
                    return required;
                }

                /**
                 * Sets the value of the required property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequired(String value) {
                    this.required = value;
                }

                /**
                 * Gets the value of the repeatable property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRepeatable() {
                    return repeatable;
                }

                /**
                 * Sets the value of the repeatable property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRepeatable(String value) {
                    this.repeatable = value;
                }

                /**
                 * Gets the value of the restricted property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRestricted() {
                    return restricted;
                }

                /**
                 * Sets the value of the restricted property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRestricted(String value) {
                    this.restricted = value;
                }

                /**
                 * Gets the value of the constraint property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the constraint property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConstraint().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GetAvailableVoiceProductsResponse.ProductList.Product.Parameter.Constraint }
                 * 
                 * 
                 */
                public List<GetAvailableVoiceProductsResponse.ProductList.Product.Parameter.Constraint> getConstraint() {
                    if (constraint == null) {
                        constraint = new ArrayList<GetAvailableVoiceProductsResponse.ProductList.Product.Parameter.Constraint>();
                    }
                    return this.constraint;
                }

                /**
                 * Gets the value of the selectionOption property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the selectionOption property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSelectionOption().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GetAvailableVoiceProductsResponse.ProductList.Product.Parameter.SelectionOption }
                 * 
                 * 
                 */
                public List<GetAvailableVoiceProductsResponse.ProductList.Product.Parameter.SelectionOption> getSelectionOption() {
                    if (selectionOption == null) {
                        selectionOption = new ArrayList<GetAvailableVoiceProductsResponse.ProductList.Product.Parameter.SelectionOption>();
                    }
                    return this.selectionOption;
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
                 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "description"
                })
                public static class Constraint {

                    @XmlElement(name = "Description", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                    protected String description;

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
                 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="RandomDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="LECMinimumDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
                    "identifier",
                    "value",
                    "description",
                    "_default",
                    "randomDisplay",
                    "lecMinimumDays"
                })
                public static class SelectionOption {

                    @XmlElement(name = "Identifier", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                    protected String identifier;
                    @XmlElement(name = "Value", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                    protected String value;
                    @XmlElement(name = "Description", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                    protected String description;
                    @XmlElement(name = "Default", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                    protected String _default;
                    @XmlElement(name = "RandomDisplay", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                    protected String randomDisplay;
                    @XmlElement(name = "LECMinimumDays", namespace = "http://charter.com/enterprise/billing/csg/orders.gavpl")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger lecMinimumDays;

                    /**
                     * Gets the value of the identifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentifier() {
                        return identifier;
                    }

                    /**
                     * Sets the value of the identifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentifier(String value) {
                        this.identifier = value;
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
                     * Gets the value of the default property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDefault() {
                        return _default;
                    }

                    /**
                     * Sets the value of the default property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDefault(String value) {
                        this._default = value;
                    }

                    /**
                     * Gets the value of the randomDisplay property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRandomDisplay() {
                        return randomDisplay;
                    }

                    /**
                     * Sets the value of the randomDisplay property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRandomDisplay(String value) {
                        this.randomDisplay = value;
                    }

                    /**
                     * Gets the value of the lecMinimumDays property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getLECMinimumDays() {
                        return lecMinimumDays;
                    }

                    /**
                     * Sets the value of the lecMinimumDays property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setLECMinimumDays(BigInteger value) {
                        this.lecMinimumDays = value;
                    }

                }

            }

        }

    }

}
