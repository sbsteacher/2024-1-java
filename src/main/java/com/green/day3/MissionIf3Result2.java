package com.green.day3;

import java.util.Scanner;

public class MissionIf3Result2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요.(남/여) >> ");
        String gender = scan.nextLine();
        System.out.print("당신의 키를 입력해 주세요 >> ");
        int height = scan.nextInt();
        int standHeight = 161; //여자 평균키값

        if("남".equals(gender)) {
            standHeight = 175;
            System.out.print("남자 ");
        } else if("여".equals(gender)) {
            System.out.print("여자 ");
        }
        if(height > standHeight) {
            System.out.println("평균보다 큽니다.");
        } else if(height < standHeight) {
            System.out.println("평균보다 작습니다.");
        } else {
            System.out.println("평균입니다.");
        }
        System.out.println("-- 종료 --");
        //남자 평균키: 175, 여자 평균키: 161
        //gender "남", 기준값이 175
        //gender "여", 기준값이 161
        //gender "남 or 여 아니면" 성별을 입력해 주세요. > 종료
    }
}
