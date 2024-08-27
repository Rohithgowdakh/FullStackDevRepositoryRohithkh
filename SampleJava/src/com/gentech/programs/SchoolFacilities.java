package com.gentech.programs;

class Student 
{
    String studentName;
    int studentId;
}

class Library
{
    String libraryName;
    int numberOfBooks;
}

class Sports 
{
    String sportName;
    int numberOfPlayers;
}

class ComputerLab 
{
    String labName;
    int numberOfComputers;
}

public class SchoolFacilities {
    public static void main(String[] args) {
       
        Student student1 = new Student();
        student1.studentName = "Alice";
        student1.studentId = 1001;
        System.out.println("Student Name: " + student1.studentName);
        System.out.println("Student ID: " + student1.studentId);
        System.out.println("++++++++++++++");      
        Library library = new Library();
        library.libraryName = "Central Library";
        library.numberOfBooks = 5000;
        System.out.println("Library Name: " + library.libraryName);
        System.out.println("Number of Books: " + library.numberOfBooks);
        System.out.println("++++++++++++++");
        Sports sports = new Sports();
        sports.sportName = "Basketball";
        sports.numberOfPlayers = 10;
        System.out.println("Sport Name: " + sports.sportName);
        System.out.println("Number of Players: " + sports.numberOfPlayers);
        System.out.println("++++++++++++++");
        ComputerLab computerLab = new ComputerLab();
        computerLab.labName = "Main Computer Lab";
        computerLab.numberOfComputers = 30;
        System.out.println("Lab Name: " + computerLab.labName);
        System.out.println("Number of Computers: " + computerLab.numberOfComputers);
    }
}


