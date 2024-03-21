package com.green.day5.ch2;

import java.io.PrintStream;

public class Naming {
    public static void main(String[] args) {
        /* 네이밍 규칙 */

        //<변수, 메소드 명명규칙>
        //1. 대소문자가 구분, 길이 제한 X
        int abc, Abc, aBc, abC;
        int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;

        //2. 예약어 사용금지
        //int public;
        //int void;
        int String; //String은 클래스명, 되긴하나 사용 안 하는 것이 좋다.

        //3. 숫자로 시작 X, 숫자가 시작만 아니면 어느 위치든 상관없음.
        //int 1abc;

        //4. 특수기호는 '_', '$'만 허용
        int _123, $123;

        //5. 여러 단어로 구성된 이름은 카멜 케이스 기법을 사용한다.
        //e.g. last, index, of  >>> lastIndexOf
        //     happy, sunday, morning   >>> happySundayMorning

        //6. 케밥 케이스 기법
        // happy-sunday-mornig

        //7. 스네이크 케이스 기법
        // happy_sunday_morning

        //<클래스 명명규칙>
        //1. 클래스 이름의 첫 글자는 무조건 대문자로 시작!
        //2. 여러 단어로 구성된 이름은 첫 글자를 모두 대문자로 한다. > 파스칼 케이스 기법
        //e.g. last, index, of >>> LastIndexOf
        //     string, buffer >>> StringBuffer

        //<상수 명명규칙>
        //0. 데이터 타입 앞에 final 키워드가 들어간다.
        //1. 상수 이름은 모두 대문자로 한다. 단어 구분은 '_'로 한다.
        //2. 1번 방식으로 이름을 작성하는 건 primitive type, String일 때 하는 편이다.
        //e.g. last, index, of   >>> LAST_INDEX_OF
        //     string, buffer    >>> STRING_BUFFER
        final int LAST_INDEX_OF = 10;
        final String NAME = "홍길동";

        PrintStream ps = System.out;
    }
}
