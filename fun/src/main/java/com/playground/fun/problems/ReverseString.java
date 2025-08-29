package com.playground.fun.problems;

import java.util.Arrays;

/**
 * Different ways to reverse a string
 */
public class ReverseString {

    /**
     * Classic for loop example
     * @param args input string
     * @return String reversed
     */
    public static String forLoop(String args) {
        String r = "";

        for (int i = 0; i < args.length(); i++) {
            char ch = args.charAt(i);
            // This pattern adds each char at the beginning of the existing string;
            r = ch + r;
        }

        return r;
    }

    /**
     * Reverses a string using byte array
     * @param arg input string
     * @return reversed string
     */
    public static String bytes(String arg) {
        byte[] strBytes = arg.getBytes();
        byte[] res = new byte[arg.length()];

        for (int i = 0; i < strBytes.length; i++) {
            res[i] = strBytes[strBytes.length - 1 - i];
        }

        return new String(res);
    }

    public static String stringBuilder(String arg) {
        StringBuilder sb = new StringBuilder(arg);
        return sb.reverse().toString();
    }

    public static String charArray(String arg) {
        char[] charArray = arg.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(forLoop("I love Java"));
        System.out.println(bytes("Make it so!"));
        System.out.println((stringBuilder("A lovely bunch of coconuts")));
        System.out.println(charArray("Shh... it's a secret!"));
    }

}