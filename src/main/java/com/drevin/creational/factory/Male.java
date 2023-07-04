package com.drevin.creational.factory;

public class Male implements Person{

    @Override
    public void wish(String message) {
        System.out.println("Male Wish: " + message);
    }
}
