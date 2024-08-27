package com.programs.methodsreturns;
class Concate
{
	String getConcate(String a[])
	{
		
		String result="";
		
		for(int i=0;i<a.length;i++)
		{
			result+=a[i];
		}
		return result;
	}
}

public class MainConcate {

	public static void main(String[] args) {
		String a[]= {"ab","cd","ef","gh","ij","kl"};
		Concate ob1=new Concate();
		String res=ob1.getConcate(a);
		System.out.println(res);
	}

}
