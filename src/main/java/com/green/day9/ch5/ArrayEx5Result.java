package com.green.day9.ch5;

public class ArrayEx5Result {
    public static void main(String[] args) {
        int[] score = { 100, 88, 100, 100, 90, 80, 75 };
        int sumScore = 0;
        for(int i=0; i<score.length; i++) {
            sumScore += score[i];
        }
        double avgScore = (double)sumScore / score.length;
        System.out.printf("총점: %d, 평점: %.2f\n", sumScore, avgScore);
        /*
        학생들의 국어 점수입니다.
        총점과 평점 출력해주세요.
        포맷은 자유, 평점 소수점 2자리까지
         */
    }
}
