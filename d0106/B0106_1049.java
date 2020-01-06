package d0106;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B0106_1049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sp[] = new int[m];
		int pp[] = new int[m];
		int min = 987654321;
		for(int i=0; i<m; i++) {
			sp[i] = sc.nextInt();
			pp[i] = sc.nextInt();
		}
		
		Arrays.sort(sp);
		Arrays.sort(pp);
		
		min = Math.min(((n/6)+1)*sp[0], n*pp[0]);
		min = Math.min(min, (n/6)*sp[0] + (n%6)*pp[0]);
		
		System.out.println(min);
	}
}

