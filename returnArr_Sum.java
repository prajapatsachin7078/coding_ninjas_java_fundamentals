import java.util.Scanner;
public class returnArr_Sum {
	
	public static int sum(int[] arr) {
		//Your code goes here
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        int N = arr.length;
         int sum = 0;
            for(int j = 0; j < N; j++){
                //arr[j] = sc.nextInt();
                sum+=arr[j];
            }
        sc.close();
        return sum;
        
    }
}