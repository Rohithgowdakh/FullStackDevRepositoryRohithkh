package com.programs.practice;

public class FindVarience {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,8,7,5,4};
		double varience=getVarience(arr);
		System.out.println("varience of given dataset :"+varience);

	}
	public static double getVarience(int arr[])
	{
		double m=FindMean.findMean(arr);
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			double res=arr[i]-m;
			sum+=res*res;
		}
		return sum/arr.length;
	}
}
