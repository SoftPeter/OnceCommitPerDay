package d1224;

import java.util.Scanner;

public class B1224_11054 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[1001];
		int d1[] = new int[1001];
		int d2[] = new int[1001];
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=1; i<=n; i++) {
			d1[i] = 1;
			for(int j=1; j<=n; j++) {
				if(a[i]>a[j] && d1[i]<d1[j]+1)
					d1[i] = d1[j]+1;
			}
		}
		
		for(int i=n; i>=1; i--) {
			d2[i] = 1;
			for(int j=n; j>=1; j--) {
				if(a[i]>a[j] && d2[i]<d2[j]+1)
					d2[i] = d2[j]+1;
			}
		}
		
		int ans = d1[1]+d2[1]-1;
		for(int i=1; i<=n; i++) {
			if(ans < d1[i]+d2[i]-1)
				ans = d1[i]+d2[i]-1;
		}
		System.out.println(ans);
		
	}
}