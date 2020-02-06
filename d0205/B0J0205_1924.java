package d0205;

import java.util.*;

public class B0J0205_1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일
		String day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;
		for(int i=0; i<x-1; i++) {
			sum += month[i];
		}
		sum += y;
		System.out.println(day[sum%7]);
		
	}
}