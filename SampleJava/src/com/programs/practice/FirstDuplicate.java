package com.programs.practice;

public class FirstDuplicate {

	public static void main(String[] args) {
        int[] arr = {1,1, 2, 3, 4, 2,5, 5};
        int duplicate = findFirstDuplicate(arr);
        System.out.println("First duplicate: " + duplicate);
    }

    public static int findFirstDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                    
                }
            }
            
        }
        return -1; // No duplicates found
    }

}
