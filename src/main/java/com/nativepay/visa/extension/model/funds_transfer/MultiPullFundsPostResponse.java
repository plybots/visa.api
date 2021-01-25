

package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Multi Pull Funds Transfer Response
 */@ApiModel(description = "Multi Pull Funds Transfer Response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class MultiPullFundsPostResponse {

  
  @JsonProperty("networkId")
  private Integer networkId = null;
  
  
  @JsonProperty("merchantVerificationValue")
  private String merchantVerificationValue = null;
  
  
  @JsonProperty("memberComments")
  private String memberComments = null;
  
  
  @JsonProperty("statusIdentifier")
  private String statusIdentifier = null;
  
  public MultiPullFundsPostResponse networkId(Integer networkId) {
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
  
  public MultiPullFundsPostResponse merchantVerificationValue(String merchantVerificationValue) {
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
  
  public MultiPullFundsPostResponse memberComments(String memberComments) {
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
  
  public MultiPullFundsPostResponse statusIdentifier(String statusIdentifier) {
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
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiPullFundsPostResponse multiPullFundsPostResponse = (MultiPullFundsPostResponse) o;
    return Objects.equals(this.networkId, multiPullFundsPostResponse.networkId) &&
        Objects.equals(this.merchantVerificationValue, multiPullFundsPostResponse.merchantVerificationValue) &&
        Objects.equals(this.memberComments, multiPullFundsPostResponse.memberComments) &&
        Objects.equals(this.statusIdentifier, multiPullFundsPostResponse.statusIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, merchantVerificationValue, memberComments, statusIdentifier);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiPullFundsPostResponse {\n");
    
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    merchantVerificationValue: ").append(toIndentedString(merchantVerificationValue)).append("\n");
    sb.append("    memberComments: ").append(toIndentedString(memberComments)).append("\n");
    sb.append("    statusIdentifier: ").append(toIndentedString(statusIdentifier)).append("\n");
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



