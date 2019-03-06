package com.dbulat;

public class Car {
    private final int  numberOfCarsLocal;
    private static int numberOfCarsStatic=0;

    public Car(){
//        numberOfCarsLocal++;
        numberOfCarsLocal=7;
        numberOfCarsStatic++;
        System.out.println("numberOfCarsLocal="+numberOfCarsLocal);
        System.out.println("numberOfCarsStatic="+numberOfCarsStatic);
    }
}
