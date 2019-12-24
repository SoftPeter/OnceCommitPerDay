package d1224;

import java.util.Scanner;

public class B1224_9251 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int d[][] = new int[str1.length()+1][str2.length()+2];
		
		for(int i=1; i<=str1.length(); i++) {
			char c1 = str1.charAt(i-1);
			for(int j=1; j<=str2.length(); j++) {
				char c2 = str2.charAt(j-1);
				
				if(c1 == c2) {
					d[i][j] = d[i-1][j-1]+1;
				} else {
					d[i][j] = Math.max(d[i-1][j], d[i][j-1]);
				}
			}
		}
		
		System.out.println(d[str1.length()][str2.length()]);
	}
}
