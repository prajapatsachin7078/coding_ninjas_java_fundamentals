package arrays2D;
import java.util.*;
public class spiralArray {
	static Scanner sc = new Scanner(System.in);
	public static void getSpiralArray(int [][]a) {

	if(a.length == 0)return;
    int i, k = 0, l = 0;
    int m = a.length;
    int n = a[0].length;

    /*  k - starting row index
    m - ending row index
    l - starting column index
    n - ending column index
    i - iterator
    */

    while (k < m && l < n) {
        // Print the first row from the remaining rows
        for (i = l; i < n; ++i) {
            System.out.print(a[k][i] + " ");
        }
        k++;

        // Print the last column from the remaining
        // columns
        for (i = k; i < m; ++i) {
            System.out.print(a[i][n - 1] + " ");
        }
        n--;

        // Print the last row from the remaining rows */
        if (k < m) {
            for (i = n - 1; i >= l; --i) {
                System.out.print(a[m - 1][i] + " ");
            }
            m--;
        }

        // Print the first column from the remaining
        // columns */
        if (l < n) {
            for (i = m - 1; i >= k; --i) {
                System.out.print(a[i][l] + " ");
            }
            l++;
        }
    }
}
	public static void getArray(int [][]arr){
		System.out.print("Enter the elements of " +arr.length+"*"+arr[0].length+" matrix");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		getArray(arr);
		getSpiralArray(arr);

	}

}
