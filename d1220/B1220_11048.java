package d1220;

import java.util.Scanner;

public class B1220_11048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int candy[][] = new int[n+1][m+1];
		int d[][] = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				candy[i][j] = sc.nextInt();
			}
		}
		
		d[0][0] = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				//d[i][j] += Math.max(candy[i][j], Math.max(candy[i-1][j], Math.max(candy[i][j-1], candy[i-1][j-1])));
				d[i][j] += Math.max(candy[i][j]+d[i-1][j], Math.max(candy[i][j]+d[i][j-1], candy[i][j]+d[i-1][j-1]));
				//System.out.print("d = " +d[i][j] + " ");
			}
			//System.out.println();
		}
		System.out.println(d[n][m]);
	}
}
