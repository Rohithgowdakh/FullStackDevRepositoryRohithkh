package com.practice.returnmethods;
class Sum{
	int sum=0;
	int getSum(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}
public class MainSum {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		Sum o1=new Sum();
		int res=o1.getSum(a);
		System.out.println(res);
	}

}
