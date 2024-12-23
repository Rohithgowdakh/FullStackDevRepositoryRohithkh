package com.programs.practice;

import java.util.ArrayList;

public class PairSum {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,3,4,2,8};
		ArrayList<int[]> res=pairSum(arr, 6);
		
			if(res.isEmpty())
			{
				System.out.println("No Pair Found");
			}
			else
			{
				for (int[] pair :res) {
					System.out.println(pair[0]+","+pair[1]);
				}
			}
		
	}
	public static ArrayList<int[]>  pairSum(int arr[],int target)
	{
		ArrayList<int[]> list = new ArrayList<int[]>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if((arr[i]+arr[j])==target)
				{
					list.add(new int[] {arr[i],arr[j]});
				}
			}
		}
		return list;
	}

}
