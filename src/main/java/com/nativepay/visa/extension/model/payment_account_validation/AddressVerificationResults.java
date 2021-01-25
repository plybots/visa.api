package com.nativepay.visa.extension.model.payment_account_validation;

import com.google.gson.annotations.Expose;

public class AddressVerificationResults {

    @Expose
    private String postalCode;
    @Expose
    private String street;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}