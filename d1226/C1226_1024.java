package d1226;

import java.util.Scanner;

public class C1226_1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			System.out.println("'" + c + "'");
		}
	}
}

