package com.green.day5.ch2;

public class PrintFormat {
    public static void main(String[] args) {

        //%d > 정수 : byte, short, int, long
        //%s > 문자열 : String, "직접 작성한 값"
        //%f > 실수 : float, double
        //%c > 문자 : char

        //%b > 불린 : boolean


        char c = 'A';
        int finger = 10;
        //리터럴 정수는 int타입
        //long타입 리터럴로 변경하려면 끝에 l, L 붙이면 된다.
        long big = 1_000_000_000L;

        System.out.printf("c=%c, %d\n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]\n", finger);
        System.out.printf("finger=[%05d]\n", finger);
        System.out.printf("big=%d\n", big);

        //yyyy-mm-dd
        int year = 2024;
        int mon = 2;
        int day = 2;
        System.out.printf("%4d-%02d-%02d\n", year, mon, day);


        String url = "www.green.com";
        float f1 = .10f; //0.10f 와 동일
        //리터럴 실수는 double타입,
        //끝에 f or F를 붙이면 float타입의 리터럴이 됨
        double d = 1.23556789;

        System.out.printf("url=%s\n", url);
        System.out.printf("f1=%f\n", f1);
        System.out.printf("d=%f\n", d);
        System.out.printf("d=[%.2f]\n", d); //반올림 처리 됨
        System.out.printf("d=[%10.2f]\n", d); //반올림 처리 됨
        System.out.printf("d=[%010.2f]\n", d); //반올림 처리 됨

        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%-20s]\n", url);
        System.out.printf("[%.8s]\n", url);
    }
}
