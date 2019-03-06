package com.dbulat;

import java.util.Arrays;

public class Work_4_2 {
    public static void main(String[] args) {
        int[]arr={34,76,34,6,9,23,73,99,134,56,55,45,67,76,22};
        int num=arr.length;
       // System.out.println(num);
        Arrays.sort(arr);
        System.out.println(arr[num-1]);
        //variant2
        for (int element:arr) {
            System.out.println(element);
        }
    }
}
