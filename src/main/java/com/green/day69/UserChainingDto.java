package com.green.day69;

public class UserChainingDto {
    private int age;
    private String name;
    private String addr;

    public int getAge() {
        return age;
    }

    public UserChainingDto setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserChainingDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddr() {
        return addr;
    }

    public UserChainingDto setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    @Override
    public String toString() {
        return "UserChainingDto{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
