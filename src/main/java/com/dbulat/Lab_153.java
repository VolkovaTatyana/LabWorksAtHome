package com.dbulat;

public class Lab_153 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                int res = (j + 1) * i;
                System.out.print(res + " " + '\t');
            }
            System.out.println();
        }
    }
}

