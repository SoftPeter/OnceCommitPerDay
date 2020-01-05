package d0105;

import java.util.Scanner;

public class B0105_10610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num[] = new int[10];
		int tnum = 0;
		
		for(int i=0; i<str.length(); i++) {
			int c = str.charAt(i)-48;
			num[c]++;
			tnum += c;
		}
		
		StringBuilder sb = new StringBuilder();
		if(num[0] == 0 || tnum%3 != 0) {
			System.out.println(-1);
		} else {
			for(int i=9; i>=0; i--) {
				while(num[i]>0) {
					sb.append(i);
					num[i]--;
				}
			}
		}
		System.out.println(sb.toString());
	}
}
