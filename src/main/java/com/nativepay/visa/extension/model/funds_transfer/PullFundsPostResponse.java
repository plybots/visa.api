
package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Pull Funds Transfer Response
 */@ApiModel(description = "Pull Funds Transfer Response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class PullFundsPostResponse {

  
  @JsonProperty("networkId")
  private Integer networkId = null;
  
  
  @JsonProperty("approvalCode")
  private String approvalCode = null;
  
  
  @JsonProperty("feeProgramIndicator")
  private String feeProgramIndicator = null;
  
  
  @JsonProperty("last4ofPAN")
  private Integer last4ofPAN = null;
  
  
  @JsonProperty("merchantVerificationValue")
  private String merchantVerificationValue = null;
  
  
  @JsonProperty("cavvResultCode")
  private String cavvResultCode = null;
  
  
  @JsonProperty("statusIdentifier")
  private String statusIdentifier = null;
  
  
  @JsonProperty("transactionIdentifier")
  private String transactionIdentifier = null;
  
  
  @JsonProperty("chargebackRightsIndicator")
  private String chargebackRightsIndicator = null;
  
  
  @JsonProperty("memberComments")
  private String memberComments = null;
  
  
  @JsonProperty("responseCode")
  private String responseCode = null;
  
  
  @JsonProperty("actionCode")
  private String actionCode = null;
  
  
  @JsonProperty("cpsAuthorizationCharacteristicsIndicator")
  private String cpsAuthorizationCharacteristicsIndicator = null;
  
  
  @JsonProperty("reimbursementAttribute")
  private String reimbursementAttribute = null;
  
  
  @JsonProperty("transmissionDateTime")
  private String transmissionDateTime = null;
  
  public PullFundsPostResponse networkId(Integer networkId) {
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
  
  public PullFundsPostResponse approvalCode(String approvalCode) {
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
  
  public PullFundsPostResponse feeProgramIndicator(String feeProgramIndicator) {
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
  
  public PullFundsPostResponse last4ofPAN(Integer last4ofPAN) {
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
  
  public PullFundsPostResponse merchantVerificationValue(String merchantVerificationValue) {
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
  
  public PullFundsPostResponse cavvResultCode(String cavvResultCode) {
    this.cavvResultCode = cavvResultCode;
    return this;
  }

  
  /**
  * The cavvResultCode identifies the outcome of the CAVV validation. &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#cardholder_authentication_verification_value\&quot;&gt;cavvResultCode&lt;/a&gt;
  * @return cavvResultCode
  **/
  @ApiModelProperty(value = "The cavvResultCode identifies the outcome of the CAVV validation. <br><br>Refer to <a href=\"/request_response_codes#cardholder_authentication_verification_value\">cavvResultCode</a>")
  public String getCavvResultCode() {
    return cavvResultCode;
  }
  public void setCavvResultCode(String cavvResultCode) {
    this.cavvResultCode = cavvResultCode;
  }
  
  public PullFundsPostResponse statusIdentifier(String statusIdentifier) {
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
  
  public PullFundsPostResponse transactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

  
  /**
  * The VisaNet reference number for the transaction&lt;br&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;&lt;br&gt;transactionIdentifier is a Visa generated field that client recieves in the response message.&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;As an exception Visa allows clients to use the transactionIdentifier received in the AFT response into the subsequent OCT message - this is to simplify matching the pull and push transaction pair and reconciliation.
  * @return transactionIdentifier
  **/
  @ApiModelProperty(required = true, value = "The VisaNet reference number for the transaction<br><br><b>Note: </b><br>transactionIdentifier is a Visa generated field that client recieves in the response message.<br><b>Note: </b>As an exception Visa allows clients to use the transactionIdentifier received in the AFT response into the subsequent OCT message - this is to simplify matching the pull and push transaction pair and reconciliation.")
  public String  getTransactionIdentifier() {
    return transactionIdentifier;
  }
  public void setTransactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }
  
  public PullFundsPostResponse chargebackRightsIndicator(String chargebackRightsIndicator) {
    this.chargebackRightsIndicator = chargebackRightsIndicator;
    return this;
  }

  
  /**
  * This field contains a code that notifies the issuer of the CPS chargeback protection level.
  * @return chargebackRightsIndicator
  **/
  @ApiModelProperty(value = "This field contains a code that notifies the issuer of the CPS chargeback protection level.")
  public String getChargebackRightsIndicator() {
    return chargebackRightsIndicator;
  }
  public void setChargebackRightsIndicator(String chargebackRightsIndicator) {
    this.chargebackRightsIndicator = chargebackRightsIndicator;
  }
  
  public PullFundsPostResponse memberComments(String memberComments) {
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
  
  public PullFundsPostResponse responseCode(String responseCode) {
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
  
  public PullFundsPostResponse actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

  
  /**
  * The results of the transaction request &lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#action_code\&quot;&gt;actionCode&lt;/a&gt;
  * @return actionCode
  **/
  @ApiModelProperty(required = true, value = "The results of the transaction request <br><br>Refer to <a href=\"/request_response_codes#action_code\">actionCode</a>")
  public String getActionCode() {
    return actionCode;
  }
  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }
  
  public PullFundsPostResponse cpsAuthorizationCharacteristicsIndicator(String cpsAuthorizationCharacteristicsIndicator) {
    this.cpsAuthorizationCharacteristicsIndicator = cpsAuthorizationCharacteristicsIndicator;
    return this;
  }

  
  /**
  * Indicates whether AFT transaction has qualified for CPS
  * @return cpsAuthorizationCharacteristicsIndicator
  **/
  @ApiModelProperty(value = "Indicates whether AFT transaction has qualified for CPS")
  public String getCpsAuthorizationCharacteristicsIndicator() {
    return cpsAuthorizationCharacteristicsIndicator;
  }
  public void setCpsAuthorizationCharacteristicsIndicator(String cpsAuthorizationCharacteristicsIndicator) {
    this.cpsAuthorizationCharacteristicsIndicator = cpsAuthorizationCharacteristicsIndicator;
  }
  
  public PullFundsPostResponse reimbursementAttribute(String reimbursementAttribute) {
    this.reimbursementAttribute = reimbursementAttribute;
    return this;
  }

  
  /**
  * If AFT transaction has qualified for CPS then this field contains a code that identifies the applicable interchange reimbursement fee.
  * @return reimbursementAttribute
  **/
  @ApiModelProperty(value = "If AFT transaction has qualified for CPS then this field contains a code that identifies the applicable interchange reimbursement fee.")
  public String getReimbursementAttribute() {
    return reimbursementAttribute;
  }
  public void setReimbursementAttribute(String reimbursementAttribute) {
    this.reimbursementAttribute = reimbursementAttribute;
  }
  
  public PullFundsPostResponse transmissionDateTime(String transmissionDateTime) {
    this.transmissionDateTime = transmissionDateTime;
    return this;
  }

  
  /**
  * Example: 2016-01-15T07:03:52.000Z&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt; Remove �.000Z� if this field value is used for ReverseFundsTransactions POST request or MultiReverseFundsTransactions POST request.
  * @return transmissionDateTime
  **/
  @ApiModelProperty(required = true, value = "Example: 2016-01-15T07:03:52.000Z<br><b>Note: </b> Remove �.000Z� if this field value is used for ReverseFundsTransactions POST request or MultiReverseFundsTransactions POST request.")
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
    PullFundsPostResponse pullFundsPostResponse = (PullFundsPostResponse) o;
    return Objects.equals(this.networkId, pullFundsPostResponse.networkId) &&
        Objects.equals(this.approvalCode, pullFundsPostResponse.approvalCode) &&
        Objects.equals(this.feeProgramIndicator, pullFundsPostResponse.feeProgramIndicator) &&
        Objects.equals(this.last4ofPAN, pullFundsPostResponse.last4ofPAN) &&
        Objects.equals(this.merchantVerificationValue, pullFundsPostResponse.merchantVerificationValue) &&
        Objects.equals(this.cavvResultCode, pullFundsPostResponse.cavvResultCode) &&
        Objects.equals(this.statusIdentifier, pullFundsPostResponse.statusIdentifier) &&
        Objects.equals(this.transactionIdentifier, pullFundsPostResponse.transactionIdentifier) &&
        Objects.equals(this.chargebackRightsIndicator, pullFundsPostResponse.chargebackRightsIndicator) &&
        Objects.equals(this.memberComments, pullFundsPostResponse.memberComments) &&
        Objects.equals(this.responseCode, pullFundsPostResponse.responseCode) &&
        Objects.equals(this.actionCode, pullFundsPostResponse.actionCode) &&
        Objects.equals(this.cpsAuthorizationCharacteristicsIndicator, pullFundsPostResponse.cpsAuthorizationCharacteristicsIndicator) &&
        Objects.equals(this.reimbursementAttribute, pullFundsPostResponse.reimbursementAttribute) &&
        Objects.equals(this.transmissionDateTime, pullFundsPostResponse.transmissionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, approvalCode, feeProgramIndicator, last4ofPAN, merchantVerificationValue, cavvResultCode, statusIdentifier, transactionIdentifier, chargebackRightsIndicator, memberComments, responseCode, actionCode, cpsAuthorizationCharacteristicsIndicator, reimbursementAttribute, transmissionDateTime);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullFundsPostResponse {\n");
    
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    sb.append("    last4ofPAN: ").append(toIndentedString(last4ofPAN)).append("\n");
    sb.append("    merchantVerificationValue: ").append(toIndentedString(merchantVerificationValue)).append("\n");
    sb.append("    cavvResultCode: ").append(toIndentedString(cavvResultCode)).append("\n");
    sb.append("    statusIdentifier: ").append(toIndentedString(statusIdentifier)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    chargebackRightsIndicator: ").append(toIndentedString(chargebackRightsIndicator)).append("\n");
    sb.append("    memberComments: ").append(toIndentedString(memberComments)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    cpsAuthorizationCharacteristicsIndicator: ").append(toIndentedString(cpsAuthorizationCharacteristicsIndicator)).append("\n");
    sb.append("    reimbursementAttribute: ").append(toIndentedString(reimbursementAttribute)).append("\n");
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



