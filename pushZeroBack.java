package sorting_techniques;
import java.util.Scanner;
public class pushZeroBack {
	static Scanner sc  = new Scanner(System.in);
	public static void pushBack(int[] arr) {
		  
        int i = 0;
        int j = 0;
        while(i<arr.length){
            if(arr[i] > 0){
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        while(j<arr.length){
            arr[j] = 0;
            j++;
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
		pushBack(arr);
		getArray(arr);
		
	}

}
