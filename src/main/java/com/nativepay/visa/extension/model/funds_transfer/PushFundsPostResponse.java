
package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Push Funds Transfer Response
 */@ApiModel(description = "Push Funds Transfer Response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class PushFundsPostResponse {

  
  @JsonProperty("networkId")
  private Integer networkId = null;
  
  
  @JsonProperty("approvalCode")
  private String approvalCode = null;
  
  
  @JsonProperty("feeProgramIndicator")
  private String feeProgramIndicator = null;
  
  
  @JsonProperty("prepaidBalance")
  private String prepaidBalance = null;
  
  
  @JsonProperty("prepaidBalanceCurrency")
  private String prepaidBalanceCurrency = null;
  
  
  @JsonProperty("merchantVerificationValue")
  private String merchantVerificationValue = null;
  
  
  @JsonProperty("statusIdentifier")
  private String statusIdentifier = null;
  
  
  @JsonProperty("transactionIdentifier")
  private Long transactionIdentifier = null;
  
  
  @JsonProperty("last4ofPAN")
  private Integer last4ofPAN = null;
  
  
  @JsonProperty("responseCode")
  private String responseCode = null;
  
  
  @JsonProperty("actionCode")
  private String actionCode = null;
  
  
  @JsonProperty("transmissionDateTime")
  private String transmissionDateTime = null;
  
  public PushFundsPostResponse networkId(Integer networkId) {
    this.networkId = networkId;
    return this;
  }

  
  /**
  * This contains a code that identifies the network on which the transaction was processed.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#network_id_and_sharing_group_code\&quot;&gt;Network ID&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt;&lt;br&gt;This field is returned only if it is anything other than networkId value 2.&lt;br&gt;&lt;br&gt;Supported only in US for domestic transactions.
  * @return networkId
  **/
  @ApiModelProperty(value = "This contains a code that identifies the network on which the transaction was processed.<br><br>Refer to <a href=\"/request_response_codes#network_id_and_sharing_group_code\">Network ID</a><br><br><b>Note:</b><br>This field is returned only if it is anything other than networkId value 2.<br><br>Supported only in US for domestic transactions.")
  public Integer getNetworkId() {
    return networkId;
  }
  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }
  
  public PushFundsPostResponse approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

  
  /**
  * The authorization code from the issuer.
  * @return approvalCode
  **/
  @ApiModelProperty(value = "The authorization code from the issuer.")
  public String getApprovalCode() {
    return approvalCode;
  }
  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }
  
  public PushFundsPostResponse feeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
    return this;
  }

  
  /**
  * Get feeProgramIndicator
  * @return feeProgramIndicator
  **/
  @ApiModelProperty(value = "")
  public String getFeeProgramIndicator() {
    return feeProgramIndicator;
  }
  public void setFeeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
  }
  
  public PushFundsPostResponse prepaidBalance(String prepaidBalance) {
    this.prepaidBalance = prepaidBalance;
    return this;
  }

  
  /**
  * Min Inclusive: -999999999.999&lt;br&gt;&lt;br&gt;Max Inclusive: 999999999.999&lt;br&gt;&lt;br&gt;Note: Applicable only for Top Up Transactions
  * @return prepaidBalance
  **/
  @ApiModelProperty(value = "Min Inclusive: -999999999.999<br><br>Max Inclusive: 999999999.999<br><br>Note: Applicable only for Top Up Transactions")
  public String getPrepaidBalance() {
    return prepaidBalance;
  }
  public void setPrepaidBalance(String prepaidBalance) {
    this.prepaidBalance = prepaidBalance;
  }
  
  public PushFundsPostResponse prepaidBalanceCurrency(String prepaidBalanceCurrency) {
    this.prepaidBalanceCurrency = prepaidBalanceCurrency;
    return this;
  }

  
  /**
  * Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_and_currency_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return prepaidBalanceCurrency
  **/
  @ApiModelProperty(value = "Refer to <a href=\"/request_response_codes#iso_country_and_currency_codes\">ISO Codes</a>")
  public String getPrepaidBalanceCurrency() {
    return prepaidBalanceCurrency;
  }
  public void setPrepaidBalanceCurrency(String prepaidBalanceCurrency) {
    this.prepaidBalanceCurrency = prepaidBalanceCurrency;
  }
  
  public PushFundsPostResponse merchantVerificationValue(String merchantVerificationValue) {
    this.merchantVerificationValue = merchantVerificationValue;
    return this;
  }

  
  /**
  * The concatenated Merchant Verification Value of Visa assigned and Acquirer assigned value is returned.
  * @return merchantVerificationValue
  **/
  @ApiModelProperty(value = "The concatenated Merchant Verification Value of Visa assigned and Acquirer assigned value is returned.")
  public String getMerchantVerificationValue() {
    return merchantVerificationValue;
  }
  public void setMerchantVerificationValue(String merchantVerificationValue) {
    this.merchantVerificationValue = merchantVerificationValue;
  }
  
  public PushFundsPostResponse statusIdentifier(String statusIdentifier) {
    this.statusIdentifier = statusIdentifier;
    return this;
  }

  
  /**
  * Get statusIdentifier
  * @return statusIdentifier
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatusIdentifier() {
    return statusIdentifier;
  }
  public void setStatusIdentifier(String statusIdentifier) {
    this.statusIdentifier = statusIdentifier;
  }
  
  public PushFundsPostResponse transactionIdentifier(Long transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

  
  /**
  * The VisaNet reference number for the transaction&lt;br&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;&lt;br&gt;transactionIdentifier is a Visa generated field that client recieves in the response message.&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;As an exception Visa allows clients to use the transactionIdentifier received in the AFT response into the subsequent OCT message - this is to simplify matching the pull and push transaction pair and reconciliation.
  * @return transactionIdentifier
  **/
  @ApiModelProperty(required = true, value = "The VisaNet reference number for the transaction<br><br><b>Note: </b><br>transactionIdentifier is a Visa generated field that client recieves in the response message.<br><b>Note: </b>As an exception Visa allows clients to use the transactionIdentifier received in the AFT response into the subsequent OCT message - this is to simplify matching the pull and push transaction pair and reconciliation.")
  public Long getTransactionIdentifier() {
    return transactionIdentifier;
  }
  public void setTransactionIdentifier(Long transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }
  
  public PushFundsPostResponse last4ofPAN(Integer last4ofPAN) {
    this.last4ofPAN = last4ofPAN;
    return this;
  }

  
  /**
  * This field contains the last four digits of the cardholder primary account number (PAN)
  * @return last4ofPAN
  **/
  @ApiModelProperty(value = "This field contains the last four digits of the cardholder primary account number (PAN)")
  public Integer getLast4ofPAN() {
    return last4ofPAN;
  }
  public void setLast4ofPAN(Integer last4ofPAN) {
    this.last4ofPAN = last4ofPAN;
  }
  
  public PushFundsPostResponse responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  
  /**
  * The source for the response; typically, either the recipient issuer or a Visa system.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#response_code\&quot;&gt;response Code&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;: The VisaNet Response Source for the transaction
  * @return responseCode
  **/
  @ApiModelProperty(required = true, value = "The source for the response; typically, either the recipient issuer or a Visa system.<br><br>Refer to <a href=\"/request_response_codes#response_code\">response Code</a><br><b>Note: </b>: The VisaNet Response Source for the transaction")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }
  
  public PushFundsPostResponse actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

  
  /**
  * The results of the transaction request &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#action_code\&quot;&gt;action code&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;: The VisaNet Response Code for the transaction
  * @return actionCode
  **/
  @ApiModelProperty(required = true, value = "The results of the transaction request <br><br>Refer to <a href=\"/request_response_codes#action_code\">action code</a><br><b>Note: </b>: The VisaNet Response Code for the transaction")
  public String getActionCode() {
    return actionCode;
  }
  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }
  
  public PushFundsPostResponse transmissionDateTime(String transmissionDateTime) {
    this.transmissionDateTime = transmissionDateTime;
    return this;
  }

  
  /**
  * Example: 2016-01-15T07:03:52.000Z
  * @return transmissionDateTime
  **/
  @ApiModelProperty(required = true, value = "Example: 2016-01-15T07:03:52.000Z")
  public String getTransmissionDateTime() {
    return transmissionDateTime;
  }
  public void setTransmissionDateTime(String transmissionDateTime) {
    this.transmissionDateTime = transmissionDateTime;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFundsPostResponse pushFundsPostResponse = (PushFundsPostResponse) o;
    return Objects.equals(this.networkId, pushFundsPostResponse.networkId) &&
        Objects.equals(this.approvalCode, pushFundsPostResponse.approvalCode) &&
        Objects.equals(this.feeProgramIndicator, pushFundsPostResponse.feeProgramIndicator) &&
        Objects.equals(this.prepaidBalance, pushFundsPostResponse.prepaidBalance) &&
        Objects.equals(this.prepaidBalanceCurrency, pushFundsPostResponse.prepaidBalanceCurrency) &&
        Objects.equals(this.merchantVerificationValue, pushFundsPostResponse.merchantVerificationValue) &&
        Objects.equals(this.statusIdentifier, pushFundsPostResponse.statusIdentifier) &&
        Objects.equals(this.transactionIdentifier, pushFundsPostResponse.transactionIdentifier) &&
        Objects.equals(this.last4ofPAN, pushFundsPostResponse.last4ofPAN) &&
        Objects.equals(this.responseCode, pushFundsPostResponse.responseCode) &&
        Objects.equals(this.actionCode, pushFundsPostResponse.actionCode) &&
        Objects.equals(this.transmissionDateTime, pushFundsPostResponse.transmissionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, approvalCode, feeProgramIndicator, prepaidBalance, prepaidBalanceCurrency, merchantVerificationValue, statusIdentifier, transactionIdentifier, last4ofPAN, responseCode, actionCode, transmissionDateTime);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFundsPostResponse {\n");
    
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    sb.append("    prepaidBalance: ").append(toIndentedString(prepaidBalance)).append("\n");
    sb.append("    prepaidBalanceCurrency: ").append(toIndentedString(prepaidBalanceCurrency)).append("\n");
    sb.append("    merchantVerificationValue: ").append(toIndentedString(merchantVerificationValue)).append("\n");
    sb.append("    statusIdentifier: ").append(toIndentedString(statusIdentifier)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    last4ofPAN: ").append(toIndentedString(last4ofPAN)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    transmissionDateTime: ").append(toIndentedString(transmissionDateTime)).append("\n");
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



