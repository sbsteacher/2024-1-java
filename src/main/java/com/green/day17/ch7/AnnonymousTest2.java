package com.green.day17.ch7;

public class AnnonymousTest2 {
    public static void main(String[] args) {
        Movable m1 = new MyMove();
        m1.move();

        Movable m2 = new Movable() {
            @Override
            public void move() { System.out.println("일본으로 가자!!"); }
        };
        m2.move();
    }
}
interface Movable {
    void move();
}
class MyMove implements Movable {
    @Override
    public void move() {
        System.out.println("서울까지 가자~~");
    }
}