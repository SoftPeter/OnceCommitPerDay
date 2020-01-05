package d0105;

import java.util.Arrays;
import java.util.Scanner;

public class B0105_2217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k[] = new int[n];
		for(int i=0; i<n; i++) {
			k[i] = sc.nextInt();
		}
		
		Arrays.sort(k);
		
		int sum=0;
		for(int i=n-1; i>=0; i--) {
			if(sum < k[i]*(n-i))
				sum = k[i]*(n-i);
		}
		System.out.println(sum);
	}
}
