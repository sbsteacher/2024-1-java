package com.green.day17.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            throw new Exception("뭐 땜에 예외가 발생되었소!!");
        } catch (Exception e) {
            System.out.println("예외발생: " + e.getMessage());
        }
        System.out.println("-- 종료 --");
    }
}
