package d1226;

import java.util.Scanner;

public class C1226_1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int div = 1;
		for(int i=0; i<num.length(); i++) {
			div = div*10;
		}
		for(int i=0; i<num.length(); i++) {
			char c = num.charAt(i);
			div = div/10;
			System.out.println("[" + (c-'0')*div + "]");
			
		}
		
	}
}

