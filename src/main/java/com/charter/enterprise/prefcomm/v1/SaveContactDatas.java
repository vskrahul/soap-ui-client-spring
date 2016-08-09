
package com.charter.enterprise.prefcomm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactDatas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactDatas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDataList" type="{http://www.charter.com/enterprise/prefcomm/v1}contactData" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveContactDatas", propOrder = {
    "contactDataList"
})
public class SaveContactDatas {

    @XmlElement(required = true)
    protected List<ContactData> contactDataList;

    /**
     * Gets the value of the contactDataList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDataList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDataList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactData }
     * 
     * 
     */
    public List<ContactData> getContactDataList() {
        if (contactDataList == null) {
            contactDataList = new ArrayList<ContactData>();
        }
        return this.contactDataList;
    }

}
