package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args) {
        int n1=10, n2=20, n3=30, n4=40, n5=50;

        System.out.println(n1);
        n1 = 11;
        System.out.println(n1);

        //boolean aaa = null;
        int[] numArr = new int[10];
        numArr = new int[11];

        int[] numArr3 = numArr;
        //numArr[10] = 10; //없는방 사용하면 예외발생
        System.out.println("numArr[10]: " + numArr[10]);
        //System.out.println("numArr[11]: " + numArr[11]);
        System.out.println("numArr[9]: " + numArr[9]);
        System.out.println("numArr[0]: " + numArr[0]);
        numArr[0] = 11;
        System.out.println("numArr[0]: " + numArr[0]);

        int[] numArr2 = { 10, 20, 30, 40, 50 };
        System.out.println("numArr2[1]: " + numArr2[1]);
        numArr2[1] = 25;
        System.out.println("numArr2[1]: " + numArr2[1]);
        int[] numArr4 = new int[] { 10, 20, 30 };

        String[] strArr = new String[5];
        System.out.println("strArr[0]: " + strArr[0]);
        System.out.println("strArr[1]: " + strArr[1]);
        //int[] numArr4 = new String[5];

        /*
        배열을 사용하는 이유? 같은 타입의 여러값을 편하게 쓰기/읽기 하기 위해서
        배열의 특징? 크기는 고정(생성 후 크기 변경 X)
                   index로 사용한다.
                   index는 0번부터 시작된다.
                   마지막 index값은 배열 크기 - 1 값이다.
                   for문이랑 궁합이 굉장하다.

         */

    }
}
