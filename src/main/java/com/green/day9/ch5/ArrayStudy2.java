package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int len = 30;
        int[] numArr = new int[len]; //0~99
        System.out.println(numArr.length);
        System.out.println(Arrays.toString(numArr));
        for(int i=0; i<numArr.length; i++) {
            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
        }

//        numArr[0] = 1;
//        numArr[1] = 2;
//        numArr[2] = 3;
//        numArr[9] = 10;

        for(int i=0; i<numArr.length; i++) {
            numArr[i] = i + 1;
        }

        for(int i=0; i<numArr.length; i++) {
            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
        }
        System.out.printf("numArr[%d]: %d\n", 0, numArr[0]);
        System.out.printf("numArr[%d]: %d\n", 1, numArr[1]);
        System.out.printf("numArr[%d]: %d\n", 2, numArr[2]);

        //System.out.printf("numArr[%d]: %d\n", 99, numArr[99]);

    }
}
