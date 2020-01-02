package d0102;

import java.util.Scanner;

public class B0102_5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 1000-n; //620
		int ans = 0;
		int coin[] = {500, 100, 50, 10, 5, 1};
		for(int i=0; i<6; i++) {
			ans = ans + m/coin[i];
			//System.out.println("ans = " + ans);
			m = m%coin[i];
			//System.out.println("m = " + m);
		}
		System.out.println(ans);
	}
}
