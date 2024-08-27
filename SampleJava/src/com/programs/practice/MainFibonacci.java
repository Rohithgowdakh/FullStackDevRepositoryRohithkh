package com.programs.practice;
class Fionacci  //sum of two preceding ones. 
{
	int getFib(int num)
	{
		int res=0;
		int fn=0;
		int sn=1;
		for(int i=2;i<=num;i++)
		{
			res=fn+sn;
			fn=sn;
			sn=res;
		}
	
		return sn;
	}
}
public class MainFibonacci {

	public static void main(String[] args) {
		Fionacci ob1=new Fionacci();
		int val=ob1.getFib(20);
		System.out.println("the result is :"+val);
		int sum=0;
		for (int i = 0; i <20 ; i++)
		{
			sum+=ob1.getFib(i);
		}
		System.out.println("sum of fibo: "+sum);
	}

}
