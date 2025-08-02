package com.example.SpringMVCdemo;

public class Alien {
    private String user;
    private String password;

    @Override
    public String toString() {
        return "Alien{" +
                "password='" + password + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
