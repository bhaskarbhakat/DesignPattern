package com.example.designpatterns.singletonPattern.lazy;

public class DBConnectionNonThreadSafe {
    private static DBConnectionNonThreadSafe instance;
    private String url;
    private String username;
    private String password;

    private DBConnectionNonThreadSafe(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DBConnectionNonThreadSafe getInstance(String url, String username, String password) {
        if (instance == null) {
            instance = new DBConnectionNonThreadSafe(url, username, password);
        }
        return instance;
    }
}
