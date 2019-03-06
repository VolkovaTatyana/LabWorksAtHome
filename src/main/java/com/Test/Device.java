package com.Test;

public class Device {

    private String manufactured;
    private float price;
    private String serialNumber;

    public Device (String manufactured,String serialNumber){
        this.manufactured = manufactured;
        this.serialNumber = serialNumber;
    }
    public final void printPrice(){ //нельзя переопределять
        System.out.println(price*0.7);
    }


    @Override
    public String toString() {
        return "Device: manufactered =" + manufactured + ", " +
                "pice=" + price + ", " + "serialNumber=" + serialNumber;

        /*return super.toString()+
                this.getClass().getSimpleName()+
                ": manufactured="+manufactured+
                "pice="+price+
                "serialNumber="+serialNumber;*/
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;

    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;

    }
}
