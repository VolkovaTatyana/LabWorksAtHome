package com.dbulat;

import java.util.Arrays;
import java.util.Random;

public class Work_5_1 {
    public static void main(String[] args) {
        final Random random = new Random();
        float arr[] = new float[10];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = random.nextFloat();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int number = 0;// количество элементов в новом массиве

        for (int i = 0; i < arr.length; i++) {
            float anArr = arr[i];
            if (anArr > 0.5) {
                number++;
            }
        }
        float arr1[] = new float[number];
        int index = 0;// индекс нового массива

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0.5) {
                arr1[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
