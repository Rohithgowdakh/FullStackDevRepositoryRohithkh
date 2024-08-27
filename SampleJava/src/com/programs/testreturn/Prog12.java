package com.programs.testreturn;
class NumberProvider12
{
    int getLargestNumber(int a, int b) 
    {
       
        if(a>b)
        {
            System.out.println(a);
            return a;
        }
        else
        {
            System.out.println(b);
            return b;

        }
       
    }
}

public class Prog12 {
    public static void main(String[] args) {
        NumberProvider12 provider = new NumberProvider12();
       
        int largest = provider.getLargestNumber(10,20);
        
       
    }
}
