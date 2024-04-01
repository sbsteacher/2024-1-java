package com.green.day13.ch6;
//p.264
public class PrimitiveRefEx {
    public static void main(String[] args) {
        int num = 10;

        Numbox nb = new Numbox();
        nb.num = 10;

        changeNum(num);
        System.out.println("num:" + num); //10

        changeNum(nb);
        System.out.println("nb.num:" + nb.num); //100
    }
    public static void changeNum(Numbox n) {
        n = new Numbox();
        n.num = 100;
    }

    public static void changeNum(int num) {
        num = 100;
    }


    //void, 같은 클래스 안에 존재, static, 메소드명: changeNum,  파라미터 정수값 1개

}

class Numbox {
    int num;
}
