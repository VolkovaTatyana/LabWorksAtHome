package com.dbulat;

public class Work_4_8 {
    public static void main(String[] args) {
        Computer intel = new Computer();
        Computer amd = new Computer();
        intel.setPrice(100f);
        intel.setCpu(100);
        intel.setManufacture("intel");
        intel.setSerialNumber(1);

        System.out.println(intel);
        System.out.println(amd);
        System.out.println(amd.getPrice());

    }
}
