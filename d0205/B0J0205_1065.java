package d0205;

import java.util.*;

public class B0J0205_1065 {
	final static int MAX = 1000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		if(n < 100) {
			System.out.println(n);
			System.exit(0);
		}
		
		cnt = 99;
		for(int i=100; i<=n; i++) {
			int a = i/100;
			int b = (i/10)%10;
			int c = i%10;
			
			if(a-b == b-c) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}