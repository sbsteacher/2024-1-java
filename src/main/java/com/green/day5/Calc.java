package com.green.day5;
//10의 자리숫자, 1의 자리 숫자 구하는 방법
public class Calc {
    public static void main(String[] args) {
        int score = 82;
        int val1 = score / 10; //0~10
        System.out.println(val1);

        int val2 = score % 10; //0~9
        System.out.println(val2);

        //0~2 -
        //3~6 0
        //7~9 +

        //99 > A+
        //82 > B-
        //75 > C0


    }
}
