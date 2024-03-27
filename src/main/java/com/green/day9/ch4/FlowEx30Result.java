package com.green.day9.ch4;

public class FlowEx30Result {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
//        while(sum <= 100) {
//            sum += ++i;
//        }
        while(true) {
            sum += ++i;
            if(sum > 100) { break; }
        }
        System.out.printf("i: %d, sum: %d\n", i, sum);
        /*
        1 ~ n까지 더하는데 100이 막 넘은 index값과 sum값을
        출력한다.
        i: 14, sum: 105
        while문으로 해결
         */
    }
}
