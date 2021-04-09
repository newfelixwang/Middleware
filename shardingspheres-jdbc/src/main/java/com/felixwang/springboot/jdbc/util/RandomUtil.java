package com.felixwang.springboot.jdbc.util;

import java.util.Random;

public class RandomUtil {
    private static final Random random= new Random();

    public static int nextInt(int number)
    {
        return random.nextInt(number);
    }
}
