package com.programs.testreturn;

class OneDimensionalArray {
    static boolean[] arrayElements() {
        boolean[] arr = {true, false, true, true, false, false};
        return arr;
    }
}

public class Prog1 {
    public static void main(String[] args) {
        boolean[] res = OneDimensionalArray.arrayElements();
        for (boolean element : res) {
            if (element) {
                System.out.println(element);
            }
        }
    }
}
