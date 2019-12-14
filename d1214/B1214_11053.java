package d1214;

import java.util.Scanner;

public class B1214_11053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int d[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			d[i]=1;
			//System.out.println("i = " + i);
			for(int j=0; j<i; j++) {
				if(a[j]<a[i] && d[j]+1>d[i]) {
					d[i] = d[j]+1;
					//System.out.print("	j = " + j + " => " + d[i]);
				}
				//System.out.println();
			}
		}
		
		int ans = 0;
		for(int i=0; i<n; i++) {
			if(ans < d[i])
				ans=d[i];
		}
		System.out.println(ans);
	}
}
