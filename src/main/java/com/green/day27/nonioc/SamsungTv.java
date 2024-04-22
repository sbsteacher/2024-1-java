package com.green.day27.nonioc;

import com.green.day27.Speaker;
import com.green.day27.Tv;

public class SamsungTv implements Tv {

    private Speaker speaker;

    public SamsungTv() {
        //this.speaker = new HarmanSpeaker();
        this.speaker = new JblSpekaer();
    }

    @Override
    public void sound() {
        System.out.println("SamsungTv: 소리가 난다.");
        speaker.sound();
    }
}
