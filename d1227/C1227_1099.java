package d1227;

import java.util.Scanner;

public class C1227_1099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int map[][] = new int[10][10];
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int x = 1;
		int y = 1;
		while(true) {
			if(x==8 && y==8) {
				map[x][y] = 9;
				break;
			}
			if(map[x][y]==2) {
				map[x][y] = 9;
				break;
			}
			if(map[x][y]==0) {
				map[x][y] = 9;
				if(map[x][y+1] == 0) {
					++y;
				} else if(map[x][y+1] == 2) {
					map[x][y+1] = 9;
					break;
				} else if(map[x+1][y] == 0){
					++x;
				} else if(map[x+1][y] == 2) {
					map[x+1][y] = 9;
					break;
				}
			}
		}
		
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
