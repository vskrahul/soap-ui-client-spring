
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="customerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INDIV"/>
 *     &lt;enumeration value="BUSN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "customerType")
@XmlEnum
public enum CustomerType {

    INDIV,
    BUSN;

    public String value() {
        return name();
    }

    public static CustomerType fromValue(String v) {
        return valueOf(v);
    }

}
