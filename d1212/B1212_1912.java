package d1212;

import java.util.Scanner;

public class B1212_1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		d[1]=a[1];
		int max=a[1];
		for(int i=2; i<=n; i++) {
			d[i] = Math.max(d[i-1]+a[i], a[i]);
			//System.out.println("d[" + i + "] = " + d[i]);
			max = Math.max(d[i], max);
		}	
		System.out.println(max);
		
	}
}
