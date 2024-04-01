package com.green.day12.ch6;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.checkOddEven(10); //(콘솔출력)짝수입니다.
        mm.checkOddEven(11); //(콘솔출력)홀수입니다.
        mm.checkOddEven(100); //(콘솔출력)짝수입니다.
        mm.checkOddEven(13); //(콘솔출력)홀수입니다.

        int r = mm.abs(10);
        System.out.println(r); //10

        r = mm.abs(-2);
        System.out.println(r); //2

        int randomValue = mm.getRandomValue(10); //0~9 사이의 랜덤값 리턴
        randomValue = mm.getRandomValue(100); //0~99 사이의 랜덤값 리턴

        mm.printGugudan(3);
        /*
        3 x 1 = 3
        3 x 2 = 6
        ...
        3 x 9 = 27
         */

        mm.printGugudan(5);
        /*
        5 x 1 = 5
        5 x 2 = 10
        ...
        5 x 9 = 45
         */

        int randomValue2 = mm.getRandomValue(10, 20); //10~19
        randomValue2 = mm.getRandomValue(5, 31); //5~30
    }
}

//위치파악 > 리턴,void > 메소드명 > 파라미터
class MyMethod {

    int a = 1;
    void printGugudan(int dan) {
        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }

    int getRandomValue(int min, int max) {
        int range = max - min;
        return (int)(Math.random() * range) + min;
    }

    int getRandomValue(int maxNum) {
        return (int)(Math.random() * maxNum);
    }

    int abs(int num) {
        return num < 0 ? -num : num;
    }

    void checkOddEven(int num) {
//        String result = num % 2 == 0 ? "짝" : "홀";
//        System.out.printf("%s수입니다.\n", result);
        System.out.printf("%s수입니다.\n", num % 2 == 0 ? "짝" : "홀");
    }
}
