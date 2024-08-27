package com.programs.testreturn;

class Rectangle {
    static int length = 10;
    static int breadth = 20;

    static int area() {
        return length * breadth;
    }
}

public class Prog3 {
    public static void main(String[] args) {
        int res = Rectangle.area();
        System.out.println(res);
    }
}
