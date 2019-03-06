package com.dbulat;

import java.util.Arrays;
import java.util.Random;

public class MyMath {

    public static void reverse(long b) {
        long newB;

        for (; b > 0; b /= 10) {
            newB = b % 10;
            System.out.print(newB);
        }
    }

    public static void middleArifmeticArr(int arr[][]) {
        double sum = 0;
        double count = 0;
        for (int[] anArr : arr) {
            count += anArr.length;
            for (int j = 0; j < anArr.length; j++) {
                sum += anArr[j];
            }
        }
        System.out.println(sum / count);

    }

    public static void multiArrToSingle(int[][] arrMulti) {

        Random random = new Random();
        for (int i = 0; i < arrMulti.length; i++) {
            for (int j = 0; j < arrMulti[i].length; j++) {
                int max = 100;
                int min = 50;
                int diff = max - min;
                int x = random.nextInt(diff + 1);
                x += min;
                arrMulti[i][j] = x;
                System.out.print(arrMulti[i][j] + " ");
            }
            System.out.println();
        }
        int arrSingle[] = new int[arrMulti.length];
        for (int i = 0; i < arrMulti.length; i++) {
            int sum = 0;
            for (int j = 0; j < arrMulti[i].length; j++) {
                sum += arrMulti[i][j];
            }
            arrSingle[i] = sum;
        }
        System.out.println(Arrays.toString(arrSingle));
    }

    public static void primeNumber(int n) {

        boolean notPrime = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                notPrime = true;
                break;
            }
        }
        if (notPrime) System.out.println(false);
        else System.out.println(true);
    }

    public static void printPyramid(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(" " + j);
                if (j == i) {
                    for (int k = i - 1; k > 0; k--) {
                        System.out.print(" " + k);
                    }
                }
            }
            System.out.println();
        }
    }

    public static double Pi(int aprox) {
        double a = 0;
        int b = 1;
        for (int i = 0; i < aprox; i++) {
            a += ((4.0 / b) - (4.0 / (b + 2)));
            b += 4;
        }
        return a;
    }

    public static double lenghtCirc(int r) {
        return 2 * Math.PI * r;
    }

    public static int findMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
