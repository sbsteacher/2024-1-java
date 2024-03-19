package com.green.day4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 1;

        while(input != 0) {
            System.out.print("숫자를 입력해 주세요. (종료:0) >> ");
            input = scan.nextInt();
        }
        System.out.println("-- 종료 --");




//        int i=0;
//        while(i<10) {
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("--종료--");

    }
}
