package com.net.unit;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int age;

    public Student(int age){
        this.age=age;
       // this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private static int middleAge(List<Student> list){
        int middleAge=0;
        for (Student obj : list) {
            middleAge = middleAge + obj.age;
        }
        middleAge=middleAge/list.size();
        return middleAge;
    }
    public static void main(String[] args) {
        Student stud1 = new Student(12);
        Student stud2 = new Student(15);
        Student stud3 = new Student(16);
        Student stud4 = new Student(22);
        ArrayList<Student> group1=new ArrayList();
        group1.add(stud1);
        group1.add(stud2);
        group1.add(stud3);
        group1.add(stud4);
System.out.println(middleAge(group1));    }
}
