package com.programs.practice;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {3,5,6,7,8,9,0,2,1,10};
		
		int res=searchIndex(arr,9);
		System.out.println(res);
	}
	static int searchIndex(int[] arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}

}
