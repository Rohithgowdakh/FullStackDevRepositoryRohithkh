package com.programs.practice;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,4,6,9,12,1,2,8,9,21,13,15,17};
		bubbleSort(arr);
		for(int num:arr)
		{
			System.out.print(num+" ");
		}

	}
	public static void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
				}
			}
		}
	}

}