package com.Test;

public class Geometry {
    public static void main(String[] args) {

        Shape S1 = new Shape("red") {
            @Override
            public double calcArea() {
                return 0;
            }
        };
        Circle C1 = new Circle("red", 22);
        Rectangle R1 = new Rectangle("Red", 3, 33);
        R1.draw();

        Shape[] shapes = new Shape[5];


    }
}
