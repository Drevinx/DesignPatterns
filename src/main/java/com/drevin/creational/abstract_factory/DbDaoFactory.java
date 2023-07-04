package com.drevin.creational.abstract_factory;

public class DbDaoFactory extends DaoAbsctractFactory{

    @Override
    public Dao createDao(String type) {
        Dao dao = null;

        if (type.equalsIgnoreCase("emp")){
            dao = new DbEmpDao();
        } else if ( type.equalsIgnoreCase("dep")) {
            dao = new DbDepDao();
        }

        return dao;
    }
}
