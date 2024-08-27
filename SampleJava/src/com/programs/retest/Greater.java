package com.programs.retest;
class Grreat
{
	int getGreat(int a, int b)
	{
	
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
		
	}
}
public class Greater {

	public static void main(String[] args) {
		Grreat o1=new Grreat();
		int res=o1.getGreat(10, 20);
		System.out.println(res+": is greater");
	}

}
