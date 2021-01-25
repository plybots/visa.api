

package com.nativepay.visa.extension.model.funds_transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * CardAcceptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
public class CardAcceptor {

  
  @JsonProperty("idCode")
  private String idCode = null;
  
  
  @JsonProperty("address")
  private Address address = null;
  
  
  @JsonProperty("name")
  private String name = null;
  
  
  @JsonProperty("terminalId")
  private String terminalId = null;
  
  public CardAcceptor idCode(String idCode) {
    this.idCode = idCode;
    return this;
  }

  
  /**
  * An identifier for the card acceptor (Visa Direct Originator). This value should be unique for each originator for whom you are sending transactions.
  * @return idCode
  **/
  @ApiModelProperty(required = true, value = "An identifier for the card acceptor (Visa Direct Originator). This value should be unique for each originator for whom you are sending transactions.")
  public String getIdCode() {
    return idCode;
  }
  public void setIdCode(String idCode) {
    this.idCode = idCode;
  }
  
  public CardAcceptor address(Address address) {
    this.address = address;
    return this;
  }

  
  /**
  * Get address
  * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
  
  public CardAcceptor name(String name) {
    this.name = name;
    return this;
  }

  
  /**
  * name of the originator/money transfer operator.
  * @return name
  **/
  @ApiModelProperty(required = true, value = "name of the originator/money transfer operator.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public CardAcceptor terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

  
  /**
  * The identifier for the terminal at a card acceptor location. If sending transactions from a card not present environment, use the same value for all transactions.
  * @return terminalId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the terminal at a card acceptor location. If sending transactions from a card not present environment, use the same value for all transactions.")
  public String getTerminalId() {
    return terminalId;
  }
  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardAcceptor cardAcceptor = (CardAcceptor) o;
    return Objects.equals(this.idCode, cardAcceptor.idCode) &&
        Objects.equals(this.address, cardAcceptor.address) &&
        Objects.equals(this.name, cardAcceptor.name) &&
        Objects.equals(this.terminalId, cardAcceptor.terminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCode, address, name, terminalId);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAcceptor {\n");
    
    sb.append("    idCode: ").append(toIndentedString(idCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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



