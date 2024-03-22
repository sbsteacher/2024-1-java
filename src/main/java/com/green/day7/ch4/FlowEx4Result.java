package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 >> ");
        int score = scan.nextInt();
        scan.close();

        if(score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
        } else {  //0 ~ 100
            char grade = 'D';
            if(score >= 90) { // 100 ~ 90
                grade = 'A';
            } else if(score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            }
            System.out.printf("당신의 학점은 %c입니다.\n", grade);
        }
        System.out.println("-- 종료 --");
        /*
        Scanner를 통해 점수를 입력받으세요.
        점수는 정수로 바로 받으시고, grade(학점)을 관리할 문자타입을 선언해주세요.
        만약 점수가 90점 이상이면 grade에 A값을 저장하고
        만약 점수가 80점 이상이면 grade에 B값을 저장하고
        만약 점수가 70점 이상이면 grade에 C값을 저장하고
        69점 이하라면 grade에 D값을 저장하세요.

        (출력) 당신의 학점은 ?입니다.
         */
    }
}
