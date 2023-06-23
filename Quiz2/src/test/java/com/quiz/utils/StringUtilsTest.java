package com.quiz.utils;

import example.quiz.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        testIsPalindrome();
    }

    public static void testIsPalindrome() {
        String str = "level";
        boolean result = StringUtils.isPalindrome(str);
        System.out.println("Is \"" + str + "\" a palindrome? " + result);
    }
}