package com.Test;

import java.util.Arrays;
import java.util.Random;

public class Main2 {


    public static void main(String[] args) {
//        final Monitor M1 = new Monitor();
//        final Device D1 = new Device();
//
//        D1.setManufactured("Samsung");
//        D1.setPrice(120);
//        D1.setSerialNumber("AB123456CD");
//        System.out.println(D1);
//
//        M1.setResolutionX(1024);
//        M1.setResolutionY(1280);
//        M1.setManufactured("Samsung");
//        M1.setSerialNumber("AB123456CD");
//        M1.setPrice(12);
//        System.out.println(M1);

        Object[] devices = new Object[10];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Device d = new Device("Samsung", String.valueOf(random.nextInt()));
            devices[i] = d;
        }
        for (int i = 5; i < 10; i++) {
            Monitor m = new Monitor("Philips", String.valueOf(random.nextInt()));
            m.setResolutionY(100);
            m.setResolutionX(300);
            devices[i] = m;
        }
        System.out.println(Arrays.toString(devices));

        for (int i = 0; i < devices.length; i++) {
            Object d = devices[i];
            final String className = devices[i].getClass().getSimpleName();
            if (devices[i] instanceof Device){
                System.out.println(((Device)devices[i]).getManufactured());
            }
            if (devices[i]instanceof Monitor){
                Monitor m=(Monitor)devices[i];
                System.out.println(m.getResolutionX()+"X"+m.getResolutionY()+"Y");
            }
            //System.out.println(devices[i].getClass().getSimpleName());

            //System.out.println(((Device)d).getManufactured());


        }

    }
}
