package com.programs.testreturn;

class LogicalOperator {
    boolean logicalAnd(int a, int b) {
        return a >= 10 && b < 50;
    }
}

public class Prog6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        LogicalOperator obj = new LogicalOperator();
        boolean res = obj.logicalAnd(a, b);
        System.out.println(res);
    }
}
