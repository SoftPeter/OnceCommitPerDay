package d0207;

import java.util.*;


public class PG0207_MiddleChar {
	public static void main(String[] args) {
		//[93,30,55]	[1,30,5]	[2,1]
		
		String s = "abcd";
		System.out.println((solution(s)));


	}

	public static String solution(String s) {
		int len = s.length();
		String answer = "";
		if(len%2 ==0) {
			char ch = s.charAt(len/2);
			answer += String.valueOf(s.charAt(len/2-1))  + String.valueOf(s.charAt(len/2));
		} else {
			answer += s.charAt(len/2);
		}
		return answer;
	}
}