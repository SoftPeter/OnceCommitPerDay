package d1218;

import java.util.Scanner;

public class B1218_11057 {
	final static int DIV = 10007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[][] = new int[n+1][10];
		
		for(int i=0; i<=9; i++) {
			d[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=j; k++) {
					d[i][j] += d[i-1][k];
					d[i][j] %= DIV;
				}
			}
		}
		
		int ans=0;
		for(int i=0; i<=9; i++) {
			ans += d[n][i];
			ans %= DIV;
		}
		System.out.println(ans);
	}
}
