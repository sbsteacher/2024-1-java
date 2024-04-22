package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Tv;

public class AppleTv implements Tv {
    private Speaker speaker;

    public AppleTv(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("Apple Tv: 소리가 난다.");
        speaker.sound();
    }
}
