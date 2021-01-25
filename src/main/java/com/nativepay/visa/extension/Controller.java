package com.nativepay.visa.extension;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.nativepay.visa.extension.api.FundsTransferApi;
import com.nativepay.visa.extension.api.PaymentAccountValidationApi;
import com.nativepay.visa.extension.auth.Parameters;
import com.nativepay.visa.extension.model.funds_transfer.*;
import com.nativepay.visa.extension.model.payment_account_validation.CardValidationPostPayload_v2;
import com.nativepay.visa.extension.model.payment_account_validation.CardValidationPostResponse_v2;
import com.nativepay.visa.extension.utils.SystemUtils;

import java.math.BigDecimal;

public class Controller {

    private Parameters parameters;

    public Controller(Parameters parameters) {
        this.parameters = parameters;
    }

    public CardValidationPostResponse_v2 validateCard(String cvv, String number, String date) {
        CardValidationPostPayload_v2 postPayload_v2 = new CardValidationPostPayload_v2();
        PaymentAccountValidationApi api = new PaymentAccountValidationApi();
        postPayload_v2.setCardCvv2Value(cvv);
        postPayload_v2.setPrimaryAccountNumber(number);
        postPayload_v2.setCardExpiryDate(date);
        api.setKeystorePassword(parameters.getKeystorePassword());
        api.setKeystorePath(parameters.getKeystorePath());
        api.setPassword(parameters.getPassword());
        api.setUsername(parameters.getUsername());
        return api.postcardvalidation(postPayload_v2);
    }

    // String retrievalReferenceNumber = SystemUtils.generateRetrievalReferenceNumber(systemsTraceAuditNumber);
    // int systemsTraceAuditNumber = SystemUtils.randomNumber();
    public PullFundsPostResponse postPullTransactionRequest(int amount, String cardNumber, String cardExpiryDate, String cardCvv) {
        PullFundsPostPayload payload = new PullFundsPostPayload();
        payload.setBusinessApplicationId(parameters.getBusinessApplicationId());
        payload.setSystemsTraceAuditNumber(parameters.getSystemsTraceAuditNumber());
        payload.setRetrievalReferenceNumber(parameters.getRetrievalReferenceNumber());
        payload.setLocalTransactionDateTime(SystemUtils.generateLocalTransactionDateTime());
        payload.setAcquiringBin(parameters.getAcquiringBin());
        payload.setAcquirerCountryCode(parameters.getAcquirerCountryCode());
        payload.setSenderPrimaryAccountNumber(cardNumber);
        payload.setSenderCurrencyCode(parameters.getSenderCurrencyCode());
        payload.setSenderCardExpiryDate(cardExpiryDate);
        payload.setAmount(BigDecimal.valueOf(amount));
        payload.setCardCvv2Value(cardCvv);

        CardAcceptor cardAcceptor = new CardAcceptor();
        cardAcceptor.setName(parameters.getCardAcceptorName());
        cardAcceptor.setTerminalId(parameters.getCardAcceptorTerminalId());
        cardAcceptor.setIdCode(parameters.getCardAcceptorIdCode());

        Address address = new Address();
        address.setCountry(parameters.getCardAcceptorAddressCountry());
        address.setState(parameters.getCardAcceptorAddressState());
        address.setZipCode(parameters.getCardAcceptorAddressZipCode());
        address.setCounty(parameters.getCardAcceptorAddressCounty());

        cardAcceptor.setAddress(address);
        payload.setCardAcceptor(cardAcceptor);

        FundsTransferApi api = new FundsTransferApi();
        api.setKeystorePassword(parameters.getKeystorePassword());
        api.setKeystorePath(parameters.getKeystorePath());
        api.setPassword(parameters.getPassword());
        api.setUsername(parameters.getUsername());
        api.setPrivateKeyPassword(parameters.getPrivateKeyPassword());
        return api.postpullfunds(payload);
    }


    public PushFundsPostResponse postPushTransactionRequest(int amount, String recipientCard, String senderCard) {
        PushFundsPostPayload payload = new PushFundsPostPayload();
        payload.setBusinessApplicationId(parameters.getBusinessApplicationId());
        payload.setSystemsTraceAuditNumber(parameters.getSystemsTraceAuditNumber());
        payload.setRetrievalReferenceNumber(parameters.getRetrievalReferenceNumber());
        payload.setLocalTransactionDateTime(SystemUtils.generateLocalTransactionDateTime());
        payload.setAcquiringBin(parameters.getAcquiringBin());
        payload.setAcquirerCountryCode(parameters.getAcquirerCountryCode());
        payload.setRecipientPrimaryAccountNumber(recipientCard);
        payload.setTransactionCurrencyCode(parameters.getTransactionCurrencyCode());
        payload.setAmount(BigDecimal.valueOf(amount));
        payload.setSenderAccountNumber(senderCard);

        CardAcceptor cardAcceptor = new CardAcceptor();
        cardAcceptor.setName(parameters.getCardAcceptorName());
        cardAcceptor.setTerminalId(parameters.getCardAcceptorTerminalId());
        cardAcceptor.setIdCode(parameters.getCardAcceptorIdCode());

        Address address = new Address();
        address.setCountry(parameters.getCardAcceptorAddressCountry());
        address.setState(parameters.getCardAcceptorAddressState());
        address.setZipCode(parameters.getCardAcceptorAddressZipCode());
        address.setCounty(parameters.getCardAcceptorAddressCounty());

        cardAcceptor.setAddress(address);
        payload.setCardAcceptor(cardAcceptor);

        FundsTransferApi api = new FundsTransferApi();
        api.setKeystorePassword(parameters.getKeystorePassword());
        api.setKeystorePath(parameters.getKeystorePath());
        api.setPassword(parameters.getPassword());
        api.setUsername(parameters.getUsername());
        api.setPrivateKeyPassword(parameters.getPrivateKeyPassword());
        return api.postpushfunds(payload);
    }


    public ReverseFundsPostResponse postReverseTransactionRequest(int amount, String cardNumber, String cardExpiryDate, OriginalDataElements originalDataElements) {
        ReverseFundsPostPayload payload = new ReverseFundsPostPayload();
        payload.setBusinessApplicationId(parameters.getBusinessApplicationId());
        payload.setSystemsTraceAuditNumber(parameters.getSystemsTraceAuditNumber());
        payload.setRetrievalReferenceNumber(parameters.getRetrievalReferenceNumber());
        payload.setLocalTransactionDateTime(SystemUtils.generateLocalTransactionDateTime());
        payload.setAcquiringBin(parameters.getAcquiringBin());
        payload.setAcquirerCountryCode(parameters.getAcquirerCountryCode());
        payload.setSenderPrimaryAccountNumber(cardNumber);
        payload.setSenderCurrencyCode(parameters.getSenderCurrencyCode());
        payload.setSenderCardExpiryDate(cardExpiryDate);
        payload.setAmount(BigDecimal.valueOf(amount));
        payload.setOriginalDataElements(originalDataElements);

        CardAcceptor cardAcceptor = new CardAcceptor();
        cardAcceptor.setName(parameters.getCardAcceptorName());
        cardAcceptor.setTerminalId(parameters.getCardAcceptorTerminalId());
        cardAcceptor.setIdCode(parameters.getCardAcceptorIdCode());

        Address address = new Address();
        address.setCountry(parameters.getCardAcceptorAddressCountry());
        address.setState(parameters.getCardAcceptorAddressState());
        address.setZipCode(parameters.getCardAcceptorAddressZipCode());
        address.setCounty(parameters.getCardAcceptorAddressCounty());

        cardAcceptor.setAddress(address);
        payload.setCardAcceptor(cardAcceptor);

        FundsTransferApi api = new FundsTransferApi();
        api.setKeystorePassword(parameters.getKeystorePassword());
        api.setKeystorePath(parameters.getKeystorePath());
        api.setPassword(parameters.getPassword());
        api.setUsername(parameters.getUsername());
        api.setPrivateKeyPassword(parameters.getPrivateKeyPassword());
        return api.postreversefunds(payload);
    }
}
