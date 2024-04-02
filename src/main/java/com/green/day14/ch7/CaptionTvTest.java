package com.green.day14.ch7;
//자식이 부모보다 더 작아질 수 있나요? (없음)
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        cTv.channel = 10;
        cTv.power();
        cTv.channelUp();
        cTv.channelDown();
        cTv.channelDown();
        System.out.println("cTv.channel: " + cTv.channel);
        cTv.caption = true;
        cTv.displayCaption("dddddd");
    }
}

class Dvd {

}

class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }
}

class VideoTv extends CaptionTv {

}

class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}
