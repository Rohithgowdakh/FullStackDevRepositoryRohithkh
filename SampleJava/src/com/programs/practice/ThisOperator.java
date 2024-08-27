package com.programs.practice;

class Student {
    String studentName;
    int studentId;
    int grade;
    String major;

    Student(String sName, int sId, int sGrade, String sMajor)
    {
        this.studentName = sName;
        this.studentId = sId;
        this.grade = sGrade;
        this.major = sMajor;
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
        System.out.println("Major: " + major);
        System.out.println();
    }
   void display()
    {
    	System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
        System.out.println("Major: " + major);
        System.out.println();
    }
}


public class ThisOperator {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 12345, 12, "Science");
        Student student2 = new Student("djbdbDoe", 888345, 882, "mathsce");   
        student1.display();
        student2.display();
        
    }
}
