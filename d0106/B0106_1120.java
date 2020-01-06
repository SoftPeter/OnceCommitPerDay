package d0106;

import java.util.Scanner;

public class B0106_1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int ans = 987654321;
		for(int i=0; i<=b.length()-a.length(); i++) {
			int cnt = 0;
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(j) != b.charAt(j+i))
					cnt++;
			}
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
	}
}
