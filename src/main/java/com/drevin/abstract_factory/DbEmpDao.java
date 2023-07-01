package com.drevin.abstract_factory;

public class DbEmpDao implements  Dao {

    @Override
    public void save() {
        System.out.println("DB Employ save");
    }
}
