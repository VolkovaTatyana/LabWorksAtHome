package com.dbulat;

import java.util.Arrays;
import java.util.Random;

public class Work_5_0 {
    public static void main(String[] args) {
        final Random random=new Random();

        int arr[] = new int [10];
        for (int j = 0; j < arr.length; j++) {
            arr[j]=random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        int numberOdd = 0;
        int numberEven=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
               numberEven++;
            }else {
                numberOdd++;
            }
        }
        int even[] = new int[numberEven];
        int odd[] = new int[numberOdd];

        int indexEven=0;
        int indexOdd=0;

        for (int x = 0; x < arr.length; x++) {
            if (arr[x]%2==0){
                even[indexEven]=arr[x];
                indexEven++;
            }else {
                odd[indexOdd]=arr[x];
                indexOdd++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

    }

}
