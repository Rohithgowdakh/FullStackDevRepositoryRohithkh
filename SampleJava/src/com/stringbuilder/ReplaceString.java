package com.stringbuilder;

public class ReplaceString {
 static void getReplace(){
	 StringBuffer b=new StringBuffer("HASSAN IS A DISTRICT");
	 b.delete(0, 6);                            // b.replace(0, 6, "MYSORE");
	 b.insert(0,"MANDYA");
	 System.out.println(b);
 }
	public static void main(String[] args) {
		getReplace();

	}

}
