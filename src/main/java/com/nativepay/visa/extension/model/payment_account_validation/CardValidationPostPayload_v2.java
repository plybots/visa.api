package com.nativepay.visa.extension.model.payment_account_validation;

import com.nativepay.visa.extension.model.funds_transfer.CardAcceptor;
import com.google.gson.annotations.Expose;

public class CardValidationPostPayload_v2 {

    @Expose
    private String cardCvv2Value;
    @Expose
    private String cardExpiryDate;
    @Expose
    private String primaryAccountNumber;

    public String getCardCvv2Value() {
        return cardCvv2Value;
    }

    public void setCardCvv2Value(String cardCvv2Value) {
        this.cardCvv2Value = cardCvv2Value;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getPrimaryAccountNumber() {
        return primaryAccountNumber;
    }

    public void setPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
    }
}