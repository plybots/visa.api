
package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * OriginalDataElements
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class OriginalDataElements {

  
  @JsonProperty("acquiringBin")
  private Integer acquiringBin = null;
  
  
  @JsonProperty("approvalCode")
  private String approvalCode = null;
  
  
  @JsonProperty("systemsTraceAuditNumber")
  private Integer systemsTraceAuditNumber = null;
  
  
  @JsonProperty("transmissionDateTime")
  private String transmissionDateTime = null;
  
  public OriginalDataElements acquiringBin(Integer acquiringBin) {
    this.acquiringBin = acquiringBin;
    return this;
  }

  
  /**
  * This field must contain the Bank Identification Number (BIN) from the original AFT.
  * @return acquiringBin
  **/
  @ApiModelProperty(value = "This field must contain the Bank Identification Number (BIN) from the original AFT.")
  public Integer getAcquiringBin() {
    return acquiringBin;
  }
  public void setAcquiringBin(Integer acquiringBin) {
    this.acquiringBin = acquiringBin;
  }
  
  public OriginalDataElements approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

  
  /**
  * This field, if present, must contain the approvalCode from the original AFT.
  * @return approvalCode
  **/
  @ApiModelProperty(value = "This field, if present, must contain the approvalCode from the original AFT.")
  public String getApprovalCode() {
    return approvalCode;
  }
  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }
  
  public OriginalDataElements systemsTraceAuditNumber(Integer systemsTraceAuditNumber) {
    this.systemsTraceAuditNumber = systemsTraceAuditNumber;
    return this;
  }

  
  /**
  * This field must contain the systemsTraceAuditNumber from the original AFT.
  * @return systemsTraceAuditNumber
  **/
  @ApiModelProperty(value = "This field must contain the systemsTraceAuditNumber from the original AFT.")
  public Integer getSystemsTraceAuditNumber() {
    return systemsTraceAuditNumber;
  }
  public void setSystemsTraceAuditNumber(Integer systemsTraceAuditNumber) {
    this.systemsTraceAuditNumber = systemsTraceAuditNumber;
  }
  
  public OriginalDataElements transmissionDateTime(String transmissionDateTime) {
    this.transmissionDateTime = transmissionDateTime;
    return this;
  }

  
  /**
  * This field must contain the transmissionDateTime from the original AFT &lt;br&gt;Example: 2016-01-15T07:03:52
  * @return transmissionDateTime
  **/
  @ApiModelProperty(value = "This field must contain the transmissionDateTime from the original AFT <br>Example: 2016-01-15T07:03:52")
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
    OriginalDataElements originalDataElements = (OriginalDataElements) o;
    return Objects.equals(this.acquiringBin, originalDataElements.acquiringBin) &&
        Objects.equals(this.approvalCode, originalDataElements.approvalCode) &&
        Objects.equals(this.systemsTraceAuditNumber, originalDataElements.systemsTraceAuditNumber) &&
        Objects.equals(this.transmissionDateTime, originalDataElements.transmissionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquiringBin, approvalCode, systemsTraceAuditNumber, transmissionDateTime);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginalDataElements {\n");
    
    sb.append("    acquiringBin: ").append(toIndentedString(acquiringBin)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    systemsTraceAuditNumber: ").append(toIndentedString(systemsTraceAuditNumber)).append("\n");
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



