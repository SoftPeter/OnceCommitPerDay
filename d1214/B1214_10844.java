package d1214;

import java.util.Scanner;

public class B1214_10844 {
	final static int DIV = 1000000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d[][] = new long[n+1][11];
		
		for(int i=1; i<=9; i++) {
			d[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				if(j==0)
					d[i][j] = d[i-1][j+1] % DIV;
				else if(j==9)
					d[i][j] = d[i-1][j-1] % DIV;
				else
					d[i][j] = (d[i-1][j-1] + d[i-1][j+1]) % DIV;
			}
		}
		
		long sum=0;
		for(int i=0; i<=9; i++) {
			sum += d[n][i];
		}
		System.out.println(sum%DIV);
	}
}
