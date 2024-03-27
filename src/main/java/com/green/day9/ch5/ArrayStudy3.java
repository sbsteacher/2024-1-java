package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args) {
        int[] nArr1 = { 10, 20, 30 };
        int[] nArr2 = nArr1; //얕은 복사, Shallow Copy

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

        nArr2[1] = 50;
        nArr1[0] = 80;

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));
    }
}
