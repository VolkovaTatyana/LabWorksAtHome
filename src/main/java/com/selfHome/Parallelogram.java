package com.selfHome;

class Parallelogram extends Trapezoid {

    Parallelogram(int a, int b) {
        super(a, b);
    }

    Parallelogram(int a) {
        super(a);
    }

    @Override
    void area() {
        System.out.println(getA() * getB());
    }
}
