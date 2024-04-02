package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(5); //***** (개행)
        star.singlePrint(7); //******* (개행)
        System.out.println("--------------------");
        star.squarePrint(7);
        System.out.println("--------------------");
        star.trianglePrint(10);
        //*
        //**
        //***
        //****
    }
}

class Star {
    void trianglePrint(int n) {
        for(int i=1; i<=n; i++) {
            singlePrint(i);
        }
    }

    void squarePrint(int n) {
        for(int i=0; i<n; i++) {
            singlePrint(n);
        }
    }
    void singlePrint(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
