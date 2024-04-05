package com.green.day17.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {

        try {
            System.out.println("--- 시작 ---");
            int a = 10;
            int b = 20;
            //int c = 10 / 0;
            throw new Exception();
        } catch (ArithmeticException e) {
            System.out.println("수학적 예외 발생!!!");
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생!!");
        } finally {
            System.out.println("finally 반드시 실행한다.");
        }
        System.out.println("--- 종료 ---");
    }
}
