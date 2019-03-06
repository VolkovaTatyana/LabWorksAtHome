package com.dbulat;

public class Lab_154 {
    public static void main(String[] args) {
        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.print(i + " ");
                if (i >= 20) {
                    break;
                }
            }
        }
    }
}
