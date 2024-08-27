package com.programs.practice;
class Sum
{
	 int getSum()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			sum+=i;
			
		}
		
		return sum;
	}
}
public class MainSum1to20 {

	public static void main(String[] args) {
		Sum ob1=new Sum();
		int val=ob1.getSum();
		System.out.println(val);
	}

}
