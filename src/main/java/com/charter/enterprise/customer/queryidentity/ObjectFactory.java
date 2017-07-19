
package com.charter.enterprise.customer.queryidentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.charter.enterprise.customer.queryidentity package. 
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

    private final static QName _QueryIdentityRequest_QNAME = new QName("http://charter.com/enterprise/customer/QueryIdentity", "QueryIdentityRequest");
    private final static QName _QueryIdentityResponse_QNAME = new QName("http://charter.com/enterprise/customer/QueryIdentity", "QueryIdentityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.charter.enterprise.customer.queryidentity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryIdentityResponseType }
     * 
     */
    public QueryIdentityResponseType createQueryIdentityResponseType() {
        return new QueryIdentityResponseType();
    }

    /**
     * Create an instance of {@link QueryIdentityRequestBodyType.Preferences }
     * 
     */
    public QueryIdentityRequestBodyType.Preferences createQueryIdentityRequestBodyTypePreferences() {
        return new QueryIdentityRequestBodyType.Preferences();
    }

    /**
     * Create an instance of {@link QueryIdentityRequestType }
     * 
     */
    public QueryIdentityRequestType createQueryIdentityRequestType() {
        return new QueryIdentityRequestType();
    }

    /**
     * Create an instance of {@link QueryIdentityResponseBodyType.Identity.SecurityQuestions.SecurityQuestion }
     * 
     */
    public QueryIdentityResponseBodyType.Identity.SecurityQuestions.SecurityQuestion createQueryIdentityResponseBodyTypeIdentitySecurityQuestionsSecurityQuestion() {
        return new QueryIdentityResponseBodyType.Identity.SecurityQuestions.SecurityQuestion();
    }

    /**
     * Create an instance of {@link ResultExceptionInfo }
     * 
     */
    public ResultExceptionInfo createResultExceptionInfo() {
        return new ResultExceptionInfo();
    }

    /**
     * Create an instance of {@link QueryIdentityResponseBodyType.Identity }
     * 
     */
    public QueryIdentityResponseBodyType.Identity createQueryIdentityResponseBodyTypeIdentity() {
        return new QueryIdentityResponseBodyType.Identity();
    }

    /**
     * Create an instance of {@link AccountIdentityType }
     * 
     */
    public AccountIdentityType createAccountIdentityType() {
        return new AccountIdentityType();
    }

    /**
     * Create an instance of {@link QueryIdentityResponseBodyType.Identity.Preferences }
     * 
     */
    public QueryIdentityResponseBodyType.Identity.Preferences createQueryIdentityResponseBodyTypeIdentityPreferences() {
        return new QueryIdentityResponseBodyType.Identity.Preferences();
    }

    /**
     * Create an instance of {@link QueryIdentityResponseBodyType }
     * 
     */
    public QueryIdentityResponseBodyType createQueryIdentityResponseBodyType() {
        return new QueryIdentityResponseBodyType();
    }

    /**
     * Create an instance of {@link QueryIdentityRequestBodyType }
     * 
     */
    public QueryIdentityRequestBodyType createQueryIdentityRequestBodyType() {
        return new QueryIdentityRequestBodyType();
    }

    /**
     * Create an instance of {@link UserIdentityType }
     * 
     */
    public UserIdentityType createUserIdentityType() {
        return new UserIdentityType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link QueryIdentityResponseBodyType.Identity.Preferences.Preference }
     * 
     */
    public QueryIdentityResponseBodyType.Identity.Preferences.Preference createQueryIdentityResponseBodyTypeIdentityPreferencesPreference() {
        return new QueryIdentityResponseBodyType.Identity.Preferences.Preference();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link QueryIdentityResponseBodyType.Identity.SecurityQuestions }
     * 
     */
    public QueryIdentityResponseBodyType.Identity.SecurityQuestions createQueryIdentityResponseBodyTypeIdentitySecurityQuestions() {
        return new QueryIdentityResponseBodyType.Identity.SecurityQuestions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryIdentityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/customer/QueryIdentity", name = "QueryIdentityRequest")
    public JAXBElement<QueryIdentityRequestType> createQueryIdentityRequest(QueryIdentityRequestType value) {
        return new JAXBElement<QueryIdentityRequestType>(_QueryIdentityRequest_QNAME, QueryIdentityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryIdentityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/customer/QueryIdentity", name = "QueryIdentityResponse")
    public JAXBElement<QueryIdentityResponseType> createQueryIdentityResponse(QueryIdentityResponseType value) {
        return new JAXBElement<QueryIdentityResponseType>(_QueryIdentityResponse_QNAME, QueryIdentityResponseType.class, null, value);
    }

}
