package d1211;

import java.util.Scanner;

public class B1211_2156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		d[1] = a[1];
		if(n > 1) {
			d[2] = a[1]+a[2];
		}
		for(int i=3; i<=n; i++) {
			d[i] = Math.max(Math.max(d[i-1], a[i]+d[i-2]), a[i]+a[i-1]+d[i-3]);
		}
		System.out.println(d[n]);
	}
}
