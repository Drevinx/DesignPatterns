package com.drevin.abstract_factory;

public class test {

    public static void main(String[] args) {

        DaoAbsctractFactory daoAbsctractFactory = DaoFactoryProducer.produce("xml");
        Dao dao = daoAbsctractFactory.createDao("emp");
        dao.save();

    }
}
