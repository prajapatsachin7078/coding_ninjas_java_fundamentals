package Strings;

public class reverseString {
	
	public static String reverse_String(String str) {
		int n1 = str.length()/2;
		int n2 = str.length()-1;
		char[] c = str.toCharArray();
		int i = 0;
		while(i<n1) {
			char temp = c[i];
			c[i] = c[n2];
			c[n2] = temp;
			n2--;i++;
		}
		String str1 = new String(c);
		return str1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sachin";
		str = reverse_String(str);
		System.out.print(str);

	}

}
