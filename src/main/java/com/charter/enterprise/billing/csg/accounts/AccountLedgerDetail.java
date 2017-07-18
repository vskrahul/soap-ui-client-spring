
package com.charter.enterprise.billing.csg.accounts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountLedgerDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountLedgerDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NextIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Detail" type="{http://charter.com/enterprise/billing/csg/accounts}BillingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLedgerDetail", propOrder = {
    "nextIdentifier",
    "detailCount",
    "detail"
})
public class AccountLedgerDetail {

    @XmlElement(name = "NextIdentifier")
    protected String nextIdentifier;
    @XmlElement(name = "DetailCount")
    protected int detailCount;
    @XmlElement(name = "Detail")
    protected List<BillingDetail> detail;

    /**
     * Gets the value of the nextIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextIdentifier() {
        return nextIdentifier;
    }

    /**
     * Sets the value of the nextIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextIdentifier(String value) {
        this.nextIdentifier = value;
    }

    /**
     * Gets the value of the detailCount property.
     * 
     */
    public int getDetailCount() {
        return detailCount;
    }

    /**
     * Sets the value of the detailCount property.
     * 
     */
    public void setDetailCount(int value) {
        this.detailCount = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDetail }
     * 
     * 
     */
    public List<BillingDetail> getDetail() {
        if (detail == null) {
            detail = new ArrayList<BillingDetail>();
        }
        return this.detail;
    }

}
