package d0109;

import java.util.Scanner;

public class B0109_1449 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt()-1;
		int a[] = new int[1001];
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			a[sc.nextInt()] = 1;
		}
		
		for(int i=1; i<=1000; i++) {
			if(a[i] == 1) {
				cnt++;
				for(int j=i; j<=i+l; j++) {
					if(j==1001)	break;
					a[j] = 0;
				}
			}
		}
		System.out.println(cnt);
	}
}
