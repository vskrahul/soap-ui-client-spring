
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedFunction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestedFunction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Change"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestedFunction")
@XmlEnum
public enum RequestedFunction {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Change")
    CHANGE("Change");
    private final String value;

    RequestedFunction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestedFunction fromValue(String v) {
        for (RequestedFunction c: RequestedFunction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
