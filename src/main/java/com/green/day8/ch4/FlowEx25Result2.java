package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx25Result2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) >> ");
        int input = scan.nextInt();
        int copyInput = input;
        int sum = 0;
        while(copyInput != 0) {
            int oneDigit = copyInput % 10;
            sum += oneDigit;
            copyInput /= 10; //copyInput = copyInut / 10;
        }
        System.out.printf("%d 숫자를 모두 더한 값: %d\n", input, sum);

        /*
        가이드 "숫자를 입력하세요. (예:12345) >>
        정수로 값을 받는다.
        1 + 2 + 3 + 4 + 5 결과값을 출력
        "각 자리수의 합: 15" (출력)

        12345 % 10 > 5
        12345 / 10 > 1234
        1234 % 10 > 4
        1234 / 10 > 123
        123 % 10 > 3
        123 / 10 > 12
        12 % 10 > 2
        12 / 10 > 1
        1 % 10 > 1
        1 / 10 > 0
        */
    }
}
