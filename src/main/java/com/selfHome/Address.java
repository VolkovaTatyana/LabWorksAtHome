package com.selfHome;

public class Address {
    private String country;
    private String city;
    private String phone;

    Address(String country, String city, String phone) {
        this.country = country;
        this.city = city;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return
                "country- " + country + '\n' +
                "city- " + city + '\n' +
                "phone- " + phone + '\n';
    }
}
