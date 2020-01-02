package d0102;

import java.util.Arrays;
import java.util.Scanner;

public class B0102_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
		int d[] = new int[n];
		for(int i=0; i<n; i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		
		d[0] = p[0];
		for(int i=1; i<n; i++) {
			d[i] = d[i-1]+p[i];
		}
		
		int ans=0;
		for(int i=0; i<n; i++) {
			ans = ans + d[i];
		}
		System.out.println(ans);
	}
}
