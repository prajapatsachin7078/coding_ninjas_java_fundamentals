package Strings;
import java.util.*;

public class totalSubString {
	static Scanner sc = new Scanner(System.in);
	
	public static int get_SubStrings(String str) {
		int count =0;
		int len = str.length();
		int totalsubStr = len*(len+1)/2;
		for(int i = 0;i<str.length();i++) {
			for(int j = i+1;j<=str.length();j++) {
				System.out.print(str.substring(i, j)+" ");
				count++;
			}
			System.out.println("");
			
		}
		return count;
	}
	
	public static void SubStrings(String str) {
		int n = str.length();int count=0;
		for(int len = 1; len <= str.length();len++) {
			int start = 0;
			int end = len;
			while(start<=n-len||end<=n-1){
				
				System.out.print(str.substring(start, end)+" ");
				count++;
				start++;end++;
	
			}
			System.out.println("");
		}
		System.out.print("Total SubStrings : "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = sc.next();
		System.out.println(str);
		System.out.println(get_SubStrings(str));
		SubStrings(str);

	}
}
