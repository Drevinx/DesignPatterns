package com.drevin.structural.decorator;

public class test {

    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza.bake();

        pizza = new CheesePizzaDecorator(new PlainPizza());
        pizza.bake();

        pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();

    }
}
