

package com.nativepay.visa.extension.model.payment_account_validation;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * CardValidationPostPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:58:28.768+05:30[Asia/Kolkata]")
public class CardValidationPostPayload {

  
  @JsonProperty("postalCode")
  private String postalCode = null;
  
  
  @JsonProperty("street")
  private String street = null;
  
  public CardValidationPostPayload postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  /**
  * Postal Code provided by the account holder for the primaryAccountNumber in the request.&lt;br&gt;Required when cardCvv2Value is not present.
  * @return postalCode
  **/
  @ApiModelProperty(value = "Postal Code provided by the account holder for the primaryAccountNumber in the request.<br>Required when cardCvv2Value is not present.")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
  
  public CardValidationPostPayload street(String street) {
    this.street = street;
    return this;
  }

  
  /**
  * Address provided by the account holder for the primaryAccountNumber in the request.&lt;br&gt;Required when cardCvv2Value is not present.
  * @return street
  **/
  @ApiModelProperty(value = "Address provided by the account holder for the primaryAccountNumber in the request.<br>Required when cardCvv2Value is not present.")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardValidationPostPayload cardValidationPostPayload = (CardValidationPostPayload) o;
    return Objects.equals(this.postalCode, cardValidationPostPayload.postalCode) &&
        Objects.equals(this.street, cardValidationPostPayload.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode, street);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardValidationPostPayload {\n");
    
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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



