package com.dbulat;


import java.util.Arrays;

public class Work_4_6 {
    public static void main(String[] args) {
        int[] arrayOfTemp = {88, 34, -98, 54, 0, -23, 56, 34, 99, -76, -11};

        Arrays.sort(arrayOfTemp);


        int c1=0 ;


        int arr1[] = new int[arrayOfTemp.length];
        int arr2[] = new int[arrayOfTemp.length];
        for (int i = 0; i < arrayOfTemp.length; i++) {
            c1++;
            if (arrayOfTemp[i] < 0) {
                arr1[i] = arrayOfTemp[i];


            } else {
                arr2[i] = arrayOfTemp[i];

            }

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
