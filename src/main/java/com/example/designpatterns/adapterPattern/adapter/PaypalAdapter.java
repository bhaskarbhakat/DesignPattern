package com.example.designpatterns.adapterPattern.adapter;

import com.example.designpatterns.adapterPattern.thirdPartyAPIs.PaypalSDK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class PaypalAdapter implements IPaymentGateway{

    private final PaypalSDK paypalPaymentAPIs;

    public PaypalAdapter(PaypalSDK sdk) {
        this.paypalPaymentAPIs = sdk;
    }

    @Override
    public String processPayment() {
        paypalPaymentAPIs.payWithPaypal();
        return "Payment with Paypal done : Success";
    }

    @Override
    public String showTransactionDetail(String uanNumber) {
        List<String> transactionResponse = paypalPaymentAPIs.transactionDetailByUan(uanNumber);
        return transactionResponse.toString();
    }
}
