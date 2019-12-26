package d1226;

import java.util.Scanner;

public class C1226_1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = Integer.parseInt(str, 16);
		String str1 = Integer.toOctalString(n);
		System.out.println(str1);
	}
}

