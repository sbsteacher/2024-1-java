package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int targetVal = (int)(Math.random() * 100.0) + 1;
        System.out.println("targetVal: " + targetVal);
        while(true) {
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            int input = scan.nextInt();
            if(input > targetVal) {
                System.out.println("Down");
            } else if(input < targetVal) {
                System.out.println("Up");
            } else {
                System.out.println("정답");
                break;
            }
        }
    }
}
