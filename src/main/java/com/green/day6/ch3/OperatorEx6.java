package com.green.day6.ch3;
//p.98 ~ 100
public class OperatorEx6 {
    public static void main(String[] args) {
        short a = 10;
        short b = 20;
        //short c = a + b;
        //System.out.println(c);

        int d = 1_000_000_000;
        System.out.println(d);

        long e = 1_000_000 * 1_000_000;
        long f = 1_000_000 * 1_000_000L;

        System.out.println("e: " + e);
        System.out.println("f: " + f);

        double g = 10 / 3;
        System.out.println("g: " + g);

        double g2 = 10 / (double)3;
        System.out.println("g2: " + g2);
    }
}
