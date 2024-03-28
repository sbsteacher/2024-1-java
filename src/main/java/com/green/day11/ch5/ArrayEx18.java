package com.green.day11.ch5;
//p.217
public class ArrayEx18 {
    public static void main(String[] args) {
       int[][] score = {
                 { 100, 90, 80 }
               , { 20, 25, 35 }
               , { 30, 30, 30 }
               , { 40, 40, 40 }
               , { 80, 20, 40 }
       };

       int[] sumArr = new int[score[0].length];
       for(int i=0; i<score.length; i++) {
           for(int z=0; z<score[i].length; z++) {
               sumArr[z] += score[i][z];
           }
       }
       for(int i=0; i<sumArr.length; i++) {
           System.out.printf("%d칸의 합계값: %d, 평균값: %.2f\n"
                   , i, sumArr[i], (double)sumArr[i] / score.length);
       }


       //0칸의 합계값: ?, 평균값: ?
       //1칸의 합계값: ?, 평균값: ?
       //2칸의 합계값: ?, 평균값: ?
    }
}
