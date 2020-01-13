package d0113;

import java.util.*;

public class B0113_1697 {
	static int n;
	static int k;
	static int visit[] = new int[100001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		bfs();
	}
	public static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(n);
		visit[n] = 1;
		while(!q.isEmpty()) {
			n = q.poll();
			//System.out.println("n = " + n);
			if(n == k)	break;
			if(n+1 <= 100000 && visit[n+1] == 0) {
				q.add(n+1);
				visit[n+1] = visit[n]+1;
				//System.out.println(1);
			}
			if(n-1 >= 0 && visit[n-1] == 0) {
				q.add(n-1);
				visit[n-1] = visit[n]+1;
				//System.out.println(-1);
			}
			if(n*2 <= 100000 && visit[n*2] == 0) {
				q.add(n*2);
				visit[n*2] = visit[n]+1;
				//System.out.println(2);
			}
		}
		System.out.println(visit[k]-1); // 0이 아닌 1에서 시작 해서 -1해주기 
	}
}
