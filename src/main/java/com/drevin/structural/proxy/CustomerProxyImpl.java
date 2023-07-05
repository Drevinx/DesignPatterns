package com.drevin.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{
    CustomerImpl customer = new CustomerImpl();

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        Order order = new Order();
        order.setId(1);
        order.setQuantity(20);
        order.setProductName("Phone");

        order = new Order();
        order.setId(1);
        order.setQuantity(20);
        order.setProductName("Phone");

        return orders;
    }
}
