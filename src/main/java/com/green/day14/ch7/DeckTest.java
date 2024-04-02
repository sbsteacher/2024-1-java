package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
       Deck deck = new Deck();
       deck.printAllCard();
    }
}

class Deck {
    static final String[] kinds = { "Spade", "Heart", "Diamond", "Clova" };
    final int CARD_NUM;
    Card[] cards;

    Deck() {
        CARD_NUM = 52;
        cards = new Card[CARD_NUM];
        int idx = 0;
        for(int i=0; i<kinds.length; i++) {
            for(int z=1; z<=13; z++) {
                Card c = new Card();
                this.cards[idx++] = c;
                c.kind = kinds[i];
                c.number = switch(z) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
            }
        }

    }

    void printAllCard() {
        for(Card c : cards) {
            System.out.println(c);
        }
    }

}

class Card {
    String kind; //무늬
    String number; //번호(A, 2~10, J, Q, K)

    @Override
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }
}