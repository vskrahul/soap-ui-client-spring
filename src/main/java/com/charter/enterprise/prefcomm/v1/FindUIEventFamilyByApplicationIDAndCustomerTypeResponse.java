
package com.charter.enterprise.prefcomm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findUIEventFamilyByApplicationIDAndCustomerTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findUIEventFamilyByApplicationIDAndCustomerTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.charter.com/enterprise/prefcomm/v1}uiEventFamily" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="charterHeaderOutputInfo" type="{http://www.charter.com/enterprise/prefcomm/v1}standardOutputHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findUIEventFamilyByApplicationIDAndCustomerTypeResponse", propOrder = {
    "_return",
    "charterHeaderOutputInfo"
})
public class FindUIEventFamilyByApplicationIDAndCustomerTypeResponse {

    @XmlElement(name = "return")
    protected List<UiEventFamily> _return;
    protected StandardOutputHeader charterHeaderOutputInfo;

    /**
     * Gets the value of the return property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the return property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UiEventFamily }
     * 
     * 
     */
    public List<UiEventFamily> getReturn() {
        if (_return == null) {
            _return = new ArrayList<UiEventFamily>();
        }
        return this._return;
    }

    /**
     * Gets the value of the charterHeaderOutputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StandardOutputHeader }
     *     
     */
    public StandardOutputHeader getCharterHeaderOutputInfo() {
        return charterHeaderOutputInfo;
    }

    /**
     * Sets the value of the charterHeaderOutputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOutputHeader }
     *     
     */
    public void setCharterHeaderOutputInfo(StandardOutputHeader value) {
        this.charterHeaderOutputInfo = value;
    }

}
