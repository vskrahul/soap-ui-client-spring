
package com.charter.enterprise.billing.csg.accounts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonetaryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonetaryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Delinquent"/>
 *     &lt;enumeration value="CreditOnAccount"/>
 *     &lt;enumeration value="OverPayPerViewLimit"/>
 *     &lt;enumeration value="OverLimitAndDelinquent"/>
 *     &lt;enumeration value="NotAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonetaryStatus")
@XmlEnum
public enum MonetaryStatus {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Delinquent")
    DELINQUENT("Delinquent"),
    @XmlEnumValue("CreditOnAccount")
    CREDIT_ON_ACCOUNT("CreditOnAccount"),
    @XmlEnumValue("OverPayPerViewLimit")
    OVER_PAY_PER_VIEW_LIMIT("OverPayPerViewLimit"),
    @XmlEnumValue("OverLimitAndDelinquent")
    OVER_LIMIT_AND_DELINQUENT("OverLimitAndDelinquent"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable");
    private final String value;

    MonetaryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonetaryStatus fromValue(String v) {
        for (MonetaryStatus c: MonetaryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
