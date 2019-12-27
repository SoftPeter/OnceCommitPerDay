package d1227;

import java.util.Arrays;
import java.util.Scanner;

public class C1227_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[3];
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i]%2 ==0)
				System.out.println(nums[i]);
		}
		
	}
}
