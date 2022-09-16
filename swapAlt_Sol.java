// import java.util.Scanner;
public class swapAlt_Sol {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int temp;
        int i = 0;
        if(arr.length%2 == 0){
            while(i<arr.length){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i+=2;
            }
        }
        else{
            
            while(i<arr.length-1){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i+=2;
            }
            
        }
        
    }
}
