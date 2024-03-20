package com.green.day4;

public class MissionGradeResult {
    public static void main(String[] args) {
        //int score = 0~100 사이의 랜덤 정수값 나올수 있도록 해주세요.
        //int score = 72;
        int score = (int)(Math.random() * 101.0); //0~100
        System.out.println("score: " + score);

        if(score > 100 || score < 0) {
            System.out.println("score 점수가 잘못되었습니다.");
        } else { // score 0~100
            String grade = "F";
            if(score >= 90)      { grade = "A"; }
            else if(score >= 80) { grade = "B"; }
            else if(score >= 70) { grade = "C"; }
            //위 조건식에서 전부 false가 되는 값의 범위는 0~69
            System.out.printf("당신의 학점은 %s입니다.\n", grade);
        }
        System.out.println("-- 종료 --");

        //90점 이상은 "당신의 학점은 A입니다.
        //80점 이상은 "당신의 학점은 B입니다.
        //70점 이상은 "당신의 학점은 C입니다.
        //나머지는 "당신의 학점은 F입니다.
    }

}
