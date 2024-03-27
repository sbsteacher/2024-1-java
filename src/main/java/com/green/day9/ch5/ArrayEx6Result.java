package com.green.day9.ch5;

public class ArrayEx6Result {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33 };
        int min = score[0], max = score[0];

        for(int i=1; i<score.length; i++) {
            if(min > score[i]) {
                min = score[i];
            } else if(max < score[i]) {
                max = score[i];
            }
        }
        System.out.printf("min: %d, max: %d\n", min ,max);
        /*
        score에서 가장 큰 값, 가장 작은 값 찾아내서 출력
        min: 33, max: 100
         */
    }
}
