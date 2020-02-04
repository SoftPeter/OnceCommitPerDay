package d0204;

import java.util.*;

public class SWEA0204_1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			//int math[] = new int[1001];
			int cnt[] = new int[101];
			for(int i=0; i<1000; i++) {
				cnt[sc.nextInt()] += 1;
			}

			int max = 0;
			int ans =0;
			for(int i=0; i<cnt.length-1; i++) {
				if(max < cnt[i]) {
					ans = i;
					max = cnt[i];
				}
				if(max == cnt[i]) {
					if(ans > i)
						ans = i;
				}
			}
			System.out.println("#" + (t+1) + " " + ans);
		}
	}
}