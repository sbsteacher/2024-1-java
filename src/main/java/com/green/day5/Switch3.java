package com.green.day5;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (여/남) >> ");
        String gender = scan.nextLine();

        //reference 변수는 객체의 주소값을 저장할 수 있다.
        //객체의 주소값만 저장 가능 (그리고 이것은 객체를 가리키고 있다고 표현)
        //null은 주소값이 없다는 의미 (그리고 이것은 객체를 가리키고 있지 않다)
        //int num = null; //primitive type은 null을 가질 수 없다.
        String result = switch (gender) {
            case "여", "여자" -> "당신은 여성입니다";
            case "남", "남자" -> "당신은 남성입니다.";
            default -> "성별을 입력해 주세요.";
        };

        System.out.println(result);
    }
}
