package com.drevin.abstract_factory;

public class XmlDaoFactory extends DaoAbsctractFactory{

    @Override
    public Dao createDao(String type) {
        Dao dao = null;

        if (type.equalsIgnoreCase("emp")){
            dao = new XmlEmpDao();
        } else if ( type.equalsIgnoreCase("dep")) {
            dao = new XmlDepDao();
        }

        return dao;
    }
}
