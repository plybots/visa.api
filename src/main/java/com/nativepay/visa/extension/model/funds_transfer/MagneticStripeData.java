


package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * MagneticStripeData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class MagneticStripeData {

  
  @JsonProperty("track1Data")
  private String track1Data = null;
  
  
  @JsonProperty("track2Data")
  private String track2Data = null;
  
  public MagneticStripeData track1Data(String track1Data) {
    this.track1Data = track1Data;
    return this;
  }

  
  /**
  * &lt;b&gt;Conditional (see Note)&lt;/b&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; For a cardPresent scenario, magneticStripeData.track1Data (or magneticStripeData.track2Data) must be included.&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; These fields are only available in OCT transactions in specific geographies. Please reach out to your Visa representative for details
  * @return track1Data
  **/
  @ApiModelProperty(value = "<b>Conditional (see Note)</b><br><br><b>Note:</b> For a cardPresent scenario, magneticStripeData.track1Data (or magneticStripeData.track2Data) must be included.<br><br><b>Note:</b> These fields are only available in OCT transactions in specific geographies. Please reach out to your Visa representative for details")
  public String getTrack1Data() {
    return track1Data;
  }
  public void setTrack1Data(String track1Data) {
    this.track1Data = track1Data;
  }
  
  public MagneticStripeData track2Data(String track2Data) {
    this.track2Data = track2Data;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent scenario, MagneticStripeData.track1Data (or MagneticStripeData.track2Data) must be included.
  * @return track2Data
  **/
  @ApiModelProperty(value = "<b>Note:</b> For a CardPresent scenario, MagneticStripeData.track1Data (or MagneticStripeData.track2Data) must be included.")
  public String getTrack2Data() {
    return track2Data;
  }
  public void setTrack2Data(String track2Data) {
    this.track2Data = track2Data;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagneticStripeData magneticStripeData = (MagneticStripeData) o;
    return Objects.equals(this.track1Data, magneticStripeData.track1Data) &&
        Objects.equals(this.track2Data, magneticStripeData.track2Data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(track1Data, track2Data);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagneticStripeData {\n");
    
    sb.append("    track1Data: ").append(toIndentedString(track1Data)).append("\n");
    sb.append("    track2Data: ").append(toIndentedString(track2Data)).append("\n");
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



