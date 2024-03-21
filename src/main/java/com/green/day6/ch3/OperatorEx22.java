package com.green.day6.ch3;
//p.110
public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f; //0.10000000014901161
        double d = 0.1; //0.10000000000000001
        double d2 = f;

        System.out.printf("%f == %f %b\n", 10.0, 10.0f, 10.0 == 10.0f);
        System.out.printf("%f == %f %b\n", f, d, f == d);
        System.out.printf("%f == %f %b\n", f, d, (double)f == d);
        System.out.printf("%f == %f %b\n", f, d, f == (float)d);

    }
}
