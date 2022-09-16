package Strings;

public class reverseEachWordOfString {
	
	public static String reverseEachWord(String str) 
	{
		int startWord = 0;
		int i =0;
		String temp = "";
		for(;i < str.length();i++) 
		{
			
			if(str.charAt(i) == ' ')
			{
				
				for(int j = i-1;j>=startWord;j--) 
				{
					
					temp = temp + str.charAt(j);
					
				}
				temp = temp + ' ';
				startWord = i+1;
			}
			
		}
		for(int j = i-1;j>=startWord;j--) 
		{
			
			temp = temp + str.charAt(j);
			
		}
		startWord = i+1;
		return temp;
	}
	public static String reverse(String str) { // optimized code
		if(str.length()==0)return str;
        int startWord = 0;
		int i =0;
		String temp = "";
        String word = "";
		for(;i < str.length();i++) 
		{
			if(str.charAt(i) != ' '){
                word = str.charAt(i) + word;
            }
            if(str.charAt(i) == ' '|| i == str.length()-1){
                
               temp = temp + word + ' '; 
                word = "";
            }
        }
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sachin prajapati ji";
		System.out.println(str);
		str = reverseEachWord(str);
		System.out.println(str);
		str = reverse(str);
		System.out.println(str);
		
	}

}
