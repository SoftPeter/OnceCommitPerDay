package d1227;

import java.util.Scanner;

public class C1227_1093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[24];
		for(int i=0; i<n; i++) {
			num[sc.nextInt()]++;
		}
		for(int i=1; i<=23; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
