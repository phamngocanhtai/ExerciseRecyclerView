package com.example.exerciserecyclerview;

import java.util.ArrayList;
import java.util.Random;

public class User {
    String name;
    String phone;
    int avatar;

    public User(String name, String phone, int avatar) {
        this.name = name;
        this.phone = phone;
        this.avatar = avatar;
    }

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    static ArrayList<User> getMockData () {

        ArrayList<User> users = new ArrayList<>();
        Random random = new Random();

        String [] name = {"AAAA", "BBBB", "CCCC", "DDDD", "EEEE",
                            "FFFF", "GGGG", "HHHH", "IIII", "JJJJ"};
        String [] phone = {"0000...", "1111...", "2222...", "3333...", "4444...",
                            "5555...", "6666...", "7777...", "8888...", "9999..."};

        for (int i = 0; i <name.length; i++)
        {
            users.add(new User(name[i], phone[i], random.nextInt(7)));
        }
        return users;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
