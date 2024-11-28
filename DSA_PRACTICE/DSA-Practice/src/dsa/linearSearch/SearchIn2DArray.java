package dsa.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][]={
                {10,20,30},
                {12,33,22,12},
                {112,22,22,33,12}
        };
       int[] ans= getVal(arr,20);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] getVal(int[][] arr ,int target)
    {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target)
                {
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
