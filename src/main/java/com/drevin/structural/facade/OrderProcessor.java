package com.drevin.structural.facade;

public class OrderProcessor {

    public boolean checkStock(String name){
        System.out.println("Checking stock");
        return true;
    }

    public String placeOrder(String name, int quantity){
        System.out.println("Order placed!");
        return "abc123";
    }

    public void shipOrder(String OrderId){
        System.out.println("Order Shipped");
    }
}
