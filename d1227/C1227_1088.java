package d1227;

import java.util.Scanner;

public class C1227_1088 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i%3!=0)
				System.out.print(i + " ");
		}
	}
}
