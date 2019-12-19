package d1219;

import java.util.Scanner;

public class B1219_2294 {
	final static int MAX = 10001;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int coin[] = new int[n+1];
		int d[] = new int[k+1];
		for(int i=1; i<=n; i++) {
			coin[i] = sc.nextInt();
		}
		
		for(int i=1; i<=k; i++) {
			d[i] = MAX;
		}
		
		d[0] = 0;
		for(int i=1; i<=n; i++) {
			for(int j=coin[i]; j<=k; j++) {
				d[j] = Math.min(d[j], d[j-coin[i]]+1);
			}
		}
		
		if(d[k]==MAX)
			d[k] = -1;
		System.out.println(d[k]);
	}
}
