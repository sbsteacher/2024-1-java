package com.green.day2;

//비교 연산자
//comparison operator
public class CompOperator {
    public static void main(String[] args) {
        //정수형 데이터 타입인 int형
        //불린형, true, false값만 가질 수 있는 데이터 타입
        boolean b1 = true;
        boolean b2 = false;
        //boolean b3 = 32;

        boolean r1 = 10 > 9; //10이 9보다 초과?
        System.out.println(r1);

        r1 = 10 < 9; //10이 9보다 미만?
        System.out.println(r1);

        r1 = 10 >= 9; //10은 9보다 이상?
        System.out.println(r1);

        r1 = 10 >= 10; //10은 10보다 이상?
        System.out.println(r1);

        r1 = 10 <= 10; //10은 10보다 이하?
        System.out.println(r1);

        r1 = 10 == 10; //10은 10과 같니? > true
        System.out.println(r1);

        r1 = 10 != 10; //10은 10과 다르니? > false
        System.out.println(r1);
    }
}
