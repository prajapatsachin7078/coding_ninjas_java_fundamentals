package arrays2D;
import java.util.*;
public class waveArr {
	static Scanner sc = new Scanner(System.in);
	public static void wavePrint(int mat[][]){
		//Your code goes here
        if (mat.length==0)
            return;
        int row = mat.length;
        int col = mat[0].length;
        
        for(int i = 0;i<col;i++){
                if(i%2==0)
                    for(int j = 0;j<row;j++)
                        System.out.print(mat[j][i]+" ");
                else
                    
                    for(int j = row-1;j>=0;j--)
                        System.out.print(mat[j][i]+" ");
                    
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
		wavePrint(arr);

	}

}
