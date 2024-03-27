package com.green.day9.ch5;

import java.util.Arrays;

public class MissionArray2Result {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i<numArr.length; i++) {
            int rVal = (int)(Math.random() * 21.0) + 10;
            numArr[i] = rVal;
        }
        System.out.println(Arrays.toString(numArr));
        /*
        정수값 10개 저장할 수 있는 배열 생성
        10칸 초기화 하는데 10~30 칸마다 랜덤값 값이 세팅될 수 있도록 해주세요.
        (중복 허용)
        출력 포맷은 자유
         */
    }
}
