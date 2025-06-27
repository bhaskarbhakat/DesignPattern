package com.example.designpatterns.singletonPattern.eager;

public class DBConnectionEager {
    private static final DBConnectionEager instance =
            new DBConnectionEager("jdbc:mysql://localhost:8081/user/db", "bhaskarbhakat", "password");

    private String url;
    private String username;
    private String password;

    private DBConnectionEager(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DBConnectionEager getInstance() {
        return instance;
    }
}
