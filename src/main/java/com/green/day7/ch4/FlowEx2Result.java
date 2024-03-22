package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 >>");
        String input = scan.nextLine();
        int numVal = Integer.parseInt(input);
        String result = switch (numVal) {
          case 0 -> "입력하신 숫자는 0입니다.";
          default -> String.format("입력하신 숫자는 0이 아닙니다. " +
                  "\n입력하신 숫자는 %d입니다.\n", numVal);
        };
        System.out.println(result);
        /*
        Scanner 객체를 이용하여 콘솔에서 문자열값을 받는다.
        받은 문자열을 숫자로 파싱한다.
        파싱한 숫자가 0이라면 >> 입력하신 숫자는 0입니다. (출력)
                    0이 아니라면 >> 입력하신 숫자는 0이 아닙니다.
                                  입력하신 숫자는 ?입니다. (출력)
         */
    }
}
