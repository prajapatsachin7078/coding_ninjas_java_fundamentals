package sorting_techniques;
import java.util.Scanner;
public class rotateArr {
	static Scanner sc  = new Scanner(System.in);
	public static void rotate_arr(int[] arr, int d) { // first technique;
    	//Your code goes here
        
        int temp_arr[] = new int[d];
        int i = 0;
        while(i<temp_arr.length){
            temp_arr[i] = arr[i];
            i++;
        }
        int j  = 0;
        while(j<arr.length-d){
            arr[j] = arr[j+d];
            j++;
        }
        i =0;
        while(j<arr.length){
            arr[j] = temp_arr[i];
            j++;i++;
        }
    }

	public static void rotate01(int[] arr, int d) {
		
		reverseArr.reverse(arr);
		int i = 0;
		int n1 = (arr.length-d)/2;
		int n2 = arr.length-d-1;
		while(i<n1) {
			int temp = arr[i];
			arr[i] = arr[n2];
			arr[n2] = temp;
			i++;n2--;
		}
		int n3 = arr.length-1;
		while(i<arr.length) {
			int temp = arr[i];
			arr[i] = arr[n3];
			arr[n3]  = temp;
			i++;
			n3--;
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
		System.out.println("Enter the index to rotate : ");
		int d = sc.nextInt();
//		rotate_arr(arr,d);
		rotate01(arr,d);
		getArray(arr);
	}

}
