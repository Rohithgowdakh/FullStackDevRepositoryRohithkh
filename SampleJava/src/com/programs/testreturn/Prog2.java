package com.programs.testreturn;

class LaptopName {
    static String laptopBrand() {
        String laptopName = "ThinkPad";
        return laptopName;
    }
}

public class Prog2 {
    public static void main(String[] args) {
        String res = LaptopName.laptopBrand();
        System.out.println(res);
    }
}
