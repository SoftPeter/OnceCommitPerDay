package d0105;

import java.util.Scanner;

public class B0105_2875 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //여 
		int m = sc.nextInt(); //남 
		int k = sc.nextInt(); //인턴 
		int team = 0;
		
		while(n>=2 && m>=1 && (n+m) >= (3+k)) {
			n-=2;
			m-=1;
			team++;
		}
		System.out.println(team);
		
	}
}
