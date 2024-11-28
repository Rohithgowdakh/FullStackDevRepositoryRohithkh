package dsa.linearSearch;
public class MaxMIn {
    public static void main(String[] args) {
        int arr[]={10,10,20,22,90,837,99};
        System.out.println(getMax(arr));

    }
    public static int getMax(int[] arr)
    {
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}