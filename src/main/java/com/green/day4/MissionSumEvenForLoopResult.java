package com.green.day4;

public class MissionSumEvenForLoopResult {
    public static void main(String[] args) {
        //1~100까지 짝수만 더한 값 출력
        //2550
        int evenSum = 0;
        for(int i=1; i<=100; i++) {
            if(i % 2 == 0) {
                evenSum = evenSum + i;
                //evenSum += i;
            }
        }
        System.out.println("evenSum: " + evenSum);
    }
}
