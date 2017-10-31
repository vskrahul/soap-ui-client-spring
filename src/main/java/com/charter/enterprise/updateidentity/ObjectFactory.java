
package com.charter.enterprise.updateidentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.charter.enterprise.updateidentity package. 
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

    private final static QName _UpdateIdentityRequest_QNAME = new QName("http://charter.com/enterprise/updateidentity", "UpdateIdentityRequest");
    private final static QName _UpdateIdentityResponse_QNAME = new QName("http://charter.com/enterprise/updateidentity", "UpdateIdentityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.charter.enterprise.updateidentity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateIdentityRequestBodyType.Preferences.PreferenceModification }
     * 
     */
    public UpdateIdentityRequestBodyType.Preferences.PreferenceModification createUpdateIdentityRequestBodyTypePreferencesPreferenceModification() {
        return new UpdateIdentityRequestBodyType.Preferences.PreferenceModification();
    }

    /**
     * Create an instance of {@link ResultExceptionInfo }
     * 
     */
    public ResultExceptionInfo createResultExceptionInfo() {
        return new ResultExceptionInfo();
    }

    /**
     * Create an instance of {@link AccountIdentityType }
     * 
     */
    public AccountIdentityType createAccountIdentityType() {
        return new AccountIdentityType();
    }

    /**
     * Create an instance of {@link UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestionModification }
     * 
     */
    public UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestionModification createUpdateIdentityRequestBodyTypeSecurityQuestionsSecurityQuestionModification() {
        return new UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestionModification();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link UpdateIdentityRequestBodyType }
     * 
     */
    public UpdateIdentityRequestBodyType createUpdateIdentityRequestBodyType() {
        return new UpdateIdentityRequestBodyType();
    }

    /**
     * Create an instance of {@link IdentityResponseBodyType }
     * 
     */
    public IdentityResponseBodyType createIdentityResponseBodyType() {
        return new IdentityResponseBodyType();
    }

    /**
     * Create an instance of {@link UserIdentityType }
     * 
     */
    public UserIdentityType createUserIdentityType() {
        return new UserIdentityType();
    }

    /**
     * Create an instance of {@link UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestion }
     * 
     */
    public UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestion createUpdateIdentityRequestBodyTypeSecurityQuestionsSecurityQuestion() {
        return new UpdateIdentityRequestBodyType.SecurityQuestions.SecurityQuestion();
    }

    /**
     * Create an instance of {@link UpdateIdentityRequestBodyType.Preferences }
     * 
     */
    public UpdateIdentityRequestBodyType.Preferences createUpdateIdentityRequestBodyTypePreferences() {
        return new UpdateIdentityRequestBodyType.Preferences();
    }

    /**
     * Create an instance of {@link UpdateIdentityRequestBodyType.SecurityQuestions }
     * 
     */
    public UpdateIdentityRequestBodyType.SecurityQuestions createUpdateIdentityRequestBodyTypeSecurityQuestions() {
        return new UpdateIdentityRequestBodyType.SecurityQuestions();
    }

    /**
     * Create an instance of {@link UpdateIdentityRequestType }
     * 
     */
    public UpdateIdentityRequestType createUpdateIdentityRequestType() {
        return new UpdateIdentityRequestType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link UpdateIdentityRequestBodyType.IdentityModification }
     * 
     */
    public UpdateIdentityRequestBodyType.IdentityModification createUpdateIdentityRequestBodyTypeIdentityModification() {
        return new UpdateIdentityRequestBodyType.IdentityModification();
    }

    /**
     * Create an instance of {@link UpdateIdentityResponseType }
     * 
     */
    public UpdateIdentityResponseType createUpdateIdentityResponseType() {
        return new UpdateIdentityResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdentityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/updateidentity", name = "UpdateIdentityRequest")
    public JAXBElement<UpdateIdentityRequestType> createUpdateIdentityRequest(UpdateIdentityRequestType value) {
        return new JAXBElement<UpdateIdentityRequestType>(_UpdateIdentityRequest_QNAME, UpdateIdentityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdentityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/updateidentity", name = "UpdateIdentityResponse")
    public JAXBElement<UpdateIdentityResponseType> createUpdateIdentityResponse(UpdateIdentityResponseType value) {
        return new JAXBElement<UpdateIdentityResponseType>(_UpdateIdentityResponse_QNAME, UpdateIdentityResponseType.class, null, value);
    }

}
