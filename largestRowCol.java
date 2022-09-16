package arrays2D;

import java.util.Scanner;

public class largestRowCol {
	static Scanner sc = new Scanner(System.in);
	public static void findLargest(int mat[][]){
		//Your code goes here
        int largest1 = Integer.MIN_VALUE;
        if(mat.length == 0){
            System.out.print("row 0" + " " + largest1);
            return;
        }
        
         int largest2 = Integer.MIN_VALUE;
        // for row sum 
        int row = 0;
        for(int i = 0;i<mat.length;i++){
            int sum = 0;
            for(int j = 0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
            if(sum>largest1){
                largest1 = sum;
                row = i;
            }
        }
        // for column sum 
        int col = 0;
         for(int j = 0;j<mat[0].length;j++){
             int sum = 0;
             for(int i = 0;i<mat.length;i++){
                sum+=mat[i][j];
            }
            if(sum>largest2){
                largest2 = sum;
                col = j;
            }
        }
        if(largest1 >= largest2){
            System.out.print("row "+ row + " " + largest1);
        }
        else{
            System.out.print("column "+ col + " " + largest2);
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
		findLargest(arr);


	}

}
