package com.programs.testreturn;

class AreaOfCircle {
    static int radius = 10;

    static double area() {
        int radiusSquare = radius * radius;
        double pi = 3.14;
        double area = pi * radiusSquare;
        return area;
    }
}

public class Prog4 {
    public static void main(String[] args) {
        double res = AreaOfCircle.area();
        System.out.println(res);
    }
}
