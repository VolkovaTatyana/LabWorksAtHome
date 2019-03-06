package com.dbulat;

public class MainMath {
    public static void main(String[] args) {
        final int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        final int max = MyMath.findMax(array);
        final int min = MyMath.findMin(array);
        //System.out.println(max);
        //System.out.println(min);

        int r = 5;
        double c = MyMath.lenghtCirc(r);
        //System.out.println(c);

        int aprox = 2;
        double P = MyMath.Pi(aprox);
        //System.out.println(P);

        int h = 15;
        MyMath.printPyramid(h);

        int n = 6;
        //MyMath.primeNumber(n);

        int[][] arrMulti = new int[5][2];
        //MyMath.multiArrToSingle(arrMulti);

        int[][] arr = new int [][]{{5, 5, 5, 5, 6, 8,1},{5,6,8,5,2,5,5,6}} ;
        //MyMath.middleArifmeticArr(arr);

        long b=1234567890;
        MyMath.reverse(b);

    }
}
