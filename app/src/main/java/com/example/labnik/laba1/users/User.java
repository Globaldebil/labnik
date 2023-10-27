package com.example.labnik.laba1.users;


import com.example.labnik.R;

import java.util.ArrayList;

public class User {
    private String Login;
    private String Password;
    public User(String login, String password) {
        Login = login;
        Password = password;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }

    public static ArrayList<User> get(String[] log, String[] pass){
        ArrayList<User> users = new ArrayList<User>();
        for(int i = 0; i < log.length; i++){
            users.add(new User(log[i],pass[i]));
        }
        return users;
    }
}
