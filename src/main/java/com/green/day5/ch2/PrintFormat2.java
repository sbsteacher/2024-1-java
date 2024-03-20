package com.green.day5.ch2;

public class PrintFormat2 {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 22;
        double height = 178.2;
        char bloodType = 'A';
        boolean isSingle = true; //true > 싱글입니다. false > 싱글이 아닙니다.

        //저의 이름은 홍길동입니다. 나이는 22살, 키는 178.2cm, 혈액형은 A형, 싱글입니다.
        System.out.printf("저의 이름은 %s입니다. 나이는 %s살, 키는 %scm, 혈액형은 %s형\n"
                , name, age, height, bloodType);
    }
}
