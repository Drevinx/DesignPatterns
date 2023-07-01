package com.drevin.factory;

public class PersonFactory {

    public Person createPerson(String sex){
        Person person = null;

        if (sex.equalsIgnoreCase("male")){
            person = new Male();
        } else if (sex.equalsIgnoreCase("famele")) {
            person = new Famele();
        }

        person.wish("something goods");
        return person;
    }
}
