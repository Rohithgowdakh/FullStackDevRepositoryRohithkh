package com.oops.test;

class Calculator {
    int value = 10;
}

class Prog4 {
    static void incrementValue(Calculator calculator) {
        calculator.value += 10;
    }

    public static void main(String[] args) {
        Calculator calculatorInstance = new Calculator();
        calculatorInstance.value = 20;

        incrementValue(calculatorInstance);
        System.out.println(calculatorInstance.value);
    }
}

