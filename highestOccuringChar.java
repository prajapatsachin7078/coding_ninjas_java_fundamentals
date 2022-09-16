package Strings;

public class highestOccuringChar {
	public static char highestOccuringCharacter(String str) {
		//Your code goes here
        if(str.length() == 1) return str.charAt(0);
        int arr[] = new int[256];
        int temp;
        int word = 0;
        String tempWord = "";
        word += str.charAt(0);
        for(int i = 0;i<str.length();i++){
            temp = str.charAt(i);
            word = 0;
            for(int j = 97;j<=122;j++){
                
                if(temp == j){
                    arr[j]++;
                    word ++;
                }
            }
            tempWord += str.charAt(i);
//            word = "";
        }
        int maxAt = 0;

        for (int i = 0; i < arr.length; i++) {
        maxAt = arr[i] > arr[maxAt] ? i : maxAt;
         }        
        System.out.println(tempWord);
        return (char)maxAt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbbcc";
		String str1 = "aaaaaa";
		System.out.println(str);
		System.out.println(highestOccuringCharacter(str));
		System.out.println(str1);
		System.out.println(highestOccuringCharacter(str1));

	}

}
