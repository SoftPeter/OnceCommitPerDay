package d1210;

import java.util.Scanner;

public class B1210_9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int d[] = new int[11];
		d[0] = 0;
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		for(int i=4; i<=10; i++) {
			d[i] = d[i-1]+d[i-2]+d[i-3];
		}
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
	}
}
