package dsa.linearSearch;

public class ReturnIndex {
    public static void main(String[] args) {
        int arr[]={1,232,44,22,34,555,5,4,3,32,19};
        System.out.println(getIndex(arr, 19));
    }
    public static int getIndex(int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i< arr.length;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
