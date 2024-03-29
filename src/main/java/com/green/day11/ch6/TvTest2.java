package com.green.day11.ch6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.channel = 10;

        Tv tv2 = tv;
        tv2 = new Tv();
        System.out.println(tv2.channel); //0

        tv2 = tv;
        System.out.println(tv2.channel); //10

    }
}
