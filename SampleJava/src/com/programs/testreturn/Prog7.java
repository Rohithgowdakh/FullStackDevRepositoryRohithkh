package com.programs.testreturn;

class SecondTable 
{
	String[] gettab(int n)
	{
		String a[]=new String[10];
		for(int i=1;i<=10;i++)
		{
			a[i-1]=n+"*"+i+"="+(n*i);
		}
		return a;
	}
}
public class Prog7{
	public static void main(String[]args) {
		SecondTable o1=new SecondTable();
		String res[]=o1.gettab(2);
		for(String ans:res)
		{
			System.out.println(ans);
		}
	}
}
