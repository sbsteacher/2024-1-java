package com.green.day17.ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int n1 = 10;
        Integer n2 = 10;
        System.out.println(n1 == n2);
        double d1 = 10.1;
        Double d2 = 10.1;

        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(0);
        //list.add("우우우");
        int r1 = list.get(0);
        int r2 = list.get(1);

        System.out.println(list);

        for(int i=0; i<list.size(); i++) {
            System.out.printf("list.get(%d) >> %d\n", i, list.get(i));
        }
    }
}
