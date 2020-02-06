package d0205;

import java.util.*;

public class B0J0205_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a*b*c;
		
		int check[] = new int[10];
		String st = Integer.toString(sum);
		//System.out.println(st);
		//System.out.println(st.length());
		for(int i=0; i<st.length(); i++) {
			//System.out.println(st);
			//System.out.println(st.charAt(i));
			int changeNum = Character.getNumericValue(st.charAt(i));
			//System.out.println(changeNum);
			check[changeNum] += 1;
		}
		for(int i=0; i<=9; i++) {
			System.out.println(check[i]);
		}
		
	}
}