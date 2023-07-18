package com.drevin.creational.builder.recursiveWitGenerics;

public class TestRecursiveFactory {

    public static void main(String[] args) {
        EmployeeBuilder eb = new EmployeeBuilder()
                .withName("Dmitri")
                .worksAs("Quantitative Analyst");
        System.out.println(eb.build());
    }
}
