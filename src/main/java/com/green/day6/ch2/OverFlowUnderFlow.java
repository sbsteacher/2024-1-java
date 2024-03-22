package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        int i = -2000;
        int i2 = -129;

        int n3 = 100;  // n3를 byte로 형변환을 할 것이다.
        //형변환 할 수 있는 값인지 체크하는 if문 작성해 주세요.
        if(Byte.MIN_VALUE <= n3 && n3 <= Byte.MAX_VALUE) {

        }

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
