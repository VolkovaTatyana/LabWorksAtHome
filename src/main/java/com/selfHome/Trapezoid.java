package com.selfHome;

class Trapezoid extends ConvexQuadrilaterial {

    private double hight;

    Trapezoid(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    Trapezoid(int a, int b) {
        super(a, b);
    }

    Trapezoid(int a) {
        super(a);
    }

    private double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    void area() {
        System.out.println((getA() + getC()) * getHight() / 2);

    }
}
