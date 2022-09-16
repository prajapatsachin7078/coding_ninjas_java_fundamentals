package sorting_techniques;
import java.util.*;
public class secondLargest {
	static Scanner sc = new Scanner(System.in);
	 public static int secondLargestElement(int[] arr) {
	    	//Your code goes here
	        int first_largest = Integer.MIN_VALUE;
	        int n = arr.length;
	        /*
	        The first loop will find the first_largest element present in the array.
	        */
	        for (int i = 0; i < n; i++)
	        {
	            /*
	            Update the value of first_largest if the current element is larger than the first_largest value till now.
	            */
	            if (first_largest < arr[i])
	            {
	                first_largest = arr[i];
	            }
	        }

	        /*
	        Now find the largest element present in the array which is smaller than the first_largest.

	        Initially, the second element present in the array is Integer.MIN_VALUE.
	        */

	        int second_largest = Integer.MIN_VALUE;
	        for (int i = 0; i < n; i++)
	        {
	            if (arr[i] > second_largest && arr[i] < first_largest)
	            {
	                second_largest = arr[i];
	            }
	        }

	        return second_largest;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements : ");
		binarySearch.setArray(arr);
		int slargest = secondLargestElement(arr);
		System.out.print(slargest);
//		binarySearch.getArray(arr);
		
		

	}

}
