package d1216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B1216_9465 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			long arr[][] = new long[n+1][2];
			for(int i=0; i<2; i++) {
				String str[] = br.readLine().split(" ");
				for(int j=1; j<=n; j++) {
					arr[j][i] = Integer.parseInt(str[j-1]);
				}
			}
			
			long d[][] = new long[n+1][3];
			for(int i=1; i<=n; i++) {
				d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
				d[i][1] = Math.max(d[i-1][0], d[i-1][2]) + arr[i][0];
				d[i][2] = Math.max(d[i-1][0], d[i-1][1]) + arr[i][1];
			}
			
			long ans = 0;
			ans = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
			System.out.println(ans);
		}
	}
}
