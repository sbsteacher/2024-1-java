package com.green.day4;

public class MissionSumForLoopResult {
    public static void main(String[] args) {
        //1~10까지 더한 값 출력
        int sum = 0;
        for(int i=1; i<=10; i++) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
    }
}
