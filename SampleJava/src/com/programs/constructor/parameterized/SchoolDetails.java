package com.programs.constructor.parameterized;

class Student {
    String studentName;
    int studentId;
    int grade;
    String major;

    Student(String sName, int sId, int sGrade, String sMajor) {
        studentName = sName;
        studentId = sId;
        grade = sGrade;
        major = sMajor;
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

    Library(String lName, int lBooks, String lLocation, String lLibrarian) {
        libraryName = lName;
        totalBooks = lBooks;
        location = lLocation;
        librarianName = lLibrarian;
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

    Sports(String sName, int sPlayers, String sCoach, String sSchedule) {
        sportName = sName;
        players = sPlayers;
        coachName = sCoach;
        practiceSchedule = sSchedule;
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

    ComputerLab(String lName, int lComputers, String lIncharge, String lLocation) {
        labName = lName;
        totalComputers = lComputers;
        labIncharge = lIncharge;
        location = lLocation;
        System.out.println("Lab Name: " + labName);
        System.out.println("Total Computers: " + totalComputers);
        System.out.println("Lab Incharge: " + labIncharge);
        System.out.println("Location: " + location);
        System.out.println();
    }
}

public class SchoolDetails {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 12345, 12, "Science");
        Library library1 = new Library("Central Library", 50000, "Main Campus", "Emma Watson");
        Sports sports1 = new Sports("Soccer", 22, "David Beckham", "Mon-Wed-Fri");
        ComputerLab computerLab1 = new ComputerLab("CompSci Lab", 40, "Dr. Alan Turing", "Building B");
    }
}
