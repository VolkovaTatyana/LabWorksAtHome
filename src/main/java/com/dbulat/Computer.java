package com.dbulat;

public class Computer {
    private int serialNumber;
    private int cpu;
    private float price;
    private String manufacture;

    public float getPrice() {
        return price;
    }

    public void setPrice(float p) {
       price = p;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int sN) {
        serialNumber = sN;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
