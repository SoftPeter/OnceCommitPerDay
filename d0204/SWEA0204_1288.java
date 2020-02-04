package d0204;

import java.util.*;

public class SWEA0204_1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int c = 1;
			int n = sc.nextInt();
			//0,1,2,3,4,5,6,7,8,9
			int cnt[] = new int[11];
			boolean check[] = new boolean[10];
			boolean flag = false;
			while(true) {
				int tmp = n*c;
				while(tmp > 0) {
					check[tmp%10]=true;
					tmp /= 10;
				}
				
				for(int i=0; i<=9; i++) {
					if(check[i]==false) {
						flag = false;
						break;
					}
					flag = true;
				}
				
				if(flag)	break;
				c++;
			}
			System.out.println("#" + t + " " + n*c);
		}
	}
}