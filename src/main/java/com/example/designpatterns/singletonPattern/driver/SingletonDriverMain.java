package com.example.designpatterns.singletonPattern.driver;

import com.example.designpatterns.singletonPattern.eager.DBConnectionEager;
import com.example.designpatterns.singletonPattern.lazy.DBConnectionNonThreadSafe;
import com.example.designpatterns.singletonPattern.lazy.DBConnectionThreadSafe;

public class SingletonDriverMain {

    public static void main(String[] args) {
        // Eager singleton class - can't take user input in runtime
        DBConnectionEager dbConnectionEager = DBConnectionEager.getInstance();

        // Lazy non-thread safe class - concurrency issue
        DBConnectionNonThreadSafe dbConnectionNonThreadSafe = DBConnectionNonThreadSafe.getInstance("jdbc:mysql://localhost:8081/user/db",
                "bhaskarbhakat", "password");

        // Lazy thread safe class - can be break by using reflection or serialize object into byte stream.
        DBConnectionThreadSafe dbConnectionThreadSafe = DBConnectionThreadSafe.getInstance("jdbc:mysql://localhost:8081/user/db",
                "bhaskarbhakat", "password");
    }

}
