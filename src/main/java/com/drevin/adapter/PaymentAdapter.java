package com.drevin.adapter;

public class PaymentAdapter {

    public double convertCzkToUsd(double czk){
        PaymentProcesor paymentProcesor = new PaymentProcesorImp();
         return paymentProcesor.pay( czk / 22);
    }
}
