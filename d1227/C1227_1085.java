package d1227;

import java.util.Scanner;

public class C1227_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		System.out.format("%.1f MB", (a*b*c*d)/(8*1024*1024));
		
	}
}
