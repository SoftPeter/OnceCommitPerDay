package d1227;

import java.util.Scanner;

public class C1227_1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<40)
			System.out.println("D");
		else if(n<70)
			System.out.println("C");
		else if(n<90)
			System.out.println("B");
		else
			System.out.println("A");
	}
}
