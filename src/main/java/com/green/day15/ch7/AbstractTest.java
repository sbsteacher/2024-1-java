package com.green.day15.ch7;

public class AbstractTest {
    public static void main(String[] args) {
        //Dog d = new Dog();
    }
}

abstract class Dog { //추상 클래스

}

abstract class Cat {
    int age;
    //추상 메소드
    abstract void crying();

    void jump() {
        System.out.println("폴짝 폴짝");
    }
}

class KoreaShortCat extends Cat {
    @Override
    void crying() {
        System.out.println("야옹~ 야옹~");
    }
}

class AmericaCat extends Cat {

    @Override
    void crying() {
        System.out.println("미유~~ 미유~~");
    }
}