public class sortBinarySol {  

    public static void sortZeroesAndOne(int[] arr) {
        
    	//Your code goes here
        int type0 = 0;
        int type1 = arr.length - 1;
 
        while (type0 < type1) {
            if (arr[type0] == 1) {
                if (arr[type1] != 1) {
                    // swap
                    arr[type1] = arr[type1] + arr[type0];
                    arr[type0] = arr[type1] - arr[type0];
                    arr[type1] = arr[type1] - arr[type0];
                }
                type1--;
            }
            else {
                type0++;
            }
        }
    }
}
