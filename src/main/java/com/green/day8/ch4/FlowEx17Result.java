package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >>");
        int star = scan.nextInt();

        for(int i=0; i<star; i++) {
            for(int z=0; z<=i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            Scanner를 이용하여 정수를 입력 받는다.
            가이드 내용 "*을 출력할 라인의 수를 입력하세요 >> "

            만약 정수값이 3이라면
            *
            **
            ***

            만약 정수값이 5라면
            *
            **
            ***
            ****
            *****
         */
    }
}
