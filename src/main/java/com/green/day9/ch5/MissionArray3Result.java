package com.green.day9.ch5;

import java.util.Arrays;

public class MissionArray3Result {
    public static void main(String[] args) {
        int[] numArr = { 10, 20, 30 };

        int temp = numArr[2];
        numArr[2] = numArr[0];
        numArr[0] = temp;

        System.out.println(Arrays.toString(numArr));
        /*
        스와핑, 0번칸, 2번칸 스와핑 해주세요.
         */
    }
}
