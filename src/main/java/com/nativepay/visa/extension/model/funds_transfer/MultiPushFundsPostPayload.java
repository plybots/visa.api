

package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Request body for creating in multi push funds transfer
 */@ApiModel(description = "Request body for creating in multi push funds transfer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class MultiPushFundsPostPayload {

  
  @JsonProperty("businessApplicationId")
  private String businessApplicationId = null;
  
  
  @JsonProperty("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;
  
  
  @JsonProperty("cardAcceptor")
  private CardAcceptor cardAcceptor = null;
  
  
  @JsonProperty("senderAddress")
  private String senderAddress = null;
  
  
  @JsonProperty("senderCity")
  private String senderCity = null;
  
  
  @JsonProperty("sourceOfFundsCode")
  private String sourceOfFundsCode = null;
  
  
  @JsonProperty("recipientName")
  private String recipientName = null;
  
  
  @JsonProperty("senderMiddleInitial")
  private String senderMiddleInitial = null;
  
  
  @JsonProperty("senderName")
  private String senderName = null;
  
  
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
  
  
  @JsonProperty("senderReference")
  private String senderReference = null;
  
  
  @JsonProperty("recipientPrimaryAccountNumber")
  private String recipientPrimaryAccountNumber = null;
  
  
  @JsonProperty("recipientLastName")
  private String recipientLastName = null;
  
  
  @JsonProperty("nationalReimbursementFee")
  private BigDecimal nationalReimbursementFee = null;
  
  
  @JsonProperty("senderPostalCode")
  private String senderPostalCode = null;
  
  
  @JsonProperty("senderFirstName")
  private String senderFirstName = null;
  
  
  @JsonProperty("senderAccountNumber")
  private String senderAccountNumber = null;
  
  
  @JsonProperty("feeProgramIndicator")
  private String feeProgramIndicator = null;
  
  
  @JsonProperty("transactionCurrencyCode")
  private String transactionCurrencyCode = null;
  
  
  @JsonProperty("acquiringBin")
  private Integer acquiringBin = null;
  
  
  @JsonProperty("accountType")
  private String accountType = null;
  
  
  @JsonProperty("merchantPseudoAbaNumber")
  private String merchantPseudoAbaNumber = null;
  
  
  @JsonProperty("transactionIdentifier")
  private Integer transactionIdentifier = null;
  
  
  @JsonProperty("localTransactionDateTime")
  private String localTransactionDateTime = null;
  
  
  @JsonProperty("recipientFirstName")
  private String recipientFirstName = null;
  
  
  @JsonProperty("amount")
  private BigDecimal amount = null;
  
  
  @JsonProperty("senderDateOfBirth")
  private String senderDateOfBirth = null;
  
  
  @JsonProperty("recipientMiddleInitial")
  private String recipientMiddleInitial = null;
  
  
  @JsonProperty("recipientCardExpiryDate")
  private String recipientCardExpiryDate = null;
  
  
  @JsonProperty("recipientCountryCode")
  private String recipientCountryCode = null;
  
  
  @JsonProperty("systemsTraceAuditNumber")
  private Integer systemsTraceAuditNumber = null;
  
  
  @JsonProperty("senderCountryCode")
  private String senderCountryCode = null;
  
  public MultiPushFundsPostPayload businessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
    return this;
  }

  
  /**
  * Identifies the programs&#x27; business application type for VisaNet transaction processing&lt;br&gt;&lt;br&gt;For Money Transfer, AA applies to transactions where the sender and recipient are the same person and PP applies to transactions where the sender and recipient are not the same person.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#business_application_identifier\&quot;&gt;businessApplicationId&lt;/a&gt; codes
  * @return businessApplicationId
  **/
  @ApiModelProperty(value = "Identifies the programs' business application type for VisaNet transaction processing<br><br>For Money Transfer, AA applies to transactions where the sender and recipient are the same person and PP applies to transactions where the sender and recipient are not the same person.<br><br>Refer to <a href=\"/request_response_codes#business_application_identifier\">businessApplicationId</a> codes")
  public String getBusinessApplicationId() {
    return businessApplicationId;
  }
  public void setBusinessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
  }
  
  public MultiPushFundsPostPayload retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

  
  /**
  * A value used to tie together service calls related to a single financial transaction. When passing Account Funding Transaction (AFT) and an Original Credit Transaction (OCT) methods, this value must differ between the two methods. When passing the Account Funding Transaction Reversal (AFTR) method, this value must match the retrievalReferenceNumber previously passed with the AFT method for this transaction.&lt;br&gt;&lt;br&gt; Recommended Format : ydddhhnnnnnn&lt;br&gt;&lt;br&gt;The first fours digits must be a valid yddd date in the Julian date format, where the first digit &#x3D; 0-9 (last digit of current year) and the next three digits &#x3D; 001-366 (number of the day in the year). hh can be the two digit hour in a 24 hour clock (00-23) during which the transaction is performed.&lt;br&gt;&lt;br&gt; nnnnnn can be the systemsTraceAuditNumber or any 6 digit number.
  * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(required = true, value = "A value used to tie together service calls related to a single financial transaction. When passing Account Funding Transaction (AFT) and an Original Credit Transaction (OCT) methods, this value must differ between the two methods. When passing the Account Funding Transaction Reversal (AFTR) method, this value must match the retrievalReferenceNumber previously passed with the AFT method for this transaction.<br><br> Recommended Format : ydddhhnnnnnn<br><br>The first fours digits must be a valid yddd date in the Julian date format, where the first digit = 0-9 (last digit of current year) and the next three digits = 001-366 (number of the day in the year). hh can be the two digit hour in a 24 hour clock (00-23) during which the transaction is performed.<br><br> nnnnnn can be the systemsTraceAuditNumber or any 6 digit number.")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }
  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }
  
  public MultiPushFundsPostPayload cardAcceptor(CardAcceptor cardAcceptor) {
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
  
  public MultiPushFundsPostPayload senderAddress(String senderAddress) {
    this.senderAddress = senderAddress;
    return this;
  }

  
  /**
  * If the transaction is a money transfer and cross-border or U.S. domestic, this field must contain the sender&#x27;s address.&lt;br&gt;&lt;br&gt;If the transaction is a funds disbursement and cross-border or U.S. domestic, this field must contain either the address of the merchant or government entity sending the funds disbursement.&lt;br&gt;&lt;br&gt;If the transaction is a pre-paid load or credit card bill pay and U.S. domestic, this field must contain the sender&#x27;s address.
  * @return senderAddress
  **/
  @ApiModelProperty(value = "If the transaction is a money transfer and cross-border or U.S. domestic, this field must contain the sender's address.<br><br>If the transaction is a funds disbursement and cross-border or U.S. domestic, this field must contain either the address of the merchant or government entity sending the funds disbursement.<br><br>If the transaction is a pre-paid load or credit card bill pay and U.S. domestic, this field must contain the sender's address.")
  public String getSenderAddress() {
    return senderAddress;
  }
  public void setSenderAddress(String senderAddress) {
    this.senderAddress = senderAddress;
  }
  
  public MultiPushFundsPostPayload senderCity(String senderCity) {
    this.senderCity = senderCity;
    return this;
  }

  
  /**
  * If the transaction is a money transfer and cross-border or U.S. domestic, this field must contain the sender&#x27;s city.&lt;br&gt;&lt;br&gt;If the transaction is a funds disbursement and cross-border or U.S. domestic, this field must contain either the city of the merchant or government entity sending the funds disbursement.&lt;br&gt;&lt;br&gt;If the transaction is a pre-paid load or credit card bill pay and U.S. domestic, this field must contain the sender&#x27;s city.
  * @return senderCity
  **/
  @ApiModelProperty(value = "If the transaction is a money transfer and cross-border or U.S. domestic, this field must contain the sender's city.<br><br>If the transaction is a funds disbursement and cross-border or U.S. domestic, this field must contain either the city of the merchant or government entity sending the funds disbursement.<br><br>If the transaction is a pre-paid load or credit card bill pay and U.S. domestic, this field must contain the sender's city.")
  public String getSenderCity() {
    return senderCity;
  }
  public void setSenderCity(String senderCity) {
    this.senderCity = senderCity;
  }
  
  public MultiPushFundsPostPayload sourceOfFundsCode(String sourceOfFundsCode) {
    this.sourceOfFundsCode = sourceOfFundsCode;
    return this;
  }

  
  /**
  * If the transaction is a money transfer, the field is required and must contain a valid &lt;a href&#x3D;\&quot;/request_response_codes#source_of_funds\&quot;&gt;sourceOfFundsCode&lt;/a&gt; code that matches the funding instrument.&lt;br&gt;&lt;br&gt;If the transaction is a funds disbursement, the field is required and most likely contains a \&quot;05\&quot; as the &lt;a href&#x3D;\&quot;/request_response_codes#source_of_funds\&quot;&gt;sourceOfFundsCode&lt;/a&gt; code to identify that the merchant or government entity used a deposit account to fund the disbursement&lt;br&gt;&lt;br&gt;If the transaction is a pre-paid load, the field is required if the transaction is non-U.S. domestic.&lt;br&gt;&lt;br&gt;If the transaction is a credit bill pay, the field is required if the transaction is non-U.S. domestic, and the &lt;a href&#x3D;\&quot;/request_response_codes#source_of_funds\&quot;&gt;sourceOfFundsCode&lt;/a&gt; code must not contain a \&quot;01\&quot; or \&quot;06\&quot;.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#source_of_funds\&quot;&gt;sourceOfFundsCode&lt;/a&gt; codes
  * @return sourceOfFundsCode
  **/
  @ApiModelProperty(value = "If the transaction is a money transfer, the field is required and must contain a valid <a href=\"/request_response_codes#source_of_funds\">sourceOfFundsCode</a> code that matches the funding instrument.<br><br>If the transaction is a funds disbursement, the field is required and most likely contains a \"05\" as the <a href=\"/request_response_codes#source_of_funds\">sourceOfFundsCode</a> code to identify that the merchant or government entity used a deposit account to fund the disbursement<br><br>If the transaction is a pre-paid load, the field is required if the transaction is non-U.S. domestic.<br><br>If the transaction is a credit bill pay, the field is required if the transaction is non-U.S. domestic, and the <a href=\"/request_response_codes#source_of_funds\">sourceOfFundsCode</a> code must not contain a \"01\" or \"06\".<br><br>Refer to <a href=\"/request_response_codes#source_of_funds\">sourceOfFundsCode</a> codes")
  public String getSourceOfFundsCode() {
    return sourceOfFundsCode;
  }
  public void setSourceOfFundsCode(String sourceOfFundsCode) {
    this.sourceOfFundsCode = sourceOfFundsCode;
  }
  
  public MultiPushFundsPostPayload recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  
  /**
  * Recipient name is required for cross-border enhanced money transfer OCTs.
  * @return recipientName
  **/
  @ApiModelProperty(required = true, value = "Recipient name is required for cross-border enhanced money transfer OCTs.")
  public String getRecipientName() {
    return recipientName;
  }
  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }
  
  public MultiPushFundsPostPayload senderMiddleInitial(String senderMiddleInitial) {
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
  
  public MultiPushFundsPostPayload senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

  
  /**
  * If the transaction is a money transfer and cross-border or U.S. domestic, this field must contain the sender&#x27;s name.&lt;br&gt;&lt;br&gt;If the transaction is a funds disbursement and cross-border or U.S. domestic, this field must contain either the name of the merchant or government entity sending the funds disbursement.&lt;br&gt;&lt;br&gt;If the transaction is a pre-paid load or credit card bill pay and U.S. domestic, this field must contain the sender&#x27;s name.&lt;br&gt;&lt;br&gt;Recommended Format: Last Name/Family Surname 1 + Space + Last Name/Family Surname 2 (optional) + Space + First Name/Given Name + Space + Middle Initial or Middle name (optional) + space&lt;br&gt;&lt;br&gt;Example: Doe John A
  * @return senderName
  **/
  @ApiModelProperty(value = "If the transaction is a money transfer and cross-border or U.S. domestic, this field must contain the sender's name.<br><br>If the transaction is a funds disbursement and cross-border or U.S. domestic, this field must contain either the name of the merchant or government entity sending the funds disbursement.<br><br>If the transaction is a pre-paid load or credit card bill pay and U.S. domestic, this field must contain the sender's name.<br><br>Recommended Format: Last Name/Family Surname 1 + Space + Last Name/Family Surname 2 (optional) + Space + First Name/Given Name + Space + Middle Initial or Middle name (optional) + space<br><br>Example: Doe John A")
  public String getSenderName() {
    return senderName;
  }
  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }
  
  public MultiPushFundsPostPayload recipientState(String recipientState) {
    this.recipientState = recipientState;
    return this;
  }

  
  /**
  * Required if RecipientCountryCode is either 124(CAN) or 840(USA) 
  * @return recipientState
  **/
  @ApiModelProperty(value = "Required if RecipientCountryCode is either 124(CAN) or 840(USA) ")
  public String getRecipientState() {
    return recipientState;
  }
  public void setRecipientState(String recipientState) {
    this.recipientState = recipientState;
  }
  
  public MultiPushFundsPostPayload surcharge(String surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  
  /**
  * When present, this field contains the sender&#x27;s surcharge as assessed by the originator. Values in this field must be in the same currency and format as defined in the amount field.&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt;&lt;br&gt;Supported only in the US.
  * @return surcharge
  **/
  @ApiModelProperty(value = "When present, this field contains the sender's surcharge as assessed by the originator. Values in this field must be in the same currency and format as defined in the amount field.<br><br><b>Note:</b><br>Supported only in the US.")
  public String getSurcharge() {
    return surcharge;
  }
  public void setSurcharge(String surcharge) {
    this.surcharge = surcharge;
  }
  
  public MultiPushFundsPostPayload senderStateCode(String senderStateCode) {
    this.senderStateCode = senderStateCode;
    return this;
  }

  
  /**
  * Required if SenderCountryCode is either 124(CAN) or 840(USA)
  * @return senderStateCode
  **/
  @ApiModelProperty(value = "Required if SenderCountryCode is either 124(CAN) or 840(USA)")
  public String getSenderStateCode() {
    return senderStateCode;
  }
  public void setSenderStateCode(String senderStateCode) {
    this.senderStateCode = senderStateCode;
  }
  
  public MultiPushFundsPostPayload merchantCategoryCode(Integer merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  
  /**
  * If provided, then the value overrides the one present in onboarding data. If the merchantCategoryCode value is not populated in onboarding data then this field is mandatory.&lt;br&gt;&lt;br&gt;If not provided, then the value will default to the values provided during onboarding (when the services are provisioned)&lt;b&gt;Note:&lt;/b&gt; required if not provided during onboarding
  * @return merchantCategoryCode
  **/
  @ApiModelProperty(value = "If provided, then the value overrides the one present in onboarding data. If the merchantCategoryCode value is not populated in onboarding data then this field is mandatory.<br><br>If not provided, then the value will default to the values provided during onboarding (when the services are provisioned)<b>Note:</b> required if not provided during onboarding")
  public Integer getMerchantCategoryCode() {
    return merchantCategoryCode;
  }
  public void setMerchantCategoryCode(Integer merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }
  
  public MultiPushFundsPostPayload senderLastName(String senderLastName) {
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
  
  public MultiPushFundsPostPayload merchantVerificationValue(MerchantVerificationValue merchantVerificationValue) {
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
  
  public MultiPushFundsPostPayload sharingGroupCode(String sharingGroupCode) {
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
  
  public MultiPushFundsPostPayload acquirerCountryCode(Integer acquirerCountryCode) {
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
  
  public MultiPushFundsPostPayload senderReference(String senderReference) {
    this.senderReference = senderReference;
    return this;
  }

  
  /**
  * If the transaction is a money transfer, pre-paid load, or credit card bill pay, and if the sender intends to fund the transaction with a non-financial instrument (for example, cash), a reference number unique to the sender is required.&lt;br&gt;&lt;br&gt;If the transaction is a funds disbursement, the field is required.&lt;br&gt;&lt;br&gt; This field is required if senderAccountNumber is not sent.
  * @return senderReference
  **/
  @ApiModelProperty(value = "If the transaction is a money transfer, pre-paid load, or credit card bill pay, and if the sender intends to fund the transaction with a non-financial instrument (for example, cash), a reference number unique to the sender is required.<br><br>If the transaction is a funds disbursement, the field is required.<br><br> This field is required if senderAccountNumber is not sent.")
  public String getSenderReference() {
    return senderReference;
  }
  public void setSenderReference(String senderReference) {
    this.senderReference = senderReference;
  }
  
  public MultiPushFundsPostPayload recipientPrimaryAccountNumber(String recipientPrimaryAccountNumber) {
    this.recipientPrimaryAccountNumber = recipientPrimaryAccountNumber;
    return this;
  }

  
  /**
  * The recipient&#x27;s PAN.
  * @return recipientPrimaryAccountNumber
  **/
  @ApiModelProperty(value = "The recipient's PAN.")
  public String getRecipientPrimaryAccountNumber() {
    return recipientPrimaryAccountNumber;
  }
  public void setRecipientPrimaryAccountNumber(String recipientPrimaryAccountNumber) {
    this.recipientPrimaryAccountNumber = recipientPrimaryAccountNumber;
  }
  
  public MultiPushFundsPostPayload recipientLastName(String recipientLastName) {
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
  
  public MultiPushFundsPostPayload nationalReimbursementFee(BigDecimal nationalReimbursementFee) {
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
  
  public MultiPushFundsPostPayload senderPostalCode(String senderPostalCode) {
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
  
  public MultiPushFundsPostPayload senderFirstName(String senderFirstName) {
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
  
  public MultiPushFundsPostPayload senderAccountNumber(String senderAccountNumber) {
    this.senderAccountNumber = senderAccountNumber;
    return this;
  }

  
  /**
  * If the transaction is a money transfer, pre-paid load, or credit card bill pay, and if the sender intends to fund the transaction with a financial instrument (for example, debit card), and if the SenderCardId attribute is not sent, this field is required and must contain the sender&#x27;s account number. &lt;br&gt;&lt;br&gt;If the transaction is a funds disbursement, the field is not required.
  * @return senderAccountNumber
  **/
  @ApiModelProperty(value = "If the transaction is a money transfer, pre-paid load, or credit card bill pay, and if the sender intends to fund the transaction with a financial instrument (for example, debit card), and if the SenderCardId attribute is not sent, this field is required and must contain the sender's account number. <br><br>If the transaction is a funds disbursement, the field is not required.")
  public String getSenderAccountNumber() {
    return senderAccountNumber;
  }
  public void setSenderAccountNumber(String senderAccountNumber) {
    this.senderAccountNumber = senderAccountNumber;
  }
  
  public MultiPushFundsPostPayload feeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt; If present, a valid value is required. Spaces or special characters are not allowed.
  * @return feeProgramIndicator
  **/
  @ApiModelProperty(value = "<b>Note:</b> If present, a valid value is required. Spaces or special characters are not allowed.")
  public String getFeeProgramIndicator() {
    return feeProgramIndicator;
  }
  public void setFeeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
  }
  
  public MultiPushFundsPostPayload transactionCurrencyCode(String transactionCurrencyCode) {
    this.transactionCurrencyCode = transactionCurrencyCode;
    return this;
  }

  
  /**
  * Use a 3-character alpha or numeric currency code for currency of the sender. You should (unless prohibited by local law / regulation) use the billingCurrencyCode obtained from the Funds Transfer Attribute Inquiry API under Payment Account Attribute Inquiry. &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_and_currency_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return transactionCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "Use a 3-character alpha or numeric currency code for currency of the sender. You should (unless prohibited by local law / regulation) use the billingCurrencyCode obtained from the Funds Transfer Attribute Inquiry API under Payment Account Attribute Inquiry. <br><br>Refer to <a href=\"/request_response_codes#iso_country_and_currency_codes\">ISO Codes</a>")
  public String getTransactionCurrencyCode() {
    return transactionCurrencyCode;
  }
  public void setTransactionCurrencyCode(String transactionCurrencyCode) {
    this.transactionCurrencyCode = transactionCurrencyCode;
  }
  
  public MultiPushFundsPostPayload acquiringBin(Integer acquiringBin) {
    this.acquiringBin = acquiringBin;
    return this;
  }

  
  /**
  * The Bank Identification Number (BIN) under which the Visa Direct solution is registered. This must match the information provided during enrollment.
  * @return acquiringBin
  **/
  @ApiModelProperty(required = true, value = "The Bank Identification Number (BIN) under which the Visa Direct solution is registered. This must match the information provided during enrollment.")
  public Integer getAcquiringBin() {
    return acquiringBin;
  }
  public void setAcquiringBin(Integer acquiringBin) {
    this.acquiringBin = acquiringBin;
  }
  
  public MultiPushFundsPostPayload accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  
  /**
  * This is used to identify the account type of the senderPrimaryAccountNumber in the request. Below are the possible values.&lt;br&gt;&lt;br&gt; 00-Not applicable&lt;br&gt; 10-Saving account&lt;br&gt; 20-Checking account&lt;br&gt; 30-Credit card account&lt;br&gt; 40-Universal account&lt;br&gt;&lt;br&gt;Default is set to \&quot;00\&quot; if not provided.
  * @return accountType
  **/
  @ApiModelProperty(value = "This is used to identify the account type of the senderPrimaryAccountNumber in the request. Below are the possible values.<br><br> 00-Not applicable<br> 10-Saving account<br> 20-Checking account<br> 30-Credit card account<br> 40-Universal account<br><br>Default is set to \"00\" if not provided.")
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }
  
  public MultiPushFundsPostPayload merchantPseudoAbaNumber(String merchantPseudoAbaNumber) {
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
  
  public MultiPushFundsPostPayload transactionIdentifier(Integer transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

  
  /**
  * The VisaNet transaction identifier. If you have previously sent an AFT, this field must include the VisaNet transaction identifier returned in the AFT response.
  * @return transactionIdentifier
  **/
  @ApiModelProperty(value = "The VisaNet transaction identifier. If you have previously sent an AFT, this field must include the VisaNet transaction identifier returned in the AFT response.")
  public Integer getTransactionIdentifier() {
    return transactionIdentifier;
  }
  public void setTransactionIdentifier(Integer transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }
  
  public MultiPushFundsPostPayload localTransactionDateTime(String localTransactionDateTime) {
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
  
  public MultiPushFundsPostPayload recipientFirstName(String recipientFirstName) {
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
  
  public MultiPushFundsPostPayload amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  /**
  * The transaction amount to be delivered to the recipient.
  * @return amount
  **/
  @ApiModelProperty(required = true, value = "The transaction amount to be delivered to the recipient.")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
  
  public MultiPushFundsPostPayload senderDateOfBirth(String senderDateOfBirth) {
    this.senderDateOfBirth = senderDateOfBirth;
    return this;
  }

  
  /**
  * The birth date for the sender 
  * @return senderDateOfBirth
  **/
  @ApiModelProperty(value = "The birth date for the sender ")
  public String getSenderDateOfBirth() {
    return senderDateOfBirth;
  }
  public void setSenderDateOfBirth(String senderDateOfBirth) {
    this.senderDateOfBirth = senderDateOfBirth;
  }
  
  public MultiPushFundsPostPayload recipientMiddleInitial(String recipientMiddleInitial) {
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
  
  public MultiPushFundsPostPayload recipientCardExpiryDate(String recipientCardExpiryDate) {
    this.recipientCardExpiryDate = recipientCardExpiryDate;
    return this;
  }

  
  /**
  * The expiration date for the recipient&#x27;s primary account number in  recipientPrimaryAccountNumber
  * @return recipientCardExpiryDate
  **/
  @ApiModelProperty(value = "The expiration date for the recipient's primary account number in  recipientPrimaryAccountNumber")
  public String getRecipientCardExpiryDate() {
    return recipientCardExpiryDate;
  }
  public void setRecipientCardExpiryDate(String recipientCardExpiryDate) {
    this.recipientCardExpiryDate = recipientCardExpiryDate;
  }
  
  public MultiPushFundsPostPayload recipientCountryCode(String recipientCountryCode) {
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
  
  public MultiPushFundsPostPayload systemsTraceAuditNumber(Integer systemsTraceAuditNumber) {
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
  
  public MultiPushFundsPostPayload senderCountryCode(String senderCountryCode) {
    this.senderCountryCode = senderCountryCode;
    return this;
  }

  
  /**
  * If the transaction is a money transfer and cross-border or U.S. domestic, this field must contain the sender&#x27;s country code.&lt;br&gt;&lt;br&gt;If the transaction is a funds disbursement and cross-border or U.S. domestic, this field must contain either the country code of the merchant or government entity sending the funds disbursement.&lt;br&gt;&lt;br&gt;If the transaction is a pre-paid load or credit card bill pay and U.S. domestic, this field must contain the sender&#x27;s country code.&lt;br&gt;&lt;br&gt;Alpha or numeric country code can be supported.&lt;br&gt;&lt;br&gt;This field is required when sending the transactions to some of the US debit networks.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_and_currency_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return senderCountryCode
  **/
  @ApiModelProperty(value = "If the transaction is a money transfer and cross-border or U.S. domestic, this field must contain the sender's country code.<br><br>If the transaction is a funds disbursement and cross-border or U.S. domestic, this field must contain either the country code of the merchant or government entity sending the funds disbursement.<br><br>If the transaction is a pre-paid load or credit card bill pay and U.S. domestic, this field must contain the sender's country code.<br><br>Alpha or numeric country code can be supported.<br><br>This field is required when sending the transactions to some of the US debit networks.<br><br>Refer to <a href=\"/request_response_codes#iso_country_and_currency_codes\">ISO Codes</a>")
  public String getSenderCountryCode() {
    return senderCountryCode;
  }
  public void setSenderCountryCode(String senderCountryCode) {
    this.senderCountryCode = senderCountryCode;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiPushFundsPostPayload multiPushFundsPostPayload = (MultiPushFundsPostPayload) o;
    return Objects.equals(this.businessApplicationId, multiPushFundsPostPayload.businessApplicationId) &&
        Objects.equals(this.retrievalReferenceNumber, multiPushFundsPostPayload.retrievalReferenceNumber) &&
        Objects.equals(this.cardAcceptor, multiPushFundsPostPayload.cardAcceptor) &&
        Objects.equals(this.senderAddress, multiPushFundsPostPayload.senderAddress) &&
        Objects.equals(this.senderCity, multiPushFundsPostPayload.senderCity) &&
        Objects.equals(this.sourceOfFundsCode, multiPushFundsPostPayload.sourceOfFundsCode) &&
        Objects.equals(this.recipientName, multiPushFundsPostPayload.recipientName) &&
        Objects.equals(this.senderMiddleInitial, multiPushFundsPostPayload.senderMiddleInitial) &&
        Objects.equals(this.senderName, multiPushFundsPostPayload.senderName) &&
        Objects.equals(this.recipientState, multiPushFundsPostPayload.recipientState) &&
        Objects.equals(this.surcharge, multiPushFundsPostPayload.surcharge) &&
        Objects.equals(this.senderStateCode, multiPushFundsPostPayload.senderStateCode) &&
        Objects.equals(this.merchantCategoryCode, multiPushFundsPostPayload.merchantCategoryCode) &&
        Objects.equals(this.senderLastName, multiPushFundsPostPayload.senderLastName) &&
        Objects.equals(this.merchantVerificationValue, multiPushFundsPostPayload.merchantVerificationValue) &&
        Objects.equals(this.sharingGroupCode, multiPushFundsPostPayload.sharingGroupCode) &&
        Objects.equals(this.acquirerCountryCode, multiPushFundsPostPayload.acquirerCountryCode) &&
        Objects.equals(this.senderReference, multiPushFundsPostPayload.senderReference) &&
        Objects.equals(this.recipientPrimaryAccountNumber, multiPushFundsPostPayload.recipientPrimaryAccountNumber) &&
        Objects.equals(this.recipientLastName, multiPushFundsPostPayload.recipientLastName) &&
        Objects.equals(this.nationalReimbursementFee, multiPushFundsPostPayload.nationalReimbursementFee) &&
        Objects.equals(this.senderPostalCode, multiPushFundsPostPayload.senderPostalCode) &&
        Objects.equals(this.senderFirstName, multiPushFundsPostPayload.senderFirstName) &&
        Objects.equals(this.senderAccountNumber, multiPushFundsPostPayload.senderAccountNumber) &&
        Objects.equals(this.feeProgramIndicator, multiPushFundsPostPayload.feeProgramIndicator) &&
        Objects.equals(this.transactionCurrencyCode, multiPushFundsPostPayload.transactionCurrencyCode) &&
        Objects.equals(this.acquiringBin, multiPushFundsPostPayload.acquiringBin) &&
        Objects.equals(this.accountType, multiPushFundsPostPayload.accountType) &&
        Objects.equals(this.merchantPseudoAbaNumber, multiPushFundsPostPayload.merchantPseudoAbaNumber) &&
        Objects.equals(this.transactionIdentifier, multiPushFundsPostPayload.transactionIdentifier) &&
        Objects.equals(this.localTransactionDateTime, multiPushFundsPostPayload.localTransactionDateTime) &&
        Objects.equals(this.recipientFirstName, multiPushFundsPostPayload.recipientFirstName) &&
        Objects.equals(this.amount, multiPushFundsPostPayload.amount) &&
        Objects.equals(this.senderDateOfBirth, multiPushFundsPostPayload.senderDateOfBirth) &&
        Objects.equals(this.recipientMiddleInitial, multiPushFundsPostPayload.recipientMiddleInitial) &&
        Objects.equals(this.recipientCardExpiryDate, multiPushFundsPostPayload.recipientCardExpiryDate) &&
        Objects.equals(this.recipientCountryCode, multiPushFundsPostPayload.recipientCountryCode) &&
        Objects.equals(this.systemsTraceAuditNumber, multiPushFundsPostPayload.systemsTraceAuditNumber) &&
        Objects.equals(this.senderCountryCode, multiPushFundsPostPayload.senderCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessApplicationId, retrievalReferenceNumber, cardAcceptor, senderAddress, senderCity, sourceOfFundsCode, recipientName, senderMiddleInitial, senderName, recipientState, surcharge, senderStateCode, merchantCategoryCode, senderLastName, merchantVerificationValue, sharingGroupCode, acquirerCountryCode, senderReference, recipientPrimaryAccountNumber, recipientLastName, nationalReimbursementFee, senderPostalCode, senderFirstName, senderAccountNumber, feeProgramIndicator, transactionCurrencyCode, acquiringBin, accountType, merchantPseudoAbaNumber, transactionIdentifier, localTransactionDateTime, recipientFirstName, amount, senderDateOfBirth, recipientMiddleInitial, recipientCardExpiryDate, recipientCountryCode, systemsTraceAuditNumber, senderCountryCode);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiPushFundsPostPayload {\n");
    
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
    sb.append("    cardAcceptor: ").append(toIndentedString(cardAcceptor)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
    sb.append("    senderCity: ").append(toIndentedString(senderCity)).append("\n");
    sb.append("    sourceOfFundsCode: ").append(toIndentedString(sourceOfFundsCode)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    senderMiddleInitial: ").append(toIndentedString(senderMiddleInitial)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    recipientState: ").append(toIndentedString(recipientState)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    senderStateCode: ").append(toIndentedString(senderStateCode)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    senderLastName: ").append(toIndentedString(senderLastName)).append("\n");
    sb.append("    merchantVerificationValue: ").append(toIndentedString(merchantVerificationValue)).append("\n");
    sb.append("    sharingGroupCode: ").append(toIndentedString(sharingGroupCode)).append("\n");
    sb.append("    acquirerCountryCode: ").append(toIndentedString(acquirerCountryCode)).append("\n");
    sb.append("    senderReference: ").append(toIndentedString(senderReference)).append("\n");
    sb.append("    recipientPrimaryAccountNumber: ").append(toIndentedString(recipientPrimaryAccountNumber)).append("\n");
    sb.append("    recipientLastName: ").append(toIndentedString(recipientLastName)).append("\n");
    sb.append("    nationalReimbursementFee: ").append(toIndentedString(nationalReimbursementFee)).append("\n");
    sb.append("    senderPostalCode: ").append(toIndentedString(senderPostalCode)).append("\n");
    sb.append("    senderFirstName: ").append(toIndentedString(senderFirstName)).append("\n");
    sb.append("    senderAccountNumber: ").append(toIndentedString(senderAccountNumber)).append("\n");
    sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    sb.append("    transactionCurrencyCode: ").append(toIndentedString(transactionCurrencyCode)).append("\n");
    sb.append("    acquiringBin: ").append(toIndentedString(acquiringBin)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    merchantPseudoAbaNumber: ").append(toIndentedString(merchantPseudoAbaNumber)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    localTransactionDateTime: ").append(toIndentedString(localTransactionDateTime)).append("\n");
    sb.append("    recipientFirstName: ").append(toIndentedString(recipientFirstName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    senderDateOfBirth: ").append(toIndentedString(senderDateOfBirth)).append("\n");
    sb.append("    recipientMiddleInitial: ").append(toIndentedString(recipientMiddleInitial)).append("\n");
    sb.append("    recipientCardExpiryDate: ").append(toIndentedString(recipientCardExpiryDate)).append("\n");
    sb.append("    recipientCountryCode: ").append(toIndentedString(recipientCountryCode)).append("\n");
    sb.append("    systemsTraceAuditNumber: ").append(toIndentedString(systemsTraceAuditNumber)).append("\n");
    sb.append("    senderCountryCode: ").append(toIndentedString(senderCountryCode)).append("\n");
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



