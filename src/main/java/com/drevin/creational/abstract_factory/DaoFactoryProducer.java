package com.drevin.creational.abstract_factory;

public class DaoFactoryProducer {

    public static DaoAbsctractFactory produce(String factoryType){
        DaoAbsctractFactory daoAbsctractFactory = null;

        if (factoryType.equalsIgnoreCase("xml")){
            daoAbsctractFactory = new XmlDaoFactory();
        } else if (factoryType.equalsIgnoreCase("db")) {
            daoAbsctractFactory = new DbDaoFactory();
        }

        return daoAbsctractFactory;
    }
}
