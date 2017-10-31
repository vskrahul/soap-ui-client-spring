
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.charter.enterprise.billing.csg.accounts package. 
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

    private final static QName _CharterHeaderInfo_QNAME = new QName("http://charter.com/enterprise/billing/csg/accounts", "CharterHeaderInfo");
    private final static QName _LedgerFilterLedgerDetailEndPostDate_QNAME = new QName("http://charter.com/enterprise/billing/csg/accounts", "LedgerDetailEndPostDate");
    private final static QName _LedgerFilterLedgerStatementIdentifier_QNAME = new QName("http://charter.com/enterprise/billing/csg/accounts", "LedgerStatementIdentifier");
    private final static QName _LedgerFilterLedgerStatementYear_QNAME = new QName("http://charter.com/enterprise/billing/csg/accounts", "LedgerStatementYear");
    private final static QName _LedgerFilterLedgerStatementDate_QNAME = new QName("http://charter.com/enterprise/billing/csg/accounts", "LedgerStatementDate");
    private final static QName _LedgerFilterLedgerStatementMonth_QNAME = new QName("http://charter.com/enterprise/billing/csg/accounts", "LedgerStatementMonth");
    private final static QName _LedgerFilterLedgerDetailIdentifier_QNAME = new QName("http://charter.com/enterprise/billing/csg/accounts", "LedgerDetailIdentifier");
    private final static QName _LedgerFilterLedgerDetailBeginPostDate_QNAME = new QName("http://charter.com/enterprise/billing/csg/accounts", "LedgerDetailBeginPostDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.charter.enterprise.billing.csg.accounts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountLedgersRequest.AccountLedgerFilter.LedgerDetailType }
     * 
     */
    public GetAccountLedgersRequest.AccountLedgerFilter.LedgerDetailType createGetAccountLedgersRequestAccountLedgerFilterLedgerDetailType() {
        return new GetAccountLedgersRequest.AccountLedgerFilter.LedgerDetailType();
    }

    /**
     * Create an instance of {@link MultiCallResult }
     * 
     */
    public MultiCallResult createMultiCallResult() {
        return new MultiCallResult();
    }

    /**
     * Create an instance of {@link GetCustomerStatementsResponse }
     * 
     */
    public GetCustomerStatementsResponse createGetCustomerStatementsResponse() {
        return new GetCustomerStatementsResponse();
    }

    /**
     * Create an instance of {@link ServicePriceComments }
     * 
     */
    public ServicePriceComments createServicePriceComments() {
        return new ServicePriceComments();
    }

    /**
     * Create an instance of {@link GetCPNIVerificationRequest }
     * 
     */
    public GetCPNIVerificationRequest createGetCPNIVerificationRequest() {
        return new GetCPNIVerificationRequest();
    }

    /**
     * Create an instance of {@link Account.Transfer }
     * 
     */
    public Account.Transfer createAccountTransfer() {
        return new Account.Transfer();
    }

    /**
     * Create an instance of {@link GetEquifaxCreditDataResponse }
     * 
     */
    public GetEquifaxCreditDataResponse createGetEquifaxCreditDataResponse() {
        return new GetEquifaxCreditDataResponse();
    }

    /**
     * Create an instance of {@link AddressA }
     * 
     */
    public AddressA createAddressA() {
        return new AddressA();
    }

    /**
     * Create an instance of {@link Usage.Item }
     * 
     */
    public Usage.Item createUsageItem() {
        return new Usage.Item();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link UpdateAccountServicePriceResponse }
     * 
     */
    public UpdateAccountServicePriceResponse createUpdateAccountServicePriceResponse() {
        return new UpdateAccountServicePriceResponse();
    }

    /**
     * Create an instance of {@link ServicePriceReasons }
     * 
     */
    public ServicePriceReasons createServicePriceReasons() {
        return new ServicePriceReasons();
    }

    /**
     * Create an instance of {@link Account.BillToAddress }
     * 
     */
    public Account.BillToAddress createAccountBillToAddress() {
        return new Account.BillToAddress();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount createEquifaxCreditDetailResultCustomerListCustomerUncollectedAccount() {
        return new EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount();
    }

    /**
     * Create an instance of {@link GetAccountLedgersResponse }
     * 
     */
    public GetAccountLedgersResponse createGetAccountLedgersResponse() {
        return new GetAccountLedgersResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link BillingDetail }
     * 
     */
    public BillingDetail createBillingDetail() {
        return new BillingDetail();
    }

    /**
     * Create an instance of {@link AccountLedgerDetail }
     * 
     */
    public AccountLedgerDetail createAccountLedgerDetail() {
        return new AccountLedgerDetail();
    }

    /**
     * Create an instance of {@link BillingDetail.Payment.Card }
     * 
     */
    public BillingDetail.Payment.Card createBillingDetailPaymentCard() {
        return new BillingDetail.Payment.Card();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.Score }
     * 
     */
    public EquifaxCreditDetailResult.Credit.Score createEquifaxCreditDetailResultCreditScore() {
        return new EquifaxCreditDetailResult.Credit.Score();
    }

    /**
     * Create an instance of {@link GetFutureStatementsResponse }
     * 
     */
    public GetFutureStatementsResponse createGetFutureStatementsResponse() {
        return new GetFutureStatementsResponse();
    }

    /**
     * Create an instance of {@link PaymentDetail.Card }
     * 
     */
    public PaymentDetail.Card createPaymentDetailCard() {
        return new PaymentDetail.Card();
    }

    /**
     * Create an instance of {@link Usage }
     * 
     */
    public Usage createUsage() {
        return new Usage();
    }

    /**
     * Create an instance of {@link LedgerFilter.LedgerDetailType }
     * 
     */
    public LedgerFilter.LedgerDetailType createLedgerFilterLedgerDetailType() {
        return new LedgerFilter.LedgerDetailType();
    }

    /**
     * Create an instance of {@link UpdateAccountRequest }
     * 
     */
    public UpdateAccountRequest createUpdateAccountRequest() {
        return new UpdateAccountRequest();
    }

    /**
     * Create an instance of {@link Account.BillToName }
     * 
     */
    public Account.BillToName createAccountBillToName() {
        return new Account.BillToName();
    }

    /**
     * Create an instance of {@link BillingInfo }
     * 
     */
    public BillingInfo createBillingInfo() {
        return new BillingInfo();
    }

    /**
     * Create an instance of {@link OfferDisplay }
     * 
     */
    public OfferDisplay createOfferDisplay() {
        return new OfferDisplay();
    }

    /**
     * Create an instance of {@link CsgHeaderInfo }
     * 
     */
    public CsgHeaderInfo createCsgHeaderInfo() {
        return new CsgHeaderInfo();
    }

    /**
     * Create an instance of {@link BillingDetail.Item.Component.Billing }
     * 
     */
    public BillingDetail.Item.Component.Billing createBillingDetailItemComponentBilling() {
        return new BillingDetail.Item.Component.Billing();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList.Customer.Previous.Identification }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList.Customer.Previous.Identification createEquifaxCreditDetailResultCustomerListCustomerPreviousIdentification() {
        return new EquifaxCreditDetailResult.CustomerList.Customer.Previous.Identification();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList.Customer.Verification }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList.Customer.Verification createEquifaxCreditDetailResultCustomerListCustomerVerification() {
        return new EquifaxCreditDetailResult.CustomerList.Customer.Verification();
    }

    /**
     * Create an instance of {@link GetFutureStatementsRequest }
     * 
     */
    public GetFutureStatementsRequest createGetFutureStatementsRequest() {
        return new GetFutureStatementsRequest();
    }

    /**
     * Create an instance of {@link PaymentHistory }
     * 
     */
    public PaymentHistory createPaymentHistory() {
        return new PaymentHistory();
    }

    /**
     * Create an instance of {@link LineOfBusiness }
     * 
     */
    public LineOfBusiness createLineOfBusiness() {
        return new LineOfBusiness();
    }

    /**
     * Create an instance of {@link GetAccountStatementsAllResponse }
     * 
     */
    public GetAccountStatementsAllResponse createGetAccountStatementsAllResponse() {
        return new GetAccountStatementsAllResponse();
    }

    /**
     * Create an instance of {@link PhoneA }
     * 
     */
    public PhoneA createPhoneA() {
        return new PhoneA();
    }

    /**
     * Create an instance of {@link GetAccountLedgersRequest.AccountLedgerFilter.LedgerDateRange }
     * 
     */
    public GetAccountLedgersRequest.AccountLedgerFilter.LedgerDateRange createGetAccountLedgersRequestAccountLedgerFilterLedgerDateRange() {
        return new GetAccountLedgersRequest.AccountLedgerFilter.LedgerDateRange();
    }

    /**
     * Create an instance of {@link GetAccountLedgersRequest.AccountLedgerFilter }
     * 
     */
    public GetAccountLedgersRequest.AccountLedgerFilter createGetAccountLedgersRequestAccountLedgerFilter() {
        return new GetAccountLedgersRequest.AccountLedgerFilter();
    }

    /**
     * Create an instance of {@link com.charter.enterprise.billing.csg.accounts.Audit }
     * 
     */
    public com.charter.enterprise.billing.csg.accounts.Audit createAudit() {
        return new com.charter.enterprise.billing.csg.accounts.Audit();
    }

    /**
     * Create an instance of {@link PricePlanType }
     * 
     */
    public PricePlanType createPricePlanType() {
        return new PricePlanType();
    }

    /**
     * Create an instance of {@link GetAccountsRequest }
     * 
     */
    public GetAccountsRequest createGetAccountsRequest() {
        return new GetAccountsRequest();
    }

    /**
     * Create an instance of {@link BillingDetail.Item }
     * 
     */
    public BillingDetail.Item createBillingDetailItem() {
        return new BillingDetail.Item();
    }

    /**
     * Create an instance of {@link BillingDetail.Transfer }
     * 
     */
    public BillingDetail.Transfer createBillingDetailTransfer() {
        return new BillingDetail.Transfer();
    }

    /**
     * Create an instance of {@link StatementSummary }
     * 
     */
    public StatementSummary createStatementSummary() {
        return new StatementSummary();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.IncidentReport }
     * 
     */
    public EquifaxCreditDetailResult.Credit.IncidentReport createEquifaxCreditDetailResultCreditIncidentReport() {
        return new EquifaxCreditDetailResult.Credit.IncidentReport();
    }

    /**
     * Create an instance of {@link UpdateAccountResponse }
     * 
     */
    public UpdateAccountResponse createUpdateAccountResponse() {
        return new UpdateAccountResponse();
    }

    /**
     * Create an instance of {@link AccountStatementAllInfo }
     * 
     */
    public AccountStatementAllInfo createAccountStatementAllInfo() {
        return new AccountStatementAllInfo();
    }

    /**
     * Create an instance of {@link GetCustomerStatementsRequest }
     * 
     */
    public GetCustomerStatementsRequest createGetCustomerStatementsRequest() {
        return new GetCustomerStatementsRequest();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link GetFutureStatementsResponse.Statement.Ledger.Detail }
     * 
     */
    public GetFutureStatementsResponse.Statement.Ledger.Detail createGetFutureStatementsResponseStatementLedgerDetail() {
        return new GetFutureStatementsResponse.Statement.Ledger.Detail();
    }

    /**
     * Create an instance of {@link ServicesResultReasons }
     * 
     */
    public ServicesResultReasons createServicesResultReasons() {
        return new ServicesResultReasons();
    }

    /**
     * Create an instance of {@link com.charter.enterprise.billing.csg.accounts.Statement }
     * 
     */
    public com.charter.enterprise.billing.csg.accounts.Statement createStatement() {
        return new com.charter.enterprise.billing.csg.accounts.Statement();
    }

    /**
     * Create an instance of {@link CriteriaType }
     * 
     */
    public CriteriaType createCriteriaType() {
        return new CriteriaType();
    }

    /**
     * Create an instance of {@link VerifyResult }
     * 
     */
    public VerifyResult createVerifyResult() {
        return new VerifyResult();
    }

    /**
     * Create an instance of {@link BillingDetail.Tax }
     * 
     */
    public BillingDetail.Tax createBillingDetailTax() {
        return new BillingDetail.Tax();
    }

    /**
     * Create an instance of {@link CsgStatusMessage }
     * 
     */
    public CsgStatusMessage createCsgStatusMessage() {
        return new CsgStatusMessage();
    }

    /**
     * Create an instance of {@link GetFutureStatementsResponse.Statement }
     * 
     */
    public GetFutureStatementsResponse.Statement createGetFutureStatementsResponseStatement() {
        return new GetFutureStatementsResponse.Statement();
    }

    /**
     * Create an instance of {@link UpdateAccountServicePriceRequest }
     * 
     */
    public UpdateAccountServicePriceRequest createUpdateAccountServicePriceRequest() {
        return new UpdateAccountServicePriceRequest();
    }

    /**
     * Create an instance of {@link BillingDetail.Item.Billing }
     * 
     */
    public BillingDetail.Item.Billing createBillingDetailItemBilling() {
        return new BillingDetail.Item.Billing();
    }

    /**
     * Create an instance of {@link com.charter.enterprise.billing.csg.accounts.Total }
     * 
     */
    public com.charter.enterprise.billing.csg.accounts.Total createTotal() {
        return new com.charter.enterprise.billing.csg.accounts.Total();
    }

    /**
     * Create an instance of {@link GetAccountLedgersRequest.Ledger }
     * 
     */
    public GetAccountLedgersRequest.Ledger createGetAccountLedgersRequestLedger() {
        return new GetAccountLedgersRequest.Ledger();
    }

    /**
     * Create an instance of {@link CharterHeaderInfo }
     * 
     */
    public CharterHeaderInfo createCharterHeaderInfo() {
        return new CharterHeaderInfo();
    }

    /**
     * Create an instance of {@link BillingDetail.Adjustment.Item }
     * 
     */
    public BillingDetail.Adjustment.Item createBillingDetailAdjustmentItem() {
        return new BillingDetail.Adjustment.Item();
    }

    /**
     * Create an instance of {@link AccountCriteria.Name }
     * 
     */
    public AccountCriteria.Name createAccountCriteriaName() {
        return new AccountCriteria.Name();
    }

    /**
     * Create an instance of {@link AccountLedger }
     * 
     */
    public AccountLedger createAccountLedger() {
        return new AccountLedger();
    }

    /**
     * Create an instance of {@link GetVerificationResponse }
     * 
     */
    public GetVerificationResponse createGetVerificationResponse() {
        return new GetVerificationResponse();
    }

    /**
     * Create an instance of {@link GetAccountStatementsAllRequest }
     * 
     */
    public GetAccountStatementsAllRequest createGetAccountStatementsAllRequest() {
        return new GetAccountStatementsAllRequest();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.Verification }
     * 
     */
    public EquifaxCreditDetailResult.Credit.Verification createEquifaxCreditDetailResultCreditVerification() {
        return new EquifaxCreditDetailResult.Credit.Verification();
    }

    /**
     * Create an instance of {@link BillingDetail.Adjustment }
     * 
     */
    public BillingDetail.Adjustment createBillingDetailAdjustment() {
        return new BillingDetail.Adjustment();
    }

    /**
     * Create an instance of {@link LedgerFilter }
     * 
     */
    public LedgerFilter createLedgerFilter() {
        return new LedgerFilter();
    }

    /**
     * Create an instance of {@link com.charter.enterprise.billing.csg.accounts.Identification }
     * 
     */
    public com.charter.enterprise.billing.csg.accounts.Identification createIdentification() {
        return new com.charter.enterprise.billing.csg.accounts.Identification();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Identification }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Identification createEquifaxCreditDetailResultCustomerListCustomerUncollectedAccountIdentification() {
        return new EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Identification();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.UnreturnedEquipment }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.UnreturnedEquipment createEquifaxCreditDetailResultCustomerListCustomerUncollectedAccountUnreturnedEquipment() {
        return new EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.UnreturnedEquipment();
    }

    /**
     * Create an instance of {@link PaymentDetail }
     * 
     */
    public PaymentDetail createPaymentDetail() {
        return new PaymentDetail();
    }

    /**
     * Create an instance of {@link BillingDetail.Payment }
     * 
     */
    public BillingDetail.Payment createBillingDetailPayment() {
        return new BillingDetail.Payment();
    }

    /**
     * Create an instance of {@link CodeDescription }
     * 
     */
    public CodeDescription createCodeDescription() {
        return new CodeDescription();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList.Customer.Identification }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList.Customer.Identification createEquifaxCreditDetailResultCustomerListCustomerIdentification() {
        return new EquifaxCreditDetailResult.CustomerList.Customer.Identification();
    }

    /**
     * Create an instance of {@link ServicePriceUpdateResult }
     * 
     */
    public ServicePriceUpdateResult createServicePriceUpdateResult() {
        return new ServicePriceUpdateResult();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.Contact.Warning }
     * 
     */
    public EquifaxCreditDetailResult.Credit.Contact.Warning createEquifaxCreditDetailResultCreditContactWarning() {
        return new EquifaxCreditDetailResult.Credit.Contact.Warning();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.Warning }
     * 
     */
    public EquifaxCreditDetailResult.Credit.Warning createEquifaxCreditDetailResultCreditWarning() {
        return new EquifaxCreditDetailResult.Credit.Warning();
    }

    /**
     * Create an instance of {@link AccountCriteria.CustomerAddress }
     * 
     */
    public AccountCriteria.CustomerAddress createAccountCriteriaCustomerAddress() {
        return new AccountCriteria.CustomerAddress();
    }

    /**
     * Create an instance of {@link BillingDetail.Miscellaneous }
     * 
     */
    public BillingDetail.Miscellaneous createBillingDetailMiscellaneous() {
        return new BillingDetail.Miscellaneous();
    }

    /**
     * Create an instance of {@link GetAccountsResponse }
     * 
     */
    public GetAccountsResponse createGetAccountsResponse() {
        return new GetAccountsResponse();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Balance }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Balance createEquifaxCreditDetailResultCustomerListCustomerUncollectedAccountBalance() {
        return new EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Balance();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList.Customer }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList.Customer createEquifaxCreditDetailResultCustomerListCustomer() {
        return new EquifaxCreditDetailResult.CustomerList.Customer();
    }

    /**
     * Create an instance of {@link GetCPNIVerificationResponse }
     * 
     */
    public GetCPNIVerificationResponse createGetCPNIVerificationResponse() {
        return new GetCPNIVerificationResponse();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link ServicePriceServices }
     * 
     */
    public ServicePriceServices createServicePriceServices() {
        return new ServicePriceServices();
    }

    /**
     * Create an instance of {@link com.charter.enterprise.billing.csg.accounts.Billing }
     * 
     */
    public com.charter.enterprise.billing.csg.accounts.Billing createBilling() {
        return new com.charter.enterprise.billing.csg.accounts.Billing();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList.Customer.Previous }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList.Customer.Previous createEquifaxCreditDetailResultCustomerListCustomerPrevious() {
        return new EquifaxCreditDetailResult.CustomerList.Customer.Previous();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.Contact }
     * 
     */
    public EquifaxCreditDetailResult.Credit.Contact createEquifaxCreditDetailResultCreditContact() {
        return new EquifaxCreditDetailResult.Credit.Contact();
    }

    /**
     * Create an instance of {@link BillingDetail.Payment.EFT }
     * 
     */
    public BillingDetail.Payment.EFT createBillingDetailPaymentEFT() {
        return new BillingDetail.Payment.EFT();
    }

    /**
     * Create an instance of {@link Account.ResponsibleParty }
     * 
     */
    public Account.ResponsibleParty createAccountResponsibleParty() {
        return new Account.ResponsibleParty();
    }

    /**
     * Create an instance of {@link Prorate }
     * 
     */
    public Prorate createProrate() {
        return new Prorate();
    }

    /**
     * Create an instance of {@link GetFutureStatementsResponse.Statement.Ledger.Detail.Item }
     * 
     */
    public GetFutureStatementsResponse.Statement.Ledger.Detail.Item createGetFutureStatementsResponseStatementLedgerDetailItem() {
        return new GetFutureStatementsResponse.Statement.Ledger.Detail.Item();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.CustomerList }
     * 
     */
    public EquifaxCreditDetailResult.CustomerList createEquifaxCreditDetailResultCustomerList() {
        return new EquifaxCreditDetailResult.CustomerList();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit }
     * 
     */
    public EquifaxCreditDetailResult.Credit createEquifaxCreditDetailResultCredit() {
        return new EquifaxCreditDetailResult.Credit();
    }

    /**
     * Create an instance of {@link GetEquifaxCreditDetailRequest }
     * 
     */
    public GetEquifaxCreditDetailRequest createGetEquifaxCreditDetailRequest() {
        return new GetEquifaxCreditDetailRequest();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult }
     * 
     */
    public EquifaxCreditDetailResult createEquifaxCreditDetailResult() {
        return new EquifaxCreditDetailResult();
    }

    /**
     * Create an instance of {@link AccountCriteria }
     * 
     */
    public AccountCriteria createAccountCriteria() {
        return new AccountCriteria();
    }

    /**
     * Create an instance of {@link GetFutureStatementsResponse.Statement.Summary.PendingTotal }
     * 
     */
    public GetFutureStatementsResponse.Statement.Summary.PendingTotal createGetFutureStatementsResponseStatementSummaryPendingTotal() {
        return new GetFutureStatementsResponse.Statement.Summary.PendingTotal();
    }

    /**
     * Create an instance of {@link GetAccountLedgersRequest }
     * 
     */
    public GetAccountLedgersRequest createGetAccountLedgersRequest() {
        return new GetAccountLedgersRequest();
    }

    /**
     * Create an instance of {@link PaymentDetail.EFT }
     * 
     */
    public PaymentDetail.EFT createPaymentDetailEFT() {
        return new PaymentDetail.EFT();
    }

    /**
     * Create an instance of {@link CustomField }
     * 
     */
    public CustomField createCustomField() {
        return new CustomField();
    }

    /**
     * Create an instance of {@link ServicePriceUpdateRequest }
     * 
     */
    public ServicePriceUpdateRequest createServicePriceUpdateRequest() {
        return new ServicePriceUpdateRequest();
    }

    /**
     * Create an instance of {@link Verify }
     * 
     */
    public Verify createVerify() {
        return new Verify();
    }

    /**
     * Create an instance of {@link ScoreProduct }
     * 
     */
    public ScoreProduct createScoreProduct() {
        return new ScoreProduct();
    }

    /**
     * Create an instance of {@link GetFutureStatementsResponse.Statement.Summary }
     * 
     */
    public GetFutureStatementsResponse.Statement.Summary createGetFutureStatementsResponseStatementSummary() {
        return new GetFutureStatementsResponse.Statement.Summary();
    }

    /**
     * Create an instance of {@link Account.Remittance }
     * 
     */
    public Account.Remittance createAccountRemittance() {
        return new Account.Remittance();
    }

    /**
     * Create an instance of {@link OfferDisplay.Display }
     * 
     */
    public OfferDisplay.Display createOfferDisplayDisplay() {
        return new OfferDisplay.Display();
    }

    /**
     * Create an instance of {@link ServicesResult }
     * 
     */
    public ServicesResult createServicesResult() {
        return new ServicesResult();
    }

    /**
     * Create an instance of {@link ResultExceptionInfo }
     * 
     */
    public ResultExceptionInfo createResultExceptionInfo() {
        return new ResultExceptionInfo();
    }

    /**
     * Create an instance of {@link GetFutureStatementsResponse.Statement.Ledger }
     * 
     */
    public GetFutureStatementsResponse.Statement.Ledger createGetFutureStatementsResponseStatementLedger() {
        return new GetFutureStatementsResponse.Statement.Ledger();
    }

    /**
     * Create an instance of {@link GetVerificationRequest }
     * 
     */
    public GetVerificationRequest createGetVerificationRequest() {
        return new GetVerificationRequest();
    }

    /**
     * Create an instance of {@link BillingDetail.Item.Component }
     * 
     */
    public BillingDetail.Item.Component createBillingDetailItemComponent() {
        return new BillingDetail.Item.Component();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.Inquiry }
     * 
     */
    public EquifaxCreditDetailResult.Credit.Inquiry createEquifaxCreditDetailResultCreditInquiry() {
        return new EquifaxCreditDetailResult.Credit.Inquiry();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.Contact.Phone }
     * 
     */
    public EquifaxCreditDetailResult.Credit.Contact.Phone createEquifaxCreditDetailResultCreditContactPhone() {
        return new EquifaxCreditDetailResult.Credit.Contact.Phone();
    }

    /**
     * Create an instance of {@link PaymentDetail.Restriction }
     * 
     */
    public PaymentDetail.Restriction createPaymentDetailRestriction() {
        return new PaymentDetail.Restriction();
    }

    /**
     * Create an instance of {@link BillingDetail.Billing }
     * 
     */
    public BillingDetail.Billing createBillingDetailBilling() {
        return new BillingDetail.Billing();
    }

    /**
     * Create an instance of {@link GetFutureStatementsResponse.Statement.Summary.Total }
     * 
     */
    public GetFutureStatementsResponse.Statement.Summary.Total createGetFutureStatementsResponseStatementSummaryTotal() {
        return new GetFutureStatementsResponse.Statement.Summary.Total();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.Audit }
     * 
     */
    public EquifaxCreditDetailResult.Credit.Audit createEquifaxCreditDetailResultCreditAudit() {
        return new EquifaxCreditDetailResult.Credit.Audit();
    }

    /**
     * Create an instance of {@link EquifaxCreditDetailResult.Credit.Contact.Address }
     * 
     */
    public EquifaxCreditDetailResult.Credit.Contact.Address createEquifaxCreditDetailResultCreditContactAddress() {
        return new EquifaxCreditDetailResult.Credit.Contact.Address();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharterHeaderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/billing/csg/accounts", name = "CharterHeaderInfo")
    public JAXBElement<CharterHeaderInfo> createCharterHeaderInfo(CharterHeaderInfo value) {
        return new JAXBElement<CharterHeaderInfo>(_CharterHeaderInfo_QNAME, CharterHeaderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/billing/csg/accounts", name = "LedgerDetailEndPostDate", scope = LedgerFilter.class)
    public JAXBElement<String> createLedgerFilterLedgerDetailEndPostDate(String value) {
        return new JAXBElement<String>(_LedgerFilterLedgerDetailEndPostDate_QNAME, String.class, LedgerFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/billing/csg/accounts", name = "LedgerStatementIdentifier", scope = LedgerFilter.class)
    public JAXBElement<String> createLedgerFilterLedgerStatementIdentifier(String value) {
        return new JAXBElement<String>(_LedgerFilterLedgerStatementIdentifier_QNAME, String.class, LedgerFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/billing/csg/accounts", name = "LedgerStatementYear", scope = LedgerFilter.class)
    public JAXBElement<Integer> createLedgerFilterLedgerStatementYear(Integer value) {
        return new JAXBElement<Integer>(_LedgerFilterLedgerStatementYear_QNAME, Integer.class, LedgerFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/billing/csg/accounts", name = "LedgerStatementDate", scope = LedgerFilter.class)
    public JAXBElement<String> createLedgerFilterLedgerStatementDate(String value) {
        return new JAXBElement<String>(_LedgerFilterLedgerStatementDate_QNAME, String.class, LedgerFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/billing/csg/accounts", name = "LedgerStatementMonth", scope = LedgerFilter.class)
    public JAXBElement<Integer> createLedgerFilterLedgerStatementMonth(Integer value) {
        return new JAXBElement<Integer>(_LedgerFilterLedgerStatementMonth_QNAME, Integer.class, LedgerFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/billing/csg/accounts", name = "LedgerDetailIdentifier", scope = LedgerFilter.class)
    public JAXBElement<BigInteger> createLedgerFilterLedgerDetailIdentifier(BigInteger value) {
        return new JAXBElement<BigInteger>(_LedgerFilterLedgerDetailIdentifier_QNAME, BigInteger.class, LedgerFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://charter.com/enterprise/billing/csg/accounts", name = "LedgerDetailBeginPostDate", scope = LedgerFilter.class)
    public JAXBElement<String> createLedgerFilterLedgerDetailBeginPostDate(String value) {
        return new JAXBElement<String>(_LedgerFilterLedgerDetailBeginPostDate_QNAME, String.class, LedgerFilter.class, value);
    }

}
