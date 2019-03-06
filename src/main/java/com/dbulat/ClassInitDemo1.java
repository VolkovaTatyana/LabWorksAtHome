package com.dbulat;

public class ClassInitDemo1 {
    public ClassInitDemo1(){
        System.out.println("constr");
    }
    {
        System.out.println("nonStat");
    }
    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        System.out.println("main");
        ClassInitDemo1 cmd=new ClassInitDemo1();
    }
}
