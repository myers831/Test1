package com.example.admin.test1;

/**
 * Created by Admin on 9/29/2017.
 */

class Singleton {
    private static final Singleton ourInstance = new Singleton();

    static synchronized Singleton getInstance() {
        System.out.println("In use");
        return ourInstance;
    }

    private Singleton() {
    }
}
