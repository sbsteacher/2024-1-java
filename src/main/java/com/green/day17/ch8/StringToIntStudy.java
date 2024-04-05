package com.green.day17.ch8;

public class StringToIntStudy {
    public static void main(String[] args) {
        int result = Utils.convertStringToInt("33a3");
        System.out.println("result: " + result);
    }
}

class Utils {
    static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }
}
