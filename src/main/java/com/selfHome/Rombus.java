package com.selfHome;

class Rombus extends Parallelogram {
    private int hight;

    private int getHight() {
        return hight;
    }

    private void setHight(int hight) {
        this.hight = hight;
    }

    Rombus(int a) {
        super(a);
    }

    @Override
    void area() {
        System.out.println(getA() * getHight());
    }
}
