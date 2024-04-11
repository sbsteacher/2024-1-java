package com.green.day19.blackjack;

import java.util.List;

public class Rule {
    private final int MAX_POINT = 21;

    public void whoIsWinner(Gamer gamer, Dealer dealer) {
        int gamerPoint = getTotalPoint(gamer.openCards());
        int dealerPoint = getTotalPoint(dealer.openCards());

        System.out.println("gamer: " + gamer.openCards());
        System.out.println("dealer: " + dealer.openCards());
        if ((gamerPoint == dealerPoint) || (gamerPoint > MAX_POINT && dealerPoint > MAX_POINT)) {
            System.out.println("비겼습니다.");
        } else if(gamerPoint <= MAX_POINT && dealerPoint <= MAX_POINT) {
            if(gamerPoint > dealerPoint) {
                System.out.println("게이머 승"); return;
            }
            System.out.println("딜러 승");
        } else {
            if(gamerPoint > MAX_POINT) {
                System.out.println("딜러 승"); return;
            }
            System.out.println("게이머 승");
        }
    }

    private int getTotalPoint(List<Card> cards) {
        int sum = 0;
        for(Card c : cards) {
            sum += c.getPoint();
        }
        return sum;
    }
}
