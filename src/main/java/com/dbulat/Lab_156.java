package com.dbulat;


import java.util.Scanner;

public class Lab_156 {
    public static void main(String[] args) {

        // сумма квадратов цифр числа

        Scanner num = new Scanner(System.in);
        System.out.println("Enter number: ");

        int n = num.nextInt();
        int r =(int) Math.ceil(Math.log10(n));

        int a = 0;
            for (int i = 0; i < r; i++) {
                a += (n % 10) * (n % 10);
                n /= 10;
            }
        System.out.println(a);
     }
}

