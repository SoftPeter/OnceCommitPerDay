package d1223;

import java.util.Scanner;

public class B1223_11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int nk = k;
		int nsum = 1;
		int ksum = 1;
		for(int i=0; i<nk; i++) {
			nsum = nsum*n;
			n--;
			//System.out.println("nsum = " + nsum);
		}
		for(int j=0; j<nk; j++) {
			ksum = ksum*k;
			k--;
			//System.out.println("ksum = " + ksum);
		}
		System.out.println(nsum/ksum);
		
	}
}
