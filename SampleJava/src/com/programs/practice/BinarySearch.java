package com.programs.practice;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,12,14,15};
		int res=binarySearch(arr,12);
		System.out.println(res);
	}
	public static int binarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length;	
		while(start<end) {
			int mid=start+(end-start)/2;
			if(target==arr[mid]) {
				return mid;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}else if(target<arr[mid]) {
				end=mid-1;
			}
		}
		return -1;
	}
	

}
