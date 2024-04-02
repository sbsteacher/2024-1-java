package com.green.day14.ch6;

import java.util.Arrays;

class MyArrays {
    static void printArr(int[] arr) {
        if(arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d", arr[0]);
        for(int i=1; i<arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }
            //리턴타입, 메소드명, 파라미터
    static String toString(int[] arr) {
        if(arr.length == 0) { return "[]"; }
        //String str = "[" + arr[0];
        String str = String.format("[%d", arr[0]);
        for(int i=1; i<arr.length; i++) {
            str += String.format(", %d", arr[i]);
        }
        str += "]";
        return str;
    }
}

class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4, 10 };
        MyArrays.printArr(arr); // [3, 2, 1, 6, 5, 4, 10]

        String str = Arrays.toString(arr);
        System.out.println("str: " + str);

        String str2 = MyArrays.toString(arr);
        System.out.println("str2: " + str2);
    }
}
