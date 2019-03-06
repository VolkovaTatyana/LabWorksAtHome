package com.Test;

public class Geometry {
    public static void main(String[] args) {

        Circle C1 = new Circle("red", 22);
        //System.out.println(C1.calcArea());
        //System.out.println(C1);
        Rectangle R1 = new Rectangle("Red", 3, 33);
        //System.out.println(R1);
        Shape S1 = new Shape("red") {
            @Override
            public double calcArea() {
                return 0;
            }
        };
        Square sq1 = new Square("black", R1.W);
        System.out.println(sq1.calcArea());
    }
}
