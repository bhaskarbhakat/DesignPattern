package com.example.designpatterns.singletonPattern.lazy;

public class DBConnectionThreadSafe {
    private static DBConnectionThreadSafe instance;
    private String url;
    private String username;
    private String password;

    private DBConnectionThreadSafe(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DBConnectionThreadSafe getInstance(String url, String username, String password) {
        if (instance == null) {
            synchronized (DBConnectionThreadSafe.class) {
                if (instance == null) {
                    return new DBConnectionThreadSafe(url, username, password);
                }
            }
        }
        return instance;
    }

}

// 1st approach : To make it thread safe, make getInstance as synchronized method which solves concurrency issues
// completely but takes a toll on performance hit

// 2nd approach : To make it thread safe, use synchronised block