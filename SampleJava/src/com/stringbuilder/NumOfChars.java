package com.stringbuilder;

public class NumOfChars {

	public static void main(String[] args) {
		getLength();
	}
	static void getLength()
	 {
		 String b=new String("KARNATAKA");
//		 int count=0;
//		 for(int i=0;i<b.length();i++) {
//			 count=count+1;
//		 }
//		 System.out.println(count);
		 char ch[]=b.toCharArray();
	      int res=ch.length;
	      System.out.println(res);
	 }
}
