package com.green.day2;

public class RandomValue {
    public static void main(String[] args) {
        //형변환, 타입이 안 맞으면 맞게 타입 변화를 줘야 한다.
        // 자동형변환, 강제형변환
        System.out.println(Math.random() * 10); //0.000000 ~ 0.999999

        int result = (int)(Math.random() * 10); //0~9, 1~9
        System.out.println(result);

    }
}
