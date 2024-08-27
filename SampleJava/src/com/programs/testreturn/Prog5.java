package com.programs.testreturn;

class Voting {
    static String eligibleVoting() {
        int age = 20;
        if (age >= 18)
            return "The Person is Eligible for voting";
        else
            return "The Person is not Eligible for voting";
    }
}

public class Prog5 {
    public static void main(String[] args) {
        String res = Voting.eligibleVoting();
        System.out.println(res);
    }
}

