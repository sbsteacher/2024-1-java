package com.green.day13.ch6;
//p.289 가변인자, 잘 사용하지 X
public class VarArgsEx {
    public static void main(String[] args) {
        MyMath3_1 mm = new MyMath3_1();
        mm.sum(1, 2);
        mm.sum(1, 2, 3);
        mm.sum(1, 2, 3, 4);
        mm.sum(1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4);

        int[] arr = {1, 2, 3};
        mm.sum(arr);

        mm.sum(new int[]{1, 2, 3});
    }
}

class MyMath3_1 {
    void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    void sum(int...arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum: " + sum);
    }
}
