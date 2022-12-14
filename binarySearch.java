package sorting_techniques;
import java.util.Scanner;
public class binarySearch {
	static Scanner sc = new Scanner(System.in);
	// bubble_Sort function
	public static void bubble_Sort(int[] arr) {
		 for(int round = 1; round < arr.length; round++){
	            for(int i = 0 ; i < arr.length-round; i++){
	                if(arr[i] > arr[i+1]){
	                   int temp = arr[i];
	                    arr[i] = arr[i+1];
	                    arr[i+1] = temp;
	                }
	            }
	        }
	}
	// binary_Search function
	public static int binary_Search(int[] arr, int d) {
		int s = 0;
		int e = arr.length-1;
		int mid;
		while(s<=e) {
			
			mid = (s+e)/2;
			if(arr[mid] ==  d)
				return mid;
			else if(d < arr[mid])
				e = mid-1;
			else {
				s = mid+1;
			}
			
		}
		return -1;
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
	public static void main(String[] args) {
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements : ");
		setArray(arr);
		bubble_Sort(arr);
		getArray(arr);
		System.out.println("Enter the element to search : ");
		int value = sc.nextInt();
		int index = binary_Search(arr,value);
		System.out.print(index);
//		getArray(arr);
	}

}
