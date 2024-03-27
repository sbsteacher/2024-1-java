package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] nArr1 = { 10, 20, 30, 40 };
        int[] nArr2 = new int[nArr1.length];

        for(int i=0; i<nArr1.length; i++) {
            nArr2[i] = nArr1[i] + 5;
        }

        //nArr2[0] = 1;

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

    }
}
