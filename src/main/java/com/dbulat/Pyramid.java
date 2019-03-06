package com.dbulat;

public class Pyramid {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
                if (j==i){
                    for (int k = i-1; k > 0; k--) {
                        System.out.print(k);
                    }

                }

            }
            System.out.println();
        }

    }
}
