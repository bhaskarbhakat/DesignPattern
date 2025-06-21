package com.example.designpatterns.adapterPattern.adapter;

import com.example.designpatterns.adapterPattern.thirdPartyAPIs.StripePaymentAPI;

public class StripePaymentAdapter implements IPaymentGateway{

    final private StripePaymentAPI stripePaymentAPIs;

    public StripePaymentAdapter(StripePaymentAPI stripePaymentAPI) {
        this.stripePaymentAPIs = stripePaymentAPI;
    }

    @Override
    public String processPayment() {
        return stripePaymentAPIs.makePayment();
    }

    @Override
    public String showTransactionDetail(String uanNumber) {
        return stripePaymentAPIs.getTransactionDetail(uanNumber);
    }
}
