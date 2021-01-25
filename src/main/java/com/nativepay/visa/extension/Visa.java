package com.nativepay.visa.extension;

import com.google.gson.Gson;
import com.nativepay.visa.extension.api.PaymentAccountValidationApi;
import com.nativepay.visa.extension.auth.Parameters;
import com.nativepay.visa.extension.model.payment_account_validation.CardValidationPostResponse_v2;

public class Visa {
    public static void main(String[] args) {
        cardValidationSample();
    }

    private static void cardValidationSample(){
        Parameters parameters = new Parameters();
        parameters.setKeystorePassword("nativepay@123");
        parameters.setKeystorePath("/home/api/keys/key_cert_bundle.p12");
        parameters.setPassword("IiJjWPceLFrMorq0");
        parameters.setUsername("8CCBUUQ0J4KGE2G435WR21uaK4RIAtDilToWmr-GM7i9CGPgg");
        Controller controller = new Controller(parameters);
        CardValidationPostResponse_v2 response = controller.validateCard("999", "4957030420210454", "2020-10");
        System.out.println(new Gson().toJson(response));
    }
}
