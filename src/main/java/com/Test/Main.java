package com.Test;

import com.dbulat.Duck;

public class Main {
    public static void main(String[] args) {
        final Duck duck=new Duck();
        final Bird bird=new Bird("eagle");

        bird.walk();
        duck.walk();

        duck.print();
        System.out.println(duck.toString());

    }
}
