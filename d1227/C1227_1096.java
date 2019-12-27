package d1227;

import java.util.Scanner;

public class C1227_1096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int map[][] = new int[20][20];
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				map[i][j] = 0;
			}
		}
		
		int n = sc.nextInt();
		while(n-->0) {
			map[sc.nextInt()-1][sc.nextInt()-1] = 1;
		}
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
