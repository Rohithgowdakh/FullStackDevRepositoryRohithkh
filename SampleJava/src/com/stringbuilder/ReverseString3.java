package com.stringbuilder;

public class ReverseString3 {
	public static void main(String[] args) {
		getReverse();
	}
	static void getReverse()
	 {
		 StringBuffer b=new StringBuffer("WORLD TOXIC");
		 for(int i=b.length()-1;i>=0;i--) {
			 
			System.out.print(b.substring(i,i+1)); 
		 }
	        
	 }

}
