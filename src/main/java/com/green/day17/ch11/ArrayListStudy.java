package com.green.day17.ch11;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        Object obj = 10;
        obj = "하하하하";
        obj = 11.1;

        ArrayList list = new ArrayList();
        list.add(10); //0번방에 값이 대입
        list.add(20); //1번방에 값이 대입
        list.add(30); //2번방에 값이 대입
        list.add("하하하하하"); //3번방에 값이 대입
        list.add(11.1); //4번방에 값이 대입

        int r = (int)list.get(0);
        r = (int)list.get(1);
        r = (int)list.get(2);
        r = (int)list.get(3);
        System.out.println("--- 종료 ----");
    }
}
