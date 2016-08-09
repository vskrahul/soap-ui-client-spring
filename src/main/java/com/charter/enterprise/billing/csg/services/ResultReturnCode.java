
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultReturnCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultReturnCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="NoDataFound"/>
 *     &lt;enumeration value="InvalidXml"/>
 *     &lt;enumeration value="BusinessRuleNotMet"/>
 *     &lt;enumeration value="Exception"/>
 *     &lt;enumeration value="DatabaseError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultReturnCode")
@XmlEnum
public enum ResultReturnCode {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("NoDataFound")
    NO_DATA_FOUND("NoDataFound"),
    @XmlEnumValue("InvalidXml")
    INVALID_XML("InvalidXml"),
    @XmlEnumValue("BusinessRuleNotMet")
    BUSINESS_RULE_NOT_MET("BusinessRuleNotMet"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception"),
    @XmlEnumValue("DatabaseError")
    DATABASE_ERROR("DatabaseError");
    private final String value;

    ResultReturnCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultReturnCode fromValue(String v) {
        for (ResultReturnCode c: ResultReturnCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
