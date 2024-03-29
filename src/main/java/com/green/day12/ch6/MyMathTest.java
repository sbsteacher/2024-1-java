package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        myMath.add(10, 20);
        myMath.add(100, 200);

        myMath.minus(100, 50); //100 - 50 = 50
        myMath.minus(200, 50); //200 - 50 = 150
        //System.out.println(myMath.minus(200, 50));

        System.out.println(myMath.returnAdd(500, 600));

        int result = myMath.returnAdd(500, 600);

        myMath.returnAdd(500, 600);
    }
}

class MyMath {
    //리턴 메소드, void 메소드

    //리턴타입 메소드명 파라미터(매개변수) > 메소드 선언부
    // { } 부분은 > 메소드 구현부
    void method1() {

    }

    int method2() {
        return 10;
    }

    void add(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
        return;
    }

    int returnAdd(int n1, int n2) {
        return n1 + n2;
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
        return;
    }

}
