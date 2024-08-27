package com.programs.retest;
class Name
{
	String[] getName(String b1,String b2,String b3)
	{
		
		String a[]=new String[3];
		a[0]=b1;
		a[1]=b2;
		a[2]=b3;
		return a;
	}

}
public class Prog11 {

	public static void main(String[] args) {
		Name a1=new Name();
		String res[]=a1.getName("crow","pegion" , "peacock");
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

}
