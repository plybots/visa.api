

package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Multi Reverse Funds Transfer Response
 */@ApiModel(description = "Multi Reverse Funds Transfer Response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class MultiReverseFundsTransactionsGetResponse {

  
  @JsonProperty("approvalCode")
  private String approvalCode = null;
  
  
  @JsonProperty("feeProgramIndicator")
  private String feeProgramIndicator = null;
  
  
  @JsonProperty("last4ofPAN")
  private Integer last4ofPAN = null;
  
  
  @JsonProperty("statusIdentifier")
  private String statusIdentifier = null;
  
  
  @JsonProperty("transactionIdentifier")
  private Integer transactionIdentifier = null;
  
  
  @JsonProperty("memberComments")
  private String memberComments = null;
  
  
  @JsonProperty("responseCode")
  private String responseCode = null;
  
  
  @JsonProperty("actionCode")
  private String actionCode = null;
  
  
  @JsonProperty("transmissionDateTime")
  private String transmissionDateTime = null;
  
  public MultiReverseFundsTransactionsGetResponse approvalCode(String approvalCode) {
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
  
  public MultiReverseFundsTransactionsGetResponse feeProgramIndicator(String feeProgramIndicator) {
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
  
  public MultiReverseFundsTransactionsGetResponse last4ofPAN(Integer last4ofPAN) {
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
  
  public MultiReverseFundsTransactionsGetResponse statusIdentifier(String statusIdentifier) {
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
  
  public MultiReverseFundsTransactionsGetResponse transactionIdentifier(Integer transactionIdentifier) {
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
  
  public MultiReverseFundsTransactionsGetResponse memberComments(String memberComments) {
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
  
  public MultiReverseFundsTransactionsGetResponse responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  
  /**
  * The source for the response; typically, either the recipient issuer or a Visa system.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#response_code\&quot;&gt;responseCode&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;: The VisaNet Response Source for the transaction
  * @return responseCode
  **/
  @ApiModelProperty(required = true, value = "The source for the response; typically, either the recipient issuer or a Visa system.<br><br>Refer to <a href=\"/request_response_codes#response_code\">responseCode</a><br><b>Note: </b>: The VisaNet Response Source for the transaction")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }
  
  public MultiReverseFundsTransactionsGetResponse actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

  
  /**
  * The results of the transaction request &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#action_code\&quot;&gt;actionCode&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;: The VisaNet Response Code for the transaction
  * @return actionCode
  **/
  @ApiModelProperty(required = true, value = "The results of the transaction request <br><br>Refer to <a href=\"/request_response_codes#action_code\">actionCode</a><br><b>Note: </b>: The VisaNet Response Code for the transaction")
  public String getActionCode() {
    return actionCode;
  }
  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }
  
  public MultiReverseFundsTransactionsGetResponse transmissionDateTime(String transmissionDateTime) {
    this.transmissionDateTime = transmissionDateTime;
    return this;
  }

  
  /**
  * Example: 2016-01-15T07:03:52:000Z
  * @return transmissionDateTime
  **/
  @ApiModelProperty(required = true, value = "Example: 2016-01-15T07:03:52:000Z")
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
    MultiReverseFundsTransactionsGetResponse multiReverseFundsTransactionsGetResponse = (MultiReverseFundsTransactionsGetResponse) o;
    return Objects.equals(this.approvalCode, multiReverseFundsTransactionsGetResponse.approvalCode) &&
        Objects.equals(this.feeProgramIndicator, multiReverseFundsTransactionsGetResponse.feeProgramIndicator) &&
        Objects.equals(this.last4ofPAN, multiReverseFundsTransactionsGetResponse.last4ofPAN) &&
        Objects.equals(this.statusIdentifier, multiReverseFundsTransactionsGetResponse.statusIdentifier) &&
        Objects.equals(this.transactionIdentifier, multiReverseFundsTransactionsGetResponse.transactionIdentifier) &&
        Objects.equals(this.memberComments, multiReverseFundsTransactionsGetResponse.memberComments) &&
        Objects.equals(this.responseCode, multiReverseFundsTransactionsGetResponse.responseCode) &&
        Objects.equals(this.actionCode, multiReverseFundsTransactionsGetResponse.actionCode) &&
        Objects.equals(this.transmissionDateTime, multiReverseFundsTransactionsGetResponse.transmissionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, feeProgramIndicator, last4ofPAN, statusIdentifier, transactionIdentifier, memberComments, responseCode, actionCode, transmissionDateTime);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiReverseFundsTransactionsGetResponse {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    sb.append("    last4ofPAN: ").append(toIndentedString(last4ofPAN)).append("\n");
    sb.append("    statusIdentifier: ").append(toIndentedString(statusIdentifier)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    memberComments: ").append(toIndentedString(memberComments)).append("\n");
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



