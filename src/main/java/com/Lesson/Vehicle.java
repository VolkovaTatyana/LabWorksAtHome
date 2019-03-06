package com.Lesson;

public abstract class Vehicle implements Moveable {
    public void move(){
        System.out.println("move");
    }
    abstract void doSomthing();
}
