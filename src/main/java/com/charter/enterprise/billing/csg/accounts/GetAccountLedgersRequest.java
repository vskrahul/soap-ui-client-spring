
package com.charter.enterprise.billing.csg.accounts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CsgHeaderInfo" type="{http://charter.com/enterprise/billing/csg/accounts}CsgHeaderInfo" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ledger" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NextIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountLedgerFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatementMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StatementYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LedgerDateRange" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LedgerBeginPostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="LedgerEndPostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LedgerDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DetailTypeExcludeIncludeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "csgHeaderInfo",
    "accountId",
    "ledger",
    "accountLedgerFilter"
})
@XmlRootElement(name = "GetAccountLedgersRequest")
public class GetAccountLedgersRequest {

    @XmlElement(name = "CsgHeaderInfo")
    protected CsgHeaderInfo csgHeaderInfo;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "Ledger")
    protected GetAccountLedgersRequest.Ledger ledger;
    @XmlElement(name = "AccountLedgerFilter")
    protected GetAccountLedgersRequest.AccountLedgerFilter accountLedgerFilter;

    /**
     * Gets the value of the csgHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CsgHeaderInfo }
     *     
     */
    public CsgHeaderInfo getCsgHeaderInfo() {
        return csgHeaderInfo;
    }

    /**
     * Sets the value of the csgHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsgHeaderInfo }
     *     
     */
    public void setCsgHeaderInfo(CsgHeaderInfo value) {
        this.csgHeaderInfo = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the ledger property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountLedgersRequest.Ledger }
     *     
     */
    public GetAccountLedgersRequest.Ledger getLedger() {
        return ledger;
    }

    /**
     * Sets the value of the ledger property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountLedgersRequest.Ledger }
     *     
     */
    public void setLedger(GetAccountLedgersRequest.Ledger value) {
        this.ledger = value;
    }

    /**
     * Gets the value of the accountLedgerFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountLedgersRequest.AccountLedgerFilter }
     *     
     */
    public GetAccountLedgersRequest.AccountLedgerFilter getAccountLedgerFilter() {
        return accountLedgerFilter;
    }

    /**
     * Sets the value of the accountLedgerFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountLedgersRequest.AccountLedgerFilter }
     *     
     */
    public void setAccountLedgerFilter(GetAccountLedgersRequest.AccountLedgerFilter value) {
        this.accountLedgerFilter = value;
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
     *         &lt;element name="StatementMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StatementYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LedgerDateRange" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LedgerBeginPostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="LedgerEndPostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LedgerDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DetailTypeExcludeIncludeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "statementMonth",
        "statementYear",
        "ledgerDateRange",
        "ledgerDetailType",
        "detailTypeExcludeIncludeIndicator"
    })
    public static class AccountLedgerFilter {

        @XmlElement(name = "StatementMonth")
        protected String statementMonth;
        @XmlElement(name = "StatementYear")
        protected String statementYear;
        @XmlElement(name = "LedgerDateRange")
        protected GetAccountLedgersRequest.AccountLedgerFilter.LedgerDateRange ledgerDateRange;
        @XmlElement(name = "LedgerDetailType")
        protected List<GetAccountLedgersRequest.AccountLedgerFilter.LedgerDetailType> ledgerDetailType;
        @XmlElement(name = "DetailTypeExcludeIncludeIndicator")
        protected String detailTypeExcludeIncludeIndicator;

        /**
         * Gets the value of the statementMonth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatementMonth() {
            return statementMonth;
        }

        /**
         * Sets the value of the statementMonth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatementMonth(String value) {
            this.statementMonth = value;
        }

        /**
         * Gets the value of the statementYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatementYear() {
            return statementYear;
        }

        /**
         * Sets the value of the statementYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatementYear(String value) {
            this.statementYear = value;
        }

        /**
         * Gets the value of the ledgerDateRange property.
         * 
         * @return
         *     possible object is
         *     {@link GetAccountLedgersRequest.AccountLedgerFilter.LedgerDateRange }
         *     
         */
        public GetAccountLedgersRequest.AccountLedgerFilter.LedgerDateRange getLedgerDateRange() {
            return ledgerDateRange;
        }

        /**
         * Sets the value of the ledgerDateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetAccountLedgersRequest.AccountLedgerFilter.LedgerDateRange }
         *     
         */
        public void setLedgerDateRange(GetAccountLedgersRequest.AccountLedgerFilter.LedgerDateRange value) {
            this.ledgerDateRange = value;
        }

        /**
         * Gets the value of the ledgerDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ledgerDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLedgerDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetAccountLedgersRequest.AccountLedgerFilter.LedgerDetailType }
         * 
         * 
         */
        public List<GetAccountLedgersRequest.AccountLedgerFilter.LedgerDetailType> getLedgerDetailType() {
            if (ledgerDetailType == null) {
                ledgerDetailType = new ArrayList<GetAccountLedgersRequest.AccountLedgerFilter.LedgerDetailType>();
            }
            return this.ledgerDetailType;
        }

        /**
         * Gets the value of the detailTypeExcludeIncludeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetailTypeExcludeIncludeIndicator() {
            return detailTypeExcludeIncludeIndicator;
        }

        /**
         * Sets the value of the detailTypeExcludeIncludeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetailTypeExcludeIncludeIndicator(String value) {
            this.detailTypeExcludeIncludeIndicator = value;
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
         *         &lt;element name="LedgerBeginPostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="LedgerEndPostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "ledgerBeginPostDate",
            "ledgerEndPostDate"
        })
        public static class LedgerDateRange {

            @XmlElement(name = "LedgerBeginPostDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar ledgerBeginPostDate;
            @XmlElement(name = "LedgerEndPostDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar ledgerEndPostDate;

            /**
             * Gets the value of the ledgerBeginPostDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLedgerBeginPostDate() {
                return ledgerBeginPostDate;
            }

            /**
             * Sets the value of the ledgerBeginPostDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLedgerBeginPostDate(XMLGregorianCalendar value) {
                this.ledgerBeginPostDate = value;
            }

            /**
             * Gets the value of the ledgerEndPostDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLedgerEndPostDate() {
                return ledgerEndPostDate;
            }

            /**
             * Sets the value of the ledgerEndPostDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLedgerEndPostDate(XMLGregorianCalendar value) {
                this.ledgerEndPostDate = value;
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
         *         &lt;element name="DetailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "detailType"
        })
        public static class LedgerDetailType {

            @XmlElement(name = "DetailType")
            protected String detailType;

            /**
             * Gets the value of the detailType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailType() {
                return detailType;
            }

            /**
             * Sets the value of the detailType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailType(String value) {
                this.detailType = value;
            }

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
     *         &lt;element name="NextIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "nextIdentifier"
    })
    public static class Ledger {

        @XmlElement(name = "NextIdentifier")
        protected String nextIdentifier;

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

    }

}
