
package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Request body for creating in multi pull funds transfer
 */@ApiModel(description = "Request body for creating in multi pull funds transfer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class MultiPullFundsPostPayload {

  
  @JsonProperty("businessApplicationId")
  private String businessApplicationId = null;
  
  
  @JsonProperty("sourceOfFunds")
  private String sourceOfFunds = null;
  
  
  @JsonProperty("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;
  
  
  @JsonProperty("cardAcceptor")
  private CardAcceptor cardAcceptor = null;
  
  
  @JsonProperty("senderAddress")
  private String senderAddress = null;
  
  
  @JsonProperty("senderMiddleInitial")
  private String senderMiddleInitial = null;
  
  
  @JsonProperty("recipientState")
  private String recipientState = null;
  
  
  @JsonProperty("surcharge")
  private String surcharge = null;
  
  
  @JsonProperty("senderStateCode")
  private String senderStateCode = null;
  
  
  @JsonProperty("merchantCategoryCode")
  private Integer merchantCategoryCode = null;
  
  
  @JsonProperty("senderLastName")
  private String senderLastName = null;
  
  
  @JsonProperty("merchantVerificationValue")
  private MerchantVerificationValue merchantVerificationValue = null;
  
  
  @JsonProperty("sharingGroupCode")
  private String sharingGroupCode = null;
  
  
  @JsonProperty("acquirerCountryCode")
  private Integer acquirerCountryCode = null;
  
  
  @JsonProperty("amount")
  private BigDecimal amount = null;
  
  
  @JsonProperty("memberComments")
  private String memberComments = null;
  
  
  @JsonProperty("recipientLastName")
  private String recipientLastName = null;
  
  
  @JsonProperty("nationalReimbursementFee")
  private BigDecimal nationalReimbursementFee = null;
  
  
  @JsonProperty("cardCvv2Value")
  private String cardCvv2Value = null;
  
  
  @JsonProperty("cavv")
  private String cavv = null;
  
  
  @JsonProperty("senderPostalCode")
  private String senderPostalCode = null;
  
  
  @JsonProperty("pinData")
  private PinData pinData = null;
  
  
  @JsonProperty("senderFirstName")
  private String senderFirstName = null;
  
  
  @JsonProperty("senderCity")
  private String senderCity = null;
  
  
  @JsonProperty("feeProgramIndicator")
  private String feeProgramIndicator = null;
  
  
  @JsonProperty("addressVerificationData")
  private AddressVerificationData addressVerificationData = null;
  
  
  @JsonProperty("senderAccountNumber")
  private String senderAccountNumber = null;
  
  
  @JsonProperty("magneticStripeData")
  private MagneticStripeData magneticStripeData = null;
  
  
  @JsonProperty("acquiringBin")
  private Integer acquiringBin = null;
  
  
  @JsonProperty("cpsAuthorizationCharacteristicsIndicator")
  private String cpsAuthorizationCharacteristicsIndicator = null;
  
  
  @JsonProperty("merchantPseudoAbaNumber")
  private String merchantPseudoAbaNumber = null;
  
  
  @JsonProperty("foreignExchangeFeeTransaction")
  private BigDecimal foreignExchangeFeeTransaction = null;
  
  
  @JsonProperty("pointOfServiceData")
  private PointOfServiceData pointOfServiceData = null;
  
  
  @JsonProperty("senderPrimaryAccountNumber")
  private String senderPrimaryAccountNumber = null;
  
  
  @JsonProperty("localTransactionDateTime")
  private String localTransactionDateTime = null;
  
  
  @JsonProperty("recipientFirstName")
  private String recipientFirstName = null;
  
  
  @JsonProperty("senderCardExpiryDate")
  private String senderCardExpiryDate = null;
  
  
  @JsonProperty("recipientMiddleInitial")
  private String recipientMiddleInitial = null;
  
  
  @JsonProperty("recipientCountryCode")
  private String recipientCountryCode = null;
  
  
  @JsonProperty("systemsTraceAuditNumber")
  private Integer systemsTraceAuditNumber = null;
  
  
  @JsonProperty("senderCountryCode")
  private String senderCountryCode = null;
  
  
  @JsonProperty("senderCurrencyCode")
  private String senderCurrencyCode = null;
  
  
  @JsonProperty("pointOfServiceCapability")
  private PointOfServiceCapability pointOfServiceCapability = null;
  
  public MultiPullFundsPostPayload businessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
    return this;
  }

  
  /**
  * Identifies the programs&#x27; business application type for VisaNet transaction processing&lt;br&gt;&lt;br&gt;For Money Transfer, AA applies to transactions where the sender and recipient are the same person and PP applies to transactions where the sender and recipient are not the same person.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#business_application_identifier\&quot;&gt;businessApplicationId&lt;/a&gt; codes
  * @return businessApplicationId
  **/
  @ApiModelProperty(required = true, value = "Identifies the programs' business application type for VisaNet transaction processing<br><br>For Money Transfer, AA applies to transactions where the sender and recipient are the same person and PP applies to transactions where the sender and recipient are not the same person.<br><br>Refer to <a href=\"/request_response_codes#business_application_identifier\">businessApplicationId</a> codes")
  public String getBusinessApplicationId() {
    return businessApplicationId;
  }
  public void setBusinessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
  }
  
  public MultiPullFundsPostPayload sourceOfFunds(String sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

  
  /**
  * when present, this field contain a valid &lt;a href&#x3D;\&quot;/request_response_codes#sourceOfFundsCode\&quot;&gt;sourceOfFundsCode&lt;/a&gt; code that matches the funding instrument. &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#sourceOfFundsCode\&quot;&gt;sourceOfFundsCode&lt;/a&gt; codes
  * @return sourceOfFunds
  **/
  @ApiModelProperty(value = "when present, this field contain a valid <a href=\"/request_response_codes#sourceOfFundsCode\">sourceOfFundsCode</a> code that matches the funding instrument. <br><br>Refer to <a href=\"/request_response_codes#sourceOfFundsCode\">sourceOfFundsCode</a> codes")
  public String getSourceOfFunds() {
    return sourceOfFunds;
  }
  public void setSourceOfFunds(String sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }
  
  public MultiPullFundsPostPayload retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

  
  /**
  * A value used to tie together service calls related to a single financial transaction. When passing Account Funding Transaction (AFT) and Original Credit Transaction (OCT) methods, this value must differ between the two methods. When passing the Account Funding Transaction Reversal (AFTR) method, this value must match the  retrievalReferenceNumber previously passed with the AFT method for this transaction.&lt;br&gt;&lt;br&gt;Recommended Format: ydddhhnnnnnn&lt;br&gt;&lt;br&gt;The first fours digits must be a valid yddd date in the Julian date format, where the first digit &#x3D; 0-9 (last digit of current year) and the next three digits &#x3D; 001-366 (number of the day in the year).&lt;br&gt;&lt;br&gt;hh can be the two digit hour in a 24 hour clock (00-23) during which the transaction is performed.&lt;br&gt;&lt;br&gt;nnnnnn can be the systemsTraceAuditNumber or any 6 digit number.
  * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(required = true, value = "A value used to tie together service calls related to a single financial transaction. When passing Account Funding Transaction (AFT) and Original Credit Transaction (OCT) methods, this value must differ between the two methods. When passing the Account Funding Transaction Reversal (AFTR) method, this value must match the  retrievalReferenceNumber previously passed with the AFT method for this transaction.<br><br>Recommended Format: ydddhhnnnnnn<br><br>The first fours digits must be a valid yddd date in the Julian date format, where the first digit = 0-9 (last digit of current year) and the next three digits = 001-366 (number of the day in the year).<br><br>hh can be the two digit hour in a 24 hour clock (00-23) during which the transaction is performed.<br><br>nnnnnn can be the systemsTraceAuditNumber or any 6 digit number.")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }
  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }
  
  public MultiPullFundsPostPayload cardAcceptor(CardAcceptor cardAcceptor) {
    this.cardAcceptor = cardAcceptor;
    return this;
  }

  
  /**
  * Get cardAcceptor
  * @return cardAcceptor
  **/
  @ApiModelProperty(required = true, value = "")
  public CardAcceptor getCardAcceptor() {
    return cardAcceptor;
  }
  public void setCardAcceptor(CardAcceptor cardAcceptor) {
    this.cardAcceptor = cardAcceptor;
  }
  
  public MultiPullFundsPostPayload senderAddress(String senderAddress) {
    this.senderAddress = senderAddress;
    return this;
  }

  
  /**
  * When present, this field contains sender&#x27;s Address
  * @return senderAddress
  **/
  @ApiModelProperty(value = "When present, this field contains sender's Address")
  public String getSenderAddress() {
    return senderAddress;
  }
  public void setSenderAddress(String senderAddress) {
    this.senderAddress = senderAddress;
  }
  
  public MultiPullFundsPostPayload senderMiddleInitial(String senderMiddleInitial) {
    this.senderMiddleInitial = senderMiddleInitial;
    return this;
  }

  
  /**
  * This field contains sender&#x27;s middle initial
  * @return senderMiddleInitial
  **/
  @ApiModelProperty(value = "This field contains sender's middle initial")
  public String getSenderMiddleInitial() {
    return senderMiddleInitial;
  }
  public void setSenderMiddleInitial(String senderMiddleInitial) {
    this.senderMiddleInitial = senderMiddleInitial;
  }
  
  public MultiPullFundsPostPayload recipientState(String recipientState) {
    this.recipientState = recipientState;
    return this;
  }

  
  /**
  * Required if RecipientCountryCode is either 124(CAN) or 840(USA)
  * @return recipientState
  **/
  @ApiModelProperty(value = "Required if RecipientCountryCode is either 124(CAN) or 840(USA)")
  public String getRecipientState() {
    return recipientState;
  }
  public void setRecipientState(String recipientState) {
    this.recipientState = recipientState;
  }
  
  public MultiPullFundsPostPayload surcharge(String surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  
  /**
  * When present, this field contains the sender&#x27;s surcharge as assessed by the originator. Values in this field must be in the same currency and format as defined in the amount field.
  * @return surcharge
  **/
  @ApiModelProperty(value = "When present, this field contains the sender's surcharge as assessed by the originator. Values in this field must be in the same currency and format as defined in the amount field.")
  public String getSurcharge() {
    return surcharge;
  }
  public void setSurcharge(String surcharge) {
    this.surcharge = surcharge;
  }
  
  public MultiPullFundsPostPayload senderStateCode(String senderStateCode) {
    this.senderStateCode = senderStateCode;
    return this;
  }

  
  /**
  * When present, this field contains sender&#x27;s state code
  * @return senderStateCode
  **/
  @ApiModelProperty(value = "When present, this field contains sender's state code")
  public String getSenderStateCode() {
    return senderStateCode;
  }
  public void setSenderStateCode(String senderStateCode) {
    this.senderStateCode = senderStateCode;
  }
  
  public MultiPullFundsPostPayload merchantCategoryCode(Integer merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt; If provided, then the value overrides the one present in onboarding data. If the merchantCategoryCode value is not populated in onboarding data then this field is mandatory.&lt;br&gt;&lt;br&gt;If not provided, then the value will default to the values provided during onboarding (when the services are provisioned).
  * @return merchantCategoryCode
  **/
  @ApiModelProperty(value = "<b>Note:</b> If provided, then the value overrides the one present in onboarding data. If the merchantCategoryCode value is not populated in onboarding data then this field is mandatory.<br><br>If not provided, then the value will default to the values provided during onboarding (when the services are provisioned).")
  public Integer getMerchantCategoryCode() {
    return merchantCategoryCode;
  }
  public void setMerchantCategoryCode(Integer merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }
  
  public MultiPullFundsPostPayload senderLastName(String senderLastName) {
    this.senderLastName = senderLastName;
    return this;
  }

  
  /**
  * This field contains sender&#x27;s last name
  * @return senderLastName
  **/
  @ApiModelProperty(value = "This field contains sender's last name")
  public String getSenderLastName() {
    return senderLastName;
  }
  public void setSenderLastName(String senderLastName) {
    this.senderLastName = senderLastName;
  }
  
  public MultiPullFundsPostPayload merchantVerificationValue(MerchantVerificationValue merchantVerificationValue) {
    this.merchantVerificationValue = merchantVerificationValue;
    return this;
  }

  
  /**
  * Get merchantVerificationValue
  * @return merchantVerificationValue
  **/
  @ApiModelProperty(value = "")
  public MerchantVerificationValue getMerchantVerificationValue() {
    return merchantVerificationValue;
  }
  public void setMerchantVerificationValue(MerchantVerificationValue merchantVerificationValue) {
    this.merchantVerificationValue = merchantVerificationValue;
  }
  
  public MultiPullFundsPostPayload sharingGroupCode(String sharingGroupCode) {
    this.sharingGroupCode = sharingGroupCode;
    return this;
  }

  
  /**
  * This field is optionally used by Push Payments Gateway participants (merchants and acquirers) to specify the network access priority.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#network_id_and_sharing_group_code\&quot;&gt;Sharing Group Code&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt;&lt;br&gt;Supported only in US for domestic transactions involving Push Payments Gateway Service.
  * @return sharingGroupCode
  **/
  @ApiModelProperty(value = "This field is optionally used by Push Payments Gateway participants (merchants and acquirers) to specify the network access priority.<br><br>Refer to <a href=\"/request_response_codes#network_id_and_sharing_group_code\">Sharing Group Code</a><br><br><b>Note:</b><br>Supported only in US for domestic transactions involving Push Payments Gateway Service.")
  public String getSharingGroupCode() {
    return sharingGroupCode;
  }
  public void setSharingGroupCode(String sharingGroupCode) {
    this.sharingGroupCode = sharingGroupCode;
  }
  
  public MultiPullFundsPostPayload acquirerCountryCode(Integer acquirerCountryCode) {
    this.acquirerCountryCode = acquirerCountryCode;
    return this;
  }

  
  /**
  * Use a 3-digit numeric country code for the country of the BIN under which your Visa Direct solution is registered. This must match the information provided during program enrollment.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_and_currency_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return acquirerCountryCode
  **/
  @ApiModelProperty(required = true, value = "Use a 3-digit numeric country code for the country of the BIN under which your Visa Direct solution is registered. This must match the information provided during program enrollment.<br><br>Refer to <a href=\"/request_response_codes#iso_country_and_currency_codes\">ISO Codes</a>")
  public Integer getAcquirerCountryCode() {
    return acquirerCountryCode;
  }
  public void setAcquirerCountryCode(Integer acquirerCountryCode) {
    this.acquirerCountryCode = acquirerCountryCode;
  }
  
  public MultiPullFundsPostPayload amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  /**
  * The amount of the transaction, inclusive of all fees you assess for the transaction, including currency conversion fees. If the originator is populating the surcharge or foreignExchangeFeeTransaction field, they must be included in the amount field.
  * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transaction, inclusive of all fees you assess for the transaction, including currency conversion fees. If the originator is populating the surcharge or foreignExchangeFeeTransaction field, they must be included in the amount field.")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
  
  public MultiPullFundsPostPayload memberComments(String memberComments) {
    this.memberComments = memberComments;
    return this;
  }

  
  /**
  * This field can be optionally used to send and receive comments by service providers. Issuers can optionally include new text in this field in the response. If the issuer does not include this field, Visa will inject the value from the request in the response and send it back to the service provider.
  * @return memberComments
  **/
  @ApiModelProperty(value = "This field can be optionally used to send and receive comments by service providers. Issuers can optionally include new text in this field in the response. If the issuer does not include this field, Visa will inject the value from the request in the response and send it back to the service provider.")
  public String getMemberComments() {
    return memberComments;
  }
  public void setMemberComments(String memberComments) {
    this.memberComments = memberComments;
  }
  
  public MultiPullFundsPostPayload recipientLastName(String recipientLastName) {
    this.recipientLastName = recipientLastName;
    return this;
  }

  
  /**
  * When present, this field contains recipient&#x27;s last name
  * @return recipientLastName
  **/
  @ApiModelProperty(value = "When present, this field contains recipient's last name")
  public String getRecipientLastName() {
    return recipientLastName;
  }
  public void setRecipientLastName(String recipientLastName) {
    this.recipientLastName = recipientLastName;
  }
  
  public MultiPullFundsPostPayload nationalReimbursementFee(BigDecimal nationalReimbursementFee) {
    this.nationalReimbursementFee = nationalReimbursementFee;
    return this;
  }

  
  /**
  * When present, this field contains the IRF fees.
  * @return nationalReimbursementFee
  **/
  @ApiModelProperty(value = "When present, this field contains the IRF fees.")
  public BigDecimal getNationalReimbursementFee() {
    return nationalReimbursementFee;
  }
  public void setNationalReimbursementFee(BigDecimal nationalReimbursementFee) {
    this.nationalReimbursementFee = nationalReimbursementFee;
  }
  
  public MultiPullFundsPostPayload cardCvv2Value(String cardCvv2Value) {
    this.cardCvv2Value = cardCvv2Value;
    return this;
  }

  
  /**
  * The cardCvv2Value provided by the account holder for the senderPrimaryAccountNumber in the request.
  * @return cardCvv2Value
  **/
  @ApiModelProperty(value = "The cardCvv2Value provided by the account holder for the senderPrimaryAccountNumber in the request.")
  public String getCardCvv2Value() {
    return cardCvv2Value;
  }
  public void setCardCvv2Value(String cardCvv2Value) {
    this.cardCvv2Value = cardCvv2Value;
  }
  
  public MultiPullFundsPostPayload cavv(String cavv) {
    this.cavv = cavv;
    return this;
  }

  
  /**
  * The Cardholder Authentication Verification Value (CAVV) is a value generated by an Access Control Server (ACS) and signed by the Issuer using account and password information of cardholders registered for the Verified by Visa program.  This field should be in hexabinary format.
  * @return cavv
  **/
  @ApiModelProperty(value = "The Cardholder Authentication Verification Value (CAVV) is a value generated by an Access Control Server (ACS) and signed by the Issuer using account and password information of cardholders registered for the Verified by Visa program.  This field should be in hexabinary format.")
  public String getCavv() {
    return cavv;
  }
  public void setCavv(String cavv) {
    this.cavv = cavv;
  }
  
  public MultiPullFundsPostPayload senderPostalCode(String senderPostalCode) {
    this.senderPostalCode = senderPostalCode;
    return this;
  }

  
  /**
  * When present, this field contains the sender&#x27;s postal code
  * @return senderPostalCode
  **/
  @ApiModelProperty(value = "When present, this field contains the sender's postal code")
  public String getSenderPostalCode() {
    return senderPostalCode;
  }
  public void setSenderPostalCode(String senderPostalCode) {
    this.senderPostalCode = senderPostalCode;
  }
  
  public MultiPullFundsPostPayload pinData(PinData pinData) {
    this.pinData = pinData;
    return this;
  }

  
  /**
  * Get pinData
  * @return pinData
  **/
  @ApiModelProperty(value = "")
  public PinData getPinData() {
    return pinData;
  }
  public void setPinData(PinData pinData) {
    this.pinData = pinData;
  }
  
  public MultiPullFundsPostPayload senderFirstName(String senderFirstName) {
    this.senderFirstName = senderFirstName;
    return this;
  }

  
  /**
  * This field contains sender&#x27;s first name
  * @return senderFirstName
  **/
  @ApiModelProperty(value = "This field contains sender's first name")
  public String getSenderFirstName() {
    return senderFirstName;
  }
  public void setSenderFirstName(String senderFirstName) {
    this.senderFirstName = senderFirstName;
  }
  
  public MultiPullFundsPostPayload senderCity(String senderCity) {
    this.senderCity = senderCity;
    return this;
  }

  
  /**
  * When present, this field contains sender&#x27;s city
  * @return senderCity
  **/
  @ApiModelProperty(value = "When present, this field contains sender's city")
  public String getSenderCity() {
    return senderCity;
  }
  public void setSenderCity(String senderCity) {
    this.senderCity = senderCity;
  }
  
  public MultiPullFundsPostPayload feeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
    return this;
  }

  
  /**
  * If present, a valid value is required. Spaces or special characters are not allowed.
  * @return feeProgramIndicator
  **/
  @ApiModelProperty(value = "If present, a valid value is required. Spaces or special characters are not allowed.")
  public String getFeeProgramIndicator() {
    return feeProgramIndicator;
  }
  public void setFeeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
  }
  
  public MultiPullFundsPostPayload addressVerificationData(AddressVerificationData addressVerificationData) {
    this.addressVerificationData = addressVerificationData;
    return this;
  }

  
  /**
  * Get addressVerificationData
  * @return addressVerificationData
  **/
  @ApiModelProperty(value = "")
  public AddressVerificationData getAddressVerificationData() {
    return addressVerificationData;
  }
  public void setAddressVerificationData(AddressVerificationData addressVerificationData) {
    this.addressVerificationData = addressVerificationData;
  }
  
  public MultiPullFundsPostPayload senderAccountNumber(String senderAccountNumber) {
    this.senderAccountNumber = senderAccountNumber;
    return this;
  }

  
  /**
  * When present, this field contains the sender&#x27;s account number
  * @return senderAccountNumber
  **/
  @ApiModelProperty(value = "When present, this field contains the sender's account number")
  public String getSenderAccountNumber() {
    return senderAccountNumber;
  }
  public void setSenderAccountNumber(String senderAccountNumber) {
    this.senderAccountNumber = senderAccountNumber;
  }
  
  public MultiPullFundsPostPayload magneticStripeData(MagneticStripeData magneticStripeData) {
    this.magneticStripeData = magneticStripeData;
    return this;
  }

  
  /**
  * Get magneticStripeData
  * @return magneticStripeData
  **/
  @ApiModelProperty(value = "")
  public MagneticStripeData getMagneticStripeData() {
    return magneticStripeData;
  }
  public void setMagneticStripeData(MagneticStripeData magneticStripeData) {
    this.magneticStripeData = magneticStripeData;
  }
  
  public MultiPullFundsPostPayload acquiringBin(Integer acquiringBin) {
    this.acquiringBin = acquiringBin;
    return this;
  }

  
  /**
  * The Bank Identification Number (BIN) under which your Visa Direct is registered. This must match the information provided during enrollment.
  * @return acquiringBin
  **/
  @ApiModelProperty(required = true, value = "The Bank Identification Number (BIN) under which your Visa Direct is registered. This must match the information provided during enrollment.")
  public Integer getAcquiringBin() {
    return acquiringBin;
  }
  public void setAcquiringBin(Integer acquiringBin) {
    this.acquiringBin = acquiringBin;
  }
  
  public MultiPullFundsPostPayload cpsAuthorizationCharacteristicsIndicator(String cpsAuthorizationCharacteristicsIndicator) {
    this.cpsAuthorizationCharacteristicsIndicator = cpsAuthorizationCharacteristicsIndicator;
    return this;
  }

  
  /**
  * Request for CPS authorization. If present, a valid value is required. Spaces or special characters are not allowed.
  * @return cpsAuthorizationCharacteristicsIndicator
  **/
  @ApiModelProperty(value = "Request for CPS authorization. If present, a valid value is required. Spaces or special characters are not allowed.")
  public String getCpsAuthorizationCharacteristicsIndicator() {
    return cpsAuthorizationCharacteristicsIndicator;
  }
  public void setCpsAuthorizationCharacteristicsIndicator(String cpsAuthorizationCharacteristicsIndicator) {
    this.cpsAuthorizationCharacteristicsIndicator = cpsAuthorizationCharacteristicsIndicator;
  }
  
  public MultiPullFundsPostPayload merchantPseudoAbaNumber(String merchantPseudoAbaNumber) {
    this.merchantPseudoAbaNumber = merchantPseudoAbaNumber;
    return this;
  }

  
  /**
  * This is a number that uniquely identifies the originator when they sign up to send Push Payment Gateway transactions. On enrollment, an originator will get a single pseudo-value that is assigned by Visa. The other networks will assign their own unique values for the originator.&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt;&lt;br&gt;Supported only in US for domestic transactions involving Push Payments Gateway Service.
  * @return merchantPseudoAbaNumber
  **/
  @ApiModelProperty(value = "This is a number that uniquely identifies the originator when they sign up to send Push Payment Gateway transactions. On enrollment, an originator will get a single pseudo-value that is assigned by Visa. The other networks will assign their own unique values for the originator.<br><br><b>Note:</b><br>Supported only in US for domestic transactions involving Push Payments Gateway Service.")
  public String getMerchantPseudoAbaNumber() {
    return merchantPseudoAbaNumber;
  }
  public void setMerchantPseudoAbaNumber(String merchantPseudoAbaNumber) {
    this.merchantPseudoAbaNumber = merchantPseudoAbaNumber;
  }
  
  public MultiPullFundsPostPayload foreignExchangeFeeTransaction(BigDecimal foreignExchangeFeeTransaction) {
    this.foreignExchangeFeeTransaction = foreignExchangeFeeTransaction;
    return this;
  }

  
  /**
  * When present, this field contains the sender&#x27;s foreign exchange markup fee (markup above the wholesale or VisaNet exchange rate as assessed by the originator). Values in this field must be in the same currency and format as defined in the amount field.
  * @return foreignExchangeFeeTransaction
  **/
  @ApiModelProperty(value = "When present, this field contains the sender's foreign exchange markup fee (markup above the wholesale or VisaNet exchange rate as assessed by the originator). Values in this field must be in the same currency and format as defined in the amount field.")
  public BigDecimal getForeignExchangeFeeTransaction() {
    return foreignExchangeFeeTransaction;
  }
  public void setForeignExchangeFeeTransaction(BigDecimal foreignExchangeFeeTransaction) {
    this.foreignExchangeFeeTransaction = foreignExchangeFeeTransaction;
  }
  
  public MultiPullFundsPostPayload pointOfServiceData(PointOfServiceData pointOfServiceData) {
    this.pointOfServiceData = pointOfServiceData;
    return this;
  }

  
  /**
  * Get pointOfServiceData
  * @return pointOfServiceData
  **/
  @ApiModelProperty(value = "")
  public PointOfServiceData getPointOfServiceData() {
    return pointOfServiceData;
  }
  public void setPointOfServiceData(PointOfServiceData pointOfServiceData) {
    this.pointOfServiceData = pointOfServiceData;
  }
  
  public MultiPullFundsPostPayload senderPrimaryAccountNumber(String senderPrimaryAccountNumber) {
    this.senderPrimaryAccountNumber = senderPrimaryAccountNumber;
    return this;
  }

  
  /**
  * The primary account number of the sender&#x27;s account.
  * @return senderPrimaryAccountNumber
  **/
  @ApiModelProperty(required = true, value = "The primary account number of the sender's account.")
  public String getSenderPrimaryAccountNumber() {
    return senderPrimaryAccountNumber;
  }
  public void setSenderPrimaryAccountNumber(String senderPrimaryAccountNumber) {
    this.senderPrimaryAccountNumber = senderPrimaryAccountNumber;
  }
  
  public MultiPullFundsPostPayload localTransactionDateTime(String localTransactionDateTime) {
    this.localTransactionDateTime = localTransactionDateTime;
    return this;
  }

  
  /**
  * Get localTransactionDateTime
  * @return localTransactionDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLocalTransactionDateTime() {
    return localTransactionDateTime;
  }
  public void setLocalTransactionDateTime(String localTransactionDateTime) {
    this.localTransactionDateTime = localTransactionDateTime;
  }
  
  public MultiPullFundsPostPayload recipientFirstName(String recipientFirstName) {
    this.recipientFirstName = recipientFirstName;
    return this;
  }

  
  /**
  * When present, this field contains recipient&#x27;s first name
  * @return recipientFirstName
  **/
  @ApiModelProperty(value = "When present, this field contains recipient's first name")
  public String getRecipientFirstName() {
    return recipientFirstName;
  }
  public void setRecipientFirstName(String recipientFirstName) {
    this.recipientFirstName = recipientFirstName;
  }
  
  public MultiPullFundsPostPayload senderCardExpiryDate(String senderCardExpiryDate) {
    this.senderCardExpiryDate = senderCardExpiryDate;
    return this;
  }

  
  /**
  * The expiration date for the sender&#x27;s Visa account number in  senderPrimaryAccountNumber
  * @return senderCardExpiryDate
  **/
  @ApiModelProperty(required = true, value = "The expiration date for the sender's Visa account number in  senderPrimaryAccountNumber")
  public String getSenderCardExpiryDate() {
    return senderCardExpiryDate;
  }
  public void setSenderCardExpiryDate(String senderCardExpiryDate) {
    this.senderCardExpiryDate = senderCardExpiryDate;
  }
  
  public MultiPullFundsPostPayload recipientMiddleInitial(String recipientMiddleInitial) {
    this.recipientMiddleInitial = recipientMiddleInitial;
    return this;
  }

  
  /**
  * When present, this field contains recipient&#x27;s middle initial
  * @return recipientMiddleInitial
  **/
  @ApiModelProperty(value = "When present, this field contains recipient's middle initial")
  public String getRecipientMiddleInitial() {
    return recipientMiddleInitial;
  }
  public void setRecipientMiddleInitial(String recipientMiddleInitial) {
    this.recipientMiddleInitial = recipientMiddleInitial;
  }
  
  public MultiPullFundsPostPayload recipientCountryCode(String recipientCountryCode) {
    this.recipientCountryCode = recipientCountryCode;
    return this;
  }

  
  /**
  * when present, this field contains recipient&#x27;s country code &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return recipientCountryCode
  **/
  @ApiModelProperty(value = "when present, this field contains recipient's country code <br><br>Refer to <a href=\"/request_response_codes#iso_country_codes\">ISO Codes</a>")
  public String getRecipientCountryCode() {
    return recipientCountryCode;
  }
  public void setRecipientCountryCode(String recipientCountryCode) {
    this.recipientCountryCode = recipientCountryCode;
  }
  
  public MultiPullFundsPostPayload systemsTraceAuditNumber(Integer systemsTraceAuditNumber) {
    this.systemsTraceAuditNumber = systemsTraceAuditNumber;
    return this;
  }

  
  /**
  * A unique value should be used for each API method. However, when passing the (AFTR) method, this value must match the systemsTraceAuditNumber previously passed with the AFT method for the current transaction.
  * @return systemsTraceAuditNumber
  **/
  @ApiModelProperty(required = true, value = "A unique value should be used for each API method. However, when passing the (AFTR) method, this value must match the systemsTraceAuditNumber previously passed with the AFT method for the current transaction.")
  public Integer getSystemsTraceAuditNumber() {
    return systemsTraceAuditNumber;
  }
  public void setSystemsTraceAuditNumber(Integer systemsTraceAuditNumber) {
    this.systemsTraceAuditNumber = systemsTraceAuditNumber;
  }
  
  public MultiPullFundsPostPayload senderCountryCode(String senderCountryCode) {
    this.senderCountryCode = senderCountryCode;
    return this;
  }

  
  /**
  * when present, this field contains sender&#x27;s country code &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return senderCountryCode
  **/
  @ApiModelProperty(value = "when present, this field contains sender's country code <br><br>Refer to <a href=\"/request_response_codes#iso_country_codes\">ISO Codes</a>")
  public String getSenderCountryCode() {
    return senderCountryCode;
  }
  public void setSenderCountryCode(String senderCountryCode) {
    this.senderCountryCode = senderCountryCode;
  }
  
  public MultiPullFundsPostPayload senderCurrencyCode(String senderCurrencyCode) {
    this.senderCurrencyCode = senderCurrencyCode;
    return this;
  }

  
  /**
  * Use a 3-character alpha or numeric currency code for currency of the sender.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_and_currency_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return senderCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "Use a 3-character alpha or numeric currency code for currency of the sender.<br><br>Refer to <a href=\"/request_response_codes#iso_country_and_currency_codes\">ISO Codes</a>")
  public String getSenderCurrencyCode() {
    return senderCurrencyCode;
  }
  public void setSenderCurrencyCode(String senderCurrencyCode) {
    this.senderCurrencyCode = senderCurrencyCode;
  }
  
  public MultiPullFundsPostPayload pointOfServiceCapability(PointOfServiceCapability pointOfServiceCapability) {
    this.pointOfServiceCapability = pointOfServiceCapability;
    return this;
  }

  
  /**
  * Get pointOfServiceCapability
  * @return pointOfServiceCapability
  **/
  @ApiModelProperty(value = "")
  public PointOfServiceCapability getPointOfServiceCapability() {
    return pointOfServiceCapability;
  }
  public void setPointOfServiceCapability(PointOfServiceCapability pointOfServiceCapability) {
    this.pointOfServiceCapability = pointOfServiceCapability;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiPullFundsPostPayload multiPullFundsPostPayload = (MultiPullFundsPostPayload) o;
    return Objects.equals(this.businessApplicationId, multiPullFundsPostPayload.businessApplicationId) &&
        Objects.equals(this.sourceOfFunds, multiPullFundsPostPayload.sourceOfFunds) &&
        Objects.equals(this.retrievalReferenceNumber, multiPullFundsPostPayload.retrievalReferenceNumber) &&
        Objects.equals(this.cardAcceptor, multiPullFundsPostPayload.cardAcceptor) &&
        Objects.equals(this.senderAddress, multiPullFundsPostPayload.senderAddress) &&
        Objects.equals(this.senderMiddleInitial, multiPullFundsPostPayload.senderMiddleInitial) &&
        Objects.equals(this.recipientState, multiPullFundsPostPayload.recipientState) &&
        Objects.equals(this.surcharge, multiPullFundsPostPayload.surcharge) &&
        Objects.equals(this.senderStateCode, multiPullFundsPostPayload.senderStateCode) &&
        Objects.equals(this.merchantCategoryCode, multiPullFundsPostPayload.merchantCategoryCode) &&
        Objects.equals(this.senderLastName, multiPullFundsPostPayload.senderLastName) &&
        Objects.equals(this.merchantVerificationValue, multiPullFundsPostPayload.merchantVerificationValue) &&
        Objects.equals(this.sharingGroupCode, multiPullFundsPostPayload.sharingGroupCode) &&
        Objects.equals(this.acquirerCountryCode, multiPullFundsPostPayload.acquirerCountryCode) &&
        Objects.equals(this.amount, multiPullFundsPostPayload.amount) &&
        Objects.equals(this.memberComments, multiPullFundsPostPayload.memberComments) &&
        Objects.equals(this.recipientLastName, multiPullFundsPostPayload.recipientLastName) &&
        Objects.equals(this.nationalReimbursementFee, multiPullFundsPostPayload.nationalReimbursementFee) &&
        Objects.equals(this.cardCvv2Value, multiPullFundsPostPayload.cardCvv2Value) &&
        Objects.equals(this.cavv, multiPullFundsPostPayload.cavv) &&
        Objects.equals(this.senderPostalCode, multiPullFundsPostPayload.senderPostalCode) &&
        Objects.equals(this.pinData, multiPullFundsPostPayload.pinData) &&
        Objects.equals(this.senderFirstName, multiPullFundsPostPayload.senderFirstName) &&
        Objects.equals(this.senderCity, multiPullFundsPostPayload.senderCity) &&
        Objects.equals(this.feeProgramIndicator, multiPullFundsPostPayload.feeProgramIndicator) &&
        Objects.equals(this.addressVerificationData, multiPullFundsPostPayload.addressVerificationData) &&
        Objects.equals(this.senderAccountNumber, multiPullFundsPostPayload.senderAccountNumber) &&
        Objects.equals(this.magneticStripeData, multiPullFundsPostPayload.magneticStripeData) &&
        Objects.equals(this.acquiringBin, multiPullFundsPostPayload.acquiringBin) &&
        Objects.equals(this.cpsAuthorizationCharacteristicsIndicator, multiPullFundsPostPayload.cpsAuthorizationCharacteristicsIndicator) &&
        Objects.equals(this.merchantPseudoAbaNumber, multiPullFundsPostPayload.merchantPseudoAbaNumber) &&
        Objects.equals(this.foreignExchangeFeeTransaction, multiPullFundsPostPayload.foreignExchangeFeeTransaction) &&
        Objects.equals(this.pointOfServiceData, multiPullFundsPostPayload.pointOfServiceData) &&
        Objects.equals(this.senderPrimaryAccountNumber, multiPullFundsPostPayload.senderPrimaryAccountNumber) &&
        Objects.equals(this.localTransactionDateTime, multiPullFundsPostPayload.localTransactionDateTime) &&
        Objects.equals(this.recipientFirstName, multiPullFundsPostPayload.recipientFirstName) &&
        Objects.equals(this.senderCardExpiryDate, multiPullFundsPostPayload.senderCardExpiryDate) &&
        Objects.equals(this.recipientMiddleInitial, multiPullFundsPostPayload.recipientMiddleInitial) &&
        Objects.equals(this.recipientCountryCode, multiPullFundsPostPayload.recipientCountryCode) &&
        Objects.equals(this.systemsTraceAuditNumber, multiPullFundsPostPayload.systemsTraceAuditNumber) &&
        Objects.equals(this.senderCountryCode, multiPullFundsPostPayload.senderCountryCode) &&
        Objects.equals(this.senderCurrencyCode, multiPullFundsPostPayload.senderCurrencyCode) &&
        Objects.equals(this.pointOfServiceCapability, multiPullFundsPostPayload.pointOfServiceCapability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessApplicationId, sourceOfFunds, retrievalReferenceNumber, cardAcceptor, senderAddress, senderMiddleInitial, recipientState, surcharge, senderStateCode, merchantCategoryCode, senderLastName, merchantVerificationValue, sharingGroupCode, acquirerCountryCode, amount, memberComments, recipientLastName, nationalReimbursementFee, cardCvv2Value, cavv, senderPostalCode, pinData, senderFirstName, senderCity, feeProgramIndicator, addressVerificationData, senderAccountNumber, magneticStripeData, acquiringBin, cpsAuthorizationCharacteristicsIndicator, merchantPseudoAbaNumber, foreignExchangeFeeTransaction, pointOfServiceData, senderPrimaryAccountNumber, localTransactionDateTime, recipientFirstName, senderCardExpiryDate, recipientMiddleInitial, recipientCountryCode, systemsTraceAuditNumber, senderCountryCode, senderCurrencyCode, pointOfServiceCapability);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiPullFundsPostPayload {\n");
    
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
    sb.append("    cardAcceptor: ").append(toIndentedString(cardAcceptor)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
    sb.append("    senderMiddleInitial: ").append(toIndentedString(senderMiddleInitial)).append("\n");
    sb.append("    recipientState: ").append(toIndentedString(recipientState)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    senderStateCode: ").append(toIndentedString(senderStateCode)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    senderLastName: ").append(toIndentedString(senderLastName)).append("\n");
    sb.append("    merchantVerificationValue: ").append(toIndentedString(merchantVerificationValue)).append("\n");
    sb.append("    sharingGroupCode: ").append(toIndentedString(sharingGroupCode)).append("\n");
    sb.append("    acquirerCountryCode: ").append(toIndentedString(acquirerCountryCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    memberComments: ").append(toIndentedString(memberComments)).append("\n");
    sb.append("    recipientLastName: ").append(toIndentedString(recipientLastName)).append("\n");
    sb.append("    nationalReimbursementFee: ").append(toIndentedString(nationalReimbursementFee)).append("\n");
    sb.append("    cardCvv2Value: ").append(toIndentedString(cardCvv2Value)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    senderPostalCode: ").append(toIndentedString(senderPostalCode)).append("\n");
    sb.append("    pinData: ").append(toIndentedString(pinData)).append("\n");
    sb.append("    senderFirstName: ").append(toIndentedString(senderFirstName)).append("\n");
    sb.append("    senderCity: ").append(toIndentedString(senderCity)).append("\n");
    sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    sb.append("    addressVerificationData: ").append(toIndentedString(addressVerificationData)).append("\n");
    sb.append("    senderAccountNumber: ").append(toIndentedString(senderAccountNumber)).append("\n");
    sb.append("    magneticStripeData: ").append(toIndentedString(magneticStripeData)).append("\n");
    sb.append("    acquiringBin: ").append(toIndentedString(acquiringBin)).append("\n");
    sb.append("    cpsAuthorizationCharacteristicsIndicator: ").append(toIndentedString(cpsAuthorizationCharacteristicsIndicator)).append("\n");
    sb.append("    merchantPseudoAbaNumber: ").append(toIndentedString(merchantPseudoAbaNumber)).append("\n");
    sb.append("    foreignExchangeFeeTransaction: ").append(toIndentedString(foreignExchangeFeeTransaction)).append("\n");
    sb.append("    pointOfServiceData: ").append(toIndentedString(pointOfServiceData)).append("\n");
    sb.append("    senderPrimaryAccountNumber: ").append(toIndentedString(senderPrimaryAccountNumber)).append("\n");
    sb.append("    localTransactionDateTime: ").append(toIndentedString(localTransactionDateTime)).append("\n");
    sb.append("    recipientFirstName: ").append(toIndentedString(recipientFirstName)).append("\n");
    sb.append("    senderCardExpiryDate: ").append(toIndentedString(senderCardExpiryDate)).append("\n");
    sb.append("    recipientMiddleInitial: ").append(toIndentedString(recipientMiddleInitial)).append("\n");
    sb.append("    recipientCountryCode: ").append(toIndentedString(recipientCountryCode)).append("\n");
    sb.append("    systemsTraceAuditNumber: ").append(toIndentedString(systemsTraceAuditNumber)).append("\n");
    sb.append("    senderCountryCode: ").append(toIndentedString(senderCountryCode)).append("\n");
    sb.append("    senderCurrencyCode: ").append(toIndentedString(senderCurrencyCode)).append("\n");
    sb.append("    pointOfServiceCapability: ").append(toIndentedString(pointOfServiceCapability)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}



