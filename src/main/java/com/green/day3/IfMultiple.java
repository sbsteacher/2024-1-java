package com.green.day3;

public class IfMultiple {
    public static void main(String[] args) {
        int val1 = 10, val2 = 100;
        //val1이 짝수면 (val2도 짝수면 val2 - val1 값을 출력, 홀수면 그대로 출력)
        //val1이 홀수면 (val2가 짝수면 val2 - 5 값을 출력, 홀수면 그대로 출력)

        if(val1 % 2 == 0) {

            if(val2 % 2 == 0) {
                System.out.println(val2 - val1);
            } else {
                System.out.println(val2);
            }

        } else {

            if(val2 % 2 == 0) {
                System.out.println(val2 - 5);
            } else {
                System.out.println(val2);
            }
        }
    }
}
