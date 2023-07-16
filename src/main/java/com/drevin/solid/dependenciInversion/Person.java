package com.drevin.solid.dependenciInversion;
enum Relationship
{
    PARENT,
    CHILD,
    SIBLING
}

public class Person {

    public String name;
    // dob etc.


    public Person(String name) {
        this.name = name;
    }
}
