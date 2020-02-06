package d0205;

import java.util.*;

public class B0J0205_2960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		boolean visit[] = new boolean[n+1];
		int cnt=0;
		for(int i=2; i<=n; i++) {
			for(int j=i; j<=n; j+=i) {
				if(!visit[j]) {
					cnt++;
					visit[j]= true;
				}
				
				if(cnt == k) {
					System.out.println(j);
					System.exit(0);
				}
				
			}
		}
		
	}
}