package com.green.day18;

import java.util.Arrays;

public class ExamTest2 {
    public static void main(String[] args) {
        /*
        2 x 1 = 2 (tab) 3 x 1 = 3 (tab) 4 x 1 = 4 (개행)
        2 x 2 = 4 (tab) 3 x 2 = 6 (tab) 4 x 2 = 8 (개행)
        ...
        2 x 9 = 18 (\t) 3 x 9 = 27 (tab) 4 x 9 = 36 (개행)
         */
        Exam2.printGugudan(2, 9);

        int sum = Exam2.getSumFromString2("23223"); //2 + 3 + 2 + 2 + 3 값 리턴 (12)
        System.out.println("sum: " + sum);
        int sum2 = Exam2.getSumFromString2("111"); //1 + 1 + 1 값 리턴 (3)
        System.out.println("sum2: " + sum2);
        System.out.println("-----------");
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));
        Exam2.inputRandomValue(arr); //1~9사이의 랜덤값 중복없이
        System.out.println(Arrays.toString(arr));
    }
}

class Exam2 {
    static void inputRandomValue(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int rVal = (int)(Math.random() * 9) + 1; //1~9사이 랜덤값
            arr[i] = rVal;

            for(int z=0; z<i; z++) {
                if(arr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }

    static int getSumFromString2(String str) {
        int sum = 0;
        int val = Integer.parseInt(str);
        do {
            int oneDigit = val % 10;
            sum += oneDigit;
            val /= 10;
        } while(val > 0);
        return sum;
    }

    static int getSumFromString(String str) { //문자 배열로 처리
        int sum = 0;
        char[] charArr = str.toCharArray();
        for(int i=0; i<charArr.length; i++) {
            char ch = charArr[i];
            int val = Character.getNumericValue(ch);
            sum += val;
        }
        return sum;
    }

    static void printGugudan(int sDan, int eDan) {
        for(int i=1; i<10; i++) {
            for(int z=sDan; z<=eDan; z++) {
                System.out.printf("%d x %d = %d\t", z, i, z * i);
            }
            System.out.println();
        }
    }

}
