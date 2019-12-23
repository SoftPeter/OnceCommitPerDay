package d1223;

import java.util.Scanner;

public class B1223_2133 {
	public static int d[][] = new int[1001][1001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[31];
		
		d[0]=1;
		for(int i=2; i<=n; i+=2) {
			d[i] = 3*d[i-2];
			for(int j=4; j<=i; j+=2) {
				d[i] += 2*d[i-j];
			}
		}
		
		System.out.println(d[n]);
	}
}
