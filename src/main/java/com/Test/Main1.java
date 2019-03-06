package com.Test;

import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
        final HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"apple");
        map.put(2,"pinapple");
        map.put(3,"apple2");
        System.out.println(map);
        System.out.println(map.get(2));

    }
}
