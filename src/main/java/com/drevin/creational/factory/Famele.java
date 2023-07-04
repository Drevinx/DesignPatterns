package com.drevin.creational.factory;

public class Famele implements Person{

    @Override
    public void wish(String message) {
        System.out.println("Famele Wish: " + message);
    }
}
