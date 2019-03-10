package com.selfHome;

public abstract class Quadrilaterial {
    private int a;
    private int b;
    private int c;
    private int d;

    abstract void area();


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Quadrilaterial(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quadrilaterial(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Quadrilaterial(int a) {
        this.a = a;
    }
}
