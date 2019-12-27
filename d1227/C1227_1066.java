package d1227;

import java.util.Arrays;
import java.util.Scanner;

public class C1227_1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[3];
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i]%2 !=0)
				System.out.println("odd");
			else
				System.out.println("even");
		}
		
	}
}
