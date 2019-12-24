package d1224;

import java.util.Scanner;

public class B1224_1890 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int map[][] = new int[101][101];
		long d[][] = new long[101][101];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		d[1][1] = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==n && j==n)
					continue;
				int next = map[i][j];
				if(i+next <= n)
					d[i+next][j] += d[i][j];
				if(j+next <= n)
					d[i][j+next] += d[i][j];
			}
		}
		System.out.println(d[n][n]);
		
	}
}