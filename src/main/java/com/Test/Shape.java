package com.Test;

public abstract class Shape {
    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape(String color){
        shapeColor=color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }

    public abstract double calcArea();




}
