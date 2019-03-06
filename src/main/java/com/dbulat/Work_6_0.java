package com.dbulat;

import java.util.Arrays;
import java.util.Random;

public class Work_6_0 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(159);
            if (i%2!=0){
                array[i]=0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
