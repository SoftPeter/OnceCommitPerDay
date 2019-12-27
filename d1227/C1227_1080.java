package d1227;

import java.util.Scanner;

public class C1227_1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=0; i<=1000; i++) {
			sum += i;
			if(sum >= n) {
				System.out.println(i);
				break;
			}
		}
	}
}
