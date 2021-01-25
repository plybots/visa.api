

package com.nativepay.visa.extension.model.payment_account_validation;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * CardValidationPostResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:58:28.768+05:30[Asia/Kolkata]")
public class CardValidationPostResponse {

  
  @JsonProperty("approvalCode")
  private String approvalCode = null;
  
  
  @JsonProperty("cardVerificationResults")
  private String cardVerificationResults = null;
  
  
  @JsonProperty("transactionIdentifier")
  private Integer transactionIdentifier = null;
  
  
  @JsonProperty("cardholderAuthenticationVerificationResults")
  private String cardholderAuthenticationVerificationResults = null;
  
  
  @JsonProperty(" cvv2ResultCode")
  private String _cvv2ResultCode = null;
  
  
  @JsonProperty("cardAuthenticationResults")
  private String cardAuthenticationResults = null;
  
  
  @JsonProperty("responseCode")
  private String responseCode = null;
  
  
  @JsonProperty("actionCode")
  private String actionCode = null;
  
  
  @JsonProperty("addressVerificationResults")
  private String addressVerificationResults = null;
  
  public CardValidationPostResponse approvalCode(String approvalCode) {
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
  
  public CardValidationPostResponse cardVerificationResults(String cardVerificationResults) {
    this.cardVerificationResults = cardVerificationResults;
    return this;
  }

  
  /**
  * A Visa-defined code indicating Card Verification Value (CVV), iCVV (Integrated Chip Card CVV) or dCVV (dynamic CVV) verification results. &lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#cvv_icvv_results_codes\&quot;&gt; CVV/iCVV Results Codes.&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;Reserved for future use
  * @return cardVerificationResults
  **/
  @ApiModelProperty(value = "A Visa-defined code indicating Card Verification Value (CVV), iCVV (Integrated Chip Card CVV) or dCVV (dynamic CVV) verification results. <br>Refer to <a href=\"/request_response_codes#cvv_icvv_results_codes\"> CVV/iCVV Results Codes.</a><br><b>Note: </b>Reserved for future use")
  public String getCardVerificationResults() {
    return cardVerificationResults;
  }
  public void setCardVerificationResults(String cardVerificationResults) {
    this.cardVerificationResults = cardVerificationResults;
  }
  
  public CardValidationPostResponse transactionIdentifier(Integer transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

  
  /**
  * The VisaNet reference number for the transaction.
  * @return transactionIdentifier
  **/
  @ApiModelProperty(required = true, value = "The VisaNet reference number for the transaction.")
  public Integer getTransactionIdentifier() {
    return transactionIdentifier;
  }
  public void setTransactionIdentifier(Integer transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }
  
  public CardValidationPostResponse cardholderAuthenticationVerificationResults(String cardholderAuthenticationVerificationResults) {
    this.cardholderAuthenticationVerificationResults = cardholderAuthenticationVerificationResults;
    return this;
  }

  
  /**
  * Results of the Cardholder Authentication Verification Value (CAVV) validation. &lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#cardholder_authentication_verification_value\&quot;&gt;CAVV Results Codes.&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;Reserved for future use
  * @return cardholderAuthenticationVerificationResults
  **/
  @ApiModelProperty(value = "Results of the Cardholder Authentication Verification Value (CAVV) validation. <br>Refer to <a href=\"/request_response_codes#cardholder_authentication_verification_value\">CAVV Results Codes.</a><br><b>Note: </b>Reserved for future use")
  public String getCardholderAuthenticationVerificationResults() {
    return cardholderAuthenticationVerificationResults;
  }
  public void setCardholderAuthenticationVerificationResults(String cardholderAuthenticationVerificationResults) {
    this.cardholderAuthenticationVerificationResults = cardholderAuthenticationVerificationResults;
  }
  
  public CardValidationPostResponse _cvv2ResultCode(String _cvv2ResultCode) {
    this._cvv2ResultCode = _cvv2ResultCode;
    return this;
  }

  
  /**
  * Results of the CVV2 validation for the primaryAccountNumber in the request.&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#card_verification2_results\&quot;&gt;cvv2ResultsCode&lt;/a&gt;
  * @return _cvv2ResultCode
  **/
  @ApiModelProperty(value = "Results of the CVV2 validation for the primaryAccountNumber in the request.<br>Refer to <a href=\"/request_response_codes#card_verification2_results\">cvv2ResultsCode</a>")
  public String getCvv2ResultCode() {
    return _cvv2ResultCode;
  }
  public void setCvv2ResultCode(String _cvv2ResultCode) {
    this._cvv2ResultCode = _cvv2ResultCode;
  }
  
  public CardValidationPostResponse cardAuthenticationResults(String cardAuthenticationResults) {
    this.cardAuthenticationResults = cardAuthenticationResults;
    return this;
  }

  
  /**
  * A Visa-defined code indicating Online Card Authentication Method results. &lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#card_authentication_results\&quot;&gt;cardAuthenticationResults.&lt;/a&gt;&lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;Reserved for future use
  * @return cardAuthenticationResults
  **/
  @ApiModelProperty(value = "A Visa-defined code indicating Online Card Authentication Method results. <br>Refer to <a href=\"/request_response_codes#card_authentication_results\">cardAuthenticationResults.</a><br><b>Note: </b>Reserved for future use")
  public String getCardAuthenticationResults() {
    return cardAuthenticationResults;
  }
  public void setCardAuthenticationResults(String cardAuthenticationResults) {
    this.cardAuthenticationResults = cardAuthenticationResults;
  }
  
  public CardValidationPostResponse responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  
  /**
  * The source for the response; typically, either the recipient issuer or a Visa system. &lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#response_code\&quot;&gt;Response Code&lt;/a&gt;
  * @return responseCode
  **/
  @ApiModelProperty(required = true, value = "The source for the response; typically, either the recipient issuer or a Visa system. <br>Refer to <a href=\"/request_response_codes#response_code\">Response Code</a>")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }
  
  public CardValidationPostResponse actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

  
  /**
  * The results of the transaction request.&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#action_code\&quot;&gt;Action Code&lt;/a&gt; &lt;br&gt;&lt;b&gt;Note: &lt;/b&gt;The VisaNet Response Code for the transaction
  * @return actionCode
  **/
  @ApiModelProperty(required = true, value = "The results of the transaction request.<br>Refer to <a href=\"/request_response_codes#action_code\">Action Code</a> <br><b>Note: </b>The VisaNet Response Code for the transaction")
  public String getActionCode() {
    return actionCode;
  }
  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }
  
  public CardValidationPostResponse addressVerificationResults(String addressVerificationResults) {
    this.addressVerificationResults = addressVerificationResults;
    return this;
  }

  
  /**
  * Results of the Address Verification Service (AVS) validation for the PrimaryAccountNumber in the request. &lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#address_verification_results\&quot;&gt;Address Verification Results&lt;/a&gt;
  * @return addressVerificationResults
  **/
  @ApiModelProperty(value = "Results of the Address Verification Service (AVS) validation for the PrimaryAccountNumber in the request. <br>Refer to <a href=\"/request_response_codes#address_verification_results\">Address Verification Results</a>")
  public String getAddressVerificationResults() {
    return addressVerificationResults;
  }
  public void setAddressVerificationResults(String addressVerificationResults) {
    this.addressVerificationResults = addressVerificationResults;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardValidationPostResponse cardValidationPostResponse = (CardValidationPostResponse) o;
    return Objects.equals(this.approvalCode, cardValidationPostResponse.approvalCode) &&
        Objects.equals(this.cardVerificationResults, cardValidationPostResponse.cardVerificationResults) &&
        Objects.equals(this.transactionIdentifier, cardValidationPostResponse.transactionIdentifier) &&
        Objects.equals(this.cardholderAuthenticationVerificationResults, cardValidationPostResponse.cardholderAuthenticationVerificationResults) &&
        Objects.equals(this._cvv2ResultCode, cardValidationPostResponse._cvv2ResultCode) &&
        Objects.equals(this.cardAuthenticationResults, cardValidationPostResponse.cardAuthenticationResults) &&
        Objects.equals(this.responseCode, cardValidationPostResponse.responseCode) &&
        Objects.equals(this.actionCode, cardValidationPostResponse.actionCode) &&
        Objects.equals(this.addressVerificationResults, cardValidationPostResponse.addressVerificationResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, cardVerificationResults, transactionIdentifier, cardholderAuthenticationVerificationResults, _cvv2ResultCode, cardAuthenticationResults, responseCode, actionCode, addressVerificationResults);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardValidationPostResponse {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    cardVerificationResults: ").append(toIndentedString(cardVerificationResults)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    cardholderAuthenticationVerificationResults: ").append(toIndentedString(cardholderAuthenticationVerificationResults)).append("\n");
    sb.append("    _cvv2ResultCode: ").append(toIndentedString(_cvv2ResultCode)).append("\n");
    sb.append("    cardAuthenticationResults: ").append(toIndentedString(cardAuthenticationResults)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    addressVerificationResults: ").append(toIndentedString(addressVerificationResults)).append("\n");
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



