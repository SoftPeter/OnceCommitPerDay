package d0205;

import java.util.*;

public class B0J0205_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int ans = 0;
		int tmp = 0;
		for(int i=0; i<ar.length-2; i++) {
			for(int j=i+1; j<ar.length-1; j++) {
				for(int k=j+1; k<ar.length; k++) {
					tmp = ar[i] + ar[j] + ar[k];
					if(tmp <= m && tmp > ans) {
						ans = tmp;
					}
				}
			}
		}
		System.out.println(ans);
	}
}