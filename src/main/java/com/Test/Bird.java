package com.Test;

import com.Lesson.Moveable;
import com.Lesson.Singer;

public class Bird implements Singer, Moveable {
    protected final String name;
    protected int color;
    protected int hz;

    public Bird(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bird bird = (Bird) o;

        if (color != bird.color) return false;
        if (hz != bird.hz) return false;
        return name != null ? name.equals(bird.name) : bird.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + color;
        result = 31 * result + hz;
        return result;
    }

    public void walk(){
        System.out.println("I'm walking");
    }

    public void move(){

    }

    @Override
    public void sing() {

    }
}
