package com.nativepay.visa.extension.model.payment_account_validation;

import com.google.gson.annotations.Expose;

public class CardValidationPostResponse_v2 {

    @Expose
    private String actionCode;
    @Expose
    private String addressVerificationResults;
    @Expose
    private String cvv2ResultCode;
    @Expose
    private String responseCode;
    @Expose
    private Long transactionIdentifier;

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getAddressVerificationResults() {
        return addressVerificationResults;
    }

    public void setAddressVerificationResults(String addressVerificationResults) {
        this.addressVerificationResults = addressVerificationResults;
    }

    public String getCvv2ResultCode() {
        return cvv2ResultCode;
    }

    public void setCvv2ResultCode(String cvv2ResultCode) {
        this.cvv2ResultCode = cvv2ResultCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public Long getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public void setTransactionIdentifier(Long transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

}
