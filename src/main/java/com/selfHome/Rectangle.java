package com.selfHome;

class Rectangle extends Parallelogram {
    Rectangle(int a, int b) {
        super(a, b);
    }

    Rectangle(int a) {
        super(a);
    }

    @Override
    void area() {
        System.out.println(getA() * getB());
    }
}
