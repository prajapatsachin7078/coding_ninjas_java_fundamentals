public class binarySearchSol { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int s = 0;
        int e = arr.length-1;
        // int mid = (s+e)/2;
        while(s<=e){
            int mid = (s+e)/2;
            
            if(x==arr[mid]){
                return mid;
            }
            else if(x<arr[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }

}
