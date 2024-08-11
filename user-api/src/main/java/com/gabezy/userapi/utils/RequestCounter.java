package com.gabezy.userapi.utils;

import lombok.Getter;

public class RequestCounter {

    private static Integer counter = 0;

    public static Integer increment() {
        counter++;
        return counter;
    }
}
