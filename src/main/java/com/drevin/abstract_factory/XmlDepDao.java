package com.drevin.abstract_factory;

public class XmlDepDao implements  Dao {

    @Override
    public void save() {
        System.out.println("XML Department save");
    }
}
