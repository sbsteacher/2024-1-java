package com.green.day3;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "안녕";
        String s2 = "안녕";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "Hello";
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s1));

        String so1 = new String("안녕");
        String so2 = new String("안녕");
        System.out.println(so1);
        System.out.println(so2);
        System.out.println(so1 == so2);
        System.out.println(so1.equals(so2));
        System.out.println(so2.equals(so1));
    }
}
