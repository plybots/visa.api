
package com.nativepay.visa.extension.model.payment_account_validation;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Encrypted Payload
 */
@ApiModel(description = "Encrypted Payload")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:58:28.768+05:30[Asia/Kolkata]")
public class EncryptedResponse {


    @JsonProperty("encData")
    private String encData = null;

    public EncryptedResponse encData(String encData) {
        this.encData = encData;
        return this;
    }


    /**
     * Encrypted payload string
     *
     * @return encData
     **/
    @ApiModelProperty(required = true, value = "Encrypted payload string")
    public String getEncData() {
        return encData;
    }

    public void setEncData(String encData) {
        this.encData = encData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EncryptedResponse encryptedResponse = (EncryptedResponse) o;
        return Objects.equals(this.encData, encryptedResponse.encData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptedResponse {\n");

        sb.append("    encData: ").append(toIndentedString(encData)).append("\n");
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



