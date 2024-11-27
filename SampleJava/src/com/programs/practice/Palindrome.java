package com.programs.practice;


public class Palindrome {
	static boolean checkPalindrome(String str)
	{
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res+=str.charAt(i);
		}
		if(str.equals(res)) 
			return true;
		else
		    return false;
			
	}
	public static void main(String[] args) {
		boolean res=checkPalindrome("racecar");
		System.out.println(res);
	}
}
