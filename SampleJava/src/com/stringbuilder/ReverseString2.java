package com.stringbuilder;

public class ReverseString2 {
	public static void main(String[] args) {
		getReverse();
	}
	static void getReverse()
	 {
		 String b=new String("WORLD TOXIC");
		 char ch[]=b.toCharArray();
		 for(int i=ch.length-1;i>=0;i--) {
			 System.out.print(ch[i]);
		 }
	        
	 }
}
