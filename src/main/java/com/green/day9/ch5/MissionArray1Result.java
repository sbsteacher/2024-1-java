package com.green.day9.ch5;

public class MissionArray1Result {
    public static void main(String[] args) {
        int[] numArr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        //Q1) for문 활용 오른쪽과 같이 출력  >> 10, 20, 30, 40, 50,
        for(int i=0; i<numArr.length; i++) {
            //System.out.print(numArr[i] + ", ");
            System.out.printf("%d, ", numArr[i]);
        }
        System.out.println();


        //Q2) for문 활용 오른쪽과 같이 출력  >> 10, 20, 30, 40, 50
        System.out.println("------------ Q2-1");
        for(int i=0; i<numArr.length; i++) {
            if(i == numArr.length - 1) {
                System.out.print(numArr[i]);
                continue;
            }
            System.out.printf("%d, ", numArr[i]);

        }
        System.out.println();
        System.out.println("------------Q2-2");
        int lastIndex = numArr.length - 1;
        for(int i=0; i<numArr.length; i++) {
            System.out.printf("%d", numArr[i]);
            if(i < lastIndex) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("------------Q2-3");
        for(int i=0; i<numArr.length; i++) {
            if(i > 0) {
                System.out.print(", ");
            }
            System.out.printf("%d", numArr[i]);
        }
        System.out.println();
        System.out.println("------------Q2-4");
        System.out.print(numArr[0]);
        for(int i=1; i<numArr.length; i++) {
            System.out.printf(", %d", numArr[i]);
        }
    }
}
