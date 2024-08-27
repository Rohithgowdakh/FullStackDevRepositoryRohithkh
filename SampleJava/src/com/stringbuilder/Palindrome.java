package com.stringbuilder;

public class Palindrome {
static String getPal(String s1) 
{
		StringBuffer s2=new StringBuffer (s1);
		s2.reverse();
		String s3=s2.toString();
		if(s1.equals(s3))	
		{
			return s1+" is palindrome";
		}
		else
		{
			return s1+" is not palindrome";
		}
}	

	public static void main(String[] args) {
		System.out.println(getPal("RACECAR")); 

	}

}
