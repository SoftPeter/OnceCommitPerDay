package d0102;

import java.util.Scanner;

public class B0102_11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int coin[] = new int[n];
		int sum =0;
		for(int i=0; i<n; i++) {
			coin[i] = sc.nextInt();
		}
		
		for(int i=n-1; i>=0; i--) {
			sum = sum + k/coin[i];
			k = k%coin[i];
		}
		System.out.println(sum);
		
	}
}
