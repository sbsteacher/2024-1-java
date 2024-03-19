package com.green.day3;

public class MissionForLoopGugudan {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; //2~9랜덤값
        System.out.println("dan: " + dan);

        for(int i=1; i<10; i++) {
            //System.out.println(dan + " x " + i + " = " + (dan * i));
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
        }
        int num = 1000000;
        System.out.printf("%,d\n", num);
        // 1,000,000

        /*
        만약 dan = 2
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        ...
        2 x 9 = 18

        만약 dan = 5
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15
        ...
        5 x 9 = 45
       */
    }
}
