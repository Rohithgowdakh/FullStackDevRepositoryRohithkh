package com.stringbuilder;

public class ReverseString {
	public static void main(String[] args) {
		getReverse();
	}
	static void getReverse()
	 {
		 String b=new String("WORLD TOXIC");
		 for(int i=b.length()-1;i>=0;i--) {
			
			 System.out.print( b.charAt(i));
		 }
	        
	 }

}
