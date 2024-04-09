package com.green.day19.blackjack;

public class Dealer extends Gamer {
    private static final int CAN_RECEIVE_POINT = 16; //16이하면 카드 한장 더 가져올꺼야

    public boolean isMoreReceiveCard() {
        int totalPoint = 0;
        for(Card card : cards) {
            totalPoint += card.getPoint();
        }
        return totalPoint <= CAN_RECEIVE_POINT;
    }
}


class DealerTest {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.receiveCard(new Card("Heart", "K"));
        dealer.receiveCard(new Card("Spade", "7"));
        boolean answer = dealer.isMoreReceiveCard();
        System.out.println("answer: " + answer);
    }
}