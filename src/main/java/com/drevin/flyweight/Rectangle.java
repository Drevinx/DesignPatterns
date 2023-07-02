package com.drevin.flyweight;

public class Rectangle extends Shape {
    private String label;

    public Rectangle() {
        this.label = "Rectangle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void draw(int lenght, int breadth, String fillStyle) {
        System.out.println("Draw: " + label + " lenght: " + lenght +
                " Fill style: "  + fillStyle );
    }
}
