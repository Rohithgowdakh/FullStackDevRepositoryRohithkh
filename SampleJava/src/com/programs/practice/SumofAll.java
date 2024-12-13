package com.programs.practice;

public class SumofAll {

	public static void main(String[] args) {
		int arr[]= {1,3,5,5,6,7,8,3,2,4};
		int result=sum(arr);
		System.out.println("Sum of all Elements is :"+result);
	}
	public static int sum(int arr[])
	{
		int sum=0;
		for(int s:arr)
		{
			sum+=s;
		}
		return sum;
	}
}
