package com.green.day2;

public class MissionRandomValue {
    public static void main(String[] args) {
        //1~9 사이의 랜덤한 값 나올 수 있게 세팅
        for(int i=0; i<100; i++) {
            int result = (int)(Math.random() * 9) + 1; //0~8
            System.out.println(result);
        }
        System.out.println("---------------");

        // 5~12 사이의 랜덤한 값 나올 수 있게 세팅
        // 0~7 > 5~12
        for(int i=0; i<10; i++) {
            int result = (int)(Math.random() * 8) + 5;
            System.out.println(result);
        }
    }
}
