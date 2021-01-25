
package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * PinData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class PinData {

  
  @JsonProperty("securityRelatedControlInfo")
  private SecurityRelatedControlInfo securityRelatedControlInfo = null;
  
  
  @JsonProperty("pinDataBlock")
  private String pinDataBlock = null;
  
  public PinData securityRelatedControlInfo(SecurityRelatedControlInfo securityRelatedControlInfo) {
    this.securityRelatedControlInfo = securityRelatedControlInfo;
    return this;
  }

  
  /**
  * Get securityRelatedControlInfo
  * @return securityRelatedControlInfo
  **/
  @ApiModelProperty(value = "")
  public SecurityRelatedControlInfo getSecurityRelatedControlInfo() {
    return securityRelatedControlInfo;
  }
  public void setSecurityRelatedControlInfo(SecurityRelatedControlInfo securityRelatedControlInfo) {
    this.securityRelatedControlInfo = securityRelatedControlInfo;
  }
  
  public PinData pinDataBlock(String pinDataBlock) {
    this.pinDataBlock = pinDataBlock;
    return this;
  }

  
  /**
  * For a CardPresent with PIN Data scenario, this field is required.
  * @return pinDataBlock
  **/
  @ApiModelProperty(value = "For a CardPresent with PIN Data scenario, this field is required.")
  public String getPinDataBlock() {
    return pinDataBlock;
  }
  public void setPinDataBlock(String pinDataBlock) {
    this.pinDataBlock = pinDataBlock;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinData pinData = (PinData) o;
    return Objects.equals(this.securityRelatedControlInfo, pinData.securityRelatedControlInfo) &&
        Objects.equals(this.pinDataBlock, pinData.pinDataBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityRelatedControlInfo, pinDataBlock);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinData {\n");
    
    sb.append("    securityRelatedControlInfo: ").append(toIndentedString(securityRelatedControlInfo)).append("\n");
    sb.append("    pinDataBlock: ").append(toIndentedString(pinDataBlock)).append("\n");
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



