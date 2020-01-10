package d0110;

import java.util.Scanner;

public class B0110_1439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int z=0, o = 0;
		if(str.charAt(0) == '0') {
			z++;
		} else {
			o++;
		}
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) != str.charAt(i-1)) {
				if(str.charAt(i) == '0') {
					z++;
				} else {
					o++;
				}
			}
		}
		System.out.println(Math.min(o, z));
	}
}
