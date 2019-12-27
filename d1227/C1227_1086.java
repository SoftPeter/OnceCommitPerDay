package d1227;

import java.util.Scanner;

public class C1227_1086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.format("%.2f MB", (a*b*c)/(8*1024*1024));
		
	}
}
