package com.selfHome;

class ConvexQuadrilaterial extends Quadrilaterial {

    private double perimetr;

    ConvexQuadrilaterial(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    ConvexQuadrilaterial(int a, int b) {
        super(a, b);
    }

    ConvexQuadrilaterial(int a) {
        super(a);
    }

    private void setPerimetr(double perimetr) {
        this.perimetr = getA() + getB() + getC() + getD();
    }

    private double getPerimetr() {
        return perimetr;
    }


    @Override
    void area() {

        System.out.println(Math.pow(((getPerimetr() - getA()) * (getPerimetr() - getB()) *
                (getPerimetr() - getC()) * (getPerimetr() - getD())), 0.5));

    }

}
