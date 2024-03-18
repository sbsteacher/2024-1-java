package com.green.day2;

public class ConditionalOperator {
    public static void main(String[] args) {
        //삼항식, 조건식
        // 식 ? true일 때 : false일 때;

        String s = "짝";
        s = "홀";

        s = 9 % 2 == 0 ? "짝" : "홀";

        System.out.println(s);

        System.out.println(9 % 2 == 0 ? "짝" : "홀");
    }
}
