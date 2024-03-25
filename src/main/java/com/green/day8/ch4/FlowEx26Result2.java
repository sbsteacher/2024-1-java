package com.green.day8.ch4;

public class FlowEx26Result2 {
    public static void main(String[] args) {
        /*
        (책 예제 답)
        1 ~ n
        값들을 계속 더할껀데 더한값이 100이하인 index값이 몇인지 구하시오.
         */
        int i = 0;
        int sum = 0;
        while((sum += ++i) < 200) {
            System.out.printf("sum: %d, i: %d\n", sum, i);
        }
        System.out.println("----------");
        System.out.println(i);
    }
}
