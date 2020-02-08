package d0207;

import java.util.*;


public class PG0207_2016 {
	public static void main(String[] args) {
		//[93,30,55]	[1,30,5]	[2,1]
		
		int a = 5;
		int b = 24;
		System.out.println((solution(a,b)));


	}

	public static String solution(int a, int b) {
		int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] month = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int d=0;
		for(int i=0; i<a-1; i++) {
			d += day[i];
			
		}
		d += b;
		String answer = "";
		answer += month[(d+4)%7];
		return answer;
	  }
}