
package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Push Funds Transfer Response
 */@ApiModel(description = "Push Funds Transfer Response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class PushFundsTransactionsGetResponse {

  
  @JsonProperty("approvalCode")
  private String approvalCode = null;
  
  
  @JsonProperty("feeProgramIndicator")
  private String feeProgramIndicator = null;
  
  
  @JsonProperty("prepaidBalance")
  private String prepaidBalance = null;
  
  
  @JsonProperty("prepaidBalanceCurrency")
  private String prepaidBalanceCurrency = null;
  
  
  @JsonProperty("statusIdentifier")
  private String statusIdentifier = null;
  
  
  @JsonProperty("transactionIdentifier")
  private Integer transactionIdentifier = null;
  
  
  @JsonProperty("last4ofPAN")
  private Integer last4ofPAN = null;
  
  
  @JsonProperty("responseCode")
  private String responseCode = null;
  
  
  @JsonProperty("actionCode")
  private String actionCode = null;
  
  
  @JsonProperty("transmissionDateTime")
  private String transmissionDateTime = null;
  
  public PushFundsTransactionsGetResponse approvalCode(String approvalCode) {
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
  
  public PushFundsTransactionsGetResponse feeProgramIndicator(String feeProgramIndicator) {
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
  
  public PushFundsTransactionsGetResponse prepaidBalance(String prepaidBalance) {
    this.prepaidBalance = prepaidBalance;
    return this;
  }

  
  /**
  * Min Inclusive: -999999999.999&lt;br&gt;Max Inclusive: 999999999.999&lt;br&gt;Applicable only for Top Up Transactions
  * @return prepaidBalance
  **/
  @ApiModelProperty(value = "Min Inclusive: -999999999.999<br>Max Inclusive: 999999999.999<br>Applicable only for Top Up Transactions")
  public String getPrepaidBalance() {
    return prepaidBalance;
  }
  public void setPrepaidBalance(String prepaidBalance) {
    this.prepaidBalance = prepaidBalance;
  }
  
  public PushFundsTransactionsGetResponse prepaidBalanceCurrency(String prepaidBalanceCurrency) {
    this.prepaidBalanceCurrency = prepaidBalanceCurrency;
    return this;
  }

  
  /**
  * Applicable only for Top Up Transactions
  * @return prepaidBalanceCurrency
  **/
  @ApiModelProperty(value = "Applicable only for Top Up Transactions")
  public String getPrepaidBalanceCurrency() {
    return prepaidBalanceCurrency;
  }
  public void setPrepaidBalanceCurrency(String prepaidBalanceCurrency) {
    this.prepaidBalanceCurrency = prepaidBalanceCurrency;
  }
  
  public PushFundsTransactionsGetResponse statusIdentifier(String statusIdentifier) {
    this.statusIdentifier = statusIdentifier;
    return this;
  }

  
  /**
  * required when call times out
  * @return statusIdentifier
  **/
  @ApiModelProperty(value = "required when call times out")
  public String getStatusIdentifier() {
    return statusIdentifier;
  }
  public void setStatusIdentifier(String statusIdentifier) {
    this.statusIdentifier = statusIdentifier;
  }
  
  public PushFundsTransactionsGetResponse transactionIdentifier(Integer transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

  
  /**
  * The VisaNet reference number for the transaction&lt;br&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;&lt;br&gt;transactionIdentifier is a Visa generated field that client recieves in the response message.&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;As an exception Visa allows clients to use the transactionIdentifier received in the AFT response into the subsequent OCT message - this is to simplify matching the pull and push transaction pair and reconciliation.
  * @return transactionIdentifier
  **/
  @ApiModelProperty(required = true, value = "The VisaNet reference number for the transaction<br><br><b>Note: </b><br>transactionIdentifier is a Visa generated field that client recieves in the response message.<br><b>Note: </b>As an exception Visa allows clients to use the transactionIdentifier received in the AFT response into the subsequent OCT message - this is to simplify matching the pull and push transaction pair and reconciliation.")
  public Integer getTransactionIdentifier() {
    return transactionIdentifier;
  }
  public void setTransactionIdentifier(Integer transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }
  
  public PushFundsTransactionsGetResponse last4ofPAN(Integer last4ofPAN) {
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
  
  public PushFundsTransactionsGetResponse responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  
  /**
  * The source for the response; typically, either the recipient issuer or a Visa system.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#response_code\&quot;&gt;response code&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;: The VisaNet Response Source for the transaction
  * @return responseCode
  **/
  @ApiModelProperty(required = true, value = "The source for the response; typically, either the recipient issuer or a Visa system.<br><br>Refer to <a href=\"/request_response_codes#response_code\">response code</a><br><b>Note: </b>: The VisaNet Response Source for the transaction")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }
  
  public PushFundsTransactionsGetResponse actionCode(String actionCode) {
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
  
  public PushFundsTransactionsGetResponse transmissionDateTime(String transmissionDateTime) {
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
    PushFundsTransactionsGetResponse pushFundsTransactionsGetResponse = (PushFundsTransactionsGetResponse) o;
    return Objects.equals(this.approvalCode, pushFundsTransactionsGetResponse.approvalCode) &&
        Objects.equals(this.feeProgramIndicator, pushFundsTransactionsGetResponse.feeProgramIndicator) &&
        Objects.equals(this.prepaidBalance, pushFundsTransactionsGetResponse.prepaidBalance) &&
        Objects.equals(this.prepaidBalanceCurrency, pushFundsTransactionsGetResponse.prepaidBalanceCurrency) &&
        Objects.equals(this.statusIdentifier, pushFundsTransactionsGetResponse.statusIdentifier) &&
        Objects.equals(this.transactionIdentifier, pushFundsTransactionsGetResponse.transactionIdentifier) &&
        Objects.equals(this.last4ofPAN, pushFundsTransactionsGetResponse.last4ofPAN) &&
        Objects.equals(this.responseCode, pushFundsTransactionsGetResponse.responseCode) &&
        Objects.equals(this.actionCode, pushFundsTransactionsGetResponse.actionCode) &&
        Objects.equals(this.transmissionDateTime, pushFundsTransactionsGetResponse.transmissionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, feeProgramIndicator, prepaidBalance, prepaidBalanceCurrency, statusIdentifier, transactionIdentifier, last4ofPAN, responseCode, actionCode, transmissionDateTime);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFundsTransactionsGetResponse {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    sb.append("    prepaidBalance: ").append(toIndentedString(prepaidBalance)).append("\n");
    sb.append("    prepaidBalanceCurrency: ").append(toIndentedString(prepaidBalanceCurrency)).append("\n");
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



