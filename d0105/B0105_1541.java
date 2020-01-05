package d0105;

import java.util.Scanner;

public class B0105_1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//System.out.println(str);
		String[] Astr = str.split("\\-");
		int sum = 0;
		int ans =0;
		//System.out.println(Astr.length);
		for(int i=0; i<Astr.length; i++) {
			sum = calc(Astr[i]);
			
			if(i==0)	sum *=-1;
			
			ans -= sum;
			
		}
		System.out.println(ans);
	}
	
	private static int calc(String str) {
		String[] Astr2 = str.split("\\+");
		int result = 0;
		for(int i=0; i<Astr2.length; i++) {
			result = result + Integer.parseInt(Astr2[i]);
		}
		return result;
	}
}
