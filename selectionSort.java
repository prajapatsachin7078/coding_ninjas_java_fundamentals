package sorting_techniques;
import java.util.Scanner;
public class selectionSort {
	
	static Scanner sc = new Scanner(System.in);
	public static void SelectionSort(int []arr) {
		for(int i = 0;i<arr.length-1;i++) {
			int min_index = i;
			for(int j = i+1; j<arr.length;j++) {
				if(arr[j]<arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
	public static void setArray(int []arr) {
		for(int i =0 ;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static void getArray(int []arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String []args) {
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements : ");
		setArray(arr);
//		getArray(arr);
		SelectionSort(arr);
		getArray(arr);
		
		
	}

}
