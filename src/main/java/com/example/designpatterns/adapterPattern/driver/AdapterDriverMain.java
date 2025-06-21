package com.example.designpatterns.adapterPattern.driver;

import com.example.designpatterns.adapterPattern.adapter.IPaymentGateway;
import com.example.designpatterns.adapterPattern.adapter.PaypalAdapter;
import com.example.designpatterns.adapterPattern.thirdPartyAPIs.PaypalSDK;

public class AdapterDriverMain {

    public static void main(String[] args) {
        IPaymentGateway paymentGateway = new PaypalAdapter(new PaypalSDK());
        System.out.println(paymentGateway.processPayment());
        System.out.println(paymentGateway.showTransactionDetail("UAN83828881"));
    }
}
