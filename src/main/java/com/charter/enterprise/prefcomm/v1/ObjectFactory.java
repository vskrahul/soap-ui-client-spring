
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.charter.enterprise.prefcomm.v1 package. 
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

    private final static QName _FindContactPreferencesByContactDataValueAndContactMethodId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByContactDataValueAndContactMethodId");
    private final static QName _GetPreferenceAccountByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getPreferenceAccountByIdResponse");
    private final static QName _FindAllBillingSystemResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllBillingSystemResponse");
    private final static QName _GetContactTypeById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactTypeById");
    private final static QName _SaveContactPreferenceResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactPreferenceResponse");
    private final static QName _InvalidateContact_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "invalidateContact");
    private final static QName _FindContactPreferencesByContactDataValueResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByContactDataValueResponse");
    private final static QName _GetContactByUsername_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactByUsername");
    private final static QName _PurgePreferenceAccount_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "purgePreferenceAccount");
    private final static QName _FindAllBillingSystem_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllBillingSystem");
    private final static QName _GetContactPreferenceById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactPreferenceById");
    private final static QName _PurgePreferences_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "purgePreferences");
    private final static QName _FindAllModifiedContactAccountsInRangeResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllModifiedContactAccountsInRangeResponse");
    private final static QName _GetContactById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactById");
    private final static QName _GetBillingSystemByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getBillingSystemByIdResponse");
    private final static QName _SaveContactDatas_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactDatas");
    private final static QName _GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse");
    private final static QName _SaveContactResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactResponse");
    private final static QName _GetContactByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactByIdResponse");
    private final static QName _FindPreferenceHistoryByAccountNumber_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findPreferenceHistoryByAccountNumber");
    private final static QName _FindContactDatasByContactIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDatasByContactIdResponse");
    private final static QName _SaveContactByContactValues_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactByContactValues");
    private final static QName _GetPreferenceAccountByAccountId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getPreferenceAccountByAccountId");
    private final static QName _SavePreferenceAccount_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "savePreferenceAccount");
    private final static QName _FindAllServiceEvents_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllServiceEvents");
    private final static QName _GetUIApplicationById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getUIApplicationById");
    private final static QName _FindContactHistoryByAccountNumber_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactHistoryByAccountNumber");
    private final static QName _FindAllContactTypesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllContactTypesResponse");
    private final static QName _DeleteContactDataById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactDataById");
    private final static QName _GetContactPreferenceByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactPreferenceByIdResponse");
    private final static QName _DeleteContactResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactResponse");
    private final static QName _FindContactDataByPreferenceAccountResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDataByPreferenceAccountResponse");
    private final static QName _SaveContactDataByValue_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactDataByValue");
    private final static QName _FindContactDatasByAccountNumberAndBillingSystemResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDatasByAccountNumberAndBillingSystemResponse");
    private final static QName _SaveContactPreferencesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactPreferencesResponse");
    private final static QName _FindContactDatasByAccountNumberAndBillingSystemAndRole_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDatasByAccountNumberAndBillingSystemAndRole");
    private final static QName _FindContactPreferencesByPreferenceAccountAndServiceEvent_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByPreferenceAccountAndServiceEvent");
    private final static QName _FindContactsByPreferenceAccountAndContactRole_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactsByPreferenceAccountAndContactRole");
    private final static QName _SaveContactData_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactData");
    private final static QName _FindContactPreferencesByContactDataValue_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByContactDataValue");
    private final static QName _GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getPreferenceAccountInfoByAccountNumberAndBillingSystemResponse");
    private final static QName _FindContactsByAccountNumberAndBillingSystemAndRoleResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactsByAccountNumberAndBillingSystemAndRoleResponse");
    private final static QName _SaveContactPreferenceByValues_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactPreferenceByValues");
    private final static QName _DeleteContactByContactId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactByContactId");
    private final static QName _FindAllContactRoles_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllContactRoles");
    private final static QName _GetContactRoleByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactRoleByIdResponse");
    private final static QName _FindAllContactRolesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllContactRolesResponse");
    private final static QName _FindAllLanguageTypes_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllLanguageTypes");
    private final static QName _EnterprisePreferredCommunicationServiceException_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "EnterprisePreferredCommunicationServiceException");
    private final static QName _FindContactPreferencesByPreferenceAccount_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByPreferenceAccount");
    private final static QName _FindContactPreferencesByAccountNumberAndBillingSystem_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByAccountNumberAndBillingSystem");
    private final static QName _GetServiceEventByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getServiceEventByIdResponse");
    private final static QName _FindContactDataByPreferenceAccountAndContactRole_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDataByPreferenceAccountAndContactRole");
    private final static QName _FindAllModifiedContactAccountsInRange_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllModifiedContactAccountsInRange");
    private final static QName _SaveContacts_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContacts");
    private final static QName _GetBillingSystemById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getBillingSystemById");
    private final static QName _GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getEventCommunicationByApplicationIdServiceEventIdAndContactMethodId");
    private final static QName _DeleteContactPreferenceById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactPreferenceById");
    private final static QName _SaveContactDataResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactDataResponse");
    private final static QName _FindContactsByPreferenceAccount_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactsByPreferenceAccount");
    private final static QName _FindPreferenceHistoryByAccountNumberInRangeResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findPreferenceHistoryByAccountNumberInRangeResponse");
    private final static QName _SaveContactDataByValueResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactDataByValueResponse");
    private final static QName _FindAllContactMethods_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllContactMethods");
    private final static QName _FindContactHistoryByAccountNumberInRangeResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactHistoryByAccountNumberInRangeResponse");
    private final static QName _FindAllUIApplications_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllUIApplications");
    private final static QName _FindContactDataByContactDataValue_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDataByContactDataValue");
    private final static QName _GetPreferenceAccountById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getPreferenceAccountById");
    private final static QName _FindAllServiceEventsResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllServiceEventsResponse");
    private final static QName _PurgePreferenceAccountByPreferenceAccountId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "purgePreferenceAccountByPreferenceAccountId");
    private final static QName _FindAllEventCommunications_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllEventCommunications");
    private final static QName _SavePreferenceAccountByValues_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "savePreferenceAccountByValues");
    private final static QName _FindAllEventCommunicationsResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllEventCommunicationsResponse");
    private final static QName _SaveContactDatasResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactDatasResponse");
    private final static QName _SaveContactByContactValuesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactByContactValuesResponse");
    private final static QName _DeleteContactDataResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactDataResponse");
    private final static QName _FindContactDataByPreferenceAccountAndContactRoleResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDataByPreferenceAccountAndContactRoleResponse");
    private final static QName _DeleteContactByContactIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactByContactIdResponse");
    private final static QName _GetContactByNameId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactByNameId");
    private final static QName _FindEventCommunicationsByApplicationId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findEventCommunicationsByApplicationId");
    private final static QName _InvalidateContactResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "invalidateContactResponse");
    private final static QName _SaveContactDatasByValuesList_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactDatasByValuesList");
    private final static QName _SaveContactDatasByValuesListResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactDatasByValuesListResponse");
    private final static QName _SaveContactsResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactsResponse");
    private final static QName _FindEventCommunicationByApplicationIdAndServiceEventId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findEventCommunicationByApplicationIdAndServiceEventId");
    private final static QName _DeleteContact_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContact");
    private final static QName _FindContactPreferencesByPreferenceAccountAndContactMethodResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByPreferenceAccountAndContactMethodResponse");
    private final static QName _GetEventCommunicationById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getEventCommunicationById");
    private final static QName _FindContactDatasByContactId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDatasByContactId");
    private final static QName _FindContactsByPreferenceAccountAndContactRoleResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactsByPreferenceAccountAndContactRoleResponse");
    private final static QName _SaveContactPreferenceByValueResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactPreferenceByValueResponse");
    private final static QName _SaveContactPreference_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactPreference");
    private final static QName _FindContactDatasByAccountNumberAndBillingSystem_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDatasByAccountNumberAndBillingSystem");
    private final static QName _CharterHeaderInputInfo_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "charterHeaderInputInfo");
    private final static QName _FindContactPreferencesByContactDataResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByContactDataResponse");
    private final static QName _GetContactByNameIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactByNameIdResponse");
    private final static QName _FindPreferenceHistoryByAccountNumberInRange_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findPreferenceHistoryByAccountNumberInRange");
    private final static QName _GetServiceEventById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getServiceEventById");
    private final static QName _FindContactPreferencesByContactData_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByContactData");
    private final static QName _FindContactDataByContactDataValueResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDataByContactDataValueResponse");
    private final static QName _PurgePreferenceAccountByPreferenceAccountIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "purgePreferenceAccountByPreferenceAccountIdResponse");
    private final static QName _FindAllContactMethodsResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllContactMethodsResponse");
    private final static QName _FindPreferenceHistoryByAccountNumberResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findPreferenceHistoryByAccountNumberResponse");
    private final static QName _FindContactsByAccountNumberAndBillingSystemAndRole_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactsByAccountNumberAndBillingSystemAndRole");
    private final static QName _GetLanguageTypeById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getLanguageTypeById");
    private final static QName _GetUIApplicationByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getUIApplicationByIdResponse");
    private final static QName _GetLanguageTypeByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getLanguageTypeByIdResponse");
    private final static QName _GetPreferenceAccountByAccountNumberAndBillingSystem_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getPreferenceAccountByAccountNumberAndBillingSystem");
    private final static QName _FindContactsByAccountNumberAndBillingSystem_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactsByAccountNumberAndBillingSystem");
    private final static QName _DeleteContactDataByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactDataByIdResponse");
    private final static QName _GetContactDataByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactDataByIdResponse");
    private final static QName _GetUIEventFamilyByApplicationIdAndServiceEventId_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getUIEventFamilyByApplicationIdAndServiceEventId");
    private final static QName _FindContactPreferencesByPreferenceAccountAndContactMethod_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByPreferenceAccountAndContactMethod");
    private final static QName _FindUIEventFamilyByApplicationIDResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findUIEventFamilyByApplicationIDResponse");
    private final static QName _OptOut_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "optOut");
    private final static QName _SaveContactPreferenceByValuesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactPreferenceByValuesResponse");
    private final static QName _FindContactPreferencesByAccountNumberAndBillingSystemResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByAccountNumberAndBillingSystemResponse");
    private final static QName _PurgeAccount_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "purgeAccount");
    private final static QName _FindAllUIEventFamilies_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllUIEventFamilies");
    private final static QName _GetPreferenceAccountByAccountIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getPreferenceAccountByAccountIdResponse");
    private final static QName _FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDatasByAccountNumberAndBillingSystemAndRoleResponse");
    private final static QName _DeleteContactPreferenceByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactPreferenceByIdResponse");
    private final static QName _SavePreferenceAccountByValuesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "savePreferenceAccountByValuesResponse");
    private final static QName _GetContactRoleById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactRoleById");
    private final static QName _OptOutResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "optOutResponse");
    private final static QName _PurgePreferenceAccountResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "purgePreferenceAccountResponse");
    private final static QName _GetContactMethodById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactMethodById");
    private final static QName _FindContactsByAccountNumberAndBillingSystemResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactsByAccountNumberAndBillingSystemResponse");
    private final static QName _FindContactPreferencesByPreferenceAccountResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByPreferenceAccountResponse");
    private final static QName _FindContactDatasByContactResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDatasByContactResponse");
    private final static QName _FindEventCommunicationByApplicationIdAndServiceEventIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findEventCommunicationByApplicationIdAndServiceEventIdResponse");
    private final static QName _SaveContactsByContactValuesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactsByContactValuesResponse");
    private final static QName _FindAllLanguageTypesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllLanguageTypesResponse");
    private final static QName _PurgeAccountResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "purgeAccountResponse");
    private final static QName _SaveContactsByContactValues_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactsByContactValues");
    private final static QName _FindAllModifiedPreferenceAccountsInRangeResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllModifiedPreferenceAccountsInRangeResponse");
    private final static QName _DeleteContactPreference_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactPreference");
    private final static QName _GetUIEventFamilyByApplicationIdAndServiceEventIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getUIEventFamilyByApplicationIdAndServiceEventIdResponse");
    private final static QName _FindContactDataByPreferenceAccount_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDataByPreferenceAccount");
    private final static QName _GetContactByUsernameResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactByUsernameResponse");
    private final static QName _FindAllUIApplicationsResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllUIApplicationsResponse");
    private final static QName _FindContactPreferencesByContactDataValueAndContactMethodIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByContactDataValueAndContactMethodIdResponse");
    private final static QName _GetPreferenceAccountInfoByAccountNumberAndBillingSystem_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getPreferenceAccountInfoByAccountNumberAndBillingSystem");
    private final static QName _SaveContactPreferenceByValue_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactPreferenceByValue");
    private final static QName _PurgePreferencesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "purgePreferencesResponse");
    private final static QName _SaveContactPreferences_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContactPreferences");
    private final static QName _FindAllModifiedPreferenceAccountsInRange_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllModifiedPreferenceAccountsInRange");
    private final static QName _FindContactHistoryByAccountNumberInRange_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactHistoryByAccountNumberInRange");
    private final static QName _FindContactHistoryByAccountNumberResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactHistoryByAccountNumberResponse");
    private final static QName _GetContactDataById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactDataById");
    private final static QName _FindAllContactTypes_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllContactTypes");
    private final static QName _GetUIEventFamilyById_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getUIEventFamilyById");
    private final static QName _DeleteContactPreferenceResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactPreferenceResponse");
    private final static QName _FindContactDatasByContact_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactDatasByContact");
    private final static QName _GetContactMethodByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactMethodByIdResponse");
    private final static QName _FindContactPreferencesByPreferenceAccountAndServiceEventResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactPreferencesByPreferenceAccountAndServiceEventResponse");
    private final static QName _FindUIEventFamilyByApplicationID_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findUIEventFamilyByApplicationID");
    private final static QName _GetEventCommunicationByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getEventCommunicationByIdResponse");
    private final static QName _GetPreferenceAccountByAccountNumberAndBillingSystemResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getPreferenceAccountByAccountNumberAndBillingSystemResponse");
    private final static QName _GetUIEventFamilyByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getUIEventFamilyByIdResponse");
    private final static QName _SaveContact_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "saveContact");
    private final static QName _DeleteContactData_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "deleteContactData");
    private final static QName _FindContactsByPreferenceAccountResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findContactsByPreferenceAccountResponse");
    private final static QName _FindEventCommunicationsByApplicationIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findEventCommunicationsByApplicationIdResponse");
    private final static QName _GetContactTypeByIdResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "getContactTypeByIdResponse");
    private final static QName _SavePreferenceAccountResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "savePreferenceAccountResponse");
    private final static QName _FindAllUIEventFamiliesResponse_QNAME = new QName("http://www.charter.com/enterprise/prefcomm/v1", "findAllUIEventFamiliesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.charter.enterprise.prefcomm.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteContactByContactIdResponse }
     * 
     */
    public DeleteContactByContactIdResponse createDeleteContactByContactIdResponse() {
        return new DeleteContactByContactIdResponse();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByPreferenceAccountAndServiceEventResponse }
     * 
     */
    public FindContactPreferencesByPreferenceAccountAndServiceEventResponse createFindContactPreferencesByPreferenceAccountAndServiceEventResponse() {
        return new FindContactPreferencesByPreferenceAccountAndServiceEventResponse();
    }

    /**
     * Create an instance of {@link FindContactsByAccountNumberAndBillingSystemAndRoleResponse }
     * 
     */
    public FindContactsByAccountNumberAndBillingSystemAndRoleResponse createFindContactsByAccountNumberAndBillingSystemAndRoleResponse() {
        return new FindContactsByAccountNumberAndBillingSystemAndRoleResponse();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByPreferenceAccount }
     * 
     */
    public FindContactPreferencesByPreferenceAccount createFindContactPreferencesByPreferenceAccount() {
        return new FindContactPreferencesByPreferenceAccount();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByContactData }
     * 
     */
    public FindContactPreferencesByContactData createFindContactPreferencesByContactData() {
        return new FindContactPreferencesByContactData();
    }

    /**
     * Create an instance of {@link GetUIEventFamilyByIdResponse }
     * 
     */
    public GetUIEventFamilyByIdResponse createGetUIEventFamilyByIdResponse() {
        return new GetUIEventFamilyByIdResponse();
    }

    /**
     * Create an instance of {@link FindAllEventCommunications }
     * 
     */
    public FindAllEventCommunications createFindAllEventCommunications() {
        return new FindAllEventCommunications();
    }

    /**
     * Create an instance of {@link FindPreferenceHistoryByAccountNumber }
     * 
     */
    public FindPreferenceHistoryByAccountNumber createFindPreferenceHistoryByAccountNumber() {
        return new FindPreferenceHistoryByAccountNumber();
    }

    /**
     * Create an instance of {@link GetContactMethodByIdResponse }
     * 
     */
    public GetContactMethodByIdResponse createGetContactMethodByIdResponse() {
        return new GetContactMethodByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteContactDataById }
     * 
     */
    public DeleteContactDataById createDeleteContactDataById() {
        return new DeleteContactDataById();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByPreferenceAccountAndContactMethod }
     * 
     */
    public FindContactPreferencesByPreferenceAccountAndContactMethod createFindContactPreferencesByPreferenceAccountAndContactMethod() {
        return new FindContactPreferencesByPreferenceAccountAndContactMethod();
    }

    /**
     * Create an instance of {@link GetUIEventFamilyByApplicationIdAndServiceEventId }
     * 
     */
    public GetUIEventFamilyByApplicationIdAndServiceEventId createGetUIEventFamilyByApplicationIdAndServiceEventId() {
        return new GetUIEventFamilyByApplicationIdAndServiceEventId();
    }

    /**
     * Create an instance of {@link FindContactHistoryByAccountNumber }
     * 
     */
    public FindContactHistoryByAccountNumber createFindContactHistoryByAccountNumber() {
        return new FindContactHistoryByAccountNumber();
    }

    /**
     * Create an instance of {@link PurgePreferenceAccountResponse }
     * 
     */
    public PurgePreferenceAccountResponse createPurgePreferenceAccountResponse() {
        return new PurgePreferenceAccountResponse();
    }

    /**
     * Create an instance of {@link GetContactByUsername }
     * 
     */
    public GetContactByUsername createGetContactByUsername() {
        return new GetContactByUsername();
    }

    /**
     * Create an instance of {@link EventCommunication }
     * 
     */
    public EventCommunication createEventCommunication() {
        return new EventCommunication();
    }

    /**
     * Create an instance of {@link ContactRole }
     * 
     */
    public ContactRole createContactRole() {
        return new ContactRole();
    }

    /**
     * Create an instance of {@link SavePreferenceAccountResponse }
     * 
     */
    public SavePreferenceAccountResponse createSavePreferenceAccountResponse() {
        return new SavePreferenceAccountResponse();
    }

    /**
     * Create an instance of {@link SaveContactPreferenceByValuesResponse }
     * 
     */
    public SaveContactPreferenceByValuesResponse createSaveContactPreferenceByValuesResponse() {
        return new SaveContactPreferenceByValuesResponse();
    }

    /**
     * Create an instance of {@link FindContactDatasByContactId }
     * 
     */
    public FindContactDatasByContactId createFindContactDatasByContactId() {
        return new FindContactDatasByContactId();
    }

    /**
     * Create an instance of {@link FindContactDatasByContact }
     * 
     */
    public FindContactDatasByContact createFindContactDatasByContact() {
        return new FindContactDatasByContact();
    }

    /**
     * Create an instance of {@link FindAllModifiedPreferenceAccountsInRangeResponse }
     * 
     */
    public FindAllModifiedPreferenceAccountsInRangeResponse createFindAllModifiedPreferenceAccountsInRangeResponse() {
        return new FindAllModifiedPreferenceAccountsInRangeResponse();
    }

    /**
     * Create an instance of {@link FindContactDatasByAccountNumberAndBillingSystem }
     * 
     */
    public FindContactDatasByAccountNumberAndBillingSystem createFindContactDatasByAccountNumberAndBillingSystem() {
        return new FindContactDatasByAccountNumberAndBillingSystem();
    }

    /**
     * Create an instance of {@link FindPreferenceHistoryByAccountNumberInRangeResponse }
     * 
     */
    public FindPreferenceHistoryByAccountNumberInRangeResponse createFindPreferenceHistoryByAccountNumberInRangeResponse() {
        return new FindPreferenceHistoryByAccountNumberInRangeResponse();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByPreferenceAccountResponse }
     * 
     */
    public FindContactPreferencesByPreferenceAccountResponse createFindContactPreferencesByPreferenceAccountResponse() {
        return new FindContactPreferencesByPreferenceAccountResponse();
    }

    /**
     * Create an instance of {@link GetServiceEventById }
     * 
     */
    public GetServiceEventById createGetServiceEventById() {
        return new GetServiceEventById();
    }

    /**
     * Create an instance of {@link DeleteContactPreferenceResponse }
     * 
     */
    public DeleteContactPreferenceResponse createDeleteContactPreferenceResponse() {
        return new DeleteContactPreferenceResponse();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByAccountNumberAndBillingSystem }
     * 
     */
    public FindContactPreferencesByAccountNumberAndBillingSystem createFindContactPreferencesByAccountNumberAndBillingSystem() {
        return new FindContactPreferencesByAccountNumberAndBillingSystem();
    }

    /**
     * Create an instance of {@link GetContactByUsernameResponse }
     * 
     */
    public GetContactByUsernameResponse createGetContactByUsernameResponse() {
        return new GetContactByUsernameResponse();
    }

    /**
     * Create an instance of {@link GetBillingSystemById }
     * 
     */
    public GetBillingSystemById createGetBillingSystemById() {
        return new GetBillingSystemById();
    }

    /**
     * Create an instance of {@link GetContactById }
     * 
     */
    public GetContactById createGetContactById() {
        return new GetContactById();
    }

    /**
     * Create an instance of {@link FindAllUIApplications }
     * 
     */
    public FindAllUIApplications createFindAllUIApplications() {
        return new FindAllUIApplications();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByContactDataValueAndContactMethodId }
     * 
     */
    public FindContactPreferencesByContactDataValueAndContactMethodId createFindContactPreferencesByContactDataValueAndContactMethodId() {
        return new FindContactPreferencesByContactDataValueAndContactMethodId();
    }

    /**
     * Create an instance of {@link LanguageType }
     * 
     */
    public LanguageType createLanguageType() {
        return new LanguageType();
    }

    /**
     * Create an instance of {@link FindContactHistoryByAccountNumberInRangeResponse }
     * 
     */
    public FindContactHistoryByAccountNumberInRangeResponse createFindContactHistoryByAccountNumberInRangeResponse() {
        return new FindContactHistoryByAccountNumberInRangeResponse();
    }

    /**
     * Create an instance of {@link DeleteContactResponse }
     * 
     */
    public DeleteContactResponse createDeleteContactResponse() {
        return new DeleteContactResponse();
    }

    /**
     * Create an instance of {@link GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse }
     * 
     */
    public GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse createGetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse() {
        return new GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse();
    }

    /**
     * Create an instance of {@link GetUIApplicationByIdResponse }
     * 
     */
    public GetUIApplicationByIdResponse createGetUIApplicationByIdResponse() {
        return new GetUIApplicationByIdResponse();
    }

    /**
     * Create an instance of {@link InvalidateContactResponse }
     * 
     */
    public InvalidateContactResponse createInvalidateContactResponse() {
        return new InvalidateContactResponse();
    }

    /**
     * Create an instance of {@link FindAllServiceEventsResponse }
     * 
     */
    public FindAllServiceEventsResponse createFindAllServiceEventsResponse() {
        return new FindAllServiceEventsResponse();
    }

    /**
     * Create an instance of {@link GetContactDataByIdResponse }
     * 
     */
    public GetContactDataByIdResponse createGetContactDataByIdResponse() {
        return new GetContactDataByIdResponse();
    }

    /**
     * Create an instance of {@link SaveContactDatas }
     * 
     */
    public SaveContactDatas createSaveContactDatas() {
        return new SaveContactDatas();
    }

    /**
     * Create an instance of {@link FindAllModifiedContactAccountsInRange }
     * 
     */
    public FindAllModifiedContactAccountsInRange createFindAllModifiedContactAccountsInRange() {
        return new FindAllModifiedContactAccountsInRange();
    }

    /**
     * Create an instance of {@link FindContactsByPreferenceAccount }
     * 
     */
    public FindContactsByPreferenceAccount createFindContactsByPreferenceAccount() {
        return new FindContactsByPreferenceAccount();
    }

    /**
     * Create an instance of {@link DeleteContactPreference }
     * 
     */
    public DeleteContactPreference createDeleteContactPreference() {
        return new DeleteContactPreference();
    }

    /**
     * Create an instance of {@link OptOutResponse }
     * 
     */
    public OptOutResponse createOptOutResponse() {
        return new OptOutResponse();
    }

    /**
     * Create an instance of {@link GetContactRoleById }
     * 
     */
    public GetContactRoleById createGetContactRoleById() {
        return new GetContactRoleById();
    }

    /**
     * Create an instance of {@link SaveContactPreferences }
     * 
     */
    public SaveContactPreferences createSaveContactPreferences() {
        return new SaveContactPreferences();
    }

    /**
     * Create an instance of {@link FindEventCommunicationByApplicationIdAndServiceEventIdResponse }
     * 
     */
    public FindEventCommunicationByApplicationIdAndServiceEventIdResponse createFindEventCommunicationByApplicationIdAndServiceEventIdResponse() {
        return new FindEventCommunicationByApplicationIdAndServiceEventIdResponse();
    }

    /**
     * Create an instance of {@link GetContactTypeById }
     * 
     */
    public GetContactTypeById createGetContactTypeById() {
        return new GetContactTypeById();
    }

    /**
     * Create an instance of {@link SaveContactDataByValue }
     * 
     */
    public SaveContactDataByValue createSaveContactDataByValue() {
        return new SaveContactDataByValue();
    }

    /**
     * Create an instance of {@link FindPreferenceHistoryByAccountNumberInRange }
     * 
     */
    public FindPreferenceHistoryByAccountNumberInRange createFindPreferenceHistoryByAccountNumberInRange() {
        return new FindPreferenceHistoryByAccountNumberInRange();
    }

    /**
     * Create an instance of {@link SaveContactPreferenceByValueResponse }
     * 
     */
    public SaveContactPreferenceByValueResponse createSaveContactPreferenceByValueResponse() {
        return new SaveContactPreferenceByValueResponse();
    }

    /**
     * Create an instance of {@link SaveContactDataResponse }
     * 
     */
    public SaveContactDataResponse createSaveContactDataResponse() {
        return new SaveContactDataResponse();
    }

    /**
     * Create an instance of {@link SaveContactsByContactValuesResponse }
     * 
     */
    public SaveContactsByContactValuesResponse createSaveContactsByContactValuesResponse() {
        return new SaveContactsByContactValuesResponse();
    }

    /**
     * Create an instance of {@link GetUIEventFamilyByApplicationIdAndServiceEventIdResponse }
     * 
     */
    public GetUIEventFamilyByApplicationIdAndServiceEventIdResponse createGetUIEventFamilyByApplicationIdAndServiceEventIdResponse() {
        return new GetUIEventFamilyByApplicationIdAndServiceEventIdResponse();
    }

    /**
     * Create an instance of {@link StandardInputHeader }
     * 
     */
    public StandardInputHeader createStandardInputHeader() {
        return new StandardInputHeader();
    }

    /**
     * Create an instance of {@link FindEventCommunicationsByApplicationId }
     * 
     */
    public FindEventCommunicationsByApplicationId createFindEventCommunicationsByApplicationId() {
        return new FindEventCommunicationsByApplicationId();
    }

    /**
     * Create an instance of {@link PreferenceAccount }
     * 
     */
    public PreferenceAccount createPreferenceAccount() {
        return new PreferenceAccount();
    }

    /**
     * Create an instance of {@link FindAllEventCommunicationsResponse }
     * 
     */
    public FindAllEventCommunicationsResponse createFindAllEventCommunicationsResponse() {
        return new FindAllEventCommunicationsResponse();
    }

    /**
     * Create an instance of {@link FindContactDataByContactDataValue }
     * 
     */
    public FindContactDataByContactDataValue createFindContactDataByContactDataValue() {
        return new FindContactDataByContactDataValue();
    }

    /**
     * Create an instance of {@link SavePreferenceAccountByValuesResponse }
     * 
     */
    public SavePreferenceAccountByValuesResponse createSavePreferenceAccountByValuesResponse() {
        return new SavePreferenceAccountByValuesResponse();
    }

    /**
     * Create an instance of {@link FindUIEventFamilyByApplicationIDResponse }
     * 
     */
    public FindUIEventFamilyByApplicationIDResponse createFindUIEventFamilyByApplicationIDResponse() {
        return new FindUIEventFamilyByApplicationIDResponse();
    }

    /**
     * Create an instance of {@link GetContactByNameId }
     * 
     */
    public GetContactByNameId createGetContactByNameId() {
        return new GetContactByNameId();
    }

    /**
     * Create an instance of {@link DeleteContactDataResponse }
     * 
     */
    public DeleteContactDataResponse createDeleteContactDataResponse() {
        return new DeleteContactDataResponse();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByContactDataValueAndContactMethodIdResponse }
     * 
     */
    public FindContactPreferencesByContactDataValueAndContactMethodIdResponse createFindContactPreferencesByContactDataValueAndContactMethodIdResponse() {
        return new FindContactPreferencesByContactDataValueAndContactMethodIdResponse();
    }

    /**
     * Create an instance of {@link FindContactHistoryByAccountNumberResponse }
     * 
     */
    public FindContactHistoryByAccountNumberResponse createFindContactHistoryByAccountNumberResponse() {
        return new FindContactHistoryByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link FindAllServiceEvents }
     * 
     */
    public FindAllServiceEvents createFindAllServiceEvents() {
        return new FindAllServiceEvents();
    }

    /**
     * Create an instance of {@link SaveContactByContactValues }
     * 
     */
    public SaveContactByContactValues createSaveContactByContactValues() {
        return new SaveContactByContactValues();
    }

    /**
     * Create an instance of {@link GetContactMethodById }
     * 
     */
    public GetContactMethodById createGetContactMethodById() {
        return new GetContactMethodById();
    }

    /**
     * Create an instance of {@link FindPreferenceHistoryByAccountNumberResponse }
     * 
     */
    public FindPreferenceHistoryByAccountNumberResponse createFindPreferenceHistoryByAccountNumberResponse() {
        return new FindPreferenceHistoryByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link FindContactDataByContactDataValueResponse }
     * 
     */
    public FindContactDataByContactDataValueResponse createFindContactDataByContactDataValueResponse() {
        return new FindContactDataByContactDataValueResponse();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByAccountNumberAndBillingSystemResponse }
     * 
     */
    public FindContactPreferencesByAccountNumberAndBillingSystemResponse createFindContactPreferencesByAccountNumberAndBillingSystemResponse() {
        return new FindContactPreferencesByAccountNumberAndBillingSystemResponse();
    }

    /**
     * Create an instance of {@link InvalidateContact }
     * 
     */
    public InvalidateContact createInvalidateContact() {
        return new InvalidateContact();
    }

    /**
     * Create an instance of {@link FindContactHistoryByAccountNumberInRange }
     * 
     */
    public FindContactHistoryByAccountNumberInRange createFindContactHistoryByAccountNumberInRange() {
        return new FindContactHistoryByAccountNumberInRange();
    }

    /**
     * Create an instance of {@link FindAllUIApplicationsResponse }
     * 
     */
    public FindAllUIApplicationsResponse createFindAllUIApplicationsResponse() {
        return new FindAllUIApplicationsResponse();
    }

    /**
     * Create an instance of {@link DeleteContactPreferenceById }
     * 
     */
    public DeleteContactPreferenceById createDeleteContactPreferenceById() {
        return new DeleteContactPreferenceById();
    }

    /**
     * Create an instance of {@link ContactDataValue }
     * 
     */
    public ContactDataValue createContactDataValue() {
        return new ContactDataValue();
    }

    /**
     * Create an instance of {@link ContactPreference }
     * 
     */
    public ContactPreference createContactPreference() {
        return new ContactPreference();
    }

    /**
     * Create an instance of {@link FindAllContactMethodsResponse }
     * 
     */
    public FindAllContactMethodsResponse createFindAllContactMethodsResponse() {
        return new FindAllContactMethodsResponse();
    }

    /**
     * Create an instance of {@link SaveContactDatasByValuesListResponse }
     * 
     */
    public SaveContactDatasByValuesListResponse createSaveContactDatasByValuesListResponse() {
        return new SaveContactDatasByValuesListResponse();
    }

    /**
     * Create an instance of {@link PurgePreferenceAccountByPreferenceAccountId }
     * 
     */
    public PurgePreferenceAccountByPreferenceAccountId createPurgePreferenceAccountByPreferenceAccountId() {
        return new PurgePreferenceAccountByPreferenceAccountId();
    }

    /**
     * Create an instance of {@link FindAllContactRoles }
     * 
     */
    public FindAllContactRoles createFindAllContactRoles() {
        return new FindAllContactRoles();
    }

    /**
     * Create an instance of {@link SaveContactPreferenceByValue }
     * 
     */
    public SaveContactPreferenceByValue createSaveContactPreferenceByValue() {
        return new SaveContactPreferenceByValue();
    }

    /**
     * Create an instance of {@link ContactValues }
     * 
     */
    public ContactValues createContactValues() {
        return new ContactValues();
    }

    /**
     * Create an instance of {@link SaveContactPreferenceByValues }
     * 
     */
    public SaveContactPreferenceByValues createSaveContactPreferenceByValues() {
        return new SaveContactPreferenceByValues();
    }

    /**
     * Create an instance of {@link ServiceEvent }
     * 
     */
    public ServiceEvent createServiceEvent() {
        return new ServiceEvent();
    }

    /**
     * Create an instance of {@link GetUIEventFamilyById }
     * 
     */
    public GetUIEventFamilyById createGetUIEventFamilyById() {
        return new GetUIEventFamilyById();
    }

    /**
     * Create an instance of {@link FindAllUIEventFamilies }
     * 
     */
    public FindAllUIEventFamilies createFindAllUIEventFamilies() {
        return new FindAllUIEventFamilies();
    }

    /**
     * Create an instance of {@link FindContactsByPreferenceAccountAndContactRoleResponse }
     * 
     */
    public FindContactsByPreferenceAccountAndContactRoleResponse createFindContactsByPreferenceAccountAndContactRoleResponse() {
        return new FindContactsByPreferenceAccountAndContactRoleResponse();
    }

    /**
     * Create an instance of {@link StandardOutputHeader }
     * 
     */
    public StandardOutputHeader createStandardOutputHeader() {
        return new StandardOutputHeader();
    }

    /**
     * Create an instance of {@link GetPreferenceAccountByIdResponse }
     * 
     */
    public GetPreferenceAccountByIdResponse createGetPreferenceAccountByIdResponse() {
        return new GetPreferenceAccountByIdResponse();
    }

    /**
     * Create an instance of {@link FindContactDataByPreferenceAccountAndContactRoleResponse }
     * 
     */
    public FindContactDataByPreferenceAccountAndContactRoleResponse createFindContactDataByPreferenceAccountAndContactRoleResponse() {
        return new FindContactDataByPreferenceAccountAndContactRoleResponse();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link FindEventCommunicationsByApplicationIdResponse }
     * 
     */
    public FindEventCommunicationsByApplicationIdResponse createFindEventCommunicationsByApplicationIdResponse() {
        return new FindEventCommunicationsByApplicationIdResponse();
    }

    /**
     * Create an instance of {@link DeleteContactDataByIdResponse }
     * 
     */
    public DeleteContactDataByIdResponse createDeleteContactDataByIdResponse() {
        return new DeleteContactDataByIdResponse();
    }

    /**
     * Create an instance of {@link GetContactRoleByIdResponse }
     * 
     */
    public GetContactRoleByIdResponse createGetContactRoleByIdResponse() {
        return new GetContactRoleByIdResponse();
    }

    /**
     * Create an instance of {@link GetContactPreferenceByIdResponse }
     * 
     */
    public GetContactPreferenceByIdResponse createGetContactPreferenceByIdResponse() {
        return new GetContactPreferenceByIdResponse();
    }

    /**
     * Create an instance of {@link FindContactsByPreferenceAccountAndContactRole }
     * 
     */
    public FindContactsByPreferenceAccountAndContactRole createFindContactsByPreferenceAccountAndContactRole() {
        return new FindContactsByPreferenceAccountAndContactRole();
    }

    /**
     * Create an instance of {@link FindContactDataByPreferenceAccount }
     * 
     */
    public FindContactDataByPreferenceAccount createFindContactDataByPreferenceAccount() {
        return new FindContactDataByPreferenceAccount();
    }

    /**
     * Create an instance of {@link DeleteContactPreferenceByIdResponse }
     * 
     */
    public DeleteContactPreferenceByIdResponse createDeleteContactPreferenceByIdResponse() {
        return new DeleteContactPreferenceByIdResponse();
    }

    /**
     * Create an instance of {@link FindAllContactMethods }
     * 
     */
    public FindAllContactMethods createFindAllContactMethods() {
        return new FindAllContactMethods();
    }

    /**
     * Create an instance of {@link GetContactByNameIdResponse }
     * 
     */
    public GetContactByNameIdResponse createGetContactByNameIdResponse() {
        return new GetContactByNameIdResponse();
    }

    /**
     * Create an instance of {@link FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse }
     * 
     */
    public FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse createFindContactDatasByAccountNumberAndBillingSystemAndRoleResponse() {
        return new FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse();
    }

    /**
     * Create an instance of {@link FindAllLanguageTypesResponse }
     * 
     */
    public FindAllLanguageTypesResponse createFindAllLanguageTypesResponse() {
        return new FindAllLanguageTypesResponse();
    }

    /**
     * Create an instance of {@link UiEventFamily }
     * 
     */
    public UiEventFamily createUiEventFamily() {
        return new UiEventFamily();
    }

    /**
     * Create an instance of {@link GetLanguageTypeById }
     * 
     */
    public GetLanguageTypeById createGetLanguageTypeById() {
        return new GetLanguageTypeById();
    }

    /**
     * Create an instance of {@link GetEventCommunicationByIdResponse }
     * 
     */
    public GetEventCommunicationByIdResponse createGetEventCommunicationByIdResponse() {
        return new GetEventCommunicationByIdResponse();
    }

    /**
     * Create an instance of {@link GetEventCommunicationById }
     * 
     */
    public GetEventCommunicationById createGetEventCommunicationById() {
        return new GetEventCommunicationById();
    }

    /**
     * Create an instance of {@link SaveContactsResponse }
     * 
     */
    public SaveContactsResponse createSaveContactsResponse() {
        return new SaveContactsResponse();
    }

    /**
     * Create an instance of {@link ContactData }
     * 
     */
    public ContactData createContactData() {
        return new ContactData();
    }

    /**
     * Create an instance of {@link FindUIEventFamilyByApplicationID }
     * 
     */
    public FindUIEventFamilyByApplicationID createFindUIEventFamilyByApplicationID() {
        return new FindUIEventFamilyByApplicationID();
    }

    /**
     * Create an instance of {@link SavePreferenceAccountByValues }
     * 
     */
    public SavePreferenceAccountByValues createSavePreferenceAccountByValues() {
        return new SavePreferenceAccountByValues();
    }

    /**
     * Create an instance of {@link FindContactDatasByAccountNumberAndBillingSystemResponse }
     * 
     */
    public FindContactDatasByAccountNumberAndBillingSystemResponse createFindContactDatasByAccountNumberAndBillingSystemResponse() {
        return new FindContactDatasByAccountNumberAndBillingSystemResponse();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByContactDataValue }
     * 
     */
    public FindContactPreferencesByContactDataValue createFindContactPreferencesByContactDataValue() {
        return new FindContactPreferencesByContactDataValue();
    }

    /**
     * Create an instance of {@link ContactMethod }
     * 
     */
    public ContactMethod createContactMethod() {
        return new ContactMethod();
    }

    /**
     * Create an instance of {@link FindAllContactTypesResponse }
     * 
     */
    public FindAllContactTypesResponse createFindAllContactTypesResponse() {
        return new FindAllContactTypesResponse();
    }

    /**
     * Create an instance of {@link GetUIApplicationById }
     * 
     */
    public GetUIApplicationById createGetUIApplicationById() {
        return new GetUIApplicationById();
    }

    /**
     * Create an instance of {@link SaveContactResponse }
     * 
     */
    public SaveContactResponse createSaveContactResponse() {
        return new SaveContactResponse();
    }

    /**
     * Create an instance of {@link GetPreferenceAccountById }
     * 
     */
    public GetPreferenceAccountById createGetPreferenceAccountById() {
        return new GetPreferenceAccountById();
    }

    /**
     * Create an instance of {@link PurgePreferencesResponse }
     * 
     */
    public PurgePreferencesResponse createPurgePreferencesResponse() {
        return new PurgePreferencesResponse();
    }

    /**
     * Create an instance of {@link SaveContactDatasResponse }
     * 
     */
    public SaveContactDatasResponse createSaveContactDatasResponse() {
        return new SaveContactDatasResponse();
    }

    /**
     * Create an instance of {@link FindAllBillingSystemResponse }
     * 
     */
    public FindAllBillingSystemResponse createFindAllBillingSystemResponse() {
        return new FindAllBillingSystemResponse();
    }

    /**
     * Create an instance of {@link GetPreferenceAccountInfoByAccountNumberAndBillingSystem }
     * 
     */
    public GetPreferenceAccountInfoByAccountNumberAndBillingSystem createGetPreferenceAccountInfoByAccountNumberAndBillingSystem() {
        return new GetPreferenceAccountInfoByAccountNumberAndBillingSystem();
    }

    /**
     * Create an instance of {@link FindContactDatasByAccountNumberAndBillingSystemAndRole }
     * 
     */
    public FindContactDatasByAccountNumberAndBillingSystemAndRole createFindContactDatasByAccountNumberAndBillingSystemAndRole() {
        return new FindContactDatasByAccountNumberAndBillingSystemAndRole();
    }

    /**
     * Create an instance of {@link FindContactDatasByContactIdResponse }
     * 
     */
    public FindContactDatasByContactIdResponse createFindContactDatasByContactIdResponse() {
        return new FindContactDatasByContactIdResponse();
    }

    /**
     * Create an instance of {@link SavePreferenceAccount }
     * 
     */
    public SavePreferenceAccount createSavePreferenceAccount() {
        return new SavePreferenceAccount();
    }

    /**
     * Create an instance of {@link FindAllContactTypes }
     * 
     */
    public FindAllContactTypes createFindAllContactTypes() {
        return new FindAllContactTypes();
    }

    /**
     * Create an instance of {@link ContactDataHistory }
     * 
     */
    public ContactDataHistory createContactDataHistory() {
        return new ContactDataHistory();
    }

    /**
     * Create an instance of {@link GetPreferenceAccountByAccountNumberAndBillingSystem }
     * 
     */
    public GetPreferenceAccountByAccountNumberAndBillingSystem createGetPreferenceAccountByAccountNumberAndBillingSystem() {
        return new GetPreferenceAccountByAccountNumberAndBillingSystem();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link PurgeAccountResponse }
     * 
     */
    public PurgeAccountResponse createPurgeAccountResponse() {
        return new PurgeAccountResponse();
    }

    /**
     * Create an instance of {@link DeleteContactData }
     * 
     */
    public DeleteContactData createDeleteContactData() {
        return new DeleteContactData();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByPreferenceAccountAndServiceEvent }
     * 
     */
    public FindContactPreferencesByPreferenceAccountAndServiceEvent createFindContactPreferencesByPreferenceAccountAndServiceEvent() {
        return new FindContactPreferencesByPreferenceAccountAndServiceEvent();
    }

    /**
     * Create an instance of {@link GetContactTypeByIdResponse }
     * 
     */
    public GetContactTypeByIdResponse createGetContactTypeByIdResponse() {
        return new GetContactTypeByIdResponse();
    }

    /**
     * Create an instance of {@link BillingSystem }
     * 
     */
    public BillingSystem createBillingSystem() {
        return new BillingSystem();
    }

    /**
     * Create an instance of {@link PurgePreferences }
     * 
     */
    public PurgePreferences createPurgePreferences() {
        return new PurgePreferences();
    }

    /**
     * Create an instance of {@link OptOut }
     * 
     */
    public OptOut createOptOut() {
        return new OptOut();
    }

    /**
     * Create an instance of {@link SaveContactsByContactValues }
     * 
     */
    public SaveContactsByContactValues createSaveContactsByContactValues() {
        return new SaveContactsByContactValues();
    }

    /**
     * Create an instance of {@link PreferenceAccountInfo }
     * 
     */
    public PreferenceAccountInfo createPreferenceAccountInfo() {
        return new PreferenceAccountInfo();
    }

    /**
     * Create an instance of {@link FindAllModifiedContactAccountsInRangeResponse }
     * 
     */
    public FindAllModifiedContactAccountsInRangeResponse createFindAllModifiedContactAccountsInRangeResponse() {
        return new FindAllModifiedContactAccountsInRangeResponse();
    }

    /**
     * Create an instance of {@link PurgePreferenceAccountByPreferenceAccountIdResponse }
     * 
     */
    public PurgePreferenceAccountByPreferenceAccountIdResponse createPurgePreferenceAccountByPreferenceAccountIdResponse() {
        return new PurgePreferenceAccountByPreferenceAccountIdResponse();
    }

    /**
     * Create an instance of {@link GetPreferenceAccountByAccountIdResponse }
     * 
     */
    public GetPreferenceAccountByAccountIdResponse createGetPreferenceAccountByAccountIdResponse() {
        return new GetPreferenceAccountByAccountIdResponse();
    }

    /**
     * Create an instance of {@link GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse }
     * 
     */
    public GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse createGetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse() {
        return new GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse();
    }

    /**
     * Create an instance of {@link SaveContactByContactValuesResponse }
     * 
     */
    public SaveContactByContactValuesResponse createSaveContactByContactValuesResponse() {
        return new SaveContactByContactValuesResponse();
    }

    /**
     * Create an instance of {@link GetLanguageTypeByIdResponse }
     * 
     */
    public GetLanguageTypeByIdResponse createGetLanguageTypeByIdResponse() {
        return new GetLanguageTypeByIdResponse();
    }

    /**
     * Create an instance of {@link SaveContactPreference }
     * 
     */
    public SaveContactPreference createSaveContactPreference() {
        return new SaveContactPreference();
    }

    /**
     * Create an instance of {@link SaveContacts }
     * 
     */
    public SaveContacts createSaveContacts() {
        return new SaveContacts();
    }

    /**
     * Create an instance of {@link FindAllUIEventFamiliesResponse }
     * 
     */
    public FindAllUIEventFamiliesResponse createFindAllUIEventFamiliesResponse() {
        return new FindAllUIEventFamiliesResponse();
    }

    /**
     * Create an instance of {@link FindContactDataByPreferenceAccountResponse }
     * 
     */
    public FindContactDataByPreferenceAccountResponse createFindContactDataByPreferenceAccountResponse() {
        return new FindContactDataByPreferenceAccountResponse();
    }

    /**
     * Create an instance of {@link GetContactByIdResponse }
     * 
     */
    public GetContactByIdResponse createGetContactByIdResponse() {
        return new GetContactByIdResponse();
    }

    /**
     * Create an instance of {@link FindAllContactRolesResponse }
     * 
     */
    public FindAllContactRolesResponse createFindAllContactRolesResponse() {
        return new FindAllContactRolesResponse();
    }

    /**
     * Create an instance of {@link SaveContactData }
     * 
     */
    public SaveContactData createSaveContactData() {
        return new SaveContactData();
    }

    /**
     * Create an instance of {@link SaveContact }
     * 
     */
    public SaveContact createSaveContact() {
        return new SaveContact();
    }

    /**
     * Create an instance of {@link GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId }
     * 
     */
    public GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId createGetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId() {
        return new GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByContactDataValueResponse }
     * 
     */
    public FindContactPreferencesByContactDataValueResponse createFindContactPreferencesByContactDataValueResponse() {
        return new FindContactPreferencesByContactDataValueResponse();
    }

    /**
     * Create an instance of {@link UiApplication }
     * 
     */
    public UiApplication createUiApplication() {
        return new UiApplication();
    }

    /**
     * Create an instance of {@link GetServiceEventByIdResponse }
     * 
     */
    public GetServiceEventByIdResponse createGetServiceEventByIdResponse() {
        return new GetServiceEventByIdResponse();
    }

    /**
     * Create an instance of {@link GetContactDataById }
     * 
     */
    public GetContactDataById createGetContactDataById() {
        return new GetContactDataById();
    }

    /**
     * Create an instance of {@link EnterprisePreferredCommunicationServiceException }
     * 
     */
    public EnterprisePreferredCommunicationServiceException createEnterprisePreferredCommunicationServiceException() {
        return new EnterprisePreferredCommunicationServiceException();
    }

    /**
     * Create an instance of {@link DeleteContact }
     * 
     */
    public DeleteContact createDeleteContact() {
        return new DeleteContact();
    }

    /**
     * Create an instance of {@link PurgeAccount }
     * 
     */
    public PurgeAccount createPurgeAccount() {
        return new PurgeAccount();
    }

    /**
     * Create an instance of {@link SaveContactDatasByValuesList }
     * 
     */
    public SaveContactDatasByValuesList createSaveContactDatasByValuesList() {
        return new SaveContactDatasByValuesList();
    }

    /**
     * Create an instance of {@link PurgePreferenceAccount }
     * 
     */
    public PurgePreferenceAccount createPurgePreferenceAccount() {
        return new PurgePreferenceAccount();
    }

    /**
     * Create an instance of {@link ContactPreferenceHistory }
     * 
     */
    public ContactPreferenceHistory createContactPreferenceHistory() {
        return new ContactPreferenceHistory();
    }

    /**
     * Create an instance of {@link FindContactDatasByContactResponse }
     * 
     */
    public FindContactDatasByContactResponse createFindContactDatasByContactResponse() {
        return new FindContactDatasByContactResponse();
    }

    /**
     * Create an instance of {@link ContactPreferenceValue }
     * 
     */
    public ContactPreferenceValue createContactPreferenceValue() {
        return new ContactPreferenceValue();
    }

    /**
     * Create an instance of {@link DeleteContactByContactId }
     * 
     */
    public DeleteContactByContactId createDeleteContactByContactId() {
        return new DeleteContactByContactId();
    }

    /**
     * Create an instance of {@link SaveContactPreferenceResponse }
     * 
     */
    public SaveContactPreferenceResponse createSaveContactPreferenceResponse() {
        return new SaveContactPreferenceResponse();
    }

    /**
     * Create an instance of {@link GetContactPreferenceById }
     * 
     */
    public GetContactPreferenceById createGetContactPreferenceById() {
        return new GetContactPreferenceById();
    }

    /**
     * Create an instance of {@link FindAllBillingSystem }
     * 
     */
    public FindAllBillingSystem createFindAllBillingSystem() {
        return new FindAllBillingSystem();
    }

    /**
     * Create an instance of {@link FindContactsByAccountNumberAndBillingSystem }
     * 
     */
    public FindContactsByAccountNumberAndBillingSystem createFindContactsByAccountNumberAndBillingSystem() {
        return new FindContactsByAccountNumberAndBillingSystem();
    }

    /**
     * Create an instance of {@link FindContactsByAccountNumberAndBillingSystemResponse }
     * 
     */
    public FindContactsByAccountNumberAndBillingSystemResponse createFindContactsByAccountNumberAndBillingSystemResponse() {
        return new FindContactsByAccountNumberAndBillingSystemResponse();
    }

    /**
     * Create an instance of {@link GetBillingSystemByIdResponse }
     * 
     */
    public GetBillingSystemByIdResponse createGetBillingSystemByIdResponse() {
        return new GetBillingSystemByIdResponse();
    }

    /**
     * Create an instance of {@link GetPreferenceAccountByAccountNumberAndBillingSystemResponse }
     * 
     */
    public GetPreferenceAccountByAccountNumberAndBillingSystemResponse createGetPreferenceAccountByAccountNumberAndBillingSystemResponse() {
        return new GetPreferenceAccountByAccountNumberAndBillingSystemResponse();
    }

    /**
     * Create an instance of {@link Audit }
     * 
     */
    public Audit createAudit() {
        return new Audit();
    }

    /**
     * Create an instance of {@link FindContactsByAccountNumberAndBillingSystemAndRole }
     * 
     */
    public FindContactsByAccountNumberAndBillingSystemAndRole createFindContactsByAccountNumberAndBillingSystemAndRole() {
        return new FindContactsByAccountNumberAndBillingSystemAndRole();
    }

    /**
     * Create an instance of {@link FindContactDataByPreferenceAccountAndContactRole }
     * 
     */
    public FindContactDataByPreferenceAccountAndContactRole createFindContactDataByPreferenceAccountAndContactRole() {
        return new FindContactDataByPreferenceAccountAndContactRole();
    }

    /**
     * Create an instance of {@link SaveContactPreferencesResponse }
     * 
     */
    public SaveContactPreferencesResponse createSaveContactPreferencesResponse() {
        return new SaveContactPreferencesResponse();
    }

    /**
     * Create an instance of {@link FindEventCommunicationByApplicationIdAndServiceEventId }
     * 
     */
    public FindEventCommunicationByApplicationIdAndServiceEventId createFindEventCommunicationByApplicationIdAndServiceEventId() {
        return new FindEventCommunicationByApplicationIdAndServiceEventId();
    }

    /**
     * Create an instance of {@link FindAllLanguageTypes }
     * 
     */
    public FindAllLanguageTypes createFindAllLanguageTypes() {
        return new FindAllLanguageTypes();
    }

    /**
     * Create an instance of {@link FindAllModifiedPreferenceAccountsInRange }
     * 
     */
    public FindAllModifiedPreferenceAccountsInRange createFindAllModifiedPreferenceAccountsInRange() {
        return new FindAllModifiedPreferenceAccountsInRange();
    }

    /**
     * Create an instance of {@link GetPreferenceAccountByAccountId }
     * 
     */
    public GetPreferenceAccountByAccountId createGetPreferenceAccountByAccountId() {
        return new GetPreferenceAccountByAccountId();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByPreferenceAccountAndContactMethodResponse }
     * 
     */
    public FindContactPreferencesByPreferenceAccountAndContactMethodResponse createFindContactPreferencesByPreferenceAccountAndContactMethodResponse() {
        return new FindContactPreferencesByPreferenceAccountAndContactMethodResponse();
    }

    /**
     * Create an instance of {@link SaveContactDataByValueResponse }
     * 
     */
    public SaveContactDataByValueResponse createSaveContactDataByValueResponse() {
        return new SaveContactDataByValueResponse();
    }

    /**
     * Create an instance of {@link FindContactPreferencesByContactDataResponse }
     * 
     */
    public FindContactPreferencesByContactDataResponse createFindContactPreferencesByContactDataResponse() {
        return new FindContactPreferencesByContactDataResponse();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link FindContactsByPreferenceAccountResponse }
     * 
     */
    public FindContactsByPreferenceAccountResponse createFindContactsByPreferenceAccountResponse() {
        return new FindContactsByPreferenceAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByContactDataValueAndContactMethodId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByContactDataValueAndContactMethodId")
    public JAXBElement<FindContactPreferencesByContactDataValueAndContactMethodId> createFindContactPreferencesByContactDataValueAndContactMethodId(FindContactPreferencesByContactDataValueAndContactMethodId value) {
        return new JAXBElement<FindContactPreferencesByContactDataValueAndContactMethodId>(_FindContactPreferencesByContactDataValueAndContactMethodId_QNAME, FindContactPreferencesByContactDataValueAndContactMethodId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferenceAccountByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getPreferenceAccountByIdResponse")
    public JAXBElement<GetPreferenceAccountByIdResponse> createGetPreferenceAccountByIdResponse(GetPreferenceAccountByIdResponse value) {
        return new JAXBElement<GetPreferenceAccountByIdResponse>(_GetPreferenceAccountByIdResponse_QNAME, GetPreferenceAccountByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBillingSystemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllBillingSystemResponse")
    public JAXBElement<FindAllBillingSystemResponse> createFindAllBillingSystemResponse(FindAllBillingSystemResponse value) {
        return new JAXBElement<FindAllBillingSystemResponse>(_FindAllBillingSystemResponse_QNAME, FindAllBillingSystemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactTypeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactTypeById")
    public JAXBElement<GetContactTypeById> createGetContactTypeById(GetContactTypeById value) {
        return new JAXBElement<GetContactTypeById>(_GetContactTypeById_QNAME, GetContactTypeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactPreferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactPreferenceResponse")
    public JAXBElement<SaveContactPreferenceResponse> createSaveContactPreferenceResponse(SaveContactPreferenceResponse value) {
        return new JAXBElement<SaveContactPreferenceResponse>(_SaveContactPreferenceResponse_QNAME, SaveContactPreferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidateContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "invalidateContact")
    public JAXBElement<InvalidateContact> createInvalidateContact(InvalidateContact value) {
        return new JAXBElement<InvalidateContact>(_InvalidateContact_QNAME, InvalidateContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByContactDataValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByContactDataValueResponse")
    public JAXBElement<FindContactPreferencesByContactDataValueResponse> createFindContactPreferencesByContactDataValueResponse(FindContactPreferencesByContactDataValueResponse value) {
        return new JAXBElement<FindContactPreferencesByContactDataValueResponse>(_FindContactPreferencesByContactDataValueResponse_QNAME, FindContactPreferencesByContactDataValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactByUsername")
    public JAXBElement<GetContactByUsername> createGetContactByUsername(GetContactByUsername value) {
        return new JAXBElement<GetContactByUsername>(_GetContactByUsername_QNAME, GetContactByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgePreferenceAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "purgePreferenceAccount")
    public JAXBElement<PurgePreferenceAccount> createPurgePreferenceAccount(PurgePreferenceAccount value) {
        return new JAXBElement<PurgePreferenceAccount>(_PurgePreferenceAccount_QNAME, PurgePreferenceAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBillingSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllBillingSystem")
    public JAXBElement<FindAllBillingSystem> createFindAllBillingSystem(FindAllBillingSystem value) {
        return new JAXBElement<FindAllBillingSystem>(_FindAllBillingSystem_QNAME, FindAllBillingSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactPreferenceById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactPreferenceById")
    public JAXBElement<GetContactPreferenceById> createGetContactPreferenceById(GetContactPreferenceById value) {
        return new JAXBElement<GetContactPreferenceById>(_GetContactPreferenceById_QNAME, GetContactPreferenceById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgePreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "purgePreferences")
    public JAXBElement<PurgePreferences> createPurgePreferences(PurgePreferences value) {
        return new JAXBElement<PurgePreferences>(_PurgePreferences_QNAME, PurgePreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllModifiedContactAccountsInRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllModifiedContactAccountsInRangeResponse")
    public JAXBElement<FindAllModifiedContactAccountsInRangeResponse> createFindAllModifiedContactAccountsInRangeResponse(FindAllModifiedContactAccountsInRangeResponse value) {
        return new JAXBElement<FindAllModifiedContactAccountsInRangeResponse>(_FindAllModifiedContactAccountsInRangeResponse_QNAME, FindAllModifiedContactAccountsInRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactById")
    public JAXBElement<GetContactById> createGetContactById(GetContactById value) {
        return new JAXBElement<GetContactById>(_GetContactById_QNAME, GetContactById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingSystemByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getBillingSystemByIdResponse")
    public JAXBElement<GetBillingSystemByIdResponse> createGetBillingSystemByIdResponse(GetBillingSystemByIdResponse value) {
        return new JAXBElement<GetBillingSystemByIdResponse>(_GetBillingSystemByIdResponse_QNAME, GetBillingSystemByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactDatas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactDatas")
    public JAXBElement<SaveContactDatas> createSaveContactDatas(SaveContactDatas value) {
        return new JAXBElement<SaveContactDatas>(_SaveContactDatas_QNAME, SaveContactDatas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse")
    public JAXBElement<GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse> createGetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse(GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse value) {
        return new JAXBElement<GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse>(_GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse_QNAME, GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactResponse")
    public JAXBElement<SaveContactResponse> createSaveContactResponse(SaveContactResponse value) {
        return new JAXBElement<SaveContactResponse>(_SaveContactResponse_QNAME, SaveContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactByIdResponse")
    public JAXBElement<GetContactByIdResponse> createGetContactByIdResponse(GetContactByIdResponse value) {
        return new JAXBElement<GetContactByIdResponse>(_GetContactByIdResponse_QNAME, GetContactByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPreferenceHistoryByAccountNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findPreferenceHistoryByAccountNumber")
    public JAXBElement<FindPreferenceHistoryByAccountNumber> createFindPreferenceHistoryByAccountNumber(FindPreferenceHistoryByAccountNumber value) {
        return new JAXBElement<FindPreferenceHistoryByAccountNumber>(_FindPreferenceHistoryByAccountNumber_QNAME, FindPreferenceHistoryByAccountNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDatasByContactIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDatasByContactIdResponse")
    public JAXBElement<FindContactDatasByContactIdResponse> createFindContactDatasByContactIdResponse(FindContactDatasByContactIdResponse value) {
        return new JAXBElement<FindContactDatasByContactIdResponse>(_FindContactDatasByContactIdResponse_QNAME, FindContactDatasByContactIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactByContactValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactByContactValues")
    public JAXBElement<SaveContactByContactValues> createSaveContactByContactValues(SaveContactByContactValues value) {
        return new JAXBElement<SaveContactByContactValues>(_SaveContactByContactValues_QNAME, SaveContactByContactValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferenceAccountByAccountId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getPreferenceAccountByAccountId")
    public JAXBElement<GetPreferenceAccountByAccountId> createGetPreferenceAccountByAccountId(GetPreferenceAccountByAccountId value) {
        return new JAXBElement<GetPreferenceAccountByAccountId>(_GetPreferenceAccountByAccountId_QNAME, GetPreferenceAccountByAccountId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePreferenceAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "savePreferenceAccount")
    public JAXBElement<SavePreferenceAccount> createSavePreferenceAccount(SavePreferenceAccount value) {
        return new JAXBElement<SavePreferenceAccount>(_SavePreferenceAccount_QNAME, SavePreferenceAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllServiceEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllServiceEvents")
    public JAXBElement<FindAllServiceEvents> createFindAllServiceEvents(FindAllServiceEvents value) {
        return new JAXBElement<FindAllServiceEvents>(_FindAllServiceEvents_QNAME, FindAllServiceEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUIApplicationById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getUIApplicationById")
    public JAXBElement<GetUIApplicationById> createGetUIApplicationById(GetUIApplicationById value) {
        return new JAXBElement<GetUIApplicationById>(_GetUIApplicationById_QNAME, GetUIApplicationById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactHistoryByAccountNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactHistoryByAccountNumber")
    public JAXBElement<FindContactHistoryByAccountNumber> createFindContactHistoryByAccountNumber(FindContactHistoryByAccountNumber value) {
        return new JAXBElement<FindContactHistoryByAccountNumber>(_FindContactHistoryByAccountNumber_QNAME, FindContactHistoryByAccountNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllContactTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllContactTypesResponse")
    public JAXBElement<FindAllContactTypesResponse> createFindAllContactTypesResponse(FindAllContactTypesResponse value) {
        return new JAXBElement<FindAllContactTypesResponse>(_FindAllContactTypesResponse_QNAME, FindAllContactTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactDataById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactDataById")
    public JAXBElement<DeleteContactDataById> createDeleteContactDataById(DeleteContactDataById value) {
        return new JAXBElement<DeleteContactDataById>(_DeleteContactDataById_QNAME, DeleteContactDataById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactPreferenceByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactPreferenceByIdResponse")
    public JAXBElement<GetContactPreferenceByIdResponse> createGetContactPreferenceByIdResponse(GetContactPreferenceByIdResponse value) {
        return new JAXBElement<GetContactPreferenceByIdResponse>(_GetContactPreferenceByIdResponse_QNAME, GetContactPreferenceByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactResponse")
    public JAXBElement<DeleteContactResponse> createDeleteContactResponse(DeleteContactResponse value) {
        return new JAXBElement<DeleteContactResponse>(_DeleteContactResponse_QNAME, DeleteContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDataByPreferenceAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDataByPreferenceAccountResponse")
    public JAXBElement<FindContactDataByPreferenceAccountResponse> createFindContactDataByPreferenceAccountResponse(FindContactDataByPreferenceAccountResponse value) {
        return new JAXBElement<FindContactDataByPreferenceAccountResponse>(_FindContactDataByPreferenceAccountResponse_QNAME, FindContactDataByPreferenceAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactDataByValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactDataByValue")
    public JAXBElement<SaveContactDataByValue> createSaveContactDataByValue(SaveContactDataByValue value) {
        return new JAXBElement<SaveContactDataByValue>(_SaveContactDataByValue_QNAME, SaveContactDataByValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDatasByAccountNumberAndBillingSystemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDatasByAccountNumberAndBillingSystemResponse")
    public JAXBElement<FindContactDatasByAccountNumberAndBillingSystemResponse> createFindContactDatasByAccountNumberAndBillingSystemResponse(FindContactDatasByAccountNumberAndBillingSystemResponse value) {
        return new JAXBElement<FindContactDatasByAccountNumberAndBillingSystemResponse>(_FindContactDatasByAccountNumberAndBillingSystemResponse_QNAME, FindContactDatasByAccountNumberAndBillingSystemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactPreferencesResponse")
    public JAXBElement<SaveContactPreferencesResponse> createSaveContactPreferencesResponse(SaveContactPreferencesResponse value) {
        return new JAXBElement<SaveContactPreferencesResponse>(_SaveContactPreferencesResponse_QNAME, SaveContactPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDatasByAccountNumberAndBillingSystemAndRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDatasByAccountNumberAndBillingSystemAndRole")
    public JAXBElement<FindContactDatasByAccountNumberAndBillingSystemAndRole> createFindContactDatasByAccountNumberAndBillingSystemAndRole(FindContactDatasByAccountNumberAndBillingSystemAndRole value) {
        return new JAXBElement<FindContactDatasByAccountNumberAndBillingSystemAndRole>(_FindContactDatasByAccountNumberAndBillingSystemAndRole_QNAME, FindContactDatasByAccountNumberAndBillingSystemAndRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByPreferenceAccountAndServiceEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByPreferenceAccountAndServiceEvent")
    public JAXBElement<FindContactPreferencesByPreferenceAccountAndServiceEvent> createFindContactPreferencesByPreferenceAccountAndServiceEvent(FindContactPreferencesByPreferenceAccountAndServiceEvent value) {
        return new JAXBElement<FindContactPreferencesByPreferenceAccountAndServiceEvent>(_FindContactPreferencesByPreferenceAccountAndServiceEvent_QNAME, FindContactPreferencesByPreferenceAccountAndServiceEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactsByPreferenceAccountAndContactRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactsByPreferenceAccountAndContactRole")
    public JAXBElement<FindContactsByPreferenceAccountAndContactRole> createFindContactsByPreferenceAccountAndContactRole(FindContactsByPreferenceAccountAndContactRole value) {
        return new JAXBElement<FindContactsByPreferenceAccountAndContactRole>(_FindContactsByPreferenceAccountAndContactRole_QNAME, FindContactsByPreferenceAccountAndContactRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactData")
    public JAXBElement<SaveContactData> createSaveContactData(SaveContactData value) {
        return new JAXBElement<SaveContactData>(_SaveContactData_QNAME, SaveContactData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByContactDataValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByContactDataValue")
    public JAXBElement<FindContactPreferencesByContactDataValue> createFindContactPreferencesByContactDataValue(FindContactPreferencesByContactDataValue value) {
        return new JAXBElement<FindContactPreferencesByContactDataValue>(_FindContactPreferencesByContactDataValue_QNAME, FindContactPreferencesByContactDataValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getPreferenceAccountInfoByAccountNumberAndBillingSystemResponse")
    public JAXBElement<GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse> createGetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse(GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse value) {
        return new JAXBElement<GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse>(_GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse_QNAME, GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactsByAccountNumberAndBillingSystemAndRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactsByAccountNumberAndBillingSystemAndRoleResponse")
    public JAXBElement<FindContactsByAccountNumberAndBillingSystemAndRoleResponse> createFindContactsByAccountNumberAndBillingSystemAndRoleResponse(FindContactsByAccountNumberAndBillingSystemAndRoleResponse value) {
        return new JAXBElement<FindContactsByAccountNumberAndBillingSystemAndRoleResponse>(_FindContactsByAccountNumberAndBillingSystemAndRoleResponse_QNAME, FindContactsByAccountNumberAndBillingSystemAndRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactPreferenceByValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactPreferenceByValues")
    public JAXBElement<SaveContactPreferenceByValues> createSaveContactPreferenceByValues(SaveContactPreferenceByValues value) {
        return new JAXBElement<SaveContactPreferenceByValues>(_SaveContactPreferenceByValues_QNAME, SaveContactPreferenceByValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactByContactId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactByContactId")
    public JAXBElement<DeleteContactByContactId> createDeleteContactByContactId(DeleteContactByContactId value) {
        return new JAXBElement<DeleteContactByContactId>(_DeleteContactByContactId_QNAME, DeleteContactByContactId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllContactRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllContactRoles")
    public JAXBElement<FindAllContactRoles> createFindAllContactRoles(FindAllContactRoles value) {
        return new JAXBElement<FindAllContactRoles>(_FindAllContactRoles_QNAME, FindAllContactRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactRoleByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactRoleByIdResponse")
    public JAXBElement<GetContactRoleByIdResponse> createGetContactRoleByIdResponse(GetContactRoleByIdResponse value) {
        return new JAXBElement<GetContactRoleByIdResponse>(_GetContactRoleByIdResponse_QNAME, GetContactRoleByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllContactRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllContactRolesResponse")
    public JAXBElement<FindAllContactRolesResponse> createFindAllContactRolesResponse(FindAllContactRolesResponse value) {
        return new JAXBElement<FindAllContactRolesResponse>(_FindAllContactRolesResponse_QNAME, FindAllContactRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllLanguageTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllLanguageTypes")
    public JAXBElement<FindAllLanguageTypes> createFindAllLanguageTypes(FindAllLanguageTypes value) {
        return new JAXBElement<FindAllLanguageTypes>(_FindAllLanguageTypes_QNAME, FindAllLanguageTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterprisePreferredCommunicationServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "EnterprisePreferredCommunicationServiceException")
    public JAXBElement<EnterprisePreferredCommunicationServiceException> createEnterprisePreferredCommunicationServiceException(EnterprisePreferredCommunicationServiceException value) {
        return new JAXBElement<EnterprisePreferredCommunicationServiceException>(_EnterprisePreferredCommunicationServiceException_QNAME, EnterprisePreferredCommunicationServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByPreferenceAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByPreferenceAccount")
    public JAXBElement<FindContactPreferencesByPreferenceAccount> createFindContactPreferencesByPreferenceAccount(FindContactPreferencesByPreferenceAccount value) {
        return new JAXBElement<FindContactPreferencesByPreferenceAccount>(_FindContactPreferencesByPreferenceAccount_QNAME, FindContactPreferencesByPreferenceAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByAccountNumberAndBillingSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByAccountNumberAndBillingSystem")
    public JAXBElement<FindContactPreferencesByAccountNumberAndBillingSystem> createFindContactPreferencesByAccountNumberAndBillingSystem(FindContactPreferencesByAccountNumberAndBillingSystem value) {
        return new JAXBElement<FindContactPreferencesByAccountNumberAndBillingSystem>(_FindContactPreferencesByAccountNumberAndBillingSystem_QNAME, FindContactPreferencesByAccountNumberAndBillingSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceEventByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getServiceEventByIdResponse")
    public JAXBElement<GetServiceEventByIdResponse> createGetServiceEventByIdResponse(GetServiceEventByIdResponse value) {
        return new JAXBElement<GetServiceEventByIdResponse>(_GetServiceEventByIdResponse_QNAME, GetServiceEventByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDataByPreferenceAccountAndContactRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDataByPreferenceAccountAndContactRole")
    public JAXBElement<FindContactDataByPreferenceAccountAndContactRole> createFindContactDataByPreferenceAccountAndContactRole(FindContactDataByPreferenceAccountAndContactRole value) {
        return new JAXBElement<FindContactDataByPreferenceAccountAndContactRole>(_FindContactDataByPreferenceAccountAndContactRole_QNAME, FindContactDataByPreferenceAccountAndContactRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllModifiedContactAccountsInRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllModifiedContactAccountsInRange")
    public JAXBElement<FindAllModifiedContactAccountsInRange> createFindAllModifiedContactAccountsInRange(FindAllModifiedContactAccountsInRange value) {
        return new JAXBElement<FindAllModifiedContactAccountsInRange>(_FindAllModifiedContactAccountsInRange_QNAME, FindAllModifiedContactAccountsInRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContacts")
    public JAXBElement<SaveContacts> createSaveContacts(SaveContacts value) {
        return new JAXBElement<SaveContacts>(_SaveContacts_QNAME, SaveContacts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingSystemById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getBillingSystemById")
    public JAXBElement<GetBillingSystemById> createGetBillingSystemById(GetBillingSystemById value) {
        return new JAXBElement<GetBillingSystemById>(_GetBillingSystemById_QNAME, GetBillingSystemById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getEventCommunicationByApplicationIdServiceEventIdAndContactMethodId")
    public JAXBElement<GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId> createGetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId(GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId value) {
        return new JAXBElement<GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId>(_GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId_QNAME, GetEventCommunicationByApplicationIdServiceEventIdAndContactMethodId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactPreferenceById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactPreferenceById")
    public JAXBElement<DeleteContactPreferenceById> createDeleteContactPreferenceById(DeleteContactPreferenceById value) {
        return new JAXBElement<DeleteContactPreferenceById>(_DeleteContactPreferenceById_QNAME, DeleteContactPreferenceById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactDataResponse")
    public JAXBElement<SaveContactDataResponse> createSaveContactDataResponse(SaveContactDataResponse value) {
        return new JAXBElement<SaveContactDataResponse>(_SaveContactDataResponse_QNAME, SaveContactDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactsByPreferenceAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactsByPreferenceAccount")
    public JAXBElement<FindContactsByPreferenceAccount> createFindContactsByPreferenceAccount(FindContactsByPreferenceAccount value) {
        return new JAXBElement<FindContactsByPreferenceAccount>(_FindContactsByPreferenceAccount_QNAME, FindContactsByPreferenceAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPreferenceHistoryByAccountNumberInRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findPreferenceHistoryByAccountNumberInRangeResponse")
    public JAXBElement<FindPreferenceHistoryByAccountNumberInRangeResponse> createFindPreferenceHistoryByAccountNumberInRangeResponse(FindPreferenceHistoryByAccountNumberInRangeResponse value) {
        return new JAXBElement<FindPreferenceHistoryByAccountNumberInRangeResponse>(_FindPreferenceHistoryByAccountNumberInRangeResponse_QNAME, FindPreferenceHistoryByAccountNumberInRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactDataByValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactDataByValueResponse")
    public JAXBElement<SaveContactDataByValueResponse> createSaveContactDataByValueResponse(SaveContactDataByValueResponse value) {
        return new JAXBElement<SaveContactDataByValueResponse>(_SaveContactDataByValueResponse_QNAME, SaveContactDataByValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllContactMethods }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllContactMethods")
    public JAXBElement<FindAllContactMethods> createFindAllContactMethods(FindAllContactMethods value) {
        return new JAXBElement<FindAllContactMethods>(_FindAllContactMethods_QNAME, FindAllContactMethods.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactHistoryByAccountNumberInRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactHistoryByAccountNumberInRangeResponse")
    public JAXBElement<FindContactHistoryByAccountNumberInRangeResponse> createFindContactHistoryByAccountNumberInRangeResponse(FindContactHistoryByAccountNumberInRangeResponse value) {
        return new JAXBElement<FindContactHistoryByAccountNumberInRangeResponse>(_FindContactHistoryByAccountNumberInRangeResponse_QNAME, FindContactHistoryByAccountNumberInRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUIApplications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllUIApplications")
    public JAXBElement<FindAllUIApplications> createFindAllUIApplications(FindAllUIApplications value) {
        return new JAXBElement<FindAllUIApplications>(_FindAllUIApplications_QNAME, FindAllUIApplications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDataByContactDataValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDataByContactDataValue")
    public JAXBElement<FindContactDataByContactDataValue> createFindContactDataByContactDataValue(FindContactDataByContactDataValue value) {
        return new JAXBElement<FindContactDataByContactDataValue>(_FindContactDataByContactDataValue_QNAME, FindContactDataByContactDataValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferenceAccountById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getPreferenceAccountById")
    public JAXBElement<GetPreferenceAccountById> createGetPreferenceAccountById(GetPreferenceAccountById value) {
        return new JAXBElement<GetPreferenceAccountById>(_GetPreferenceAccountById_QNAME, GetPreferenceAccountById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllServiceEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllServiceEventsResponse")
    public JAXBElement<FindAllServiceEventsResponse> createFindAllServiceEventsResponse(FindAllServiceEventsResponse value) {
        return new JAXBElement<FindAllServiceEventsResponse>(_FindAllServiceEventsResponse_QNAME, FindAllServiceEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgePreferenceAccountByPreferenceAccountId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "purgePreferenceAccountByPreferenceAccountId")
    public JAXBElement<PurgePreferenceAccountByPreferenceAccountId> createPurgePreferenceAccountByPreferenceAccountId(PurgePreferenceAccountByPreferenceAccountId value) {
        return new JAXBElement<PurgePreferenceAccountByPreferenceAccountId>(_PurgePreferenceAccountByPreferenceAccountId_QNAME, PurgePreferenceAccountByPreferenceAccountId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEventCommunications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllEventCommunications")
    public JAXBElement<FindAllEventCommunications> createFindAllEventCommunications(FindAllEventCommunications value) {
        return new JAXBElement<FindAllEventCommunications>(_FindAllEventCommunications_QNAME, FindAllEventCommunications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePreferenceAccountByValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "savePreferenceAccountByValues")
    public JAXBElement<SavePreferenceAccountByValues> createSavePreferenceAccountByValues(SavePreferenceAccountByValues value) {
        return new JAXBElement<SavePreferenceAccountByValues>(_SavePreferenceAccountByValues_QNAME, SavePreferenceAccountByValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEventCommunicationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllEventCommunicationsResponse")
    public JAXBElement<FindAllEventCommunicationsResponse> createFindAllEventCommunicationsResponse(FindAllEventCommunicationsResponse value) {
        return new JAXBElement<FindAllEventCommunicationsResponse>(_FindAllEventCommunicationsResponse_QNAME, FindAllEventCommunicationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactDatasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactDatasResponse")
    public JAXBElement<SaveContactDatasResponse> createSaveContactDatasResponse(SaveContactDatasResponse value) {
        return new JAXBElement<SaveContactDatasResponse>(_SaveContactDatasResponse_QNAME, SaveContactDatasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactByContactValuesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactByContactValuesResponse")
    public JAXBElement<SaveContactByContactValuesResponse> createSaveContactByContactValuesResponse(SaveContactByContactValuesResponse value) {
        return new JAXBElement<SaveContactByContactValuesResponse>(_SaveContactByContactValuesResponse_QNAME, SaveContactByContactValuesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactDataResponse")
    public JAXBElement<DeleteContactDataResponse> createDeleteContactDataResponse(DeleteContactDataResponse value) {
        return new JAXBElement<DeleteContactDataResponse>(_DeleteContactDataResponse_QNAME, DeleteContactDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDataByPreferenceAccountAndContactRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDataByPreferenceAccountAndContactRoleResponse")
    public JAXBElement<FindContactDataByPreferenceAccountAndContactRoleResponse> createFindContactDataByPreferenceAccountAndContactRoleResponse(FindContactDataByPreferenceAccountAndContactRoleResponse value) {
        return new JAXBElement<FindContactDataByPreferenceAccountAndContactRoleResponse>(_FindContactDataByPreferenceAccountAndContactRoleResponse_QNAME, FindContactDataByPreferenceAccountAndContactRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactByContactIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactByContactIdResponse")
    public JAXBElement<DeleteContactByContactIdResponse> createDeleteContactByContactIdResponse(DeleteContactByContactIdResponse value) {
        return new JAXBElement<DeleteContactByContactIdResponse>(_DeleteContactByContactIdResponse_QNAME, DeleteContactByContactIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactByNameId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactByNameId")
    public JAXBElement<GetContactByNameId> createGetContactByNameId(GetContactByNameId value) {
        return new JAXBElement<GetContactByNameId>(_GetContactByNameId_QNAME, GetContactByNameId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEventCommunicationsByApplicationId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findEventCommunicationsByApplicationId")
    public JAXBElement<FindEventCommunicationsByApplicationId> createFindEventCommunicationsByApplicationId(FindEventCommunicationsByApplicationId value) {
        return new JAXBElement<FindEventCommunicationsByApplicationId>(_FindEventCommunicationsByApplicationId_QNAME, FindEventCommunicationsByApplicationId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidateContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "invalidateContactResponse")
    public JAXBElement<InvalidateContactResponse> createInvalidateContactResponse(InvalidateContactResponse value) {
        return new JAXBElement<InvalidateContactResponse>(_InvalidateContactResponse_QNAME, InvalidateContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactDatasByValuesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactDatasByValuesList")
    public JAXBElement<SaveContactDatasByValuesList> createSaveContactDatasByValuesList(SaveContactDatasByValuesList value) {
        return new JAXBElement<SaveContactDatasByValuesList>(_SaveContactDatasByValuesList_QNAME, SaveContactDatasByValuesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactDatasByValuesListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactDatasByValuesListResponse")
    public JAXBElement<SaveContactDatasByValuesListResponse> createSaveContactDatasByValuesListResponse(SaveContactDatasByValuesListResponse value) {
        return new JAXBElement<SaveContactDatasByValuesListResponse>(_SaveContactDatasByValuesListResponse_QNAME, SaveContactDatasByValuesListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactsResponse")
    public JAXBElement<SaveContactsResponse> createSaveContactsResponse(SaveContactsResponse value) {
        return new JAXBElement<SaveContactsResponse>(_SaveContactsResponse_QNAME, SaveContactsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEventCommunicationByApplicationIdAndServiceEventId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findEventCommunicationByApplicationIdAndServiceEventId")
    public JAXBElement<FindEventCommunicationByApplicationIdAndServiceEventId> createFindEventCommunicationByApplicationIdAndServiceEventId(FindEventCommunicationByApplicationIdAndServiceEventId value) {
        return new JAXBElement<FindEventCommunicationByApplicationIdAndServiceEventId>(_FindEventCommunicationByApplicationIdAndServiceEventId_QNAME, FindEventCommunicationByApplicationIdAndServiceEventId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContact")
    public JAXBElement<DeleteContact> createDeleteContact(DeleteContact value) {
        return new JAXBElement<DeleteContact>(_DeleteContact_QNAME, DeleteContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByPreferenceAccountAndContactMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByPreferenceAccountAndContactMethodResponse")
    public JAXBElement<FindContactPreferencesByPreferenceAccountAndContactMethodResponse> createFindContactPreferencesByPreferenceAccountAndContactMethodResponse(FindContactPreferencesByPreferenceAccountAndContactMethodResponse value) {
        return new JAXBElement<FindContactPreferencesByPreferenceAccountAndContactMethodResponse>(_FindContactPreferencesByPreferenceAccountAndContactMethodResponse_QNAME, FindContactPreferencesByPreferenceAccountAndContactMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventCommunicationById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getEventCommunicationById")
    public JAXBElement<GetEventCommunicationById> createGetEventCommunicationById(GetEventCommunicationById value) {
        return new JAXBElement<GetEventCommunicationById>(_GetEventCommunicationById_QNAME, GetEventCommunicationById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDatasByContactId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDatasByContactId")
    public JAXBElement<FindContactDatasByContactId> createFindContactDatasByContactId(FindContactDatasByContactId value) {
        return new JAXBElement<FindContactDatasByContactId>(_FindContactDatasByContactId_QNAME, FindContactDatasByContactId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactsByPreferenceAccountAndContactRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactsByPreferenceAccountAndContactRoleResponse")
    public JAXBElement<FindContactsByPreferenceAccountAndContactRoleResponse> createFindContactsByPreferenceAccountAndContactRoleResponse(FindContactsByPreferenceAccountAndContactRoleResponse value) {
        return new JAXBElement<FindContactsByPreferenceAccountAndContactRoleResponse>(_FindContactsByPreferenceAccountAndContactRoleResponse_QNAME, FindContactsByPreferenceAccountAndContactRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactPreferenceByValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactPreferenceByValueResponse")
    public JAXBElement<SaveContactPreferenceByValueResponse> createSaveContactPreferenceByValueResponse(SaveContactPreferenceByValueResponse value) {
        return new JAXBElement<SaveContactPreferenceByValueResponse>(_SaveContactPreferenceByValueResponse_QNAME, SaveContactPreferenceByValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactPreference")
    public JAXBElement<SaveContactPreference> createSaveContactPreference(SaveContactPreference value) {
        return new JAXBElement<SaveContactPreference>(_SaveContactPreference_QNAME, SaveContactPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDatasByAccountNumberAndBillingSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDatasByAccountNumberAndBillingSystem")
    public JAXBElement<FindContactDatasByAccountNumberAndBillingSystem> createFindContactDatasByAccountNumberAndBillingSystem(FindContactDatasByAccountNumberAndBillingSystem value) {
        return new JAXBElement<FindContactDatasByAccountNumberAndBillingSystem>(_FindContactDatasByAccountNumberAndBillingSystem_QNAME, FindContactDatasByAccountNumberAndBillingSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardInputHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "charterHeaderInputInfo")
    public JAXBElement<StandardInputHeader> createCharterHeaderInputInfo(StandardInputHeader value) {
        return new JAXBElement<StandardInputHeader>(_CharterHeaderInputInfo_QNAME, StandardInputHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByContactDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByContactDataResponse")
    public JAXBElement<FindContactPreferencesByContactDataResponse> createFindContactPreferencesByContactDataResponse(FindContactPreferencesByContactDataResponse value) {
        return new JAXBElement<FindContactPreferencesByContactDataResponse>(_FindContactPreferencesByContactDataResponse_QNAME, FindContactPreferencesByContactDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactByNameIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactByNameIdResponse")
    public JAXBElement<GetContactByNameIdResponse> createGetContactByNameIdResponse(GetContactByNameIdResponse value) {
        return new JAXBElement<GetContactByNameIdResponse>(_GetContactByNameIdResponse_QNAME, GetContactByNameIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPreferenceHistoryByAccountNumberInRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findPreferenceHistoryByAccountNumberInRange")
    public JAXBElement<FindPreferenceHistoryByAccountNumberInRange> createFindPreferenceHistoryByAccountNumberInRange(FindPreferenceHistoryByAccountNumberInRange value) {
        return new JAXBElement<FindPreferenceHistoryByAccountNumberInRange>(_FindPreferenceHistoryByAccountNumberInRange_QNAME, FindPreferenceHistoryByAccountNumberInRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceEventById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getServiceEventById")
    public JAXBElement<GetServiceEventById> createGetServiceEventById(GetServiceEventById value) {
        return new JAXBElement<GetServiceEventById>(_GetServiceEventById_QNAME, GetServiceEventById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByContactData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByContactData")
    public JAXBElement<FindContactPreferencesByContactData> createFindContactPreferencesByContactData(FindContactPreferencesByContactData value) {
        return new JAXBElement<FindContactPreferencesByContactData>(_FindContactPreferencesByContactData_QNAME, FindContactPreferencesByContactData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDataByContactDataValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDataByContactDataValueResponse")
    public JAXBElement<FindContactDataByContactDataValueResponse> createFindContactDataByContactDataValueResponse(FindContactDataByContactDataValueResponse value) {
        return new JAXBElement<FindContactDataByContactDataValueResponse>(_FindContactDataByContactDataValueResponse_QNAME, FindContactDataByContactDataValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgePreferenceAccountByPreferenceAccountIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "purgePreferenceAccountByPreferenceAccountIdResponse")
    public JAXBElement<PurgePreferenceAccountByPreferenceAccountIdResponse> createPurgePreferenceAccountByPreferenceAccountIdResponse(PurgePreferenceAccountByPreferenceAccountIdResponse value) {
        return new JAXBElement<PurgePreferenceAccountByPreferenceAccountIdResponse>(_PurgePreferenceAccountByPreferenceAccountIdResponse_QNAME, PurgePreferenceAccountByPreferenceAccountIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllContactMethodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllContactMethodsResponse")
    public JAXBElement<FindAllContactMethodsResponse> createFindAllContactMethodsResponse(FindAllContactMethodsResponse value) {
        return new JAXBElement<FindAllContactMethodsResponse>(_FindAllContactMethodsResponse_QNAME, FindAllContactMethodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPreferenceHistoryByAccountNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findPreferenceHistoryByAccountNumberResponse")
    public JAXBElement<FindPreferenceHistoryByAccountNumberResponse> createFindPreferenceHistoryByAccountNumberResponse(FindPreferenceHistoryByAccountNumberResponse value) {
        return new JAXBElement<FindPreferenceHistoryByAccountNumberResponse>(_FindPreferenceHistoryByAccountNumberResponse_QNAME, FindPreferenceHistoryByAccountNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactsByAccountNumberAndBillingSystemAndRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactsByAccountNumberAndBillingSystemAndRole")
    public JAXBElement<FindContactsByAccountNumberAndBillingSystemAndRole> createFindContactsByAccountNumberAndBillingSystemAndRole(FindContactsByAccountNumberAndBillingSystemAndRole value) {
        return new JAXBElement<FindContactsByAccountNumberAndBillingSystemAndRole>(_FindContactsByAccountNumberAndBillingSystemAndRole_QNAME, FindContactsByAccountNumberAndBillingSystemAndRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLanguageTypeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getLanguageTypeById")
    public JAXBElement<GetLanguageTypeById> createGetLanguageTypeById(GetLanguageTypeById value) {
        return new JAXBElement<GetLanguageTypeById>(_GetLanguageTypeById_QNAME, GetLanguageTypeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUIApplicationByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getUIApplicationByIdResponse")
    public JAXBElement<GetUIApplicationByIdResponse> createGetUIApplicationByIdResponse(GetUIApplicationByIdResponse value) {
        return new JAXBElement<GetUIApplicationByIdResponse>(_GetUIApplicationByIdResponse_QNAME, GetUIApplicationByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLanguageTypeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getLanguageTypeByIdResponse")
    public JAXBElement<GetLanguageTypeByIdResponse> createGetLanguageTypeByIdResponse(GetLanguageTypeByIdResponse value) {
        return new JAXBElement<GetLanguageTypeByIdResponse>(_GetLanguageTypeByIdResponse_QNAME, GetLanguageTypeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferenceAccountByAccountNumberAndBillingSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getPreferenceAccountByAccountNumberAndBillingSystem")
    public JAXBElement<GetPreferenceAccountByAccountNumberAndBillingSystem> createGetPreferenceAccountByAccountNumberAndBillingSystem(GetPreferenceAccountByAccountNumberAndBillingSystem value) {
        return new JAXBElement<GetPreferenceAccountByAccountNumberAndBillingSystem>(_GetPreferenceAccountByAccountNumberAndBillingSystem_QNAME, GetPreferenceAccountByAccountNumberAndBillingSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactsByAccountNumberAndBillingSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactsByAccountNumberAndBillingSystem")
    public JAXBElement<FindContactsByAccountNumberAndBillingSystem> createFindContactsByAccountNumberAndBillingSystem(FindContactsByAccountNumberAndBillingSystem value) {
        return new JAXBElement<FindContactsByAccountNumberAndBillingSystem>(_FindContactsByAccountNumberAndBillingSystem_QNAME, FindContactsByAccountNumberAndBillingSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactDataByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactDataByIdResponse")
    public JAXBElement<DeleteContactDataByIdResponse> createDeleteContactDataByIdResponse(DeleteContactDataByIdResponse value) {
        return new JAXBElement<DeleteContactDataByIdResponse>(_DeleteContactDataByIdResponse_QNAME, DeleteContactDataByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactDataByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactDataByIdResponse")
    public JAXBElement<GetContactDataByIdResponse> createGetContactDataByIdResponse(GetContactDataByIdResponse value) {
        return new JAXBElement<GetContactDataByIdResponse>(_GetContactDataByIdResponse_QNAME, GetContactDataByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUIEventFamilyByApplicationIdAndServiceEventId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getUIEventFamilyByApplicationIdAndServiceEventId")
    public JAXBElement<GetUIEventFamilyByApplicationIdAndServiceEventId> createGetUIEventFamilyByApplicationIdAndServiceEventId(GetUIEventFamilyByApplicationIdAndServiceEventId value) {
        return new JAXBElement<GetUIEventFamilyByApplicationIdAndServiceEventId>(_GetUIEventFamilyByApplicationIdAndServiceEventId_QNAME, GetUIEventFamilyByApplicationIdAndServiceEventId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByPreferenceAccountAndContactMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByPreferenceAccountAndContactMethod")
    public JAXBElement<FindContactPreferencesByPreferenceAccountAndContactMethod> createFindContactPreferencesByPreferenceAccountAndContactMethod(FindContactPreferencesByPreferenceAccountAndContactMethod value) {
        return new JAXBElement<FindContactPreferencesByPreferenceAccountAndContactMethod>(_FindContactPreferencesByPreferenceAccountAndContactMethod_QNAME, FindContactPreferencesByPreferenceAccountAndContactMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUIEventFamilyByApplicationIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findUIEventFamilyByApplicationIDResponse")
    public JAXBElement<FindUIEventFamilyByApplicationIDResponse> createFindUIEventFamilyByApplicationIDResponse(FindUIEventFamilyByApplicationIDResponse value) {
        return new JAXBElement<FindUIEventFamilyByApplicationIDResponse>(_FindUIEventFamilyByApplicationIDResponse_QNAME, FindUIEventFamilyByApplicationIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "optOut")
    public JAXBElement<OptOut> createOptOut(OptOut value) {
        return new JAXBElement<OptOut>(_OptOut_QNAME, OptOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactPreferenceByValuesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactPreferenceByValuesResponse")
    public JAXBElement<SaveContactPreferenceByValuesResponse> createSaveContactPreferenceByValuesResponse(SaveContactPreferenceByValuesResponse value) {
        return new JAXBElement<SaveContactPreferenceByValuesResponse>(_SaveContactPreferenceByValuesResponse_QNAME, SaveContactPreferenceByValuesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByAccountNumberAndBillingSystemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByAccountNumberAndBillingSystemResponse")
    public JAXBElement<FindContactPreferencesByAccountNumberAndBillingSystemResponse> createFindContactPreferencesByAccountNumberAndBillingSystemResponse(FindContactPreferencesByAccountNumberAndBillingSystemResponse value) {
        return new JAXBElement<FindContactPreferencesByAccountNumberAndBillingSystemResponse>(_FindContactPreferencesByAccountNumberAndBillingSystemResponse_QNAME, FindContactPreferencesByAccountNumberAndBillingSystemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "purgeAccount")
    public JAXBElement<PurgeAccount> createPurgeAccount(PurgeAccount value) {
        return new JAXBElement<PurgeAccount>(_PurgeAccount_QNAME, PurgeAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUIEventFamilies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllUIEventFamilies")
    public JAXBElement<FindAllUIEventFamilies> createFindAllUIEventFamilies(FindAllUIEventFamilies value) {
        return new JAXBElement<FindAllUIEventFamilies>(_FindAllUIEventFamilies_QNAME, FindAllUIEventFamilies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferenceAccountByAccountIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getPreferenceAccountByAccountIdResponse")
    public JAXBElement<GetPreferenceAccountByAccountIdResponse> createGetPreferenceAccountByAccountIdResponse(GetPreferenceAccountByAccountIdResponse value) {
        return new JAXBElement<GetPreferenceAccountByAccountIdResponse>(_GetPreferenceAccountByAccountIdResponse_QNAME, GetPreferenceAccountByAccountIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDatasByAccountNumberAndBillingSystemAndRoleResponse")
    public JAXBElement<FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse> createFindContactDatasByAccountNumberAndBillingSystemAndRoleResponse(FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse value) {
        return new JAXBElement<FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse>(_FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse_QNAME, FindContactDatasByAccountNumberAndBillingSystemAndRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactPreferenceByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactPreferenceByIdResponse")
    public JAXBElement<DeleteContactPreferenceByIdResponse> createDeleteContactPreferenceByIdResponse(DeleteContactPreferenceByIdResponse value) {
        return new JAXBElement<DeleteContactPreferenceByIdResponse>(_DeleteContactPreferenceByIdResponse_QNAME, DeleteContactPreferenceByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePreferenceAccountByValuesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "savePreferenceAccountByValuesResponse")
    public JAXBElement<SavePreferenceAccountByValuesResponse> createSavePreferenceAccountByValuesResponse(SavePreferenceAccountByValuesResponse value) {
        return new JAXBElement<SavePreferenceAccountByValuesResponse>(_SavePreferenceAccountByValuesResponse_QNAME, SavePreferenceAccountByValuesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactRoleById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactRoleById")
    public JAXBElement<GetContactRoleById> createGetContactRoleById(GetContactRoleById value) {
        return new JAXBElement<GetContactRoleById>(_GetContactRoleById_QNAME, GetContactRoleById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptOutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "optOutResponse")
    public JAXBElement<OptOutResponse> createOptOutResponse(OptOutResponse value) {
        return new JAXBElement<OptOutResponse>(_OptOutResponse_QNAME, OptOutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgePreferenceAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "purgePreferenceAccountResponse")
    public JAXBElement<PurgePreferenceAccountResponse> createPurgePreferenceAccountResponse(PurgePreferenceAccountResponse value) {
        return new JAXBElement<PurgePreferenceAccountResponse>(_PurgePreferenceAccountResponse_QNAME, PurgePreferenceAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactMethodById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactMethodById")
    public JAXBElement<GetContactMethodById> createGetContactMethodById(GetContactMethodById value) {
        return new JAXBElement<GetContactMethodById>(_GetContactMethodById_QNAME, GetContactMethodById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactsByAccountNumberAndBillingSystemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactsByAccountNumberAndBillingSystemResponse")
    public JAXBElement<FindContactsByAccountNumberAndBillingSystemResponse> createFindContactsByAccountNumberAndBillingSystemResponse(FindContactsByAccountNumberAndBillingSystemResponse value) {
        return new JAXBElement<FindContactsByAccountNumberAndBillingSystemResponse>(_FindContactsByAccountNumberAndBillingSystemResponse_QNAME, FindContactsByAccountNumberAndBillingSystemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByPreferenceAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByPreferenceAccountResponse")
    public JAXBElement<FindContactPreferencesByPreferenceAccountResponse> createFindContactPreferencesByPreferenceAccountResponse(FindContactPreferencesByPreferenceAccountResponse value) {
        return new JAXBElement<FindContactPreferencesByPreferenceAccountResponse>(_FindContactPreferencesByPreferenceAccountResponse_QNAME, FindContactPreferencesByPreferenceAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDatasByContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDatasByContactResponse")
    public JAXBElement<FindContactDatasByContactResponse> createFindContactDatasByContactResponse(FindContactDatasByContactResponse value) {
        return new JAXBElement<FindContactDatasByContactResponse>(_FindContactDatasByContactResponse_QNAME, FindContactDatasByContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEventCommunicationByApplicationIdAndServiceEventIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findEventCommunicationByApplicationIdAndServiceEventIdResponse")
    public JAXBElement<FindEventCommunicationByApplicationIdAndServiceEventIdResponse> createFindEventCommunicationByApplicationIdAndServiceEventIdResponse(FindEventCommunicationByApplicationIdAndServiceEventIdResponse value) {
        return new JAXBElement<FindEventCommunicationByApplicationIdAndServiceEventIdResponse>(_FindEventCommunicationByApplicationIdAndServiceEventIdResponse_QNAME, FindEventCommunicationByApplicationIdAndServiceEventIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactsByContactValuesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactsByContactValuesResponse")
    public JAXBElement<SaveContactsByContactValuesResponse> createSaveContactsByContactValuesResponse(SaveContactsByContactValuesResponse value) {
        return new JAXBElement<SaveContactsByContactValuesResponse>(_SaveContactsByContactValuesResponse_QNAME, SaveContactsByContactValuesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllLanguageTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllLanguageTypesResponse")
    public JAXBElement<FindAllLanguageTypesResponse> createFindAllLanguageTypesResponse(FindAllLanguageTypesResponse value) {
        return new JAXBElement<FindAllLanguageTypesResponse>(_FindAllLanguageTypesResponse_QNAME, FindAllLanguageTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "purgeAccountResponse")
    public JAXBElement<PurgeAccountResponse> createPurgeAccountResponse(PurgeAccountResponse value) {
        return new JAXBElement<PurgeAccountResponse>(_PurgeAccountResponse_QNAME, PurgeAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactsByContactValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactsByContactValues")
    public JAXBElement<SaveContactsByContactValues> createSaveContactsByContactValues(SaveContactsByContactValues value) {
        return new JAXBElement<SaveContactsByContactValues>(_SaveContactsByContactValues_QNAME, SaveContactsByContactValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllModifiedPreferenceAccountsInRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllModifiedPreferenceAccountsInRangeResponse")
    public JAXBElement<FindAllModifiedPreferenceAccountsInRangeResponse> createFindAllModifiedPreferenceAccountsInRangeResponse(FindAllModifiedPreferenceAccountsInRangeResponse value) {
        return new JAXBElement<FindAllModifiedPreferenceAccountsInRangeResponse>(_FindAllModifiedPreferenceAccountsInRangeResponse_QNAME, FindAllModifiedPreferenceAccountsInRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactPreference")
    public JAXBElement<DeleteContactPreference> createDeleteContactPreference(DeleteContactPreference value) {
        return new JAXBElement<DeleteContactPreference>(_DeleteContactPreference_QNAME, DeleteContactPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUIEventFamilyByApplicationIdAndServiceEventIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getUIEventFamilyByApplicationIdAndServiceEventIdResponse")
    public JAXBElement<GetUIEventFamilyByApplicationIdAndServiceEventIdResponse> createGetUIEventFamilyByApplicationIdAndServiceEventIdResponse(GetUIEventFamilyByApplicationIdAndServiceEventIdResponse value) {
        return new JAXBElement<GetUIEventFamilyByApplicationIdAndServiceEventIdResponse>(_GetUIEventFamilyByApplicationIdAndServiceEventIdResponse_QNAME, GetUIEventFamilyByApplicationIdAndServiceEventIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDataByPreferenceAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDataByPreferenceAccount")
    public JAXBElement<FindContactDataByPreferenceAccount> createFindContactDataByPreferenceAccount(FindContactDataByPreferenceAccount value) {
        return new JAXBElement<FindContactDataByPreferenceAccount>(_FindContactDataByPreferenceAccount_QNAME, FindContactDataByPreferenceAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactByUsernameResponse")
    public JAXBElement<GetContactByUsernameResponse> createGetContactByUsernameResponse(GetContactByUsernameResponse value) {
        return new JAXBElement<GetContactByUsernameResponse>(_GetContactByUsernameResponse_QNAME, GetContactByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUIApplicationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllUIApplicationsResponse")
    public JAXBElement<FindAllUIApplicationsResponse> createFindAllUIApplicationsResponse(FindAllUIApplicationsResponse value) {
        return new JAXBElement<FindAllUIApplicationsResponse>(_FindAllUIApplicationsResponse_QNAME, FindAllUIApplicationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByContactDataValueAndContactMethodIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByContactDataValueAndContactMethodIdResponse")
    public JAXBElement<FindContactPreferencesByContactDataValueAndContactMethodIdResponse> createFindContactPreferencesByContactDataValueAndContactMethodIdResponse(FindContactPreferencesByContactDataValueAndContactMethodIdResponse value) {
        return new JAXBElement<FindContactPreferencesByContactDataValueAndContactMethodIdResponse>(_FindContactPreferencesByContactDataValueAndContactMethodIdResponse_QNAME, FindContactPreferencesByContactDataValueAndContactMethodIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferenceAccountInfoByAccountNumberAndBillingSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getPreferenceAccountInfoByAccountNumberAndBillingSystem")
    public JAXBElement<GetPreferenceAccountInfoByAccountNumberAndBillingSystem> createGetPreferenceAccountInfoByAccountNumberAndBillingSystem(GetPreferenceAccountInfoByAccountNumberAndBillingSystem value) {
        return new JAXBElement<GetPreferenceAccountInfoByAccountNumberAndBillingSystem>(_GetPreferenceAccountInfoByAccountNumberAndBillingSystem_QNAME, GetPreferenceAccountInfoByAccountNumberAndBillingSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactPreferenceByValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactPreferenceByValue")
    public JAXBElement<SaveContactPreferenceByValue> createSaveContactPreferenceByValue(SaveContactPreferenceByValue value) {
        return new JAXBElement<SaveContactPreferenceByValue>(_SaveContactPreferenceByValue_QNAME, SaveContactPreferenceByValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgePreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "purgePreferencesResponse")
    public JAXBElement<PurgePreferencesResponse> createPurgePreferencesResponse(PurgePreferencesResponse value) {
        return new JAXBElement<PurgePreferencesResponse>(_PurgePreferencesResponse_QNAME, PurgePreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContactPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContactPreferences")
    public JAXBElement<SaveContactPreferences> createSaveContactPreferences(SaveContactPreferences value) {
        return new JAXBElement<SaveContactPreferences>(_SaveContactPreferences_QNAME, SaveContactPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllModifiedPreferenceAccountsInRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllModifiedPreferenceAccountsInRange")
    public JAXBElement<FindAllModifiedPreferenceAccountsInRange> createFindAllModifiedPreferenceAccountsInRange(FindAllModifiedPreferenceAccountsInRange value) {
        return new JAXBElement<FindAllModifiedPreferenceAccountsInRange>(_FindAllModifiedPreferenceAccountsInRange_QNAME, FindAllModifiedPreferenceAccountsInRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactHistoryByAccountNumberInRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactHistoryByAccountNumberInRange")
    public JAXBElement<FindContactHistoryByAccountNumberInRange> createFindContactHistoryByAccountNumberInRange(FindContactHistoryByAccountNumberInRange value) {
        return new JAXBElement<FindContactHistoryByAccountNumberInRange>(_FindContactHistoryByAccountNumberInRange_QNAME, FindContactHistoryByAccountNumberInRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactHistoryByAccountNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactHistoryByAccountNumberResponse")
    public JAXBElement<FindContactHistoryByAccountNumberResponse> createFindContactHistoryByAccountNumberResponse(FindContactHistoryByAccountNumberResponse value) {
        return new JAXBElement<FindContactHistoryByAccountNumberResponse>(_FindContactHistoryByAccountNumberResponse_QNAME, FindContactHistoryByAccountNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactDataById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactDataById")
    public JAXBElement<GetContactDataById> createGetContactDataById(GetContactDataById value) {
        return new JAXBElement<GetContactDataById>(_GetContactDataById_QNAME, GetContactDataById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllContactTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllContactTypes")
    public JAXBElement<FindAllContactTypes> createFindAllContactTypes(FindAllContactTypes value) {
        return new JAXBElement<FindAllContactTypes>(_FindAllContactTypes_QNAME, FindAllContactTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUIEventFamilyById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getUIEventFamilyById")
    public JAXBElement<GetUIEventFamilyById> createGetUIEventFamilyById(GetUIEventFamilyById value) {
        return new JAXBElement<GetUIEventFamilyById>(_GetUIEventFamilyById_QNAME, GetUIEventFamilyById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactPreferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactPreferenceResponse")
    public JAXBElement<DeleteContactPreferenceResponse> createDeleteContactPreferenceResponse(DeleteContactPreferenceResponse value) {
        return new JAXBElement<DeleteContactPreferenceResponse>(_DeleteContactPreferenceResponse_QNAME, DeleteContactPreferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactDatasByContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactDatasByContact")
    public JAXBElement<FindContactDatasByContact> createFindContactDatasByContact(FindContactDatasByContact value) {
        return new JAXBElement<FindContactDatasByContact>(_FindContactDatasByContact_QNAME, FindContactDatasByContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactMethodByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactMethodByIdResponse")
    public JAXBElement<GetContactMethodByIdResponse> createGetContactMethodByIdResponse(GetContactMethodByIdResponse value) {
        return new JAXBElement<GetContactMethodByIdResponse>(_GetContactMethodByIdResponse_QNAME, GetContactMethodByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactPreferencesByPreferenceAccountAndServiceEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactPreferencesByPreferenceAccountAndServiceEventResponse")
    public JAXBElement<FindContactPreferencesByPreferenceAccountAndServiceEventResponse> createFindContactPreferencesByPreferenceAccountAndServiceEventResponse(FindContactPreferencesByPreferenceAccountAndServiceEventResponse value) {
        return new JAXBElement<FindContactPreferencesByPreferenceAccountAndServiceEventResponse>(_FindContactPreferencesByPreferenceAccountAndServiceEventResponse_QNAME, FindContactPreferencesByPreferenceAccountAndServiceEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUIEventFamilyByApplicationID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findUIEventFamilyByApplicationID")
    public JAXBElement<FindUIEventFamilyByApplicationID> createFindUIEventFamilyByApplicationID(FindUIEventFamilyByApplicationID value) {
        return new JAXBElement<FindUIEventFamilyByApplicationID>(_FindUIEventFamilyByApplicationID_QNAME, FindUIEventFamilyByApplicationID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventCommunicationByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getEventCommunicationByIdResponse")
    public JAXBElement<GetEventCommunicationByIdResponse> createGetEventCommunicationByIdResponse(GetEventCommunicationByIdResponse value) {
        return new JAXBElement<GetEventCommunicationByIdResponse>(_GetEventCommunicationByIdResponse_QNAME, GetEventCommunicationByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferenceAccountByAccountNumberAndBillingSystemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getPreferenceAccountByAccountNumberAndBillingSystemResponse")
    public JAXBElement<GetPreferenceAccountByAccountNumberAndBillingSystemResponse> createGetPreferenceAccountByAccountNumberAndBillingSystemResponse(GetPreferenceAccountByAccountNumberAndBillingSystemResponse value) {
        return new JAXBElement<GetPreferenceAccountByAccountNumberAndBillingSystemResponse>(_GetPreferenceAccountByAccountNumberAndBillingSystemResponse_QNAME, GetPreferenceAccountByAccountNumberAndBillingSystemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUIEventFamilyByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getUIEventFamilyByIdResponse")
    public JAXBElement<GetUIEventFamilyByIdResponse> createGetUIEventFamilyByIdResponse(GetUIEventFamilyByIdResponse value) {
        return new JAXBElement<GetUIEventFamilyByIdResponse>(_GetUIEventFamilyByIdResponse_QNAME, GetUIEventFamilyByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "saveContact")
    public JAXBElement<SaveContact> createSaveContact(SaveContact value) {
        return new JAXBElement<SaveContact>(_SaveContact_QNAME, SaveContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "deleteContactData")
    public JAXBElement<DeleteContactData> createDeleteContactData(DeleteContactData value) {
        return new JAXBElement<DeleteContactData>(_DeleteContactData_QNAME, DeleteContactData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactsByPreferenceAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findContactsByPreferenceAccountResponse")
    public JAXBElement<FindContactsByPreferenceAccountResponse> createFindContactsByPreferenceAccountResponse(FindContactsByPreferenceAccountResponse value) {
        return new JAXBElement<FindContactsByPreferenceAccountResponse>(_FindContactsByPreferenceAccountResponse_QNAME, FindContactsByPreferenceAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEventCommunicationsByApplicationIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findEventCommunicationsByApplicationIdResponse")
    public JAXBElement<FindEventCommunicationsByApplicationIdResponse> createFindEventCommunicationsByApplicationIdResponse(FindEventCommunicationsByApplicationIdResponse value) {
        return new JAXBElement<FindEventCommunicationsByApplicationIdResponse>(_FindEventCommunicationsByApplicationIdResponse_QNAME, FindEventCommunicationsByApplicationIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactTypeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "getContactTypeByIdResponse")
    public JAXBElement<GetContactTypeByIdResponse> createGetContactTypeByIdResponse(GetContactTypeByIdResponse value) {
        return new JAXBElement<GetContactTypeByIdResponse>(_GetContactTypeByIdResponse_QNAME, GetContactTypeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePreferenceAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "savePreferenceAccountResponse")
    public JAXBElement<SavePreferenceAccountResponse> createSavePreferenceAccountResponse(SavePreferenceAccountResponse value) {
        return new JAXBElement<SavePreferenceAccountResponse>(_SavePreferenceAccountResponse_QNAME, SavePreferenceAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUIEventFamiliesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.charter.com/enterprise/prefcomm/v1", name = "findAllUIEventFamiliesResponse")
    public JAXBElement<FindAllUIEventFamiliesResponse> createFindAllUIEventFamiliesResponse(FindAllUIEventFamiliesResponse value) {
        return new JAXBElement<FindAllUIEventFamiliesResponse>(_FindAllUIEventFamiliesResponse_QNAME, FindAllUIEventFamiliesResponse.class, null, value);
    }

}
