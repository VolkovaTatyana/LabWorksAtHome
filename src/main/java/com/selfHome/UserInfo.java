package com.selfHome;

public class UserInfo {
    public static void main(String[] args) {

        User user1 = new User("Ivan", "Ivanov", 1980,
                new Address("UA", "ZP", "+38-066-123-45-67"));
        System.out.println(user1);

    }
}
