package com.green.day12.ch6;
//p.246

//변수의 종류
public class Variable {
    int iv; //인스턴스 변수, 전역 변수(Global Variable)
    static int cv; //클래스 변수, 스태틱 변수, 전역 변수(Global Varialbe)

    void method(int num) {
        int lv = 0; //지역 변수 (Local Variable)
    }
    void method2() {

    }
    static void staticMethod() {
        int lv = 0; //지역 변수 (Local Variable)
    }
}
