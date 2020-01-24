package d0124;

import java.util.*;

class Field{
	int x;
	int y;
	Field(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class B0124_1012 {
	public static int dx[] = {0,0,1,-1};
	public static int dy[] = {1,-1,0,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int K = sc.nextInt();
			int f[][] = new int[M][N];
			int v[][] = new int[M][N];
		
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					f[i][j] = 0;
				}
			}
			
			for(int i=0; i<K; i++) {
				f[sc.nextInt()][sc.nextInt()] = 1;
			}
			
			int cnt=0;
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(f[i][j] == 1 && v[i][j] == 0)
						bfs(f, v, i, j, M, N, ++cnt);
				}
			}
			System.out.println(cnt);
		}
	}
	
	public static void bfs(int f[][], int v[][], int x, int y, int M, int N, int cnt) {
		Queue<Field> q = new LinkedList<Field>();
		q.add(new Field(x, y));
		v[x][y] = cnt;
		while(!q.isEmpty()) {
			Field p = q.remove();
			x = p.x;
			y = p.y;
			for(int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				if(0<=nx && nx<M && 0<=ny && ny<N) {
					if(f[nx][ny]==1 && v[nx][ny]==0) {
						q.add(new Field(nx, ny));
						v[nx][ny] = cnt;
					}
				}
			}
		}
	}
}