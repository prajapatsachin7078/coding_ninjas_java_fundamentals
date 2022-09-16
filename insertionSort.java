package sorting_techniques;
import java.util.Scanner;
public class insertionSort {
	static Scanner sc = new Scanner(System.in);
	  public static void insertion_Sort(int[] arr) {
	    	//Your code goes here
	        
	        for(int i = 1; i < arr.length; i++){
	            
	            int temp = arr[i];
	            int j = i-1;
	            while(j>=0&&arr[j]>temp){
	                arr[j+1] = arr[j];
	                j--;
	            }
	            arr[j+1] = temp;
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
		insertion_Sort(arr);
		getArray(arr);
		
		

	}

}
