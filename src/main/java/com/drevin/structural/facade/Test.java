package com.drevin.structural.facade;

public class Test {

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();

        if (processor.checkStock("MacBook")){
            String orderId = processor.placeOrder("MacBook",3);
            processor.shipOrder(orderId);
        }

        OrderFacade facade = new OrderFacade();
        facade.processOrder("MacBook",3);
    }
}
