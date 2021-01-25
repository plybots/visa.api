package com.nativepay.visa.extension.auth;

import com.nativepay.visa.extension.model.funds_transfer.OriginalDataElements;

public class Parameters {
    private String keystorePassword;
    private String keystorePath;
    private String password;
    private String username;
    private String privateKeyPassword;
    private String businessApplicationId;
    private String RetrievalReferenceNumber;
    private int AcquiringBin;
    private int AcquirerCountryCode;
    private String SenderCurrencyCode;
    private String cardAcceptorName;
    private String cardAcceptorTerminalId;
    private String cardAcceptorIdCode;
    private String cardAcceptorAddressCountry;
    private String cardAcceptorAddressState;
    private String cardAcceptorAddressZipCode;
    private String cardAcceptorAddressCounty;
    private String transactionCurrencyCode;
    private OriginalDataElements originalDataElements;

    public int getSystemsTraceAuditNumber() {
        return systemsTraceAuditNumber;
    }

    public void setSystemsTraceAuditNumber(int systemsTraceAuditNumber) {
        this.systemsTraceAuditNumber = systemsTraceAuditNumber;
    }

    private int systemsTraceAuditNumber;

    public Parameters(String keystorePassword, String keystorePath, String password, String username, String privateKeyPassword) {
        this.keystorePassword = keystorePassword;
        this.keystorePath = keystorePath;
        this.password = password;
        this.username = username;
        this.privateKeyPassword = privateKeyPassword;
    }

    public Parameters(String keystorePassword, String keystorePath, String password, String username) {
        this.keystorePassword = keystorePassword;
        this.keystorePath = keystorePath;
        this.password = password;
        this.username = username;
    }

    public Parameters() {
    }

    public String getKeystorePassword() {
        return keystorePassword;
    }

    public void setKeystorePassword(String keystorePassword) {
        this.keystorePassword = keystorePassword;
    }

    public String getKeystorePath() {
        return keystorePath;
    }

    public void setKeystorePath(String keystorePath) {
        this.keystorePath = keystorePath;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPrivateKeyPassword() {
        return privateKeyPassword;
    }

    public void setPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
    }

    public String getBusinessApplicationId() {
        return businessApplicationId;
    }

    public void setBusinessApplicationId(String businessApplicationId) {
        this.businessApplicationId = businessApplicationId;
    }

    public String getRetrievalReferenceNumber() {
        return RetrievalReferenceNumber;
    }

    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        RetrievalReferenceNumber = retrievalReferenceNumber;
    }

    public int getAcquiringBin() {
        return AcquiringBin;
    }

    public void setAcquiringBin(int acquiringBin) {
        AcquiringBin = acquiringBin;
    }

    public int getAcquirerCountryCode() {
        return AcquirerCountryCode;
    }

    public void setAcquirerCountryCode(int acquirerCountryCode) {
        AcquirerCountryCode = acquirerCountryCode;
    }

    public String getSenderCurrencyCode() {
        return SenderCurrencyCode;
    }

    public void setSenderCurrencyCode(String senderCurrencyCode) {
        SenderCurrencyCode = senderCurrencyCode;
    }

    public String getCardAcceptorName() {
        return cardAcceptorName;
    }

    public void setCardAcceptorName(String cardAcceptorName) {
        this.cardAcceptorName = cardAcceptorName;
    }

    public String getCardAcceptorTerminalId() {
        return cardAcceptorTerminalId;
    }

    public void setCardAcceptorTerminalId(String cardAcceptorTerminalId) {
        this.cardAcceptorTerminalId = cardAcceptorTerminalId;
    }

    public String getCardAcceptorIdCode() {
        return cardAcceptorIdCode;
    }

    public void setCardAcceptorIdCode(String cardAcceptorIdCode) {
        this.cardAcceptorIdCode = cardAcceptorIdCode;
    }

    public String getCardAcceptorAddressCountry() {
        return cardAcceptorAddressCountry;
    }

    public void setCardAcceptorAddressCountry(String cardAcceptorAddressCountry) {
        this.cardAcceptorAddressCountry = cardAcceptorAddressCountry;
    }

    public String getCardAcceptorAddressState() {
        return cardAcceptorAddressState;
    }

    public void setCardAcceptorAddressState(String cardAcceptorAddressState) {
        this.cardAcceptorAddressState = cardAcceptorAddressState;
    }

    public String getCardAcceptorAddressZipCode() {
        return cardAcceptorAddressZipCode;
    }

    public void setCardAcceptorAddressZipCode(String cardAcceptorAddressZipCode) {
        this.cardAcceptorAddressZipCode = cardAcceptorAddressZipCode;
    }

    public String getCardAcceptorAddressCounty() {
        return cardAcceptorAddressCounty;
    }

    public void setCardAcceptorAddressCounty(String cardAcceptorAddressCounty) {
        this.cardAcceptorAddressCounty = cardAcceptorAddressCounty;
    }

    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    public void setTransactionCurrencyCode(String transactionCurrencyCode) {
        this.transactionCurrencyCode = transactionCurrencyCode;
    }

    public OriginalDataElements getOriginalDataElements() {
        return originalDataElements;
    }

    public void setOriginalDataElements(OriginalDataElements originalDataElements) {
        this.originalDataElements = originalDataElements;
    }
}
