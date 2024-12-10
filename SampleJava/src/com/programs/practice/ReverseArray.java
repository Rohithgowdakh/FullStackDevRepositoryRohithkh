package com.programs.practice;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,22,33,44};
		reverseArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

	}
	public static void reverseArray(int[] arr)
	{
		int s=0;
		int e=arr.length-1;
		while(s<e) {
			int temp =arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
		}
	}

}
