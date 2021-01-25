
package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * SecurityRelatedControlInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class SecurityRelatedControlInfo {

  
  @JsonProperty("pinBlockFormatCode")
  private Integer pinBlockFormatCode = null;
  
  
  @JsonProperty("zoneKeyIndex")
  private Integer zoneKeyIndex = null;
  
  public SecurityRelatedControlInfo pinBlockFormatCode(Integer pinBlockFormatCode) {
    this.pinBlockFormatCode = pinBlockFormatCode;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent with PIN Data scenario, this field is required.
  * @return pinBlockFormatCode
  **/
  @ApiModelProperty(value = "<b>Note:</b> For a CardPresent with PIN Data scenario, this field is required.")
  public Integer getPinBlockFormatCode() {
    return pinBlockFormatCode;
  }
  public void setPinBlockFormatCode(Integer pinBlockFormatCode) {
    this.pinBlockFormatCode = pinBlockFormatCode;
  }
  
  public SecurityRelatedControlInfo zoneKeyIndex(Integer zoneKeyIndex) {
    this.zoneKeyIndex = zoneKeyIndex;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent with PIN Data scenario, this field is required.
  * @return zoneKeyIndex
  **/
  @ApiModelProperty(value = "<b>Note:</b> For a CardPresent with PIN Data scenario, this field is required.")
  public Integer getZoneKeyIndex() {
    return zoneKeyIndex;
  }
  public void setZoneKeyIndex(Integer zoneKeyIndex) {
    this.zoneKeyIndex = zoneKeyIndex;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityRelatedControlInfo securityRelatedControlInfo = (SecurityRelatedControlInfo) o;
    return Objects.equals(this.pinBlockFormatCode, securityRelatedControlInfo.pinBlockFormatCode) &&
        Objects.equals(this.zoneKeyIndex, securityRelatedControlInfo.zoneKeyIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinBlockFormatCode, zoneKeyIndex);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityRelatedControlInfo {\n");
    
    sb.append("    pinBlockFormatCode: ").append(toIndentedString(pinBlockFormatCode)).append("\n");
    sb.append("    zoneKeyIndex: ").append(toIndentedString(zoneKeyIndex)).append("\n");
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



