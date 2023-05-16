package com.c1se16.core.utils;

import java.util.UUID;

public class RandomUtil {

    public static String random() {
        return UUID.randomUUID().toString();
    }
}
