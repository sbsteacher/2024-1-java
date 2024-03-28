package com.green.day10.ch5;

import java.util.Arrays;

//p.197
public class ArrayEx7 {
    public static void main(String[] args) {
//       char[] cArr = {'a', 'b', 'c'};
//       System.out.println(cArr);

       int[] numArr = new int[10];
       for(int i=0; i<numArr.length; i++) {
           numArr[i] = 10 + i;
       }
       System.out.println(numArr);



       System.out.println(Arrays.toString(numArr));


       String str = new String("dddd");

    }
}
