package com.programs.practice;

public class DuplicateElements {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,5,4,1,7};
		duplicateElement(arr);
	}
	public static void duplicateElement(int arr[]) {
		System.out.println("Duplicate Elements :");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
