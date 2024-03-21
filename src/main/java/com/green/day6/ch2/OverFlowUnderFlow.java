package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        int i = 127;
        int i2 = -129;
        if(Byte.MAX_VALUE >= i) {
            byte b = (byte)i;
            System.out.println("b: " + b);
        }
        if(Byte.MIN_VALUE <= i2) {
            byte b2 = (byte)i2;
            System.out.println("b2: " + b2);
        }
        System.out.println("-- 종료 --");
    }
}
