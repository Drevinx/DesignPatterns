package com.drevin.adapter;

public class PaymentApp {

    public void Payd(double czk){
        PaymentAdapter paymentAdapter = new PaymentAdapter();
        System.out.println( "Payd: " + paymentAdapter.convertCzkToUsd(czk) + " $");
    }
}
