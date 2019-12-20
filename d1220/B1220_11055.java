package d1220;

import java.util.Scanner;

public class B1220_11055 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		int ans = 0;
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
			d[i] = a[i];
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(a[i]>a[j]) {
					d[i] = Math.max(d[i], d[j]+a[i]);
				}
			}
			ans = Math.max(ans, d[i]);
		}
		System.out.println(ans);
		
	}
}
