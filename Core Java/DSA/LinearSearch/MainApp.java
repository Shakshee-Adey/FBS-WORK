package L1;

public class MainApp {
    
	public static void main(String[] args) {
        int[] arr = {5, 8, 12, 15,17, 20,30,40};
        int x = 30;

        int result = linearSearch(arr, x);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

	static int linearSearch(int[] arr, int x) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;           // x found, return the index
            }
        }
        return -1;             // x not found
	}
}
