package com.drevin.solid.interfaceSegregation;

// bad idea
public class OldFashionedPrinter implements  Machine{
    @Override
    public void print(Document d) {
        // Yes
    }

    @Override
    public void fax(Document d) throws Exception {
        throw new Exception();
    }

    @Override
    public void scan(Document d) throws Exception {
        throw new Exception();
    }
}
