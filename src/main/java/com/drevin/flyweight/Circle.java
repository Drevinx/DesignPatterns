package com.drevin.flyweight;

public class Circle extends Shape {
    private String label;

    public Circle() {
        this.label = "Circle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void draw(int radius, String color, String borderColor) {
        System.out.println("Draw: " + label + " radius: " + radius +
                " Color: "  + color + " Border color: " + borderColor);
    }
}
