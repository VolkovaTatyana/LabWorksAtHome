package com.Lesson;

import com.Test.Bird;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bird b1=new Bird("w");
        Moveable b2=new Bird("Z");
        b1.sing();
        ((Bird) b2).sing();

    }
}
