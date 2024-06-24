package com.green.day27.ioc;

import com.green.day27.Tv;

public class TvTest {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
        String tvName = args[0];
        String speakerName = args[1];
        String wooferName = args[2];
        Tv tv = tvFactory.factory(tvName, speakerName, wooferName);
        tv.sound();
    }
}
