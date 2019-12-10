package d1210;

import java.util.Scanner;

public class B1210_2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[t+1];
		int d[] = new int[t+1];
		for(int i=1; i<=t; i++) {
			a[i] = sc.nextInt();
		}
		d[1] = a[1];
		d[2] = a[1]+a[2];
		for(int i=3; i<=t; i++) {
			d[i] = Math.max(a[i]+d[i-2], a[i]+a[i-1]+d[i-3]);
		}
		System.out.println(d[t]);
	}
}
