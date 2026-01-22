package BinarySearch;

public class BinarySearch {
	
	public static void main(String args[])
	{
		int[] arr = {5, 8, 12, 15,17, 20,30,40};
        int x = 60;

        int result = binarySearch(arr, x);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }	
	}
	public static int binarySearch(int[] arr,int x)
	{
		int start=0;
		int end=arr.length-1;
		
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]==x)
			{
				return mid;
			}
			else if(arr[mid]>x)
			{
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}return -1;
	}

}
