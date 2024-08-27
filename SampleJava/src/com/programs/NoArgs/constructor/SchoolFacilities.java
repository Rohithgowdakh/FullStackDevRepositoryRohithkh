package com.programs.NoArgs.constructor;

class Student {
    String studentName;
    int studentId;
    int grade;
    String major;

    Student() {
        studentName = "John Doe";
        studentId = 12345;
        grade = 12;
        major = "Science";
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
        System.out.println("Major: " + major);
        System.out.println();
    }
}

class Library {
    String libraryName;
    int totalBooks;
    String location;
    String librarianName;

    Library() {
        libraryName = "Central Library";
        totalBooks = 50000;
        location = "Main Campus";
        librarianName = "Emma Watson";
        System.out.println("Library Name: " + libraryName);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Location: " + location);
        System.out.println("Librarian Name: " + librarianName);
        System.out.println();
    }
}

class Sports {
    String sportName;
    int players;
    String coachName;
    String practiceSchedule;

    Sports() {
        sportName = "Soccer";
        players = 22;
        coachName = "David Beckham";
        practiceSchedule = "Mon-Wed-Fri";
        System.out.println("Sport Name: " + sportName);
        System.out.println("Players: " + players);
        System.out.println("Coach Name: " + coachName);
        System.out.println("Practice Schedule: " + practiceSchedule);
        System.out.println();
    }
}

class ComputerLab {
    String labName;
    int totalComputers;
    String labIncharge;
    String location;

    ComputerLab() {
        labName = "CompSci Lab";
        totalComputers = 40;
        labIncharge = "Dr. Alan Turing";
        location = "Building B";
        System.out.println("Lab Name: " + labName);
        System.out.println("Total Computers: " + totalComputers);
        System.out.println("Lab Incharge: " + labIncharge);
        System.out.println("Location: " + location);
        System.out.println();
    }
}

public class SchoolFacilities {
    public static void main(String[] args) {
        Student student = new Student();
        Library library = new Library();
        Sports sports = new Sports();
        ComputerLab computerLab = new ComputerLab();
    }
}
