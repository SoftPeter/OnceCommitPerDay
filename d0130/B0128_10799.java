package d0130;

import java.util.*;

public class B0128_10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Integer> stack = new Stack<>();
		int sum =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(i);
			} else {
				int p = stack.pop();
				if(i-p == 1) {
					sum = sum + stack.size();
				} else {
					sum = sum + 1;
				}
			}
		}
		System.out.println(sum);
	}
}