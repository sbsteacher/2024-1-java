package com.green.day5.ch2;

public class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 14;
        int year2 = 0, age2 = 14;
        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;
        System.out.println(year); //2014
        System.out.println(age); //15
    }
}
