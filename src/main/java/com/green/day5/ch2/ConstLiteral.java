package com.green.day5.ch2;
//상수와 리터럴
public class ConstLiteral {
    public static void main(String[] args) {
        /*
        리터럴: 값 그 자체. 현실 세계에서 얘기하는 상수와 같음.
        상수: 한번 입력된 값이 수정이 안 되는 공간 > 상수
         */

        //MAX_SPEED가 상수
        //240이 리터럴
        final int MAX_SPEED = 240;
        final int MAX_VALUE;
        MAX_VALUE = 10;
        //MAX_VALUE = 12;
        //MAX_SPEED = 250; //변경이 불가능하다. 컴파일 에러 발생.
    }
}
