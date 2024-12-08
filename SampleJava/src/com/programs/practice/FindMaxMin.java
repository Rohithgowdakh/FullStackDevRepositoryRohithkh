package com.programs.practice;

public class FindMaxMin {

	public static void main(String[] args) {
		int arr[]= {4,6,3,8,7,9,65,8,43,12,13,45,78,99,87};
		int max=max(arr);
		System.out.println("Maximum value :"+max);
		int min=min(arr);
		System.out.println("Minimum value :"+min);
	}
	public static int max(int[] arr)
	{
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int min(int[] arr)
	{
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
