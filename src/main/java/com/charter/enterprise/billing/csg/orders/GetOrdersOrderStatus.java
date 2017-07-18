
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOrdersOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetOrdersOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetOrdersOrderStatus")
@XmlEnum
public enum GetOrdersOrderStatus {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    GetOrdersOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetOrdersOrderStatus fromValue(String v) {
        for (GetOrdersOrderStatus c: GetOrdersOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
