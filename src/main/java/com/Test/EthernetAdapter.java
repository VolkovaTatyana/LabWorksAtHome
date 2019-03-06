package com.Test;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufactured, String serialNumber) {
        super(manufactured, serialNumber);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
