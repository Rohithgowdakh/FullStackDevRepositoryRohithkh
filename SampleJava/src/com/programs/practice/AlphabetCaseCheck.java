package com.programs.practice;

public class AlphabetCaseCheck {

	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		if(ch>='a'&&ch<='z')
		{
			System.out.println(ch+": is lowercase letter");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+": is UpperCase letter");
			
		}
		else
		{
			System.out.println("provide a correct alphabet");
		}

	}

}
