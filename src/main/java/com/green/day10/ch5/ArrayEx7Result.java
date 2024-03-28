package com.green.day10.ch5;

import java.util.Arrays;

//p.197 셔플
public class ArrayEx7Result {
    public static void main(String[] args) {
       int[] numArr = new int[10];
       for(int i=0; i<numArr.length; i++) {
           numArr[i] = 10 + i;
       }
       System.out.println(numArr);
       for(int i=0; i<numArr.length; i++) {
           int rIdx = (int)(Math.random() * numArr.length);
           int tmp = numArr[i];
           numArr[i] = numArr[rIdx];
           numArr[rIdx] = tmp;
       }
       System.out.println(Arrays.toString(numArr));

    }
}
