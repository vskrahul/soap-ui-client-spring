
package com.charter.enterprise.prefcomm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactPreferenceByValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactPreferenceByValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPreferenceValueList" type="{http://www.charter.com/enterprise/prefcomm/v1}contactPreferenceValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveContactPreferenceByValues", propOrder = {
    "contactPreferenceValueList"
})
public class SaveContactPreferenceByValues {

    @XmlElement(required = true)
    protected List<ContactPreferenceValue> contactPreferenceValueList;

    /**
     * Gets the value of the contactPreferenceValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPreferenceValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPreferenceValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPreferenceValue }
     * 
     * 
     */
    public List<ContactPreferenceValue> getContactPreferenceValueList() {
        if (contactPreferenceValueList == null) {
            contactPreferenceValueList = new ArrayList<ContactPreferenceValue>();
        }
        return this.contactPreferenceValueList;
    }

}
