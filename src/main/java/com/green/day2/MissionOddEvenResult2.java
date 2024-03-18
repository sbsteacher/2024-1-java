package com.green.day2;

public class MissionOddEvenResult2 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 10) + 1; // 1~10

        System.out.print(num);
        System.out.print("는(은) ");
        System.out.print(num % 2 == 0 ? "짝" : "홀");
        System.out.println("수입니다.");
    }
}
