package com.company;

public class User {
    private String id;
    private String login;
    private String password;

    public User(String id,String login,String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
