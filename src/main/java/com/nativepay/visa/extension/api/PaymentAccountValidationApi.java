

package com.nativepay.visa.extension.api;


import com.nativepay.visa.extension.model.payment_account_validation.CardValidationPostPayload_v2;
import com.nativepay.visa.extension.model.payment_account_validation.CardValidationPostPayload;
import com.nativepay.visa.extension.model.payment_account_validation.CardValidationPostResponse;
import com.nativepay.visa.extension.client.ApiClient;
import com.nativepay.visa.extension.model.payment_account_validation.CardValidationPostResponse_v2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:58:28.768+05:30[Asia/Kolkata]")
@Component("com.nativepay.visa.extension.api.PaymentAccountValidationApi")

public class PaymentAccountValidationApi {
    private ApiClient apiClient;

    public PaymentAccountValidationApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentAccountValidationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setKeystorePassword(String keystorePassword) {
        this.apiClient.setKeystorePassword(keystorePassword);
    }

    public void setKeystorePath(String keystorePath) {
        this.apiClient.setKeystorePath(keystorePath);
    }

    public void setPassword(String password) {
        this.apiClient.setPassword(password);
    }

    public void setUsername(String username) {
        this.apiClient.setUsername(username);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    /**
     * 
     * Perform validations of the payment account
     * <p><b>2XX</b> - Successful response object.
     * @param body This is an optional field. It is recommended that the clients of Funds Transfer APIs provide retrievalReferenceNumber for tie the calls with a single funds transfer transaction.&lt;/br&gt;Recommended Format: ydddhhnnnnnn&lt;/br&gt;The first fours digits must be a valid yddd date in the Julian date format, where the first digit &#x3D; 0-9 (last digit of current year) and the next three digits &#x3D; 001-366 (number of the day in the year).&lt;/br&gt;hh can be the two digit hour in a 24 hour clock (00-23) during which the transaction is performed.&lt;/br&gt;nnnnnn can be the systemsTraceAuditNumber or any 6 digit number.
     * @return CardValidationPostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public CardValidationPostResponse_v2 postcardvalidation(CardValidationPostPayload_v2 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postcardvalidation");
        }
        
        String path = UriComponentsBuilder.fromPath("/pav/v1/cardvalidation").build().toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("cardvalidation").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<CardValidationPostResponse_v2> returnType = new ParameterizedTypeReference<CardValidationPostResponse_v2>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, CardValidationPostResponse_v2.class);
    }


    public boolean validateCard(String cardNumber, String cardExpiryDate, String cvv2){
        CardValidationPostPayload_v2 postPayload_v2 = new CardValidationPostPayload_v2();
        postPayload_v2.setCardCvv2Value(cvv2);
        postPayload_v2.setPrimaryAccountNumber(cardNumber);
        postPayload_v2.setCardExpiryDate(cardExpiryDate);
        CardValidationPostResponse_v2 response_v2 = postcardvalidation(postPayload_v2);
        if (response_v2 != null && response_v2.getActionCode().equals("00")){
            return true;
        }else return false;
    }
    
}

