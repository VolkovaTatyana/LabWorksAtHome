package com.Test;

public class Circle extends Shape{
private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color: "+getShapeColor()+
                ", radius"+radius+"\nShape area is:=" +calcArea();
    }

    @Override
    public double calcArea() {

        return Math.PI*radius*radius;
    }
}
