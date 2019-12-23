package d1223;

import java.util.Scanner;

public class B1223_11051 {
	final static int DIV = 10007;
	public static int d[][] = new int[1001][1001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(solution(n,k));
	}
	
	public static int solution(int n, int k) {
		
		if(n==k || k==0)	return 1;
		
		if(d[n][k]>0)	return d[n][k];
		
		d[n][k] = solution(n-1,k-1) + solution(n-1,k);
		
		return d[n][k] % DIV;
	}
}
