package d1227;

import java.util.Scanner;

public class C1227_1097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int map[][] = new int[20][20];
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				map[i][j] =	sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		while(n-->0) {
			//10 10
			//12 12
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			for(int i=0; i<19; i++) {
				if(map[x][i]==0)	map[x][i]=1;
				else	map[x][i]=0;
			}
			for(int j=0; j<19; j++) {
				if(map[j][y]==0) map[j][y]=1;
				else map[j][y]=0;
			}
		}
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
