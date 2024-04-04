package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args) {
        //Parent p = new Parent(55);

        Child child = new Child();
        child.defense();
        child.attack();
        //child.doubleAttack();

        Parent parent = new Parent(10);
        parent.attack();
    }
}

class Parent {
    int age;

    //리턴타입이 없다. 이름이 클래스명과 같다.
    Parent(int age) {
        super();
        this.age = age;
    }

    public void attack() {
        System.out.println("부모가 적을 공격한다.");
    }

    public void defense() {
        System.out.println("부모가 적의 공격을 방어한다.");
    }
}

class Child extends Parent {
    int mzPower;
     //애노테이션 Annotation

    public Child() {
        super(112);
    }

    @Override
    public void attack() {
        System.out.println("자식이 적을 공격한다.");
    }

    public void doubleAttack() {
        defense();
        super.defense();
        System.out.println("----");
        attack();
        super.attack();
    }
}
