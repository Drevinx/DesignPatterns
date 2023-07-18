package com.drevin.creational.builder.recursiveWitGenerics;

public class EmployeeBuilder  extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder worksAs(String position)
    {
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self()
    {
        return this;
    }
}
