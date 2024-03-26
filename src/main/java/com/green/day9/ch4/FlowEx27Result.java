package com.green.day9.ch4;

import java.util.Scanner;

//p.172
public class FlowEx27Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("합계를 구할 숫자를 입력하세요. (종료: 0) >> ");
            int input = scan.nextInt();
            if(input == 0) { break; }
            sum += input;
        }
        System.out.printf("입력한 모든 숫자의 합계: %d\n", sum);


        /*
        가이드 출력 "합계를 구할 숫자를 입력하세요. (종료: 0) >> "
        가이드 출력이 계속 된다. 0을 입력할때까지...
        지금까지 입력한 모든 숫자를 더한 값을 출력한다.
        출력포맷은 자유
         */
    }
}
