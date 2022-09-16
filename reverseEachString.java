package Strings;
import java.util.*;
public class reverseEachString {
	public static String reverse(String str) {
		int startWord = 0;
		int i =0;
		String temp = "";
		for(;i < str.length();i++) 
		{
			if(str.charAt(i) == ' ')
			{
				temp = str.substring(startWord,i)+temp;
				temp = ' ' + temp ;
				startWord = i+1;
			}
		}
		temp = str.substring(startWord,i)+temp;
		return temp;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab cd ef jh";
		System.out.println(str);
		str = reverse(str);
		System.out.println(str);

	}

}
