package com.green.day18;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(3);
        game.showArr();
        game.start();
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

    void start() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.printf("숫자를 %d개 입력해 주세요. (구분은 스페이스) >>> ", NUMBER_COUNT);
            String strAnswer = scan.nextLine();// 3 7 9
            String[] answerStrArr = ?;
            int[] answerArr = ?;

        }
        //scan.close();
    }

    void showArr() {
        System.out.println(Arrays.toString(this.numArr));
    }
}




















/*
Scanner scan = new Scanner(System.in);
        while(true) {
            int striker = 0, ball = 0;
            System.out.printf("숫자를 %d개 입력해 주세요. (구분은 스페이스) >>> ", NUMBER_COUNT);
            String str = scan.nextLine();
            int[] answerArr = new int[NUMBER_COUNT];
            String[] answerStringArr = str.trim().split(" ");
            if (answerArr.length != answerStringArr.length) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            for(int i=0; i<answerArr.length; i++) {
                answerArr[i] = Integer.parseInt(answerStringArr[i]);
            }

            for(int i=0; i<answerArr.length; i++) {
                for(int z=0; z<numArr.length; z++) {
                    if(answerArr[i] == numArr[z]) {
                        if(i == z) {
                            striker++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            if(NUMBER_COUNT == striker) {
                System.out.println("정답!");
                break;
            }
            System.out.printf("S: %d, B: %d, O: %d\n", striker, ball, (NUMBER_COUNT - (striker + ball)));
        }
        scan.close();
 */