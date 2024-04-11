package com.green.day19.blackjack;

public class Card {
    private final String pattern; //무늬, Spade,
    private final String denomination; // A, 2~10, J, Q, K

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public int getPoint() {
        return switch (this.denomination) {
            case "A" -> 1;
            case "10", "J", "Q", "K" -> 10;
            default -> Integer.parseInt(denomination);
        };
    }

    @Override
    public String toString(){
        return String.format("%s(%s)", this.pattern, this.denomination);
    }
}


class CardTest {
    public static void main(String[] args) {
        //2~10 점수 그대로, A > 1점, || J, Q, K >> 10점
        Card c = new Card("Spade", "K");
        //기본 생성자는 없어야 함.

        String str = "반가워 나는 " + c;
        System.out.println(str);

        String pattern = c.getPattern();
        String denomination = c.getDenomination();
        System.out.println(c); //Spade(A)

        int score = c.getPoint(); //10


        String dd = "daksljfdlksajdf";
        System.out.println(dd);

    }
}