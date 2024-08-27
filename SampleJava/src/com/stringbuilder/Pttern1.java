package com.stringbuilder;

public class Pttern1 {
 static void getPattern() {
	 StringBuilder s1=new StringBuilder("PROGRAM");
	 for(int i=0;i<s1.length();i++)
	 {
		 for(int j=0;j<=i;j++) {
			 System.out.print(s1.charAt(j)+" ");
		 }
		 
		 System.out.println();
	 }
	 for(int i=s1.length()-1;i>=0;i--)
	 {
		 for(int j=0;j<i;j++) {
			 System.out.print(s1.charAt(j)+" ");
		 }
		 
		 System.out.println();
	 }
 }
	public static void main(String[] args) {
		getPattern();
	}

}
