package com.green.day18;

import java.util.Arrays;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(3);
        game.showArr();

    }
}

class NumberBaseBallGame {
    static final int MIN_NUMBER = 1;
    static final int DEFAULT_NUMBER = 3;
    static final int MAX_NUMBER = 9;
    final int NUMBER_COUNT;
    private int[] numArr;

    NumberBaseBallGame(final int NUMBER_COUNT) {
        if(NUMBER_COUNT < 1 || NUMBER_COUNT > MAX_NUMBER) {
            this.NUMBER_COUNT = DEFAULT_NUMBER;
        } else {
            this.NUMBER_COUNT = NUMBER_COUNT;
        }
        this.init();
    }

    private void init() {
        this.numArr = new int[NUMBER_COUNT];
        Main:
        for(int i=0; i<this.numArr.length; i++) {
            int rVal = getRandomValue();
            for(int z=0; z<i; z++) {
                if(this.numArr[z] == rVal) {
                    i--;
                    continue Main;
                }
            }
            this.numArr[i] = rVal;
        }

    }

    private int getRandomValue() {
        return (int)(Math.random() * MAX_NUMBER) + MIN_NUMBER;
    }

    public void showArr() {
        System.out.println(Arrays.toString(this.numArr));
    }
}
