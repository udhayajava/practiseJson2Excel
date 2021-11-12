package com.java;

public class StudentInfo {
    public int RollNum;
    public String Name;
    public int Age;
    public int Mark;

    public StudentInfo() {
    }

    public int getRollNum() {
        return RollNum;
    }

    public void setRollNum(int rollNum) {
        RollNum = rollNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "RollNum=" + RollNum +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Mark=" + Mark +
                '}';
    }
}
