package com.gabezy.payrollapi.utils;


public class RequestCounter {

    public static Integer counter = 0;

    public static Integer increment() {
        return ++counter;
    }

}
