package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Address verification is required for an AFT transaction to qualify for CPS
 */@ApiModel(description = "Address verification is required for an AFT transaction to qualify for CPS")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class AddressVerificationData {

  
  @JsonProperty("postalCode")
  private String postalCode = null;
  
  
  @JsonProperty("street")
  private String street = null;
  
  public AddressVerificationData postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  /**
  * Postal Code for address verification. For US, contains 5 or 9 digit ZIP
  * @return postalCode
  **/
  @ApiModelProperty(value = "Postal Code for address verification. For US, contains 5 or 9 digit ZIP")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
  
  public AddressVerificationData street(String street) {
    this.street = street;
    return this;
  }

  
  /**
  * Street for address verification
  * @return street
  **/
  @ApiModelProperty(value = "Street for address verification")
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
    AddressVerificationData addressVerificationData = (AddressVerificationData) o;
    return Objects.equals(this.postalCode, addressVerificationData.postalCode) &&
        Objects.equals(this.street, addressVerificationData.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode, street);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressVerificationData {\n");
    
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



