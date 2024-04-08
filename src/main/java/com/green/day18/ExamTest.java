package com.green.day18;

public class ExamTest {
    public static void main(String[] args) {
        int rVal = Exam.getRandomValue(1, 101); //1~100
        int rVal2 = Exam.getRandomValue(1, 101); //1~100
        Exam.printOddEven(rVal);

        //100, 99, 98, 97
        for(int i=100; i < 104 ; i++) {
            System.out.println(200 - i);
        }

        System.out.println("------------");
        System.out.printf("rVal: %d(%c), rVal2: %d(%c)\n"
                , rVal, rVal % 2 == 0 ? '짝' : '홀'
                , rVal2, rVal2 % 2 == 0 ? '짝' : '홀');
        Exam.test(rVal, rVal2);
        //val1이 짝수면 (val2도 짝수면 val2 - val1 값을 출력, 홀수면 val1값만 출력)
        //val1이 홀수면 (val2가 짝수면 val2 - 5 값을 출력, 홀수면 val2값만 출력)

        System.out.println("--------");
        // n1~n2 숫자를 세로로 출력
        Exam.printNumToNum(2, 5); // 2~20 숫자로 세로로 출력
        System.out.println("--------");
        int score = Exam.getRandomValue(-100, 200);
        System.out.println("score: " + score);
        String grade = Exam.getGrade(62);
        System.out.println("grade: " + grade);
        System.out.println("--------");
        int sum = Exam.getSumFromTo(8, 20); //8~20까지 모두 더한 값을 리턴
        System.out.println("sum: " + sum);
    }
}

class Exam {
    static int getSumFromTo(int sNum, int eNum) {
        int sum = 0;
        for(int i=sNum; i<=eNum; i++) {
            sum += i;
        }
        return sum;
    }

    static String getGrade(int score) {
        if(score < 0 || score > 100) {
            return "점수가 잘못되었습니다.";
        }
        int tenDigit = score / 10;
        if(tenDigit < 7) {  return "F"; }
        else if(tenDigit == 10) {  return "A+"; }
        String grade = switch (tenDigit) {
            case 9 -> "A";
            case 8 -> "B";
            default -> "C";
        };
        int oneDigit = score % 10;
        String symbol = "+";
        if(oneDigit < 3) {  symbol = "-";  }
        else if(oneDigit < 7) {  symbol = "0";  }
        return grade + symbol;
    }
    static void printNumToNum(int sNum, int eNum) {
        for(int i=sNum; i<= eNum; i++) {
            System.out.println(i);
        }
    }

    static void test(int val1, int val2) {
        if(val1 % 2 == 0) {
            System.out.println(val2 % 2 == 0 ? val2 - val1 : val1);
            return;
        }
        System.out.println(val2 % 2 == 0 ? val2 - 5 : val2);
    }

    static int getRandomValue(int sNum, int eNum) {
        return (int)(Math.random() * (eNum - sNum)) + sNum;
    }

    static void printOddEven(int val) {
        System.out.printf("%d는(은) %c수입니다.\n", val, val % 2 == 0 ? '짝' : '홀');
    }


}