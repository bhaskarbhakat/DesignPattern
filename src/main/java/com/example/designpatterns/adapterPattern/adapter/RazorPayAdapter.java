package com.example.designpatterns.adapterPattern.adapter;

import com.example.designpatterns.adapterPattern.thirdPartyAPIs.RazorPayPayment;
import org.springframework.beans.factory.annotation.Autowired;

public class RazorPayAdapter implements IPaymentGateway{

    private final RazorPayPayment razorPayPaymentAPIs;

    public RazorPayAdapter(RazorPayPayment razorPayPayment) {
        this.razorPayPaymentAPIs = razorPayPayment;
    }

    @Override
    public String processPayment() {
        return razorPayPaymentAPIs.payment();
    }

    @Override
    public String showTransactionDetail(String uanNumber) {
        return razorPayPaymentAPIs.fetchTransactionDetailByUAN(uanNumber);
    }
}
