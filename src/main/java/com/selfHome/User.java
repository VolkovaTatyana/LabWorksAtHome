package com.selfHome;

public class User {
    private String name;
    private String surname;
    private String address;
    private int yearOfBirth;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public User(String name, String surname, String address, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+
                '\n'+"Surname: "+getSurname()+
                '\n'+"Address: "+getAddress()+
                '\n'+"Year Of Birth: "+getYearOfBirth();
    }


    }

