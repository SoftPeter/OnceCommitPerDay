package d0128;

import java.util.*;

public class B0128_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String res = "YES";
		while(t-- > 0) {
			Stack<Integer> s = new Stack<>();
			String input = sc.next();
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i) == '(') {
					s.push(1);
					res = "YES";
				} else if(input.charAt(i) == ')') {
					if(s.isEmpty()) {
						res = "NO";
						break;
					} else {
						s.pop();
					}
				}
			}
			
			if(!s.isEmpty())
				res = "NO";
			System.out.println(res);
		}
	}
}