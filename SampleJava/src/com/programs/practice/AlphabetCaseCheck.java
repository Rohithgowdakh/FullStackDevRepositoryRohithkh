package com.programs.practice;

import java.util.Scanner;

public class AlphabetCaseCheck {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char ch=input.nextLine().charAt(0);
//		char ch=args[0].charAt(0);
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
