package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17_1Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >>");
        int star = scan.nextInt();

        //for문 2개 + if문
        for(int i=star; i>0; i--) {//5, 4, 3
            for(int z=1; z<=star; z++) { //1, 2, 3, 4, 5
                System.out.print(z<i ? "_" : "*");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        //for문 3개로 해결
        for(int i=1; i<=star; i++) {
            for(int z=star-i; z>0; z--) {
                System.out.print("_");
            }
            for(int z=0; z<i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            Scanner를 이용하여 정수를 입력 받는다.
            가이드 내용 "*을 출력할 라인의 수를 입력하세요 >> "

            만약 정수값이 3이라면
            __*
            _**
            ***

            만약 정수값이 5라면
            ____*
            ___**
            __***
            _****
            *****
         */
    }
}
