package com.example.designpatterns.adapterPattern.thirdPartyAPIs;

public class StripePaymentAPI {
    public String makePayment() {
        return "Payment made using Strip Payment API";
    }

    public void refundPayment() {
        System.out.println("Refund made using Strip Payment API");
    }

    public String getTransactionDetail(String uanNumber) {
        return "Transaction Detail : " + uanNumber;
    }
}
