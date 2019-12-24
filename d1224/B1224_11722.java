package d1224;

import java.util.Scanner;

public class B1224_11722 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[1001];
		int d[] = new int[1001];
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=1; i<=n; i++) {
			d[i] = 1;
			for(int j=1; j<=i; j++) {
				if(d[i]<d[j]+1 && a[i]<a[j]) {
					d[i] = d[j]+1;
				}
			}
		}
		
		int ans=0;
		for(int i=1; i<=n; i++) {
			if(ans < d[i])
				ans = d[i];
		}
		System.out.println(ans);
	}
}
