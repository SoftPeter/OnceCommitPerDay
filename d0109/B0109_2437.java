package d0109;

import java.util.Arrays;
import java.util.Scanner;

public class B0109_2437 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int min = 1;
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0; i<n; i++) {
			if(a[i]<=min) {
				min = min + a[i];
			} else {
				break;
			}
		}
		System.out.println(min);
	}
}
