package com.green.day5;

public class MissionGradeV2Result {
    public static void main(String[] args) {
        //int score = -10~120 사이의 랜덤 정수값 나올수 있도록 해주세요.
        int score = (int)(Math.random() * 131.0) - 10;
        //int score = 10;

        System.out.println("score: " + score);
        while(true) {
            String grade = "A";
            String symbol = "+";
            if(score < 0 || score > 100) {
                System.out.println("점수가 잘못되었습니다.");
                break;
            } else if(score < 100) { // score 0~99
                int tenDigit = score / 10; //0~9
                grade = switch (tenDigit) {
                    case 9 -> "A";
                    case 8 -> "B";
                    case 7 -> "C";
                    default -> {
                        symbol = "";
                        yield "F";
                    }
                };

                if(tenDigit > 6) { //9, 8, 7
                    int oneDigit = score % 10;
                    if(oneDigit < 3) { //0, 1, 2
                        symbol = "-";
                    } else if(oneDigit < 7) { // 3, 4, 5, 6
                        symbol = "0";
                    }
                }
            }
            System.out.printf("당신의 학점은 %s%s입니다.\n", grade, symbol);
            break;
        }
        System.out.println("-- 종료 --");

        //score값이 0~100사이의 값이 아니면 "점수가 잘못되었습니다." 출력 > 끝!

        //10의 자리 숫자가
        // 10, 9 > A
        // 8 > B
        // 7 > C
        // 6 > F

        //1의 자리 숫자가
        //0~2 -
        //3~6 0
        //7~9 +

        //예를 들어
        //99 > A+
        //82 > B-
        //75 > C0

        //단, F는 +-0가 없음 무조건 "F", A~C만 +-0가 있음, 100점은 A+
    }
}
