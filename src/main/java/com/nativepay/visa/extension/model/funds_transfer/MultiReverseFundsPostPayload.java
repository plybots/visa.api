


package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Request body for creating in multi reverse funds transfer
 */@ApiModel(description = "Request body for creating in multi reverse funds transfer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class MultiReverseFundsPostPayload {

  
  @JsonProperty("businessApplicationId")
  private String businessApplicationId = null;
  
  
  @JsonProperty("transactionIdentifier")
  private Integer transactionIdentifier = null;
  
  
  @JsonProperty("cardAcceptor")
  private CardAcceptor cardAcceptor = null;
  
  
  @JsonProperty("surcharge")
  private String surcharge = null;
  
  
  @JsonProperty("networkId")
  private Integer networkId = null;
  
  
  @JsonProperty("merchantVerificationValue")
  private MerchantVerificationValue merchantVerificationValue = null;
  
  
  @JsonProperty("sharingGroupCode")
  private String sharingGroupCode = null;
  
  
  @JsonProperty("acquirerCountryCode")
  private Integer acquirerCountryCode = null;
  
  
  @JsonProperty("systemsTraceAuditNumber")
  private Integer systemsTraceAuditNumber = null;
  
  
  @JsonProperty("originalDataElements")
  private OriginalDataElements originalDataElements = null;
  
  
  @JsonProperty("memberComments")
  private String memberComments = null;
  
  
  @JsonProperty("nationalReimbursementFee")
  private BigDecimal nationalReimbursementFee = null;
  
  
  @JsonProperty("feeProgramIndicator")
  private String feeProgramIndicator = null;
  
  
  @JsonProperty("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;
  
  
  @JsonProperty("acquiringBin")
  private Integer acquiringBin = null;
  
  
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
  
  
  @JsonProperty("senderCardExpiryDate")
  private String senderCardExpiryDate = null;
  
  
  @JsonProperty("amount")
  private BigDecimal amount = null;
  
  
  @JsonProperty("senderCurrencyCode")
  private String senderCurrencyCode = null;
  
  
  @JsonProperty("pointOfServiceCapability")
  private PointOfServiceCapability pointOfServiceCapability = null;
  
  public MultiReverseFundsPostPayload businessApplicationId(String businessApplicationId) {
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
  
  public MultiReverseFundsPostPayload transactionIdentifier(Integer transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

  
  /**
  * The VisaNet reference number for the transaction. You must use the transactionId from the initial AFT in this field.
  * @return transactionIdentifier
  **/
  @ApiModelProperty(required = true, value = "The VisaNet reference number for the transaction. You must use the transactionId from the initial AFT in this field.")
  public Integer getTransactionIdentifier() {
    return transactionIdentifier;
  }
  public void setTransactionIdentifier(Integer transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }
  
  public MultiReverseFundsPostPayload cardAcceptor(CardAcceptor cardAcceptor) {
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
  
  public MultiReverseFundsPostPayload surcharge(String surcharge) {
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
  
  public MultiReverseFundsPostPayload networkId(Integer networkId) {
    this.networkId = networkId;
    return this;
  }

  
  /**
  * This contains a code that specifies the network to be used for transmission of the message and determines the program rules that apply to the transaction.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#network_id_and_sharing_group_code\&quot;&gt;Network ID&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt;&lt;br&gt;For ReverseFundsTransactions(AFTR) and MultiReverseFundsTransactions (MULTIAFTR) originators must populate the networkId returned in the original PullFundsTransactions(AFT) and  MultiPullFundsTransactions (MULTIAFT) response.&lt;br&gt; Supported only in US for domestic transactions.
  * @return networkId
  **/
  @ApiModelProperty(value = "This contains a code that specifies the network to be used for transmission of the message and determines the program rules that apply to the transaction.<br><br>Refer to <a href=\"/request_response_codes#network_id_and_sharing_group_code\">Network ID</a><br><br><b>Note:</b><br>For ReverseFundsTransactions(AFTR) and MultiReverseFundsTransactions (MULTIAFTR) originators must populate the networkId returned in the original PullFundsTransactions(AFT) and  MultiPullFundsTransactions (MULTIAFT) response.<br> Supported only in US for domestic transactions.")
  public Integer getNetworkId() {
    return networkId;
  }
  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }
  
  public MultiReverseFundsPostPayload merchantVerificationValue(MerchantVerificationValue merchantVerificationValue) {
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
  
  public MultiReverseFundsPostPayload sharingGroupCode(String sharingGroupCode) {
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
  
  public MultiReverseFundsPostPayload acquirerCountryCode(Integer acquirerCountryCode) {
    this.acquirerCountryCode = acquirerCountryCode;
    return this;
  }

  
  /**
  * Use a 3-digit numeric country code for the country where the Visa Direct solution is registered. This must match the information provided during program enrollment.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_and_currency_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return acquirerCountryCode
  **/
  @ApiModelProperty(required = true, value = "Use a 3-digit numeric country code for the country where the Visa Direct solution is registered. This must match the information provided during program enrollment.<br><br>Refer to <a href=\"/request_response_codes#iso_country_and_currency_codes\">ISO Codes</a>")
  public Integer getAcquirerCountryCode() {
    return acquirerCountryCode;
  }
  public void setAcquirerCountryCode(Integer acquirerCountryCode) {
    this.acquirerCountryCode = acquirerCountryCode;
  }
  
  public MultiReverseFundsPostPayload systemsTraceAuditNumber(Integer systemsTraceAuditNumber) {
    this.systemsTraceAuditNumber = systemsTraceAuditNumber;
    return this;
  }

  
  /**
  * A unique value should be used for each API method where this is required. however, when passing the Account Funding Transaction Reversal (AFTR) method, this value must match the systemsTraceAuditNumber previously passed with the AFT method for the current transaction.
  * @return systemsTraceAuditNumber
  **/
  @ApiModelProperty(required = true, value = "A unique value should be used for each API method where this is required. however, when passing the Account Funding Transaction Reversal (AFTR) method, this value must match the systemsTraceAuditNumber previously passed with the AFT method for the current transaction.")
  public Integer getSystemsTraceAuditNumber() {
    return systemsTraceAuditNumber;
  }
  public void setSystemsTraceAuditNumber(Integer systemsTraceAuditNumber) {
    this.systemsTraceAuditNumber = systemsTraceAuditNumber;
  }
  
  public MultiReverseFundsPostPayload originalDataElements(OriginalDataElements originalDataElements) {
    this.originalDataElements = originalDataElements;
    return this;
  }

  
  /**
  * Get originalDataElements
  * @return originalDataElements
  **/
  @ApiModelProperty(required = true, value = "")
  public OriginalDataElements getOriginalDataElements() {
    return originalDataElements;
  }
  public void setOriginalDataElements(OriginalDataElements originalDataElements) {
    this.originalDataElements = originalDataElements;
  }
  
  public MultiReverseFundsPostPayload memberComments(String memberComments) {
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
  
  public MultiReverseFundsPostPayload nationalReimbursementFee(BigDecimal nationalReimbursementFee) {
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
  
  public MultiReverseFundsPostPayload feeProgramIndicator(String feeProgramIndicator) {
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
  
  public MultiReverseFundsPostPayload retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

  
  /**
  * A value used to tie together service calls related to a single financial transaction. When passing Account Funding Transaction (AFT) and Original Credit Transaction (OCT) methods, this value must differ between the two methods. When passing the Account Funding Transaction Reversal (AFTR) method, this value must match the retrievalReferenceNumber previously passed with the AFT method for this transaction.&lt;br&gt;&lt;br&gt;Recommended Format: ydddhhnnnnnn&lt;br&gt;&lt;br&gt;The first fours digits must be a valid yddd date in the Julian date format, where the first digit &#x3D; 0-9 (last digit of current year) and the next three digits &#x3D; 001-366 (number of the day in the year).&lt;br&gt;&lt;br&gt;hh can be the two digit hour in a 24 hour clock (00-23) during which the transaction is performed.&lt;br&gt;&lt;br&gt;nnnnnn can be the systemsTraceAuditNumber or any 6 digit number.
  * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(required = true, value = "A value used to tie together service calls related to a single financial transaction. When passing Account Funding Transaction (AFT) and Original Credit Transaction (OCT) methods, this value must differ between the two methods. When passing the Account Funding Transaction Reversal (AFTR) method, this value must match the retrievalReferenceNumber previously passed with the AFT method for this transaction.<br><br>Recommended Format: ydddhhnnnnnn<br><br>The first fours digits must be a valid yddd date in the Julian date format, where the first digit = 0-9 (last digit of current year) and the next three digits = 001-366 (number of the day in the year).<br><br>hh can be the two digit hour in a 24 hour clock (00-23) during which the transaction is performed.<br><br>nnnnnn can be the systemsTraceAuditNumber or any 6 digit number.")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }
  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }
  
  public MultiReverseFundsPostPayload acquiringBin(Integer acquiringBin) {
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
  
  public MultiReverseFundsPostPayload merchantPseudoAbaNumber(String merchantPseudoAbaNumber) {
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
  
  public MultiReverseFundsPostPayload foreignExchangeFeeTransaction(BigDecimal foreignExchangeFeeTransaction) {
    this.foreignExchangeFeeTransaction = foreignExchangeFeeTransaction;
    return this;
  }

  
  /**
  * When present, this field contains the sender&#x27;s foreign exchange markup fee (markup above the wholesale or VisaNet exchange rate as assessed by the originator. Values in this field must be in the same currency and format as defined in the amount field.
  * @return foreignExchangeFeeTransaction
  **/
  @ApiModelProperty(value = "When present, this field contains the sender's foreign exchange markup fee (markup above the wholesale or VisaNet exchange rate as assessed by the originator. Values in this field must be in the same currency and format as defined in the amount field.")
  public BigDecimal getForeignExchangeFeeTransaction() {
    return foreignExchangeFeeTransaction;
  }
  public void setForeignExchangeFeeTransaction(BigDecimal foreignExchangeFeeTransaction) {
    this.foreignExchangeFeeTransaction = foreignExchangeFeeTransaction;
  }
  
  public MultiReverseFundsPostPayload pointOfServiceData(PointOfServiceData pointOfServiceData) {
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
  
  public MultiReverseFundsPostPayload senderPrimaryAccountNumber(String senderPrimaryAccountNumber) {
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
  
  public MultiReverseFundsPostPayload localTransactionDateTime(String localTransactionDateTime) {
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
  
  public MultiReverseFundsPostPayload senderCardExpiryDate(String senderCardExpiryDate) {
    this.senderCardExpiryDate = senderCardExpiryDate;
    return this;
  }

  
  /**
  * The expiration date for the sender&#x27;s Visa account number in senderPrimaryAccountNumber.
  * @return senderCardExpiryDate
  **/
  @ApiModelProperty(value = "The expiration date for the sender's Visa account number in senderPrimaryAccountNumber.")
  public String getSenderCardExpiryDate() {
    return senderCardExpiryDate;
  }
  public void setSenderCardExpiryDate(String senderCardExpiryDate) {
    this.senderCardExpiryDate = senderCardExpiryDate;
  }
  
  public MultiReverseFundsPostPayload amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  /**
  * The total amount to be sent to the recipient
  * @return amount
  **/
  @ApiModelProperty(required = true, value = "The total amount to be sent to the recipient")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
  
  public MultiReverseFundsPostPayload senderCurrencyCode(String senderCurrencyCode) {
    this.senderCurrencyCode = senderCurrencyCode;
    return this;
  }

  
  /**
  * Use a 3-character alpha currency code for currency of the sender.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_and_currency_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return senderCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "Use a 3-character alpha currency code for currency of the sender.<br><br>Refer to <a href=\"/request_response_codes#iso_country_and_currency_codes\">ISO Codes</a>")
  public String getSenderCurrencyCode() {
    return senderCurrencyCode;
  }
  public void setSenderCurrencyCode(String senderCurrencyCode) {
    this.senderCurrencyCode = senderCurrencyCode;
  }
  
  public MultiReverseFundsPostPayload pointOfServiceCapability(PointOfServiceCapability pointOfServiceCapability) {
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
    MultiReverseFundsPostPayload multiReverseFundsPostPayload = (MultiReverseFundsPostPayload) o;
    return Objects.equals(this.businessApplicationId, multiReverseFundsPostPayload.businessApplicationId) &&
        Objects.equals(this.transactionIdentifier, multiReverseFundsPostPayload.transactionIdentifier) &&
        Objects.equals(this.cardAcceptor, multiReverseFundsPostPayload.cardAcceptor) &&
        Objects.equals(this.surcharge, multiReverseFundsPostPayload.surcharge) &&
        Objects.equals(this.networkId, multiReverseFundsPostPayload.networkId) &&
        Objects.equals(this.merchantVerificationValue, multiReverseFundsPostPayload.merchantVerificationValue) &&
        Objects.equals(this.sharingGroupCode, multiReverseFundsPostPayload.sharingGroupCode) &&
        Objects.equals(this.acquirerCountryCode, multiReverseFundsPostPayload.acquirerCountryCode) &&
        Objects.equals(this.systemsTraceAuditNumber, multiReverseFundsPostPayload.systemsTraceAuditNumber) &&
        Objects.equals(this.originalDataElements, multiReverseFundsPostPayload.originalDataElements) &&
        Objects.equals(this.memberComments, multiReverseFundsPostPayload.memberComments) &&
        Objects.equals(this.nationalReimbursementFee, multiReverseFundsPostPayload.nationalReimbursementFee) &&
        Objects.equals(this.feeProgramIndicator, multiReverseFundsPostPayload.feeProgramIndicator) &&
        Objects.equals(this.retrievalReferenceNumber, multiReverseFundsPostPayload.retrievalReferenceNumber) &&
        Objects.equals(this.acquiringBin, multiReverseFundsPostPayload.acquiringBin) &&
        Objects.equals(this.merchantPseudoAbaNumber, multiReverseFundsPostPayload.merchantPseudoAbaNumber) &&
        Objects.equals(this.foreignExchangeFeeTransaction, multiReverseFundsPostPayload.foreignExchangeFeeTransaction) &&
        Objects.equals(this.pointOfServiceData, multiReverseFundsPostPayload.pointOfServiceData) &&
        Objects.equals(this.senderPrimaryAccountNumber, multiReverseFundsPostPayload.senderPrimaryAccountNumber) &&
        Objects.equals(this.localTransactionDateTime, multiReverseFundsPostPayload.localTransactionDateTime) &&
        Objects.equals(this.senderCardExpiryDate, multiReverseFundsPostPayload.senderCardExpiryDate) &&
        Objects.equals(this.amount, multiReverseFundsPostPayload.amount) &&
        Objects.equals(this.senderCurrencyCode, multiReverseFundsPostPayload.senderCurrencyCode) &&
        Objects.equals(this.pointOfServiceCapability, multiReverseFundsPostPayload.pointOfServiceCapability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessApplicationId, transactionIdentifier, cardAcceptor, surcharge, networkId, merchantVerificationValue, sharingGroupCode, acquirerCountryCode, systemsTraceAuditNumber, originalDataElements, memberComments, nationalReimbursementFee, feeProgramIndicator, retrievalReferenceNumber, acquiringBin, merchantPseudoAbaNumber, foreignExchangeFeeTransaction, pointOfServiceData, senderPrimaryAccountNumber, localTransactionDateTime, senderCardExpiryDate, amount, senderCurrencyCode, pointOfServiceCapability);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiReverseFundsPostPayload {\n");
    
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    cardAcceptor: ").append(toIndentedString(cardAcceptor)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    merchantVerificationValue: ").append(toIndentedString(merchantVerificationValue)).append("\n");
    sb.append("    sharingGroupCode: ").append(toIndentedString(sharingGroupCode)).append("\n");
    sb.append("    acquirerCountryCode: ").append(toIndentedString(acquirerCountryCode)).append("\n");
    sb.append("    systemsTraceAuditNumber: ").append(toIndentedString(systemsTraceAuditNumber)).append("\n");
    sb.append("    originalDataElements: ").append(toIndentedString(originalDataElements)).append("\n");
    sb.append("    memberComments: ").append(toIndentedString(memberComments)).append("\n");
    sb.append("    nationalReimbursementFee: ").append(toIndentedString(nationalReimbursementFee)).append("\n");
    sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
    sb.append("    acquiringBin: ").append(toIndentedString(acquiringBin)).append("\n");
    sb.append("    merchantPseudoAbaNumber: ").append(toIndentedString(merchantPseudoAbaNumber)).append("\n");
    sb.append("    foreignExchangeFeeTransaction: ").append(toIndentedString(foreignExchangeFeeTransaction)).append("\n");
    sb.append("    pointOfServiceData: ").append(toIndentedString(pointOfServiceData)).append("\n");
    sb.append("    senderPrimaryAccountNumber: ").append(toIndentedString(senderPrimaryAccountNumber)).append("\n");
    sb.append("    localTransactionDateTime: ").append(toIndentedString(localTransactionDateTime)).append("\n");
    sb.append("    senderCardExpiryDate: ").append(toIndentedString(senderCardExpiryDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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



