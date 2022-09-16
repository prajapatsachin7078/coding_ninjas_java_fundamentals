package sorting_techniques;
import java.util.Scanner;
public class reverseArr {
	static Scanner sc = new Scanner(System.in);
	public static void reverse(int[] arr) {
		int i = 0;
		int n1 = arr.length/2;
		int n2 = arr.length-1;
		while(i<n1) {
			int temp = arr[i];
			arr[i] = arr[n2];
			arr[n2] = temp;
			i++;n2--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements : ");
		binarySearch.setArray(arr);
		reverse(arr);
		binarySearch.getArray(arr);
		

		
	}

}
