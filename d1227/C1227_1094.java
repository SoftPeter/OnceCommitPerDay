package d1227;

import java.util.Scanner;

public class C1227_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[10001];
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}

		for(int i=n-1; i>=0; i--) {
			System.out.print(num[i] + " ");
		}
	}
}
