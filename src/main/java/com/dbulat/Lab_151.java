package com.dbulat;

public class Lab_151 {
    public static void main(String[] args) {
        int x = 0;
        for (int j = 0; j < 8; j++) {
            x++;
            for (int i = x; i > 0; i--) {
                System.out.print(+i);
            }
            System.out.println();
        }
    }
}
