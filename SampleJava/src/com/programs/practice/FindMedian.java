package com.programs.practice;

public class FindMedian {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,6,5,4,3,45,5,33,7,99,98};
		double result=median(arr);
		System.out.println(result);

	}
	public static double median(int arr[])
	{
		int s=arr.length;
		int mid=s/2;
		if(s%2==1)
		{
			return arr[mid];
		}
		else 
		{
			return (arr[mid-1]+arr[mid])/2.0;
		}
	}

}
