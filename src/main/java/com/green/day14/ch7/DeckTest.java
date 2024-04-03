package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
       Deck deck = new Deck();
       //deck.printAllCard();
       Card c = deck.pick();
       System.out.println(c);

       Card c2 = deck.pick(5);
       System.out.println(c2);

       deck.shuffle();
       deck.printAllCard();
    }
}

class Deck {

    void shuffle() {
        for(int i=0; i<cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }
    }

    Card pick(int idx) {
        Card c = cards[idx];
        return c;
    }

    Card pick() {
        int rIdx = (int)(Math.random() * cards.length);  // 0 ~ 51 랜덤값 뽑는다.
        Card c = cards[rIdx];
        return c;
    }

    static final String[] kinds = { "Spade", "Heart", "Diamond", "Clova" };
    final int CARD_NUM;
    Card[] cards;
    Deck() {
        CARD_NUM = 52;
        cards = new Card[CARD_NUM];
        int idx = 0;
        for(int i=0; i<kinds.length; i++) {
            for(int z=1; z<=13; z++) {
                String kind = kinds[i];
                String number = switch(z) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
                cards[idx++] = new Card(kind, number);
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

    Card(String kind, String number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }
}