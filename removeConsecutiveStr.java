package Strings;

public class removeConsecutiveStr {
	
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String temp = "";
        char word = ' ';
        if(str.length() == 0)return str;
        word = str.charAt(0);
        for(int i = 1;i<str.length();i++){
            
            if(word != str.charAt(i)){
                word = str.charAt(i-1);
                temp = temp + word;
                word = str.charAt(i);
                
            }
            
        }
        temp += word;
        return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabbbccc";
		String str1 = "aaaaaa";
		System.out.println(str);
		System.out.println(removeConsecutiveDuplicates(str));
		System.out.println(str1);
		System.out.println(removeConsecutiveDuplicates(str1));

	}

}
