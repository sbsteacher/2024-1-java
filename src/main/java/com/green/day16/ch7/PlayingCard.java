package com.green.day16.ch7;

public interface PlayingCard {
    //public static final
    int CLOVER = 1;

    //public abstract
    String getCardNumber();
}

interface DeepPlayingCard extends PlayingCard {
    String getCardKind();
}

class PlayCard implements DeepPlayingCard {

    @Override
    public String getCardNumber() { return null; }

    @Override
    public String getCardKind() { return null; }
}

class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();
        DeepPlayingCard dpc = (DeepPlayingCard)pc;
        dpc.getCardKind();
        System.out.println("----------끝----------");
    }
}