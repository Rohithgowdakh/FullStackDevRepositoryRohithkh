package com.programs.testreturn;
class Bird
{
    String[] getBirdNames() 
    {
        return new String[] {"Sparrow", "Eagle", "Parrot"};
    }
}

public class Prog11 
{
    public static void main(String[] args) 
    {
        Bird provider = new Bird();
        String[] birdNames = provider.getBirdNames();
        
        for (String bird : birdNames) 
        {
            System.out.print(bird + " ");
        }
    }
}


