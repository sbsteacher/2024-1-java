package com.green.day8.ch4;

public class FlowEx16_2Result {
    public static void main(String[] args) {
        int star = 2;

        for(int z=0; z<star; z++) {
            for(int i=0; i<star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        star값이 5라면 별을 5개 가로로 5줄 출력한다. (마지막 개행)
        *****
        *****
        *****
        *****
        *****

        star값이 3이라면 별을 3개 가로로 3줄 출력한다. (마지막 개행)
        ***
        ***
        ***

         */
    }
}
