
package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent Transactions, this field is required.
 */@ApiModel(description = "<b>Note:</b> For a CardPresent Transactions, this field is required.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class PointOfServiceData {

  
  @JsonProperty("posConditionCode")
  private Integer posConditionCode = null;
  
  
  @JsonProperty("panEntryMode")
  private Integer panEntryMode = null;
  
  
  @JsonProperty("motoECIIndicator")
  private String motoECIIndicator = null;
  
  public PointOfServiceData posConditionCode(Integer posConditionCode) {
    this.posConditionCode = posConditionCode;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent scenario, this field is required.
  * @return posConditionCode
  **/
  @ApiModelProperty(value = "<b>Note:</b> For a CardPresent scenario, this field is required.")
  public Integer getPosConditionCode() {
    return posConditionCode;
  }
  public void setPosConditionCode(Integer posConditionCode) {
    this.posConditionCode = posConditionCode;
  }
  
  public PointOfServiceData panEntryMode(Integer panEntryMode) {
    this.panEntryMode = panEntryMode;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent scenario, this field is required.
  * @return panEntryMode
  **/
  @ApiModelProperty(value = "<b>Note:</b> For a CardPresent scenario, this field is required.")
  public Integer getPanEntryMode() {
    return panEntryMode;
  }
  public void setPanEntryMode(Integer panEntryMode) {
    this.panEntryMode = panEntryMode;
  }
  
  public PointOfServiceData motoECIIndicator(String motoECIIndicator) {
    this.motoECIIndicator = motoECIIndicator;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt; If posConditionCode is 59, motoECIIndicator must be between 5-8. Default is set to 5 if not provided. If posConditionCode is 0, motoECIIndicator will not be sent. If cavv is not provided, then motoECIIndicator should be set as 7.
  * @return motoECIIndicator
  **/
  @ApiModelProperty(value = "<b>Note:</b> If posConditionCode is 59, motoECIIndicator must be between 5-8. Default is set to 5 if not provided. If posConditionCode is 0, motoECIIndicator will not be sent. If cavv is not provided, then motoECIIndicator should be set as 7.")
  public String getMotoECIIndicator() {
    return motoECIIndicator;
  }
  public void setMotoECIIndicator(String motoECIIndicator) {
    this.motoECIIndicator = motoECIIndicator;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfServiceData pointOfServiceData = (PointOfServiceData) o;
    return Objects.equals(this.posConditionCode, pointOfServiceData.posConditionCode) &&
        Objects.equals(this.panEntryMode, pointOfServiceData.panEntryMode) &&
        Objects.equals(this.motoECIIndicator, pointOfServiceData.motoECIIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posConditionCode, panEntryMode, motoECIIndicator);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfServiceData {\n");
    
    sb.append("    posConditionCode: ").append(toIndentedString(posConditionCode)).append("\n");
    sb.append("    panEntryMode: ").append(toIndentedString(panEntryMode)).append("\n");
    sb.append("    motoECIIndicator: ").append(toIndentedString(motoECIIndicator)).append("\n");
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



