public class arrangeArr_Sol {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int f_half = n/2;
        int j = 1;
        if(n%2!=0)
        {
            for(int i = 0;i<=f_half;i++,j+=2)
            {
            arr[i] = j;
            }
            j-=2;
            for(int i = f_half+1,k = j-1; i<n ; i++,k-=2)
            {
            arr[i]=k;
            }
        }
        else{
            for(int i = 0;i<f_half;i++,j+=2)
            {
            arr[i] = j;
            }
            j=j-1;
            
            for(int i = f_half,k = j; i<n ; i++,k-=2){
            arr[i]=k;
            }
        }
    }
}