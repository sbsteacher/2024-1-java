package com.green.day8.ch4;

public class FlowEx13Result {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10; i++) {
            sum += i; //sum = sum + i;
            System.out.printf("1부터 %d까지의 합: %d\n", i, sum);
        }

        /*
        1 ~ 10 전부 더한 값 과정 출력

        1부터 1까지의 합: 1
        1부터 2까지의 합: 3
        1부터 3까지의 합: 6
        ...
        1부터 10까지의 합: 55

         */
    }
}
