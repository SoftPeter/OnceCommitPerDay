package d1227;

import java.util.Scanner;

public class C1227_1098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		int map[][]= new int[h+1][w+1];
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				map[i][j] = 0;
			}
		}
		
		while(n-- >0) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt() -1;
			int y = sc.nextInt() -1;
			
			map[x][y] = 1;
			for(int i=0; i<l; i++) {
				if(d == 0) {
					map[x][y+i] = 1;
				} else {
					map[x+i][y] = 1;
				}
			}
		}
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
