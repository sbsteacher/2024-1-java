package com.green.day19.blackjack;

import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD_COUNT = 2; //게임 최초 받는 카드 수

    public void play() {
        System.out.println("========= BlackJack ========");
        CardDeck cardDeck = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();

        initPhase(cardDeck, gamer, dealer);
        playingPhase(cardDeck, gamer, dealer);

        rule.whoIsWinner(gamer, dealer);
    }
    private void playingPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println(gamer.openCards());
            System.out.print("카드를 뽑겠습니까? 종료를 원하면 0을 입력하세요 >> ");
            String answer = scan.nextLine();
            if("0".equals(answer)) { break; }
            gamer.receiveCard(cardDeck.draw());
        }
        //게이머가 0을 입력할 때까지 카드를 뽑는다. (게이머가 카드 객체 주소값 추가로 저장)
        scan.close();
    }


    private void initPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");

        for(int i=0; i<INIT_RECEIVE_CARD_COUNT; i++) {
            Card c = cardDeck.draw();
            gamer.receiveCard(c);

            dealer.receiveCard(cardDeck.draw());
        }
        //딜러가 16초과가 될 때까지 카드를 받자.
        while(dealer.isMoreReceiveCard()) {
            dealer.receiveCard(cardDeck.draw());
        }
    }
}
