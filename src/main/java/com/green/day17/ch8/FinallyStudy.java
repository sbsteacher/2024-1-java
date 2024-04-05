package com.green.day17.ch8;

public class FinallyStudy {
    public static void main(String[] args) {
        method(2);
    }

    public static void method(int val) {
        try {
            if(val % 2 == 0) {
                return;
            }
        } catch (Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("finally");
        }
        System.out.println("method 종료");
    }
}
