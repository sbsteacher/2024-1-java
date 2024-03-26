package com.green.day9.ch4;

public class FlowEx29Result2 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for(int i=1; i<=100; i++) {
            System.out.printf("i=%d ", i);
            String str = String.valueOf(i);
            for(char c : str.toCharArray()) {
                switch(c) {
                    case '3': case '6': case '9':
                        System.out.print("짝");
                }
            }
            System.out.println();
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("nano seconds :" +  timeElapsed);
        //1000, nano seconds :38338000
        //100000, nano seconds :7490550200

        /*
        1~100까지
        3,6,9 게임
        i=1
        i=2
        i=3 짝
        i=4
        i=5
        i=6 짝
        ...
        i=30 짝
        ...
        i=33 짝짝
        ...
        i=99 짝짝
        i=100
         */
    }
}
