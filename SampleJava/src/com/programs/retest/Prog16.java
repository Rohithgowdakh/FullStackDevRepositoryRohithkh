package com.programs.retest;
class Array4
{
	static String getConcate(String a[])
	{
		String res="";
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		return res;
	}
}
public class Prog16 {

	public static void main(String[] args) {
		String a[]= {"abc","def","ghi","jkl"};
		String res=Array4.getConcate(a);
		System.out.println(res);
	}

}
