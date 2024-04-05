package com.green.day16.ch7;

public interface PlayingCard {
    //public static final
    int CLOVER = 1;
    //public abstract
    String getCardNumber();
}

class PlayCardSecond implements PlayingCard {
    public String getCardNumber() { return null; }
}

interface DeepPlayingCard extends PlayingCard {
    String getCardKind();
}

class PlayCard implements DeepPlayingCard {
    public String getCardNumber() { return null; }
    public String getCardKind() { return null; }
}

class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();
        //pc.getCardKind();

        //DeepPlayingCard dpc2 = new PlayCardSecond();
        //PlayCard pc2 =new PlayCardSecond();
        //? ddd = new PlayCardSecond();
        //PlayingCard, PlayCardSecond, Object

        DeepPlayingCard dpc = (DeepPlayingCard)pc;
        dpc.getCardKind();
        dpc.getCardNumber();
        System.out.println("----------끝----------");
    }
}