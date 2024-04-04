package com.green.day16.ch7;

public class PolyTest3 {
    public static void main(String[] args) {
        BullDog bullDog = new BullDog();


        boolean r = bullDog instanceof Dog;
        System.out.println("r: " + r);

        Animal ani = new Animal();
        System.out.println("ani instanceof Dog: " + (ani instanceof Dog)); //?, false

        ani = new BullDog();
        System.out.println("ani instanceof Dog: " + (ani instanceof Dog)); //true, true

    }
}
