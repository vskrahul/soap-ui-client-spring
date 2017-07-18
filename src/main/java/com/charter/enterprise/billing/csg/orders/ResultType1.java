
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultType1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Informational"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultType1")
@XmlEnum
public enum ResultType1 {

    @XmlEnumValue("Informational")
    INFORMATIONAL("Informational"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    ResultType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultType1 fromValue(String v) {
        for (ResultType1 c: ResultType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
