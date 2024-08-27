package com.programs.practice;
class Student2 
{
    String name;
    int age;
    String course;

    // Constructor chaining
    Student2() {
        this("Unknown", 0, "None");
    }

    public Student2(String name) {
        this(name, 0, "None");
    }

    public Student2(String name, int age) {
        this(name, age, "None");
    }

    public Student2(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class MainDemo2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("Bob");
        Student2 s3 = new Student2("Charlie", 20);
        Student2 s4 = new Student2("David", 21, "Computer Science");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
