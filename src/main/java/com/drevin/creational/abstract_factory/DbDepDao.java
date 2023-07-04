package com.drevin.creational.abstract_factory;

public class DbDepDao implements  Dao {

    @Override
    public void save() {
        System.out.println("DB Department save");
    }
}
