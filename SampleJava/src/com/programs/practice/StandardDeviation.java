package com.programs.practice;

public class StandardDeviation {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,6,4,3,3,4,4,45};
		double result=findSD(arr);
		System.out.println("Standard Deviation :"+result);
	}
	public static double findSD(int arr[])
	{
		double varience=FindVarience.getVarience(arr);
		double SD=Math.sqrt(varience);
		return SD;
	}
}
