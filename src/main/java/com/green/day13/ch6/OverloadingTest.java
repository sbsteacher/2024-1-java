package com.green.day13.ch6;

//p.286
public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        mm.add(10, 20);
    }
}
/*
    오버로딩: 같은 이름의 메소드를 여러개 작성을 가능하게 해주는 기법/기술
    오버로딩은 매개변수로 구분(변수명 상관 X)만 되면 작성 가능 (오로지 매개변수만 따진다. 타입 순서, 갯수 등)
    리턴타입은 상관 X

 */
class MyMath3 {
    int add(int n1, int n2) {
        return n1 + n2;
    }

    //위에 add메소드도 int, int 파라미터기 때문에 구분이 안된다. 그렇기에 불가하다.
//    void add(int nn1, int nn2) {
//
//    }
    int add(int n1, double n2) {
        return 0;
    }
}
