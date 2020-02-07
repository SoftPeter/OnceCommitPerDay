package d0206;

import java.util.*;


public class PG0206_Stick {
	public static void main(String[] args) {
		String arg = "()(((()())(())()))(())";
		
		System.out.println(solution(arg));


	}

	public static int solution(String arrangement) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<arrangement.length(); i++) {
        	if(arrangement.charAt(i) == '(') {
        		stack.push('(');
        	} else {
        		stack.pop();
        		if(arrangement.charAt(i-1) == '(') {
        			answer += stack.size();
        		} else {
        			answer++;
        		}
        	}
        }
        return answer;
    }
}