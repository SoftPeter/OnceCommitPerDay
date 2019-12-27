package d1227;

import java.util.Scanner;

public class C1227_1089 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=0; i<n-1; i++) {
			a+=d;
		}
		System.out.println(a);
	}
}
