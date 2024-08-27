package com.programs.testreturn;

class NumberProvider {
    void printOddNumbers() {
        for (int i = 21; i >= 11; i = i - 2) {
            System.out.print(i + " ");
        }
    }
}

public class prog9 {
    public static void main(String[] args) {
        NumberProvider provider = new NumberProvider();
        System.out.print("The odd numbers from 21 to 11 are: ");
        provider.printOddNumbers();
    }
}
