package com.example.designpatterns.adapterPattern.thirdPartyAPIs;

public class RazorPayPayment {

    public String payment() {
        System.out.println("Pay with RazorPay");
        return "Payment Done : Success";
    }

    public void refundWithRazorPay() {
        System.out.println("Refund with RazorPay");
    }

    public void cancelWithRazorPay() {
        System.out.println("Cancel with RazorPay");
    }

    public String fetchTransactionDetailByUAN(String uanNumber) {
        return "Transaction Detail made by razorPay : " + uanNumber;
    }
}
