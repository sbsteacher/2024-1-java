package com.green.day16.ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10, 11, 12);
//        System.out.printf("hour: %d\n", time.getHour());
//        time.setHour(22);
//        System.out.printf("hour: %d\n", time.getHour());
    }
}

class Time { //캡슐화, 은닉화
    private int hour;
    private int minute;
    private int second;

    Time(final int hour, final int minute, final int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

}