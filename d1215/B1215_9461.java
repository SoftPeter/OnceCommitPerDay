package d1215;

import java.util.Scanner;

public class B1215_9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long p[] = new long[101];
		
		// p[10] = p[5]+p[9];
		// p[i] = p[i-1] + p[i-5];
		p[1]=p[2]=p[3]=1;
		p[4]=p[5]=2;
		for(int i=6; i<=100; i++) {
			p[i] = p[i-1] + p[i-5];
		}
		
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(p[n]);
		}
	}
}
