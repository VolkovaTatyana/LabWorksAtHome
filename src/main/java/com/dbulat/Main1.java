package com.dbulat;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Rectangl rectangl = new Rectangl(15, 30);
        //System.out.println(rectangl.calc());
        //rectangl.print();
        //System.out.println("Perim=" + rectangl.perim());
        Rectangl[] recArr = new Rectangl[5];
        Random random = new Random();
        for (int i = 0; i < recArr.length; i++) {
            recArr[i] = new Rectangl(random.nextInt(10), random.nextInt(60));
            recArr[i].print();
            recArr[i].incr();
            recArr[i].print();

        }

//        int sum = 0;
//        for (int j = 0; j < recArr.length; j++) {
//            sum += recArr[j].calc();
//        }
        //System.out.println("SumSq=" + sum);

//        for (int x = 0; x < recArr.length; x++) {
//            System.out.println("Perim R=" + recArr[x].perim());
//        }
    }
}

class Rectangl {
    private int a;
    private int b;

    public Rectangl(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calc() {
        print();
        return a * b;
    }

    public int perim() {
        return a * 2 + b * 2;
    }

    public void print() {
        System.out.println("a: " + a +" "+ "b: " + b);
    }
    public void incr(){
        a++;
        b++;
    }

}
