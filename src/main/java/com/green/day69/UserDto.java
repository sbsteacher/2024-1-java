package com.green.day69;

public class UserDto {
    private int age;
    private String name;
    private String addr;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
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
