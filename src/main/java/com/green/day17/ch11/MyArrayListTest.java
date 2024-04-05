package com.green.day17.ch11;

import com.green.day14.ch6.MyArrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10); //0
        list.add(20); //1
        list.add(30); //2
        list.add(40); //3
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        System.out.println(list); // [10, 20]
        int size = list.size(); //9
        System.out.println("size: " + size);
        System.out.println(list.get(3)); //40
        System.out.println(list.get(0)); //10
    }
}

class MyArrayList {
    private int[] arr;

    //생성자를 생성할 줄 알아야 한다.
    MyArrayList() {
        arr = new int[0];
    }
    //1. arr 기존 크기보다 1칸 더 큰 새로운 배열 만들고
    //2. 그 배열 마지막 칸에 넘어온 파라미터값을 집어 넣는다.
    //3. 새로운 배열의 주소값을 전역변수 arr에 대입한다.
    void add(int val) {
        int[] tmp = new int[arr.length + 1];
        tmp[arr.length] = val;
        //tmp[tmp.length - 1] = val;
        for(int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
    }

    int size() {
        return arr.length;
    }

    int get(int index) {
        return arr[index];
    }

    @Override
    public String toString() {
        String str = "";
        str = str + "안녕";
        str = str + "하세요";

        StringBuilder sb2 = new StringBuilder();
        sb2.append("안녕");
        sb2.append("하세요");

        if(arr.length == 0) { return "[]"; }
        StringBuilder sb = new StringBuilder(    String.format("[%d", arr[0])     );
        for(int i=1; i<arr.length; i++) {
            sb.append(    String.format(", %d", arr[i])     );
        }
        sb.append("]");
        return sb.toString();
    }

    void showLength() {
        System.out.println("len : " + arr.length);
    }
}
