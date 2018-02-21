package com.example;

public class Student {
    private static int count;

    public Student() {
        count++;
    }

    public static int getCount() {

        return count;
    }
}

