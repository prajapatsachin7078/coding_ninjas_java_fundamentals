package sorting_techniques;
import java.util.Scanner;
public class bubbleSort {
	static Scanner sc = new Scanner(System.in);
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
		// TODO Auto-generated method stub
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements : ");
		setArray(arr);
		bubble_Sort(arr);
		getArray(arr);
		

	}

}
