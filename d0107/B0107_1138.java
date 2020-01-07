package d0107;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B0107_1138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		List<Integer> ans = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=n; i>=1; i--) {
			ans.add(a[i],i);
		}
		
		for(int k : ans) {
			System.out.print(k + " ");
		}
	}
}
