//import java.util.Scanner;
package sorting_techniques;
import java.util.Scanner;
public class mergeTwoSortedArr {
	static Scanner sc = new Scanner(System.in);
	
	public static int[] merge(int[] arr1,int[] arr2) {
		
		int i = 0;
        int j = 0;
        int k = 0;
        int N = arr1.length + arr2.length;
        int arr[] = new int[N];
        
        while(i<arr1.length&&j<arr2.length){
            
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;  
        }
        
        if(i>arr1.length-1){
            while(j<arr2.length){
                arr[k] = arr2[j];
                k++;j++;
            }
        }else{
            while(i<arr1.length){
                arr[k] = arr1[i];
                k++;i++;
            }
        }
        return arr;
		
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
		System.out.println("Enter the size of first arr : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the size of second arr : ");
		int n2 = sc.nextInt();
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		System.out.println("Enter the elements of arr1: ");
		setArray(arr1);
		System.out.println("Enter the elements of arr1: ");
		setArray(arr2);
		int arr[] = merge(arr1,arr2);
		getArray(arr);

	}

}