package d1210;

import java.util.Scanner;

public class B1210_1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int d[][] = new int[41][2];
		d[0][0] = 1;
		d[0][1] = 0;
		d[1][0] = 0;
		d[1][1] = 1;
		for(int i=2; i<41; i++) {
			d[i][0] = d[i-2][0]+d[i-1][0];
			d[i][1] = d[i-2][1]+d[i-1][1];
		}
		
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(d[n][0] + " " + d[n][1]);
		}
	}
}
