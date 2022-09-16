public class arrPairSolution {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int i = 0;
        int pair = 0;
        while(i<arr.length){
            int j = i+1;
            while(j<arr.length){
                int sum = arr[i] + arr[j];
                if(sum == x){
                    pair++;
                }
                j++;
            }
            i++;
        }
        return pair;
    }
}
