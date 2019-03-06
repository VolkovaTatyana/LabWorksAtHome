package com.dbulat;

import java.util.Scanner;

public class Lab_155 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = num.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is: " + sum + '\n' + "Avg is: " + sum / x);
    }
}
