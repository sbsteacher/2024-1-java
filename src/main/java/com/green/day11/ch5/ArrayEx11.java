package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];
        //Q1. numArr 모든 방에 0~9사이의 랜덤값 넣어주세요. (중복 허용)
        for(int i=0; i<numArr.length; i++) {
            numArr[i] = (int)(Math.random() * numArr.length); //0~9, 10~19
        }
        System.out.println(Arrays.toString(numArr));
        for(int i=0; i<numArr.length; i++) {
            int val = numArr[i];
            counterArr[val]++;
        }
        for(int i=0; i<counterArr.length; i++) {
            System.out.printf("counterArr[%d]: %d\n"
                    , i, counterArr[i]);
        }
        //Q2. numArr 각 칸에 들어있는 값의 갯수를 counterArr에 정리한다.
        //예를들어 [9, 8, 6, 7, 6, 6, 0, 0, 4, 2]인 경우
        // counterArr[0]에는 2
        // counterArr[1]에는 0
        // counterArr[9]에는 1
        //

    }
}
