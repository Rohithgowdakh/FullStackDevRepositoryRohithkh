package com.programs.methods;
class Addition
{
	void add()
	{
		int sum=0;
		for (int i=1;i<=50;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum is "+sum);
	}
}

public class MathParameter {

	public static void main(String[] args) {
		Addition ob1=new Addition();
		ob1.add();
	}

}
                                          