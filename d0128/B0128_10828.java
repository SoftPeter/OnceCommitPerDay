package d0128;

import java.util.*;

public class B0128_10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		int t = sc.nextInt();
		while(t-- > 0) {
			String input = sc.next();
			if(input.equals("push")) {
				int input2 = sc.nextInt();
				s.push(input2);
			} else if(input.equals("pop")) {
				if(s.isEmpty())
					System.out.println(-1);
				else
					System.out.println(s.pop());
			} else if(input.equals("size")) {
				System.out.println(s.size());
			} else if(input.equals("empty")) {
				if(s.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			} else if(input.equals("top")) {
				if(s.isEmpty())
					System.out.println(-1);
				else
					System.out.println(s.peek());
			}
		}
	}
}