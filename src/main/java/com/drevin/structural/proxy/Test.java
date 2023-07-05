package com.drevin.structural.proxy;

public class Test {

    public static void main(String[] args) {
        Customer customer = new CustomerImpl();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders());

        customer = new CustomerProxyImpl();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders());
    }

}
