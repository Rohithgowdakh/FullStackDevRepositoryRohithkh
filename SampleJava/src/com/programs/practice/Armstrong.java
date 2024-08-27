package com.programs.practice;
class isArmstrong
{
	static void getArm(int num )
	{
		int d=num;
		int a=0;
		
		while(num>0)
		{
			int em=num%10;
			num=num/10;
			a=a+(em*em*em);
		
		}
	
		if(a==d)
		{
			System.out.println(a+"is arm");
		}
		else
		{
			System.out.println(a+"is no arm");
		}
	}
}
public class Armstrong {

	public static void main(String[] args) {
		isArmstrong.getArm(153);
	}

}
