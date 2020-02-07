package d0206;


import java.util.*;

public class PG0206_skilltest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		n = n%26;
		String result = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				ch = (char)((ch-'a'+n) % 26 + 'a');
			}
			else if (Character.isUpperCase(ch)) {
	            ch = (char) ((ch - 'A' + n) % 26 + 'A');
	        }
			result += ch;
		}
		System.out.println(result);
		//return result;
	}
}
