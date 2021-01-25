
package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent Transactions, this field is required.
 */@ApiModel(description = "<b>Note:</b> For a CardPresent Transactions, this field is required.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class PointOfServiceCapability {

  
  @JsonProperty("posTerminalType")
  private Integer posTerminalType = null;
  
  
  @JsonProperty("posTerminalEntryCapability")
  private Integer posTerminalEntryCapability = null;
  
  public PointOfServiceCapability posTerminalType(Integer posTerminalType) {
    this.posTerminalType = posTerminalType;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt;Valid values if card is present include 0, 3 and 4. If card is not present, valid value is 5.
  * @return posTerminalType
  **/
  @ApiModelProperty(value = "<b>Note:</b>Valid values if card is present include 0, 3 and 4. If card is not present, valid value is 5.")
  public Integer getPosTerminalType() {
    return posTerminalType;
  }
  public void setPosTerminalType(Integer posTerminalType) {
    this.posTerminalType = posTerminalType;
  }
  
  public PointOfServiceCapability posTerminalEntryCapability(Integer posTerminalEntryCapability) {
    this.posTerminalEntryCapability = posTerminalEntryCapability;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt;Valid values if card is present include 0, 2 and 9. If card is not present, valid value is 1.
  * @return posTerminalEntryCapability
  **/
  @ApiModelProperty(value = "<b>Note:</b>Valid values if card is present include 0, 2 and 9. If card is not present, valid value is 1.")
  public Integer getPosTerminalEntryCapability() {
    return posTerminalEntryCapability;
  }
  public void setPosTerminalEntryCapability(Integer posTerminalEntryCapability) {
    this.posTerminalEntryCapability = posTerminalEntryCapability;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfServiceCapability pointOfServiceCapability = (PointOfServiceCapability) o;
    return Objects.equals(this.posTerminalType, pointOfServiceCapability.posTerminalType) &&
        Objects.equals(this.posTerminalEntryCapability, pointOfServiceCapability.posTerminalEntryCapability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posTerminalType, posTerminalEntryCapability);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfServiceCapability {\n");
    
    sb.append("    posTerminalType: ").append(toIndentedString(posTerminalType)).append("\n");
    sb.append("    posTerminalEntryCapability: ").append(toIndentedString(posTerminalEntryCapability)).append("\n");
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



