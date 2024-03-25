package com.green.day8.ch4;

public class FlowEx26Result {
    public static void main(String[] args) {
        /*
        1 ~ n
        값들을 계속 더할껀데 더한값이 100이하인 index값이 몇인지 구하시오.
         */
        int i = 0;
        int sum = 0;
        while(true) {
            int result = sum + i + 1;
            if(result > 200) {
                break;
            }
            sum += ++i;
        }
        System.out.println(i);
    }
}
