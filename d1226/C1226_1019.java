package d1226;

import java.util.Arrays;
import java.util.Scanner;

public class C1226_1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] d = sc.next().split("\\.");
		int[] nums = Arrays.stream(d).mapToInt(Integer::parseInt).toArray();
		
		System.out.format("%04d", nums[0]);
		System.out.print(".");
		System.out.format("%02d", nums[1]);
		System.out.print(".");
		System.out.format("%02d", nums[2]);

	}
}

