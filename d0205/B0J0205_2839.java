package d0205;

import java.util.*;

public class B0J0205_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int five = 0;
		int three = 0;
		
		while(n%5!=0 && n>=0) {
			n -= 3;
			three++;
		}
		
		if(n < 0)
			System.out.println(-1);
		else {
			five = n/5;
			System.out.println(three+five);
		}
	}
}