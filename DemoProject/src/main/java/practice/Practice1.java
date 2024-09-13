package practice;

public class Practice1 {

	public static void main(String[] args) {
		int arr[]= {1,3,5,9,4,33,55,33,29};
		System.out.println(getMax(arr));
	}
	static int getMax(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
			{
				 max=arr[i];
			}
			
		}
		return max;
	}

}
