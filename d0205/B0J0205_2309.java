package d0205;

import java.util.*;

public class B0J0205_2309 {
	final static int MAX = 1000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[9];
		int sum = 0;
		boolean flag = true;
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			sum += ar[i];
		}
		//System.out.println(sum);
		Arrays.sort(ar);
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				for(int k=0; k<ar.length; k++) {
					if(k==i || k==j) continue;
					if(sum - ar[i] - ar[j] == 100) {
						flag = false;
						System.out.println(ar[k]);
					}
				}
				if(!flag)	return;
			}
		}
	}
}