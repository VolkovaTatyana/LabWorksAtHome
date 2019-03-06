package com.dbulat;

import java.util.Arrays;

public class Lab_167 {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}};
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                //System.out.print(arr[i][j]);
                if (arr[i][j]==1){
                    System.out.print(j);
                }


            }
        }


    }
}
