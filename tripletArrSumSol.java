
public class tripletArrSumSol {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int i = 0;
        int triplet = 0;
        while(i<arr.length){
            int j = i+1;
            
            while(j<arr.length){
                int k = j+1;
                
                while(k<arr.length){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum == x){
                        triplet++;
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        return triplet;
    }

}
