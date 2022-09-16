public class unique_val_sol{  

    public static int findUnique(int[] arr){
		//Your code goes here
        int i = 0;
        int unique = arr[0];
        while(i<arr.length){
            int j = 0;
            while(j<arr.length){
                if(i==j){
                    j++;
                    continue;
                }
                if(unique==arr[j]){
                    unique = arr[i+1];
                    break;
                }
                j++;
                
            }
            if(j==arr.length){
                break;
            }
            
            i++;
        }
        return unique;
    }
}
