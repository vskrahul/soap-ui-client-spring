
package com.charter.enterprise.billing.csg.orders;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for CharterHeaderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharterHeaderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TranId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OverrideCache" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DataSourceOverride" type="{http://charter.com/enterprise/billing/csg/orders}DataSourceOverrideType"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharterHeaderInfo", propOrder = {
    "tranId",
    "logOnly",
    "overrideCache",
    "dataSourceOverride"
})
public class CharterHeaderInfo {

    @XmlElement(name = "TranId", required = true)
    protected String tranId;
    @XmlElement(name = "LogOnly")
    protected boolean logOnly;
    @XmlElement(name = "OverrideCache")
    protected boolean overrideCache;
    @XmlElement(name = "DataSourceOverride", required = true)
    protected DataSourceOverrideType dataSourceOverride;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the tranId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * Sets the value of the tranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranId(String value) {
        this.tranId = value;
    }

    /**
     * Gets the value of the logOnly property.
     * 
     */
    public boolean isLogOnly() {
        return logOnly;
    }

    /**
     * Sets the value of the logOnly property.
     * 
     */
    public void setLogOnly(boolean value) {
        this.logOnly = value;
    }

    /**
     * Gets the value of the overrideCache property.
     * 
     */
    public boolean isOverrideCache() {
        return overrideCache;
    }

    /**
     * Sets the value of the overrideCache property.
     * 
     */
    public void setOverrideCache(boolean value) {
        this.overrideCache = value;
    }

    /**
     * Gets the value of the dataSourceOverride property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceOverrideType }
     *     
     */
    public DataSourceOverrideType getDataSourceOverride() {
        return dataSourceOverride;
    }

    /**
     * Sets the value of the dataSourceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceOverrideType }
     *     
     */
    public void setDataSourceOverride(DataSourceOverrideType value) {
        this.dataSourceOverride = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
