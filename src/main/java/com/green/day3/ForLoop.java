package com.green.day3;

//for, while, do-while
public class ForLoop {
    public static void main(String[] args) {
        //        0      1        3         2
        //for( 초기화 ; 조건식 ; 증감식 ) { 반복코드 }

        for(int i=0; i<5; i++) {
            System.out.println("안녕");
        }

        // 0 > 1 > 2 > 3
        //     1 > 2 > 3
        //     1 > 2 > 3


//        "Hello" 6번 출력
//        for(int i=5; i<?; i++) {
//            System.out.println("Hello");
//        }

        for(int i=5; i<11; i++) {
            System.out.println("Hello");
        }

//        "1.Hello" 6번 출력 with 인덱스값, 1부터 시작
//        for(int i=5; i<11; i++) {
//            System.out.println("n.Hello");
//        }

        // for문 ()괄호 내용 수정 없이 인덱스값, 1부터 시작
        for(int i=5; i<11; i++) {
            System.out.println((i - 4) + ".Hello");
        }

        //100, 99, 98, 97
        for(int i=100; i > 96 ; i--) { //4번 반복
            System.out.println("Bye");
        }
    }
}
