package com.green.day13.ch6;

public class CardTest {
    /*
    shape: Heart, Diamond, Clova, Spade
    number: A, 2~10, J, Q, K
    */
    public static void main(String[] args) {
        String[] shapes = { "Heart", "Diamond", "Clova", "Spade" };
        Card[] cards = new Card[52]; //0~51
        int idx = 0;
        for(int i=0; i<shapes.length; i++) {
            for(int z=1; z<=13; z++) {
                Card c = new Card();
                c.shape = shapes[i];
                c.number = switch(z) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
                cards[idx++] = c;
            }
        }
        System.out.println("------------");
        for(Card c : cards) {
            System.out.printf("%s(%s)\n", c.shape, c.number);
        }


    }
}
