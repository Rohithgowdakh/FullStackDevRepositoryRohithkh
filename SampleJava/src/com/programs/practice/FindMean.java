package com.programs.practice;

public class FindMean {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,9};
		double res=findMean(arr);
		System.out.println("Mean of given Dataset :"+res);

	}
	public static double findMean(int arr[])
	{
		double l=arr.length;
		double sum=0;
		for(int n : arr)
		{
			sum+=n;
		}
		double r= sum/l;
		System.out.println(r);
		return r;
	}

}
