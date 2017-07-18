
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDFStatementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing" type="{http://charter.com/enterprise/billing/csg/accounts}Billing" minOccurs="0"/>
 *         &lt;element name="PreviousBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://charter.com/enterprise/billing/csg/accounts}Total" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Payment" type="{http://charter.com/enterprise/billing/csg/accounts}paymentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementSummary", propOrder = {
    "date",
    "pdfStatementId",
    "billing",
    "previousBalance",
    "balance",
    "total",
    "payment"
})
public class StatementSummary {

    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "PDFStatementId")
    protected String pdfStatementId;
    @XmlElement(name = "Billing")
    protected Billing billing;
    @XmlElement(name = "PreviousBalance")
    protected BigDecimal previousBalance;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "Total")
    protected List<Total> total;
    @XmlElement(name = "Payment")
    protected PaymentType payment;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the pdfStatementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFStatementId() {
        return pdfStatementId;
    }

    /**
     * Sets the value of the pdfStatementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFStatementId(String value) {
        this.pdfStatementId = value;
    }

    /**
     * Gets the value of the billing property.
     * 
     * @return
     *     possible object is
     *     {@link Billing }
     *     
     */
    public Billing getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Billing }
     *     
     */
    public void setBilling(Billing value) {
        this.billing = value;
    }

    /**
     * Gets the value of the previousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets the value of the previousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousBalance(BigDecimal value) {
        this.previousBalance = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the total property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Total }
     * 
     * 
     */
    public List<Total> getTotal() {
        if (total == null) {
            total = new ArrayList<Total>();
        }
        return this.total;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPayment(PaymentType value) {
        this.payment = value;
    }

}
