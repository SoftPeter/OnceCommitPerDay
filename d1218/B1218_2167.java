package d1218;

import java.util.Scanner;

public class B1218_2167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[301][301];
		for(int q=1; q<=n; q++) {
			for(int w=1; w<=m; w++) {
				a[q][w] = sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		
		while(k-- > 0) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int ans=0;
			for(int q=i; q<=x; q++) {
				for(int w=j; w<=y; w++) {
					ans += a[q][w];
				}
			}
			System.out.println(ans);
		}		
	}
}
