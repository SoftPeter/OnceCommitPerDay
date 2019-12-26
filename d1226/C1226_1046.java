package d1226;

import java.util.Scanner;

public class C1226_1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		long sum = a+b+c;
		float div = (float)(a+b+c)/3;
		
		System.out.println(sum);
		System.out.format("%.1f", div);
	}
}

