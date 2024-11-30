package com.programs.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5,5,2,2,3,3,4,5,2,1,1,3,7,8,9,7,6,8,9,3,2,1,1};
		Map<Integer, Integer> res=frequencyCount(arr);
		res.forEach((k,v)->System.out.println("Element :"+k+" "+"Count :"+v));
	}

	public static Map<Integer, Integer> frequencyCount(int[] arr)
	{
		Map<Integer, Integer> frequncy=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			frequncy.put(arr[i], frequncy.getOrDefault(arr[i], 0)+1);
		}
		return frequncy;
	}
}
