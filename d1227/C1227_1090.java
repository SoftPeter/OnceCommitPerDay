package d1227;

import java.util.Scanner;

public class C1227_1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=0; i<n-1; i++) {
			a*=r;
		}
		System.out.println(a);
	}
}
