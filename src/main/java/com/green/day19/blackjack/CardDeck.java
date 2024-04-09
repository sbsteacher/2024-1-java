package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = { "Spade", "Heart", "Diamond", "Club" };
    public static final int CARD_COUNT = 13;
    private List<Card> cards;

    public CardDeck() {
        cards = new ArrayList();
        for(int i=0; i<PATTERNS.length; i++) {
            for(int z=1; z<=CARD_COUNT; z++) {
                String pattern = PATTERNS[i];
                String denomination = getDenomination(z);
                Card c = new Card(pattern, denomination);
                cards.add(c);
            }
        }
    }

    private String getDenomination(int num) {
        return switch (num) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(num);
        };
    }

    public void showCards() {
        for(Card c : cards) {
            System.out.println(c);
        }
    }

    public Card draw() {
        int rIdx = (int)(Math.random() * cards.size());
        return cards.remove(rIdx);
    }
}

class CardDeckTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();

        // 기본 생성자에서 PATTERNS, CARD_COUNT를 활용하여
        // 52장의 카드 객체를 생성하여 list에 추가해 주세요.

        Card c = cd.draw(); //랜덤한 카드 객체 주소값 리턴
        System.out.println("c: " + c);
        System.out.println("c: " + cd.draw());
        cd.showCards(); //모든 카드의 pattern과 denomination 출력
    }
}