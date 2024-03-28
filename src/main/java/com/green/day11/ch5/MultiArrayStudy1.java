package com.green.day11.ch5;
//p.214 다차원 배열
public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = new int[3][5];

        score[0][0] = 5;
        score[1][1] = 10;
        score[1][3] = 50;

        System.out.println("score.length: " + score.length);
        System.out.println("score[0].length: " + score[0].length);
        int[] temp = score[0];

        for(int i=0; i<score.length; i++) {
            for(int z=0; z<score[i].length; z++) {
                System.out.printf("%d\t", score[i][z]);
            }
            System.out.println();
        }
    }
}
