
public class intersectionArr_Sol{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int i = 0;
        while(i<arr1.length){
            int j = 0;
            while(j<arr2.length){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
                j++;
            }
            i++;
        }
    }
}