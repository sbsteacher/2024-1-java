package com.green.day3;

public class MissionMultipleForLoop {
    public static void main(String[] args) {
        //int star = 2 ~ 6사이의 랜덤값 나올 수 있도록 세팅
        int star = (int)(Math.random() * 5.0) + 2;

        System.out.println("star: " + star);
        for(int i=0; i<star; i++) {
            for(int z=0; z<star; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        만약 star = 2
        **
        **

        만약 star = 4
        ****
        ****
        ****
        ****

        만약 star = 6
        ******
        ******
        ******
        ******
        ******
        ******

         */
    }
}
