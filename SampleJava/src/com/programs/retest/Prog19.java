package com.programs.retest;
class ProgConc
{
	static String getCon()
	{
		String res="";
		char c[]= {'a','b','c','d','e'};
		for(int i=0;i<c.length;i++)
		{
			res=res+c[i];
		}
		return res;
	}
}
public class Prog19 {

	public static void main(String[] args) {
		String res=ProgConc.getCon();
		System.out.println(res);
	}

}
