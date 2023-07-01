package com.drevin.abstract_factory;

public class XmlEmpDao implements  Dao {

    @Override
    public void save() {
        System.out.println("XML Employ save");
    }
}
