package com.Test;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufactured, String serialNumber) {
        super(manufactured, serialNumber);
    }


    @Override
    public String toString() {
        return "Monitor: manufactered=" + getManufactured() + ", " +
                "pice=" + getPrice() + ", " + "serialNumber=" + getSerialNumber() + ", " +
                "X=" + resolutionX + ", " + "Y=" + resolutionY;
       /* return super.toString()
        + "X="+resolutionX+", "+"Y="+resolutionY;   */
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;

    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;

    }

}
