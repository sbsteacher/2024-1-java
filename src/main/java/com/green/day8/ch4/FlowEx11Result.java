package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx11Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 주민번호를 입력하세요.(format: ######-#######) >> ");
        String id = scan.nextLine();
        char genderVal = id.charAt(7);
        String direction = "전";
        switch(genderVal) {
            default:
                System.out.println("유효하지않은 주민번호입니다.");
                break;
            case '1': case '3':
                switch(genderVal) {
                    case '3': direction = "후";
                }
                System.out.printf("당신은 2000년 이%s에 출생한 남자입니다.", direction);
                break;
            case '2': case '4':
                switch(genderVal) {
                    case '4': direction = "후";
                }
                System.out.printf("당신은 2000년 이%s에 출생한 여자입니다.", direction);
                break;
        }

         /*
        1, 3 > 남
        2, 4 > 여
        Scanner 객체를 통해 주민번호를 입력받으시고
        '1' > "당신은 2000년 이전에 출생한 남자입니다."
        '3' > "당신은 2000년 이후에 출생한 남자입니다."
        '2' > "당신은 2000년 이전에 출생한 여자입니다."
        '4' > "당신은 2000년 이후에 출생한 여자입니다."
        이외 값 > "유효하지않은 주민번호입니다."출력
        switch 만 사용 가능
         */
    }
}
