package d1226;

import java.util.Scanner;

public class C1226_1045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		float div = (float)n/m;
		System.out.println(n+m);
		System.out.println(n-m);
		System.out.println(n*m);
		System.out.println(n/m);
		System.out.println(n%m);
		System.out.format("%.2f", div);
		
	}
}

