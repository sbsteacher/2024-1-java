package com.green.day13.ch6;
//p.292 생성자(Constructor)
//class타입의 객체지향 언어는 객체를 생성할 때 생성자를 호출해야 한다.
//생성자의 특징: 객체 생성 때만 사용, 생성 후에는 호출 불가
//생성자 작성법: 1. 이름이 클래스명과 같다., 2.리턴타입 없음
//생성자 사용 이유: 1. 객체생성 하기 위해, 2.생성과 동시에 멤버필드 초기화하기 위해
public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        System.out.println("d1.value: " + d1.value);
        //d1.Data1(); //생성 후에는 호출 불가

        Data2 d2 = new Data2(10);
        System.out.println("d2.value: " + d2.value);
        Data2 d2_1 = new Data2();
        System.out.println("d2_1.value: " + d2_1.value); //100
    }
}

class Data1 {
    int value;

    public Data1() { //기본 생성자(만 컴파일러가 자동으로 추가해준다.(생성자가 하나도 없을 때만))
        System.out.println("Data1 생성자 호출!!");
    }
}

class Data2 {
    int value;

    public Data2() {
        value = 100;
    }

    public Data2(int param) {
        value = param;
    }
}