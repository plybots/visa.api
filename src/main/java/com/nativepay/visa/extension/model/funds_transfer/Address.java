
package com.nativepay.visa.extension.model.funds_transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class Address {

  
  @JsonProperty("county")
  private String county = null;
  
  
  @JsonProperty("country")
  private String country = null;
  
  
  @JsonProperty("state")
  private String state = null;
  
  
  @JsonProperty("zipCode")
  private String zipCode = null;
  
  public Address county(String county) {
    this.county = county;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt;county of the money transfer operator/Originator.&lt;br&gt;&lt;br&gt;Required if cardAcceptor:address:country is \&quot;US\&quot;.
  * @return county
  **/
  @ApiModelProperty(value = "<b>Note:</b>county of the money transfer operator/Originator.<br><br>Required if cardAcceptor:address:country is \"US\".")
  public String getCounty() {
    return county;
  }
  public void setCounty(String county) {
    this.county = county;
  }
  
  public Address country(String country) {
    this.country = country;
    return this;
  }

  
  /**
  * This field must contain the 3-character alpha country code for the country of the originator or money transfer operator.&lt;br&gt;&lt;br&gt;Refer to &lt;a href&#x3D;\&quot;/request_response_codes#iso_country_and_currency_codes\&quot;&gt;ISO Codes&lt;/a&gt;
  * @return country
  **/
  @ApiModelProperty(required = true, value = "This field must contain the 3-character alpha country code for the country of the originator or money transfer operator.<br><br>Refer to <a href=\"/request_response_codes#iso_country_and_currency_codes\">ISO Codes</a>")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  
  public Address state(String state) {
    this.state = state;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt;State or province of the money transfer operator/Originator. &lt;br&gt;&lt;br&gt; Required if cardAcceptor:address:country is \&quot;US\&quot; or \&quot;CA\&quot;.
  * @return state
  **/
  @ApiModelProperty(value = "<b>Note:</b>State or province of the money transfer operator/Originator. <br><br> Required if cardAcceptor:address:country is \"US\" or \"CA\".")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  
  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  
  /**
  * &lt;b&gt;Note:&lt;/b&gt;Zip/Postal code of the money transfer operator/Originator.&lt;br&gt;&lt;br&gt;Required if cardAcceptor:address:country is \&quot;US\&quot; or \&quot;CA\&quot;.
  * @return zipCode
  **/
  @ApiModelProperty(value = "<b>Note:</b>Zip/Postal code of the money transfer operator/Originator.<br><br>Required if cardAcceptor:address:country is \"US\" or \"CA\".")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.county, address.county) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.zipCode, address.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(county, country, state, zipCode);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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



