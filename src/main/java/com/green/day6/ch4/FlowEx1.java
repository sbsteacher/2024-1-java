package com.green.day6.ch4;

//p.137
public class FlowEx1 {
    public static void main(String[] args) {
       int x = 10;
       int y = 0x10; //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
       //x=3 일 때, 참인 것은?\n
       System.out.printf("x=%d 일 때, 참인 것은?\n", x);

       String name = "동구";
       char bloodType = 'O';
       System.out.printf("%s의 혈액형은 %c형입니다.\n", name, bloodType);

       //"슬랙의 혈액형은 B형입니다."
       //"가나의 혈액형은 B형입니다."
       //"가나의 혈액형은 A형입니다."

    }
}
