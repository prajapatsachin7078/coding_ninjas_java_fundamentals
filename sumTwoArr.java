package sorting_techniques;
import java.util.Scanner;
//import java.math.*;
public class sumTwoArr {
	static Scanner sc = new Scanner(System.in);
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        
        int carry = 0;
        int num;
        int i = arr1.length-1;
        int j = arr2.length-1;

        int k = output.length-1;
        while(k>=0){

            if(i>=0&&j>=0){
                num = arr1[i]+arr2[j]+carry;
                i--;j--;
            }
            else if(i>=0){
                num = arr1[i]+carry;
                i--;
            }
            else if(j>=0){
                num = arr1[i]+arr2[j]+carry;
                j--;
            }
            else{
                num = carry;
            }
                output[k] = num%10;
                carry = num/10;
             k--;
            
        }
        
    }
	public static int[] setArr() {
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for(int i = 0;i<n;i++)
			arr[i] = sc.nextInt();
		return arr;
	}
	
	public static void main(String[] args) {
		
		int []arr1 = setArr();
		int []arr2 = setArr();
		int []output = new int[1+Math.max(arr1.length, arr2.length)];
		sumOfTwoArrays(arr1,arr2,output);
		binarySearch.getArray(output);
		
		
	}

}
