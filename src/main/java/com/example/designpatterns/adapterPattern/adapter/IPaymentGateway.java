package com.example.designpatterns.adapterPattern.adapter;

public interface IPaymentGateway {
    String processPayment();
    String showTransactionDetail(String uanNumber);
}
