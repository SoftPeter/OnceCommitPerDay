package d1215;

import java.util.Scanner;

public class B1215_11052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[1001];
		int d[] = new int[10001];
		for(int i=1; i<=n; i++) {
			p[i] = sc.nextInt();
		}
		
		d[0] = 0;
		// d[i] = p[n] + d[i-n]
		// n = 1,2,3 ... n 개 
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				d[i] = Math.max(d[i], p[j] + d[i-j]);
			}
		}
		System.out.println(d[n]);
	}
}
