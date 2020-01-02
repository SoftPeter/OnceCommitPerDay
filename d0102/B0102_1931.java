package d0102;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B0102_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][2];
		for(int i=0; i<n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		
		Arrays.sort(a, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] == o2[1])
					return o1[0] - o2[0];
				else
					return o1[1] - o2[1];
			}
		});
		
		int end = -1;
		int cnt =0;
		for(int i=0; i<n; i++) {
			if(a[i][0] >= end) {
				end = a[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
