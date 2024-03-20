package com.green.day5.ch2;

//스와핑
public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("x:" + x + ", y:" + y);
        /*
            x가 가지고 있는 값과, y가 가지고 있는 값을
            서로 교환을 할 겁니다.
            조건1) 리터럴값은 사용할 수 없습니다.
            조건2) 계산 연산자 사용 금지
         */
        int tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:" + x + ", y:" + y);
        //x:20, y:10 이 출력되면 된다.
    }
}
