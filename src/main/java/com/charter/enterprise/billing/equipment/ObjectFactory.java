
package com.charter.enterprise.billing.equipment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.charter.enterprise.billing.equipment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CharterHeaderInfo_QNAME = new QName("http://charter.com/enterprise/billing/equipment", "CharterHeaderInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.charter.enterprise.billing.equipment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CharterHeaderInfo }
     * 
     */
    public CharterHeaderInfo createCharterHeaderInfo() {
        return new CharterHeaderInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharterHeaderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/billing/equipment", name = "CharterHeaderInfo")
    public JAXBElement<CharterHeaderInfo> createCharterHeaderInfo(CharterHeaderInfo value) {
        return new JAXBElement<CharterHeaderInfo>(_CharterHeaderInfo_QNAME, CharterHeaderInfo.class, null, value);
    }

}
