package com.green.day9.ch4;

public class FlowEx29Result {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(int i=1; i<=100; i++) {
            System.out.printf("i=%d ", i);
            int copy = i;

            while(copy > 2) {
                int oneDigit = copy % 10;
                if(oneDigit % 3 == 0 && oneDigit != 0) {
                    System.out.print("짝");
                }
                copy /= 10;
            }
            System.out.println();
        }

//        do {
//            int oneDigit = copy % 10;
//            if(oneDigit % 3 == 0 && oneDigit != 0) {
//                System.out.print("짝");
//            }
//        } while((copy /= 10) > 2);


//                if(oneDigit % 3 == 0 && oneDigit != 0) {
//                    System.out.print("짝");
//                }



        //                switch(oneDigit) {
//                    case 3: case 6: case 9:
//                        System.out.print("짝");
//                }


        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("nano seconds :" +  timeElapsed);
        //1000, %, nano seconds :32458300, 30838300, 35914300
        //1000, switch, nano seconds :32778900, 65411100, 38519100
        //100000, nano seconds :7462301600
        /*
        1~100까지
        3,6,9 게임
        i=1
        i=2
        i=3 짝
        i=4
        i=5
        i=6 짝
        ...
        i=30 짝
        ...
        i=33 짝짝
        ...
        i=99 짝짝
        i=100
         */
    }
}
