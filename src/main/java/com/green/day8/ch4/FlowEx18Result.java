package com.green.day8.ch4;

public class FlowEx18Result {
    public static void main(String[] args) {
        for(int i=2; i<13; i++) {
            if(i > 2) {
                System.out.println("----");
            }
            for(int z=1; z<10; z++) {
                System.out.printf("%d x %d = %d\n", i, z, i * z);
            }
        }
        /*
        2~9단 구구단 출력
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        ...
        2 x 9 = 18
        ----
        3 x 1 = 3
        3 x 2 = 6
        ...
        9 x 9 = 81

         */
    }
}
