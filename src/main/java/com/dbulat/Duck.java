package com.dbulat;

import com.Test.Bird;

public class Duck extends Bird {
    public Duck() {
        super("duck name");
    }

    private void swim(){
        System.out.println("I'm swimming");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("I'm swimming like walk");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", hz=" + hz +
                '}';
    }

    public void print(){
        walk();
        swim();
        System.out.println(name);
        System.out.println(color);
        System.out.println(hz);
    }
}
