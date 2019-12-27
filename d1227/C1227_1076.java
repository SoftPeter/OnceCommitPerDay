package d1227;

import java.util.Scanner;

public class C1227_1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char start = 'a';
		char c = sc.next().charAt(0);
		do {
			System.out.println(start);
			start += 1;
		} while(start <= c);
	}
}
