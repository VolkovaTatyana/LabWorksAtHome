package com.dbulat;

import java.util.Arrays;

public class Work_4_3 {
    public static void main(String[] args) {

        int[][] arr=new int[4][4];
        int number=0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                arr[i][j]=number++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]=number++);
            }
        }System.out.println();

    }
}
