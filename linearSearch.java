package sorting_techniques;
import java.util.Scanner;
public class linearSearch {
	static Scanner sc = new Scanner(System.in);
	
	public static int linear_Search(int[] arr , int d) {
		int i =0;
		while(i<arr.length) {
			if(arr[i] == d)
				return i;
			i++;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements : ");
		binarySearch.setArray(arr); // initializing the value of arr
		binarySearch.getArray(arr); // printing the array
		System.out.println("Enter the element to search : ");
		int value = sc.nextInt();
		int index = linear_Search(arr,value);
		System.out.print(index);

	}

}
