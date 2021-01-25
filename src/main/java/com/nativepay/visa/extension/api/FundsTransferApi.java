

package com.nativepay.visa.extension.api;

import com.google.gson.Gson;
import com.nativepay.visa.extension.client.ApiClient;
import com.nativepay.visa.extension.model.funds_transfer.*;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-28T14:56:32.747+05:30[Asia/Kolkata]")
@Component("com.nativepay.visa.extension.api.FundsTransferApi")
public class FundsTransferApi {
    private ApiClient apiClient;

    public FundsTransferApi() {
        this(new ApiClient());
    }

    @Autowired
    public FundsTransferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setPrivateKeyPassword(String privateKeyPassword) {
        this.apiClient.setPrivateKeyPassword(privateKeyPassword);
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

    
    /**
     * 
     * Read Multi Pull Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param statusIdentifier Status Identifier
     * @return MultiPullFundsTransactionsGetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public MultiPullFundsTransactionsGetResponse getmultipullfundstransactions(String statusIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'statusIdentifier' is set
        if (statusIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'statusIdentifier' when calling getmultipullfundstransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("statusIdentifier", statusIdentifier);
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/multipullfundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("multipullfundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {"application/json"};
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<MultiPullFundsTransactionsGetResponse> returnType = new ParameterizedTypeReference<MultiPullFundsTransactionsGetResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, MultiPullFundsTransactionsGetResponse.class);
    }
    
    /**
     * 
     * Read Multi Push Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param statusIdentifier Status Identifier
     * @return MultiPushFundsTransactionsGetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public MultiPushFundsTransactionsGetResponse getmultipushfundstransactions(String statusIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'statusIdentifier' is set
        if (statusIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'statusIdentifier' when calling getmultipushfundstransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("statusIdentifier", statusIdentifier);
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/multipushfundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("multipushfundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<MultiPushFundsTransactionsGetResponse> returnType = new ParameterizedTypeReference<MultiPushFundsTransactionsGetResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, MultiPushFundsTransactionsGetResponse.class);
    }
    
    /**
     * 
     * Read Multi Reverse Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param statusIdentifier Status Identifier
     * @return MultiReverseFundsTransactionsGetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public MultiReverseFundsTransactionsGetResponse getmultireversefundstransactions(String statusIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'statusIdentifier' is set
        if (statusIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'statusIdentifier' when calling getmultireversefundstransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("statusIdentifier", statusIdentifier);
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/multireversefundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("multireversefundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<MultiReverseFundsTransactionsGetResponse> returnType = new ParameterizedTypeReference<MultiReverseFundsTransactionsGetResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, MultiReverseFundsTransactionsGetResponse.class);
    }
    
    /**
     * 
     * Read Pull Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param statusIdentifier Status Identifier
     * @return PullFundsTransactionsGetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public PullFundsTransactionsGetResponse getpullfundstransactions(String statusIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'statusIdentifier' is set
        if (statusIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'statusIdentifier' when calling getpullfundstransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("statusIdentifier", statusIdentifier);
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/pullfundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("pullfundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<PullFundsTransactionsGetResponse> returnType = new ParameterizedTypeReference<PullFundsTransactionsGetResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, PullFundsTransactionsGetResponse.class);
    }

    /**
     * 
     * Read Push Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param statusIdentifier Status Identifier
     * @return PushFundsTransactionsGetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public PushFundsTransactionsGetResponse getpushfundstransactions(String statusIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'statusIdentifier' is set
        if (statusIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'statusIdentifier' when calling getpushfundstransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("statusIdentifier", statusIdentifier);
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/pushfundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("pushfundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<PushFundsTransactionsGetResponse> returnType = new ParameterizedTypeReference<PushFundsTransactionsGetResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, PushFundsTransactionsGetResponse.class);
    }
    
    /**
     * 
     * Read Reverse Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param statusIdentifier Status Identifier
     * @return ReverseFundsTransactionsGetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public ReverseFundsTransactionsGetResponse getreversefundstransactions(String statusIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'statusIdentifier' is set
        if (statusIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'statusIdentifier' when calling getreversefundstransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("statusIdentifier", statusIdentifier);
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/reversefundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("reversefundstransactions/{statusIdentifier}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<ReverseFundsTransactionsGetResponse> returnType = new ParameterizedTypeReference<ReverseFundsTransactionsGetResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, ReverseFundsTransactionsGetResponse.class);
    }
    
    /**
     * 
     * Create Multi Pull Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param body Request body for creating in multi pull funds transfer
     * @return MultiPullFundsPostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public MultiPullFundsPostResponse postmultipullfunds(MultiPullFundsPostPayload body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postmultipullfunds");
        }
        
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/multipullfundstransactions").build().toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("multipullfundstransactions").build().toUriString();
        
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

        ParameterizedTypeReference<MultiPullFundsPostResponse> returnType = new ParameterizedTypeReference<MultiPullFundsPostResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, MultiPullFundsPostResponse.class);
    }
    
    /**
     * 
     * Create Multi Push Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param body Request body for creating in multi push funds transfer
     * @return MultiPushFundsPostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public MultiPushFundsPostResponse postmultipushfunds(MultiPushFundsPostPayload body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postmultipushfunds");
        }
        
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/multipushfundstransactions").build().toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("multipushfundstransactions").build().toUriString();
        
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

        ParameterizedTypeReference<MultiPushFundsPostResponse> returnType = new ParameterizedTypeReference<MultiPushFundsPostResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, MultiPushFundsPostResponse.class);
    }
    
    /**
     * 
     * Create Multi Reverse Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param body Request body for creating in multi reverse funds transfer
     * @return MultiReverseFundsPostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public MultiReverseFundsPostResponse postmultireversefunds(MultiReverseFundsPostPayload body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postmultireversefunds");
        }
        
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/multireversefundstransactions").build().toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("multireversefundstransactions").build().toUriString();
        
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

        ParameterizedTypeReference<MultiReverseFundsPostResponse> returnType = new ParameterizedTypeReference<MultiReverseFundsPostResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, MultiReverseFundsPostResponse.class);
    }
    
    /**
     * 
     * Create Pull Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param body Request body for creating in pull funds transfer
     * @return PullFundsPostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public PullFundsPostResponse postpullfunds(PullFundsPostPayload body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postpullfunds");
        }
        
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/pullfundstransactions").build().toUriString();
///visadirect/fundstransfer/v1/pullfundstransactions
        String resourcePath = UriComponentsBuilder.fromPath("pullfundstransactions").build().toUriString();
        
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

        ParameterizedTypeReference<PullFundsPostResponse> returnType = new ParameterizedTypeReference<PullFundsPostResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, PullFundsPostResponse.class);
    }
    
    /**
     * 
     * Create Push Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param body Request body for creating in push funds transfer
     * @return PushFundsPostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public PushFundsPostResponse postpushfunds(PushFundsPostPayload body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postpushfunds");
        }
        
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/pushfundstransactions").build().toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("pushfundstransactions").build().toUriString();
        
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

        ParameterizedTypeReference<PushFundsPostResponse> returnType = new ParameterizedTypeReference<PushFundsPostResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, PushFundsPostResponse.class);
    }
    
    /**
     * 
     * Create Reverse Funds Transaction
     * <p><b>2XX</b> - Successful response object.
     * @param body Request body for creating in reverse funds transfer
     * @return ReverseFundsPostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public ReverseFundsPostResponse postreversefunds(ReverseFundsPostPayload body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postreversefunds");
        }
        
        String path = UriComponentsBuilder.fromPath("/visadirect/fundstransfer/v1/reversefundstransactions").build().toUriString();
        String resourcePath = UriComponentsBuilder.fromPath("reversefundstransactions").build().toUriString();
        
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

        ParameterizedTypeReference<ReverseFundsPostResponse> returnType = new ParameterizedTypeReference<ReverseFundsPostResponse>() {};
        return apiClient.invokeAPI(path, resourcePath, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType, ReverseFundsPostResponse.class);
    }
    
}

