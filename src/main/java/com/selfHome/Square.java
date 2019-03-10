package com.selfHome;

class Square extends Rectangle {

    Square(int a) {
        super(a);
    }

    @Override
    void area() {
        System.out.println(getA() * getA());
    }
}
