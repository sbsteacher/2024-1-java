package com.green.day5;

public class MissionGradeV2 {
    public static void main(String[] args) {
        //int score = -10~120 사이의 랜덤 정수값 나올수 있도록 해주세요.
        int score = (int)(Math.random() * 101.0);

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
