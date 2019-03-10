package com.selfHome;

import java.util.Calendar;

public class User {
    private String name;
    private String surname;
    private int yearOfBirth;
    private Object Address;

    User(String name, String surname, int yearOfBirth, Object address) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        Address = address;
    }

    private int age(int yearOfBirth){
        return Calendar.getInstance().get(Calendar.YEAR)-yearOfBirth;
    }

    @Override
    public String toString() {
        return "User" + '\n' +
                "name= " + name + '\n' +
                "surname= " + surname + '\n' +
                "yearOfBirth= " + yearOfBirth + '\n' +
                "Address" + '\n' + Address.toString()+
                 "his age is= "+age(yearOfBirth)+ " years";

    }
}





