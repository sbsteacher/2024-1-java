package com.green.day3;

public class MissionForLoopStarResult {
    public static void main(String[] args) {
        //int star = 3~10 랜덤한 값이 star 변수에 대입되도록 해주세요.
        //           0~7
        int star = (int)(Math.random() * 8.0) + 3;
        System.out.println(star);

        for(int i=star; i>0; i--) {
            System.out.print("*");
        }
        System.out.println();
        for(int i=0; i<star; i++) {
            System.out.print("*");
        }

        //만약 star = 5
        //*****

        //만약 star = 10
        //**********
    }
}
