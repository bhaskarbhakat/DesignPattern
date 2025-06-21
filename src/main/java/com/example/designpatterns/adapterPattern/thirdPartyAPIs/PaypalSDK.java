package com.example.designpatterns.adapterPattern.thirdPartyAPIs;

import java.util.Arrays;
import java.util.List;

public class PaypalSDK {

    public void payWithPaypal() {
        System.out.println("Paypal payment done");
    }

    public void getAllTransactions(String userId) {
        System.out.println("Displaying all transactions");
    }

    public List<String> transactionDetailByUan(String uanNumber) {
        System.out.println("Displaying transaction detail : " + uanNumber);
        return Arrays.asList("UAN Number : 29893", "transactionDate : 22/03/2025", "userId : 298932", "transactionAmount : 5000");
    }
}
