package com.green.day4;

public class LogicalOperatorOr {
    public static void main(String[] args) {
        boolean r = false || true || false;
        System.out.println("r:" + r);
        boolean r2 = false || false || false;
        System.out.println("r2:" + r2);
    }
}
