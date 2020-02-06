package d0205;

import java.util.*;

public class B0J0205_4948 {
	final static int MAX = 1000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] p = new boolean[MAX+1];
		for(int i=2; i<=MAX; i++) {
			p[i] = true;
		}
		for(int i=2; i<=MAX; i++) {
			for(int j=2*i; j<=MAX; j+=i) {
				if(!p[j]) continue;
				p[j] = false;
			}
		}
		
		while(true) {
            int n = sc.nextInt();
            if(n == 0)
                break;
            int cnt = 0;
            for(int i = n+1; i <= 2*n; i++) {
                if(p[i])
                    ++cnt;
            }
            System.out.println(cnt);
        }
	}
}