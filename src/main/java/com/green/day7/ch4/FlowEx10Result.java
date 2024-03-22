package com.green.day7.ch4;

public class FlowEx10Result {
    public static void main(String[] args) {
        int score = -200;
        if(score < 0 || score > 100) {
            System.out.println("잘못된 값입니다.");
        } else { //0~100
            int tenDigit = score / 10;
            String grade = switch(tenDigit) {
                case 9, 10 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                default -> "F";
            };
            System.out.printf("당신의 학점은 %s입니다.\n", grade);
        }
        /*
        값 입력은 자유
        switch 사용
        90점 이상은 "당신의 학점은 A입니다.
        80점 이상은 "당신의 학점은 B입니다.
        70점 이상은 "당신의 학점은 C입니다.
        나머지는 "당신의 학점은 F입니다.
        10의 자리 숫자를 뽑아내서 switch로 해결
         */
    }
}
