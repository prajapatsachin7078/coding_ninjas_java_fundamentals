package Strings;

public class stringCompressed {
	public static String getCompressedString(String str) {
		// Write your code here.
        String temp = "";
        int count = 1;
        int i = 1;
        for(;i<str.length();i++){
            if(str.charAt(i-1) == str.charAt(i)){
                count ++;
            }
            if(str.charAt(i-1) != str.charAt(i)){
                if(count>1){
                temp = temp + str.charAt(i-1);
                    temp = temp + count;
                    count = 1;
                }
                else{
                    temp = temp + str.charAt(i-1);
                }
                if(i==str.length()-1) // for the last character when char != lastChar
                {
                    temp = temp + str.charAt(i);
                }
            }
            if((i==str.length()-1)&&(str.charAt(i-1) == str.charAt(i))){
                temp = temp + str.charAt(i-1);
                temp = temp + count; 
            }
            
        }
        
        return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabbbbcc";
		String str1 = "aaaaaa";
		System.out.println(str);
		System.out.println(getCompressedString(str));
		System.out.println(str1);
		System.out.println(getCompressedString(str1));

	}

}
