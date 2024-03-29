package com.green.day11.ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };
        System.out.println(names[1]);
        String tmp = names[1];
        System.out.println(tmp == names[1]);
        System.out.println("tmp: " + tmp);
        //0번방 값을 "Yu" 변경
        names[0] = "Yu";
        System.out.println(names[0]);

        System.out.println("-------------------");
        //일반 for문
        for(int i=0; i<names.length; i++) {
            String val = names[i];
            System.out.printf("val: %s\n", val);
        }
        System.out.println("-------------------");
        //향상된 for문, foreach문
        for(String val : names) {
            System.out.printf("val: %s\n", val);
        }
    }
}
