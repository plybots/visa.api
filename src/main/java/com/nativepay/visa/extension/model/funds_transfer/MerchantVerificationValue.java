


package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Merchant Verification Value(MVV) is used to identify merchants that participate in a variety of programs. The MVV is unique to the merchant.
 */@ApiModel(description = "Merchant Verification Value(MVV) is used to identify merchants that participate in a variety of programs. The MVV is unique to the merchant.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class MerchantVerificationValue {

  
  @JsonProperty("mvvAcquirerAssigned")
  private String mvvAcquirerAssigned = null;
  
  
  @JsonProperty("mvvVisaAssigned")
  private String mvvVisaAssigned = null;
  
  public MerchantVerificationValue mvvAcquirerAssigned(String mvvAcquirerAssigned) {
    this.mvvAcquirerAssigned = mvvAcquirerAssigned;
    return this;
  }

  
  /**
  * Visa assists the acquirer in assigning the last four. E.g. 98FC
  * @return mvvAcquirerAssigned
  **/
  @ApiModelProperty(required = true, value = "Visa assists the acquirer in assigning the last four. E.g. 98FC")
  public String getMvvAcquirerAssigned() {
    return mvvAcquirerAssigned;
  }
  public void setMvvAcquirerAssigned(String mvvAcquirerAssigned) {
    this.mvvAcquirerAssigned = mvvAcquirerAssigned;
  }
  
  public MerchantVerificationValue mvvVisaAssigned(String mvvVisaAssigned) {
    this.mvvVisaAssigned = mvvVisaAssigned;
    return this;
  }

  
  /**
  * Visa assigned MVV value. E.g. 0A45AF
  * @return mvvVisaAssigned
  **/
  @ApiModelProperty(required = true, value = "Visa assigned MVV value. E.g. 0A45AF")
  public String getMvvVisaAssigned() {
    return mvvVisaAssigned;
  }
  public void setMvvVisaAssigned(String mvvVisaAssigned) {
    this.mvvVisaAssigned = mvvVisaAssigned;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantVerificationValue merchantVerificationValue = (MerchantVerificationValue) o;
    return Objects.equals(this.mvvAcquirerAssigned, merchantVerificationValue.mvvAcquirerAssigned) &&
        Objects.equals(this.mvvVisaAssigned, merchantVerificationValue.mvvVisaAssigned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mvvAcquirerAssigned, mvvVisaAssigned);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantVerificationValue {\n");
    
    sb.append("    mvvAcquirerAssigned: ").append(toIndentedString(mvvAcquirerAssigned)).append("\n");
    sb.append("    mvvVisaAssigned: ").append(toIndentedString(mvvVisaAssigned)).append("\n");
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



