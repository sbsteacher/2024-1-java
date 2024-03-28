package com.green.day11.ch6;

public class TvTest4 {
    public static void main(String[] args) {
        //Q1. Tv 객체의 주소값을 3개 저장할 수 있는 배열을 만들어 주세요.
        Tv[] tvArr = new Tv[3];

        //Tv tv = new Tv();

        //Q2. 각 방에 tv객체의 주소값을 넣어준다. 모두 동일하지 않다.
        for(int i=0; i<tvArr.length; i++) {
            tvArr[i] = new Tv();
        }

        for(Tv tv : tvArr) {
            System.out.println(tv);
        }

        //Q3. 0번방 Tv는 채널 11, 1번방 Tv는 채널 12, 2번방 Tv는 채널 13
        int channel = 11;
        for(int i=0; i< tvArr.length; i++) {
            Tv tv = tvArr[i];
            tv.channel = channel++;
        }
//        int channel = 11;
//        for(Tv tv : tvArr) {
//            tv.channel = channel++;
//        }

        for(Tv tv: tvArr) {
            System.out.println(tv.channel);
        }

    }
}
