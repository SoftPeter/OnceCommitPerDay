package d0106;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B0106_1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int cnt = 0;
			int n = sc.nextInt();
			int score[][] = new int[n+1][2];
			for(int i=1; i<=n; i++) {
				score[i][0] = sc.nextInt();
				score[i][1] = sc.nextInt();
			}
			
			Arrays.sort(score, new Comparator<int []>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return Integer.compare(o1[0], o2[0]);
				}
			});
			
			int pivot = score[1][1];
			int ans = 1;
			for(int i=2; i<=n; i++) {
				if(score[i][1] < pivot) {
					pivot = score[i][1];
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}

