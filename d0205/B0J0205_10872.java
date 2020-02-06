package d0205;

import java.util.*;

public class B0J0205_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =1;
		for(int i=n; i>=1; i--) {
			
			sum = sum * i;
			
		}
		System.out.println(sum);
	}
}